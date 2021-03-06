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

package org.drools.workbench.screens.guided.dtable.client.resources.i18n;

import com.google.gwt.core.client.GWT;
import com.google.gwt.i18n.client.Messages;
import org.drools.workbench.models.guided.dtable.shared.model.Pattern52;

public interface AnalysisConstants
        extends
        Messages {

    public static final AnalysisConstants INSTANCE = GWT.create(AnalysisConstants.class);

    String ConflictingMatchWithRow(int rowNumber);

    String DuplicatedMatchWithRow(int rowNumber);

    String ImpossibleMatchOn(String factField);

    String RuleHasNoAction();

    String RuleHasNoRestrictionsAndWillAlwaysFire();

    String MultipleValuesForOneAction();

    String ConstrainsForFieldXOfFactYAreRedundantTheyWillAlwaysPass(String factField, String factType);

    String ThisRowIsRedundantTo(int rowIndex);

    String ThisRowIsSubsumedByRow(int rowNumber);

    String ThisRowIsDeficient();

    String ValueForFactFieldIsSetTwice( String factName, String fieldName );

    String ValueForAnActionIsSetTwice();

    String ConditionsForFieldAreRedundant( String patternName, String factField );

}
