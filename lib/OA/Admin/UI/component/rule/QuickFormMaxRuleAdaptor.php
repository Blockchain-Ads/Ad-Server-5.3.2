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

require_once MAX_PATH.'/lib/OA/Admin/UI/component/rule/BaseQuickFormRuleToJQueryRuleAdaptor.php';


/**
 * Wrapper rule for HTML_QuickForm "max" rule.
 */
class OA_Admin_UI_Rule_JQueryMaxRule
    extends OA_Admin_UI_Rule_BaseQuickFormRuleToJQueryRuleAdaptor   
{
    /**
     * Returns Jquery validation plugin "max" rule 
     * "max": $rule['format']
     * @param array $rule
     * @return string
     */
    public function getJQueryValidationRule($rule)
    {
        return "\"max\": ".$rule['format'];    
    }
}

?>
