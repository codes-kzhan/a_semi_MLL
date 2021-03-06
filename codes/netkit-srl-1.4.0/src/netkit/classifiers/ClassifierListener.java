/**
 * ClassifierListener.java
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

package netkit.classifiers;

import netkit.graph.Node;

/**
 * $Id: ClassifierListener.java,v 1.2 2004/12/05 02:57:18 sofmac Exp $
 * Part of the open-source Network Learning Toolkit
 * <p/>
 * User: smacskassy
 * Date: Dec 1, 2004
 * Time: 12:07:27 AM
 */
public interface ClassifierListener
{
    public void estimate(Node node, double[] estimate);
    public void classify(Node node, int label);
}
