/*******************************************************************************
 * Copyright (c) 2006, 2020 THALES GLOBAL SERVICES.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.core.re.handlers;

import java.util.Collection;

import org.eclipse.core.runtime.IProgressMonitor;

import org.polarsys.capella.core.re.commands.CreateRecCommand;
import org.polarsys.capella.common.ef.command.ICommand;

/**
 */
public class CreateRecHandler extends org.polarsys.capella.common.re.handlers.CreateRecHandler {

  /**
   * {@inheritDoc}
   */
  @Override
  protected ICommand createCommand(Collection<?> selection_p, IProgressMonitor progressMonitor_p) {
    return new CreateRecCommand(selection_p, progressMonitor_p) {

    };
  }

}
