/*
 * Copyright (c) 2018, 2025, Oracle and/or its affiliates.
 *
 * This program is free software; you can redistribute it and/or modify it under the terms of the GNU General Public License, version 2.0, as published by
 * the Free Software Foundation.
 *
 * This program is designed to work with certain software that is licensed under separate terms, as designated in a particular file or component or in
 * included license documentation. The authors of MySQL hereby grant you an additional permission to link the program and your derivative works with the
 * separately licensed software that they have either included with the program or referenced in the documentation.
 *
 * Without limiting anything contained in the foregoing, this file, which is part of MySQL Connector/J, is also subject to the Universal FOSS Exception,
 * version 1.0, a copy of which can be found at http://oss.oracle.com/licenses/universal-foss-exception.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License, version 2.0, for more details.
 *
 * You should have received a copy of the GNU General Public License along with this program; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA
 */

package com.mysql.cj.jdbc;

import java.math.BigInteger;
import java.sql.SQLException;

import com.mysql.cj.MysqlType;
import com.mysql.cj.QueryBindings;
import com.mysql.cj.QueryInfo;

public interface JdbcPreparedStatement extends java.sql.PreparedStatement, JdbcStatement {

    QueryBindings getQueryBindings();

    byte[] getBytesRepresentation(int parameterIndex) throws SQLException;

    QueryInfo getQueryInfo();

    boolean isNull(int paramIndex) throws SQLException;

    String getPreparedSql();

    void setBytes(int parameterIndex, byte[] x, boolean escapeIfNeeded) throws SQLException;

    void setBigInteger(int parameterIndex, BigInteger x) throws SQLException;

    void setNull(int parameterIndex, MysqlType mysqlType) throws SQLException;

    ParameterBindings getParameterBindings() throws SQLException;

}
