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
$GLOBALS['strMaintenance'] = "Vedlikehold";
$GLOBALS['strAdministrator'] = "Administrator";

// Audit
$GLOBALS['strDeleted'] = "slettet";
$GLOBALS['strInserted'] = "satt inn";
$GLOBALS['strUpdated'] = "oppdatert";
$GLOBALS['strDelete'] = "Slett";
$GLOBALS['strFilters'] = "Filter";
$GLOBALS['strAdvertiser'] = "Annonsør";
$GLOBALS['strPublisher'] = "Nettside";
$GLOBALS['strCampaign'] = "Kampanje";
$GLOBALS['strZone'] = "Ingen";
$GLOBALS['strType'] = "Type";
$GLOBALS['strAction'] = "Handling";
$GLOBALS['strParameter'] = "Parameter";
$GLOBALS['strValue'] = "Verdi";
$GLOBALS['strMaintenanceLog'] = "Vedlikeholdslogg";
$GLOBALS['strAuditResultsNotFound'] = "Ingen hendelser funnet som matcher valgt kriterium";
$GLOBALS['strCollectedAllEvents'] = "Alle hendelser";
$GLOBALS['strClear'] = "Tøm";

if (!isset($GLOBALS['strUserlog'])) {
    $GLOBALS['strUserlog'] = array();
}
$GLOBALS['strUserlog'][phpAds_actionDeactiveCampaign] = "Kampanje {id} deaktivert";
