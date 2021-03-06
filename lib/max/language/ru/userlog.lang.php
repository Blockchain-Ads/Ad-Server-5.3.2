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
$GLOBALS['strDeliveryEngine'] = "Движок доставки";
$GLOBALS['strMaintenance'] = "Обслуживание";
$GLOBALS['strAdministrator'] = "Администратор";

// Audit
$GLOBALS['strDelete'] = "Удалить";
$GLOBALS['strHas'] = "содержит";
$GLOBALS['strAdvertiser'] = "Клиент";
$GLOBALS['strPublisher'] = "Вебсайт";
$GLOBALS['strCampaign'] = "Кампания";
$GLOBALS['strZone'] = "Зона";
$GLOBALS['strType'] = "Тип";
$GLOBALS['strAction'] = "Действие";
$GLOBALS['strValue'] = "Значение";

if (!isset($GLOBALS['strUserlog'])) {
    $GLOBALS['strUserlog'] = array();
}
$GLOBALS['strUserlog'][phpAds_actionActivationMailed] = "Уведомление активации кампании {id} отправлено по e-mail";
