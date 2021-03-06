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
 * This file is only called to redirect to somewhere else, however, if Revive
 * Adserver is not yet installed, we need to know that it was this file that
 * was called, so set a global variable.
 */
define('ROOT_INDEX', true);

// Require the initialisation file
require_once 'init.php';

// Required files
require_once LIB_PATH . '/Admin/Redirect.php';

// Redirect to the admin interface
if (OA_INSTALLATION_STATUS == OA_INSTALLATION_STATUS_INSTALLED)
{
    OX_Admin_Redirect::redirect();
}

?>
