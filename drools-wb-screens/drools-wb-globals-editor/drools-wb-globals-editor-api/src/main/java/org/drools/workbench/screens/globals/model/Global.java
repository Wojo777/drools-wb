/*
 * Copyright 2015 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/

package org.drools.workbench.screens.globals.model;

import org.jboss.errai.common.client.api.annotations.Portable;
import org.uberfire.commons.validation.PortablePreconditions;

/**
 * Definition of a Global
 */
@Portable
public class Global {

    private String alias;
    private String className;

    public Global() {
    }

    public Global( final String alias,
                   final String className ) {
        setAlias( alias );
        setClassName( className );
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias( String alias ) {
        this.alias = PortablePreconditions.checkNotNull( "alias",
                                                         alias );
    }

    public String getClassName() {
        return className;
    }

    public void setClassName( String className ) {
        this.className = PortablePreconditions.checkNotNull( "className",
                                                             className );
    }

    @Override
    public boolean equals( Object o ) {
        if ( this == o ) {
            return true;
        }
        if ( !( o instanceof Global ) ) {
            return false;
        }

        Global global = (Global) o;

        if ( alias != null ? !alias.equals( global.alias ) : global.alias != null ) {
            return false;
        }
        if ( className != null ? !className.equals( global.className ) : global.className != null ) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = alias != null ? alias.hashCode() : 0;
        result = 31 * result + ( className != null ? className.hashCode() : 0 );
        return result;
    }

}
