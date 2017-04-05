/*******************************************************************************
 * Copyright (c) 2006, 2014 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.core.transition.common.handlers.log;

import org.eclipse.emf.diffmerge.api.diff.IDifference;

import org.polarsys.capella.core.transition.common.handlers.filter.AbstractFilterItem.FilterAction;
import org.polarsys.capella.core.transition.common.handlers.log.IDiffModelType.DiffScope;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;

public interface IDiffModelViewerFactory {
  /**
   * Creates the default factory implementation.
   */
  IDiffModelViewerFactory eINSTANCE = DiffModelViewerFactory.getInstance();

  public IDiffModelViewer createDiffModelViewer(IDifference diff_p, DiffScope diffScope_p, FilterAction action_p, IContext context_p, boolean isReadOnly_p);
}