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

/**
 * @package    OpenXDll
 *
 */

// Require the base Info class.
require_once MAX_PATH . '/lib/OA/Info.php';

/**
 * The OA_Dll_AgencyInfo class extends the OA_Info class and contains information
 * about the agency.
 *
 */

class OA_Dll_AgencyInfo extends OA_Info
{
    /**
     * This field contains the ID of the agency.
     *
     * @var integer $agencyId
     */
    var $agencyId;

    /**
     * This field contains the ID of the agency account.
     *
     * @var integer $accountId
     */
    var $accountId;

    /**
     * This field provides the name of the agency.
     *
     * @var string $agencyName
     */
    var $agencyName;

    /**
     * The password variable is the password for the agency.
     *
     * @var string $password
     */
    var $password;

    /**
     * This field provides the name of the contact for the agency.
     *
     * @var string $contactName
     */
    var $contactName;

    /**
     * This field provides the email address of the contact for the agency.
     *
     * @var string $emailAddress
     */
    var $emailAddress;

    /**
     * A boolean field to indicate if the banner is active
     *
     * @var int $status
     */
    var $status;

    /**
     * This method returns an array of fields with their corresponding types.
     *
     * @access public
     *
     * @return array
     */
    function getFieldsTypes()
    {
        return [
            'agencyId' => 'integer',
            'accountId' => 'integer',
            'agencyName' => 'string',
            'password' => 'string',
            'contactName' => 'string',
            'emailAddress' => 'string',
            'status' => 'integer',
        ];
    }
}

?>