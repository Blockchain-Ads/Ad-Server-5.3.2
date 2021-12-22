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

namespace RV\Extension;

interface GeoTargetingComponentInterface
{
    /**
     * The method returns all the geotargeting info that the plugin is capable to deliver (e.g. given the configured
     * databases) as an array.
     *
     * @return array
     */
    public function getCapabilities();
}