/*******************************************************************************
 * Copyright (c) 2010, 2013 Sonatype, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Stuart McCulloch (Sonatype, Inc.) - initial API and implementation
 *
 * Minimal facade required to be binary-compatible with legacy Plexus API
 *******************************************************************************/
package org.codehaus.plexus.personality.plexus.lifecycle.phase;

public final class StoppingException
    extends Exception
{
    private static final long serialVersionUID = 1L;

    public StoppingException( final String message )
    {
        super( message );
    }

    public StoppingException( final String message, final Throwable cause )
    {
        super( message, cause );
    }
}
