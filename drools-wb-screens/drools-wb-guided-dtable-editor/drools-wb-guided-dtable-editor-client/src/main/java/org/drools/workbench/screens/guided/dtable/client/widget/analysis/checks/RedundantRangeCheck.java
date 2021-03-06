/*
 * Copyright 2015 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.drools.workbench.screens.guided.dtable.client.widget.analysis.checks;

import java.util.Collection;

import org.drools.workbench.screens.guided.dtable.client.widget.analysis.RowInspector;
import org.drools.workbench.screens.guided.dtable.client.widget.analysis.checks.base.SingleCheck;
import org.drools.workbench.screens.guided.dtable.client.widget.analysis.condition.ConditionInspector;
import org.drools.workbench.screens.guided.dtable.client.widget.analysis.condition.ConditionInspectorKey;
import org.drools.workbench.screens.guided.dtable.client.widget.analysis.condition.NumericIntegerConditionInspector;

public class RedundantRangeCheck
        extends SingleCheck {

    public RedundantRangeCheck( RowInspector rowInspector ) {
        super( rowInspector );
    }

    @Override
    public void check() {
        for ( ConditionInspectorKey key : rowInspector.getConditions().keys() ) {
            Collection<ConditionInspector> inspectors = rowInspector.getConditions().get( key );
            ConditionInspector first = inspectors.iterator().next();

            if ( inspectors.isEmpty() ) {
                break;
            } else if ( first instanceof NumericIntegerConditionInspector ) {
                IntegerGapsCheck integerGapsCheck = new IntegerGapsCheck( inspectors );
                if ( !integerGapsCheck.hasGaps() ) {
//                    return true;
                }
            }
        }
//        return false;
    }

    @Override
    public String getIssue() {
        return null;
    }

//    @Override
//    public String getIssue() {
//
//        Iterator<ConditionInspectorKey> iterator = rowInspector.getConditions().keys().iterator();
//        if (iterator.hasNext()) {
//
//            ConditionInspectorKey next = iterator.next();
//            return AnalysisConstants.INSTANCE.ConstrainsForFieldXOfFactYAreRedundantTheyWillAlwaysPass(next.getFactField(), next.getPattern().getFactType());
//        }
//        return "";
//    }
}
