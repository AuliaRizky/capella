/*******************************************************************************
 * Copyright (c) 2017, 2019 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.diffmerge.patterns.capella;

import org.eclipse.emf.diffmerge.patterns.core.gen.corepatterns.AbstractIdentifiedElement;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.shared.id.handler.AbstractIdHandler;


/**
 * An ID handler for elements of patterns.
 */
public class PatternElementIdHandler extends AbstractIdHandler {

  /**
   * @see org.polarsys.capella.shared.id.handler.IIdHandler#getId(org.eclipse.emf.ecore.EObject)
   */
  @Override
  public String getId(EObject object) {
    if(object instanceof AbstractIdentifiedElement){
      return ((AbstractIdentifiedElement)object).getId();
    }
    return null;
  }

}