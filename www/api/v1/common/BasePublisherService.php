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

// Require Publisher Service Implementation
require_once MAX_PATH . '/www/api/v1/xmlrpc/PublisherServiceImpl.php';

/**
 * Base Publisher Service
 *
 */
class BasePublisherService
{
    /**
     * Reference to Publisher Service implementation.
     *
     * @var PublisherServiceImpl $_oPublisherServiceImp
     */
    var $_oPublisherServiceImp;

    /**
     * This method initialises Service implementation object field.
     *
     */
    function __construct()
    {
        $this->_oPublisherServiceImp = new PublisherServiceImpl();
    }
}

?>