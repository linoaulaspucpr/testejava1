/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvoreavl;

/**
 *
 * @author eduardolino
 */
public class AvlNode {
	protected int height;       // Height
	protected int key;
    protected AvlNode left, right;

    public AvlNode ( int theElement ) {
        this( theElement, null, null );
    }

    public AvlNode ( int theElement, AvlNode lt, AvlNode rt ) {
        key = theElement;
        left = lt;
        right = rt;
        height   = 0;
    }
}
