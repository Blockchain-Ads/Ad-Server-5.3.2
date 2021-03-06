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

// Set translation strings
$GLOBALS['strDeliveryEngine'] = "Engine de entrega";
$GLOBALS['strMaintenance'] = "Manutenção";
$GLOBALS['strAdministrator'] = "Administrador";

// Audit
$GLOBALS['strDelete'] = "Remover";
$GLOBALS['strHas'] = "tem";
$GLOBALS['strAdvertiser'] = "Anunciante";
$GLOBALS['strPublisher'] = "Site";
$GLOBALS['strCampaign'] = "Campanha";
$GLOBALS['strZone'] = "Zona";
$GLOBALS['strType'] = "Tipo";
$GLOBALS['strAction'] = "Ação";
$GLOBALS['strValue'] = "Valor";

if (!isset($GLOBALS['strUserlog'])) {
    $GLOBALS['strUserlog'] = array();
}
$GLOBALS['strUserlog'][phpAds_actionActivationMailed] = "Estatísticas compiladas";
