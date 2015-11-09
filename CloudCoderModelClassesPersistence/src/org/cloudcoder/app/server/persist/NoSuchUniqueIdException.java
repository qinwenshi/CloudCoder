// CloudCoder - a web-based pedagogical programming environment
// Copyright (C) 2011-2015, Jaime Spacco <jspacco@knox.edu>
// Copyright (C) 2011-2015, David H. Hovemeyer <david.hovemeyer@gmail.com>
//
// This program is free software: you can redistribute it and/or modify
// it under the terms of the GNU Affero General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU Affero General Public License for more details.
//
// You should have received a copy of the GNU Affero General Public License
// along with this program.  If not, see <http://www.gnu.org/licenses/>.

package org.cloudcoder.app.server.persist;

import java.sql.SQLException;

/**
 * Exception type for failures due to an attempt to refer
 * to a nonexistent object by its unique id.
 * 
 * @author David Hovemeyer
 */
public class NoSuchUniqueIdException extends SQLException {
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor.
	 * 
	 * @param msg message describing the exception
	 */
	public NoSuchUniqueIdException(String msg) {
		super(msg);
	}
	
	/**
	 * Constructor.
	 * 
	 * @param msg message describing the exception
	 * @param cause the exception which caused this exception
	 */
	public NoSuchUniqueIdException(String msg, Throwable cause) {
		super(msg, cause);
	}
}
