/*
 * Copyright (C) 2013 Martin Fousek & Mert Caliskan
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package javaone.con3638.resourcelibrariescontracts;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 * Holds only the information about used Resource Library Contract.
 *
 * @author Martin Fousek <marfous@netbeans.org>
 */
@Named
@SessionScoped
public class SetupBean implements Serializable {

    private String rlc = "rlc1";

    public String getRlc() {
        return rlc;
    }

    public void setRlc(String rlc) {
        this.rlc = rlc;
    }

}
