/**
Copyright (c) 2013 Carnegie Mellon University Silicon Valley. 
All rights reserved. 

This program and the accompanying materials are made available
under the terms of dual licensing(GPL V2 for Research/Education
purposes). GNU Public License v2.0 which accompanies this distribution
is available at http://www.gnu.org/licenses/old-licenses/gpl-2.0.html
This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. 

Please contact http://www.cmu.edu/silicon-valley/ if you have any 
questions.
 */
package servlet;

// TODO: Auto-generated Javadoc
/**
 * The Class CurrentWinner.
 */
public class CurrentWinner {
	 
 	/**
 	 * Gets the winner.
 	 *
 	 * @param room the room
 	 * @param start the start
 	 * @return the winner
 	 */
 	float getWinner(String room,Long start){
		float wintemp = 0;
		
		 
		 try {
			 wintemp = DbAccess.getCurrentWin(room,start);
			
			}
			catch ( Exception e ) {
		        System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		        System.exit(0);
		      }
		 return wintemp;
	
		}

}
