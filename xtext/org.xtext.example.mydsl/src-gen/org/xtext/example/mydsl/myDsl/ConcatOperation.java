/**
 * generated by Xtext 2.37.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concat Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ConcatOperation#getTarget <em>Target</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ConcatOperation#getTables <em>Tables</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getConcatOperation()
 * @model
 * @generated
 */
public interface ConcatOperation extends TopLevelOperation
{
  /**
   * Returns the value of the '<em><b>Target</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' attribute.
   * @see #setTarget(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getConcatOperation_Target()
   * @model
   * @generated
   */
  String getTarget();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ConcatOperation#getTarget <em>Target</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' attribute.
   * @see #getTarget()
   * @generated
   */
  void setTarget(String value);

  /**
   * Returns the value of the '<em><b>Tables</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tables</em>' attribute list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getConcatOperation_Tables()
   * @model unique="false"
   * @generated
   */
  EList<String> getTables();

} // ConcatOperation
