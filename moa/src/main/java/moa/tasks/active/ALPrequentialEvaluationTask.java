/*
 *    ALPrequentialEvaluationTask.java
 *    Copyright (C) 2017 Otto-von-Guericke-University, Magdeburg, Germany
 *    @author Cornelius Styp von Rekowski (cornelius.styp@ovgu.de)
 *
 *    This program is free software; you can redistribute it and/or modify
 *    it under the terms of the GNU General Public License as published by
 *    the Free Software Foundation; either version 3 of the License, or
 *    (at your option) any later version.
 *
 *    This program is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *    GNU General Public License for more details.
 *
 *    You should have received a copy of the GNU General Public License
 *    along with this program. If not, see <http://www.gnu.org/licenses/>.
 *    
 */
package moa.tasks.active;

import java.util.List;

import moa.core.ObjectRepository;
import moa.tasks.TaskMonitor;

/**
 * This task performs prequential evaluation for an active learning classifier 
 * (testing, then training with each example in sequence).
 * 
 * @author Cornelius Styp von Rekowski (cornelius.styp@ovgu.de)
 * @version $Revision: 1 $
 */
public class ALPrequentialEvaluationTask extends ALMainTask {
	
	private static final long serialVersionUID = 1L;

	@Override
	public Class<?> getTaskResultType() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	protected Object doMainTask(TaskMonitor monitor, ObjectRepository repository) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<ALTaskThread> getSubtaskThreads() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String getDisplayName() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public boolean isSubtask() {
		// TODO Auto-generated method stub
		return false;
	}
}
