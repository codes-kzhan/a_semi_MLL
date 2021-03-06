/**
 * AggregatorByValue.java
 * Copyright (C) 2008 Sofus A. Macskassy
 *
 * Part of the open-source Network Learning Toolkit
 * http://netkit-srl.sourceforge.net
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 **/

/**
 * $Id$
 **/

package netkit.classifiers.aggregators;

/**
 * The AggregatorByValue extends a normal aggregator by aggregating
 * on a specific given attribute value (e.g., how often did 'aquavit'
 * appear in the aggregation neighborhood).
 *
 * @see netkit.graph.Attribute
 * @see netkit.graph.Attributes
 * @see netkit.graph.Node
 * 
 * @author Sofus A. Macskassy (sofmac@gmail.com)
 */
public interface AggregatorByValue extends Aggregator
{
    /** Gets the value value that is being aggregated on (e.g., how
     * often did 'aquavit' appear would return the double value representing
     * 'aquavit' in an AttributeCategorical)
     * @return the value representing the attribute value being aggregated.
     */
    public double getAttributeValue();
}
