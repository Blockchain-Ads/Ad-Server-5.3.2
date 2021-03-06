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
 * @package    OpenX
 */

// Require Zone Service Implementation
require_once MAX_PATH . '/www/api/v1/xmlrpc/ZoneServiceImpl.php';

/**
 * Base Zone Service
 *
 */
class BaseZoneService
{
    /**
     * Reference to zone Service implementation.
     *
     * @var ZoneServiceImpl $_oZoneServiceImp
     */
    var $_oZoneServiceImp;

    /**
     * This method initialises Service implementation object field.
     *
     */
    function __construct()
    {
        $this->_oZoneServiceImp = new ZoneServiceImpl();
    }
}

?>