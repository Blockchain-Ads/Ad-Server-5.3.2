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

function OA_runMPE()
{
    $objResponse = new xajaxResponse();
    $objResponse->addAssign("run-mpe", "innerHTML", "<img src='run-mpe.php?mpe_token=".urlencode(phpAds_SessionGetToken('mpe_token'))."' />");
    return $objResponse;
}

require_once MAX_PATH .'/lib/Max.php';
require_once MAX_PATH .'/lib/xajax/xajax.inc.php';
$xajax = new xajax(MAX::constructURL(MAX_URL_ADMIN,'run-mpe-xajax.php'));
$xajax->registerFunction("OA_runMPE");
$xajax->processRequests();

?>
