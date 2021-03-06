/*
 * IdaJava version 0.3
 * Copyright (c)2007-2010 by Christian Blichmann
 *
 * SWIG interface file for plugin exports
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, version 2 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

%ignore createSRarea; // Not exported in ida.lib
%ignore killSRareas; // Not exported in ida.lib
%ignore delSRarea; // Not exported in ida.lib
%ignore SRareaStart; // Not exported in ida.lib
%ignore SRareaEnd; // Not exported in ida.lib
%ignore splitSRarea; // Not exported in ida.lib
%ignore SRinit; // Not exported in ida.lib
%ignore SRterm; // Not exported in ida.lib
%ignore SRsave; // Not exported in ida.lib

%include <srarea.hpp>
