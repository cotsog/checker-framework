/*
 * Copyright (C) 2007 Júlio Vilmar Gesser.
 * 
 * This file is part of Java 1.5 parser and Abstract Syntax Tree.
 *
 * Java 1.5 parser and Abstract Syntax Tree is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Java 1.5 parser and Abstract Syntax Tree is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Java 1.5 parser and Abstract Syntax Tree.  If not, see <http://www.gnu.org/licenses/>.
 */
/*
 * Created on 05/10/2006
 */
package org.checkerframework.stubparser.ast.type;

import java.util.List;

import org.checkerframework.stubparser.ast.Node;
import org.checkerframework.stubparser.ast.expr.AnnotationExpr;

/**
 * @author Julio Vilmar Gesser
 */
public abstract class Type extends Node {

    private List<AnnotationExpr> annotations;

    public Type() {
    }

    public Type(int beginLine, int beginColumn, int endLine, int endColumn) {
        super(beginLine, beginColumn, endLine, endColumn);
    }

    public void setAnnotations(List<AnnotationExpr> annotations) {
        this.annotations = annotations;
    }

    public List<AnnotationExpr> getAnnotations() {
        return annotations;
    }

}
