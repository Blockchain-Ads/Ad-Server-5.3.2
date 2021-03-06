<?php

/*
+---------------------------------------------------------------------------+
| Blockchain-Ads Adserver                                                          |
| https://www.blockchain-ads.com/adserver                                           |
|                                                                           |
| Copyright: See the COPYRIGHT.txt file.                                    |
| License: GPLv2 or later, see the LICENSE.txt file.                        |
+---------------------------------------------------------------------------+
*/

$className = 'OA_UpgradePostscript_2_8_1_rc10';

require_once MAX_PATH . '/lib/OA/DB/Table.php';
require_once MAX_PATH . '/lib/OA/Upgrade/UpgradeLogger.php';

class OA_UpgradePostscript_2_8_1_rc10
{
    /**
     * @var OA_Upgrade
     */
    var $oUpgrade;

    /**
     * @var MDB2_Driver_Common
     */
    var $oDbh;

    /**
     * DB table prefix
     *
     * @var string
     */
    var $prefix;
    var $tblPreferences;

    function __construct()
    {

    }

    function execute($aParams)
    {
        $this->oUpgrade = & $aParams[0];

        $this->oDbh = OA_DB::singleton();
        $aConf = $GLOBALS['_MAX']['CONF']['table'];
        $this->prefix = $aConf['prefix'];
        $this->tblPreferences = $aConf['prefix'].($aConf['preferences'] ? $aConf['preferences'] : 'preferences');

        $query = "INSERT INTO ".$this->oDbh->quoteIdentifier($this->tblPreferences,true)."
                  (preference_name, account_type)
                 VALUES('ui_show_entity_id', '')";
        $ret = $this->oDbh->query($query);
        //check for error
        if (PEAR::isError($ret))
        {
            $this->logError($ret->getUserInfo());
            return false;
        }

        $this->logOnly("Added 'ui_show_entity_id' preference");
        return true;
    }

    function logOnly($msg)
    {
        $this->oUpgrade->oLogger->logOnly($msg);
    }


    function logError($msg)
    {
        $this->oUpgrade->oLogger->logError($msg);
    }

}