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
package org.polarsys.capella.core.business.queries.queries.information;

import java.util.List;

import org.polarsys.capella.common.queries.AbstractQuery;
import org.polarsys.capella.common.queries.interpretor.QueryInterpretor;
import org.polarsys.capella.common.queries.queryContext.IQueryContext;
import org.polarsys.capella.common.queries.queryContext.QueryContext;
import org.polarsys.capella.core.model.helpers.queries.QueryIdentifierConstants;
import org.polarsys.capella.core.model.helpers.queries.filters.RemoveFinalElement;

public class GetAvailable_ExchangeItem_InheritedExchangeItem extends AbstractQuery {

  @Override
  public List<Object> execute(Object input, IQueryContext context) {
  	List<Object> res = QueryInterpretor.executeQuery(QueryIdentifierConstants.GET_ALL_EXCHANGE_ITEMS, input, new QueryContext(), new RemoveFinalElement());
  	res.remove(input);
  	return  res;
  }
}
