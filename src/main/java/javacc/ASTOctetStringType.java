/* Generated By:JJTree: Do not edit this line. ASTOctetStringType.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package javacc;

public
class ASTOctetStringType extends SimpleNode {
  public ASTOctetStringType(int id) {
    super(id);
  }

  public ASTOctetStringType(AsnParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(AsnParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=d01dd5094503b2561bf9e3bc8b3ac4f8 (do not edit this line) */
