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

// Require the initialisation file
require_once '../../init.php';

// Required files
require_once LIB_PATH . '/Admin/Redirect.php';

// Redirect to the main "Preferences" page
OX_Admin_Redirect::redirect('account-preferences-banner.php');

?>