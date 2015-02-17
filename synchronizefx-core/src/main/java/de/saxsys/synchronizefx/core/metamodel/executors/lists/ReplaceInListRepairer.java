/**
 * This file is part of SynchronizeFX.
 * 
 * Copyright (C) 2013-2014 Saxonia Systems AG
 *
 * SynchronizeFX is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * SynchronizeFX is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with SynchronizeFX. If not, see <http://www.gnu.org/licenses/>.
 */

package de.saxsys.synchronizefx.core.metamodel.executors.lists;

import de.saxsys.synchronizefx.core.metamodel.commands.AddToList;
import de.saxsys.synchronizefx.core.metamodel.commands.ListCommand;
import de.saxsys.synchronizefx.core.metamodel.commands.RemoveFromList;
import de.saxsys.synchronizefx.core.metamodel.commands.ReplaceInList;

/**
 * Repairs a remote {@link ReplaceInList} commands in relation to local {@link ListCommand}s and local
 * {@link ReplaceInList} commands in relation to remote {@link ListCommand}s.
 *
 * <p>
 * Repairing a {@link ReplaceInList} command can result in an {@link AddToList} command in the case that the element
 * that should be replaced was removed. Therefore all methods take a {@link ReplaceOrAddInList} command as input instead
 * of a simple {@link ReplaceInList}.
 * </p>
 *
 * @author Raik Bieniek
 */
class ReplaceInListRepairer {

    // /////////////////////
    // / remote commands ///
    // /////////////////////

    /**
     * Repairs a remote {@link ReplaceOrAddInList} in relation to a local {@link AddToList} command.
     * 
     * @param remoteCommand
     *            The remote command to repair.
     * @param localCommand
     *            The local command.
     * @return The repaired remote command.
     */
    public ReplaceOrAddInList repairRemoteCommand(final ReplaceOrAddInList remoteCommand, //
            final AddToList localCommand) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("not implemented yet");
    }

    /**
     * Repairs a remote {@link ReplaceOrAddInList} in relation to a local {@link AddToList} command.
     * 
     * @param remoteCommand
     *            The remote command to repair.
     * @param localCommand
     *            The local command.
     * @return The repaired remote command.
     */
    public ReplaceOrAddInList repairRemoteCommand(final ReplaceOrAddInList remoteCommand,
            final RemoveFromList localCommand) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("not implemented yet");
    }

    /**
     * Repairs a remote {@link ReplaceOrAddInList} in relation to a local {@link AddToList} command.
     * 
     * @param remoteCommand
     *            The remote command to repair.
     * @param localCommand
     *            The local command.
     * @return The repaired remote command.
     */
    public ReplaceOrAddInList repairRemoteCommand(final ReplaceOrAddInList remoteCommand,
            final ReplaceInList localCommand) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("not implemented yet");
    }

    // ////////////////////
    // / local commands ///
    // ////////////////////

    /**
     * Repairs a local {@link ReplaceInList} command in relation to a remote {@link AddToList} command.
     * 
     * @param localCommand
     *            The local command to repair.
     * @param remoteCommand
     *            The remote command.
     * @return The repaired local command
     */
    public ReplaceOrAddInList repairLocalCommand(final ReplaceInList localCommand, final AddToList remoteCommand) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("not implemented yet");
    }

    /**
     * Repairs a local {@link ReplaceInList} command in relation to a remote {@link RemoveFromListExcept} command.
     * 
     * @param localCommand
     *            The local command to repair.
     * @param remoteCommand
     *            The remote command.
     * @return The repaired local command
     */
    public ReplaceOrAddInList repairLocalCommand(final ReplaceInList localCommand,
            final RemoveFromListExcept remoteCommand) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("not implemented yet");
    }

    /**
     * Repairs a local {@link ReplaceInList} command in relation to a remote {@link ReplaceOrAddInList} command.
     * 
     * @param localCommand
     *            The local command to repair.
     * @param remoteCommand
     *            The remote command.
     * @return The repaired local command
     */
    public ReplaceOrAddInList repairLocalCommand(final ReplaceInList localCommand,
            final ReplaceOrAddInList remoteCommand) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("not implemented yet");
    }
}
