package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.loadJSON()'", "'.from('", "')'", "'.into('", "'.withAttributes'", "'('", "','", "'.nestedIn'", "'.loadXML()'", "'.loadYAML()'", "'.concatHorizontal()'", "'.toTable('", "'.onTables('", "'.filter()'", "'.onColumn('", "'.onTable('", "'.where('", "'value'", "'toTable'", "'.save()'", "'.tables('", "'.to('", "'.as('", "'.printAll()'", "'.printTable('", "'.renameColumn()'", "'.limit()'", "'.table('", "'.selectMax()'", "'.selectMin()'", "'.select()'", "'.columns('", "'fromTable'", "'.dropTable('", "'.processFolders('", "'with'", "'{'", "'}'", "'.end();'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMyDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:71:1: ruleModel returns [EObject current=null] : ( (lv_operations_0_0= ruleTopLevelOperation ) )+ ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_operations_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( (lv_operations_0_0= ruleTopLevelOperation ) )+ )
            // InternalMyDsl.g:78:2: ( (lv_operations_0_0= ruleTopLevelOperation ) )+
            {
            // InternalMyDsl.g:78:2: ( (lv_operations_0_0= ruleTopLevelOperation ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||(LA1_0>=19 && LA1_0<=21)||LA1_0==24||LA1_0==30||(LA1_0>=34 && LA1_0<=37)||(LA1_0>=39 && LA1_0<=41)||(LA1_0>=44 && LA1_0<=45)||LA1_0==49) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:79:3: (lv_operations_0_0= ruleTopLevelOperation )
            	    {
            	    // InternalMyDsl.g:79:3: (lv_operations_0_0= ruleTopLevelOperation )
            	    // InternalMyDsl.g:80:4: lv_operations_0_0= ruleTopLevelOperation
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getOperationsTopLevelOperationParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_operations_0_0=ruleTopLevelOperation();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"operations",
            	    					lv_operations_0_0,
            	    					"org.xtext.example.mydsl.MyDsl.TopLevelOperation");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleTopLevelOperation"
    // InternalMyDsl.g:100:1: entryRuleTopLevelOperation returns [EObject current=null] : iv_ruleTopLevelOperation= ruleTopLevelOperation EOF ;
    public final EObject entryRuleTopLevelOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopLevelOperation = null;


        try {
            // InternalMyDsl.g:100:58: (iv_ruleTopLevelOperation= ruleTopLevelOperation EOF )
            // InternalMyDsl.g:101:2: iv_ruleTopLevelOperation= ruleTopLevelOperation EOF
            {
             newCompositeNode(grammarAccess.getTopLevelOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTopLevelOperation=ruleTopLevelOperation();

            state._fsp--;

             current =iv_ruleTopLevelOperation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTopLevelOperation"


    // $ANTLR start "ruleTopLevelOperation"
    // InternalMyDsl.g:107:1: ruleTopLevelOperation returns [EObject current=null] : (this_LoadOperation_0= ruleLoadOperation | this_SelectOperation_1= ruleSelectOperation | this_ConcatOperation_2= ruleConcatOperation | this_SaveOperation_3= ruleSaveOperation | this_PrintOperation_4= rulePrintOperation | this_RenameOperation_5= ruleRenameOperation | this_LimitOperation_6= ruleLimitOperation | this_ArgMaxOperation_7= ruleArgMaxOperation | this_ArgMinOperation_8= ruleArgMinOperation | this_DropOperation_9= ruleDropOperation | this_FilterOperation_10= ruleFilterOperation | this_ProcessFoldersOperation_11= ruleProcessFoldersOperation | ( () ruleEndOperation ) ) ;
    public final EObject ruleTopLevelOperation() throws RecognitionException {
        EObject current = null;

        EObject this_LoadOperation_0 = null;

        EObject this_SelectOperation_1 = null;

        EObject this_ConcatOperation_2 = null;

        EObject this_SaveOperation_3 = null;

        EObject this_PrintOperation_4 = null;

        EObject this_RenameOperation_5 = null;

        EObject this_LimitOperation_6 = null;

        EObject this_ArgMaxOperation_7 = null;

        EObject this_ArgMinOperation_8 = null;

        EObject this_DropOperation_9 = null;

        EObject this_FilterOperation_10 = null;

        EObject this_ProcessFoldersOperation_11 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:113:2: ( (this_LoadOperation_0= ruleLoadOperation | this_SelectOperation_1= ruleSelectOperation | this_ConcatOperation_2= ruleConcatOperation | this_SaveOperation_3= ruleSaveOperation | this_PrintOperation_4= rulePrintOperation | this_RenameOperation_5= ruleRenameOperation | this_LimitOperation_6= ruleLimitOperation | this_ArgMaxOperation_7= ruleArgMaxOperation | this_ArgMinOperation_8= ruleArgMinOperation | this_DropOperation_9= ruleDropOperation | this_FilterOperation_10= ruleFilterOperation | this_ProcessFoldersOperation_11= ruleProcessFoldersOperation | ( () ruleEndOperation ) ) )
            // InternalMyDsl.g:114:2: (this_LoadOperation_0= ruleLoadOperation | this_SelectOperation_1= ruleSelectOperation | this_ConcatOperation_2= ruleConcatOperation | this_SaveOperation_3= ruleSaveOperation | this_PrintOperation_4= rulePrintOperation | this_RenameOperation_5= ruleRenameOperation | this_LimitOperation_6= ruleLimitOperation | this_ArgMaxOperation_7= ruleArgMaxOperation | this_ArgMinOperation_8= ruleArgMinOperation | this_DropOperation_9= ruleDropOperation | this_FilterOperation_10= ruleFilterOperation | this_ProcessFoldersOperation_11= ruleProcessFoldersOperation | ( () ruleEndOperation ) )
            {
            // InternalMyDsl.g:114:2: (this_LoadOperation_0= ruleLoadOperation | this_SelectOperation_1= ruleSelectOperation | this_ConcatOperation_2= ruleConcatOperation | this_SaveOperation_3= ruleSaveOperation | this_PrintOperation_4= rulePrintOperation | this_RenameOperation_5= ruleRenameOperation | this_LimitOperation_6= ruleLimitOperation | this_ArgMaxOperation_7= ruleArgMaxOperation | this_ArgMinOperation_8= ruleArgMinOperation | this_DropOperation_9= ruleDropOperation | this_FilterOperation_10= ruleFilterOperation | this_ProcessFoldersOperation_11= ruleProcessFoldersOperation | ( () ruleEndOperation ) )
            int alt2=13;
            switch ( input.LA(1) ) {
            case 11:
            case 19:
            case 20:
                {
                alt2=1;
                }
                break;
            case 41:
                {
                alt2=2;
                }
                break;
            case 21:
                {
                alt2=3;
                }
                break;
            case 30:
                {
                alt2=4;
                }
                break;
            case 34:
            case 35:
                {
                alt2=5;
                }
                break;
            case 36:
                {
                alt2=6;
                }
                break;
            case 37:
                {
                alt2=7;
                }
                break;
            case 39:
                {
                alt2=8;
                }
                break;
            case 40:
                {
                alt2=9;
                }
                break;
            case 44:
                {
                alt2=10;
                }
                break;
            case 24:
                {
                alt2=11;
                }
                break;
            case 45:
                {
                alt2=12;
                }
                break;
            case 49:
                {
                alt2=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:115:3: this_LoadOperation_0= ruleLoadOperation
                    {

                    			newCompositeNode(grammarAccess.getTopLevelOperationAccess().getLoadOperationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LoadOperation_0=ruleLoadOperation();

                    state._fsp--;


                    			current = this_LoadOperation_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:124:3: this_SelectOperation_1= ruleSelectOperation
                    {

                    			newCompositeNode(grammarAccess.getTopLevelOperationAccess().getSelectOperationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SelectOperation_1=ruleSelectOperation();

                    state._fsp--;


                    			current = this_SelectOperation_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:133:3: this_ConcatOperation_2= ruleConcatOperation
                    {

                    			newCompositeNode(grammarAccess.getTopLevelOperationAccess().getConcatOperationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConcatOperation_2=ruleConcatOperation();

                    state._fsp--;


                    			current = this_ConcatOperation_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:142:3: this_SaveOperation_3= ruleSaveOperation
                    {

                    			newCompositeNode(grammarAccess.getTopLevelOperationAccess().getSaveOperationParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_SaveOperation_3=ruleSaveOperation();

                    state._fsp--;


                    			current = this_SaveOperation_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:151:3: this_PrintOperation_4= rulePrintOperation
                    {

                    			newCompositeNode(grammarAccess.getTopLevelOperationAccess().getPrintOperationParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrintOperation_4=rulePrintOperation();

                    state._fsp--;


                    			current = this_PrintOperation_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:160:3: this_RenameOperation_5= ruleRenameOperation
                    {

                    			newCompositeNode(grammarAccess.getTopLevelOperationAccess().getRenameOperationParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_RenameOperation_5=ruleRenameOperation();

                    state._fsp--;


                    			current = this_RenameOperation_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:169:3: this_LimitOperation_6= ruleLimitOperation
                    {

                    			newCompositeNode(grammarAccess.getTopLevelOperationAccess().getLimitOperationParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_LimitOperation_6=ruleLimitOperation();

                    state._fsp--;


                    			current = this_LimitOperation_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:178:3: this_ArgMaxOperation_7= ruleArgMaxOperation
                    {

                    			newCompositeNode(grammarAccess.getTopLevelOperationAccess().getArgMaxOperationParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_ArgMaxOperation_7=ruleArgMaxOperation();

                    state._fsp--;


                    			current = this_ArgMaxOperation_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:187:3: this_ArgMinOperation_8= ruleArgMinOperation
                    {

                    			newCompositeNode(grammarAccess.getTopLevelOperationAccess().getArgMinOperationParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_ArgMinOperation_8=ruleArgMinOperation();

                    state._fsp--;


                    			current = this_ArgMinOperation_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:196:3: this_DropOperation_9= ruleDropOperation
                    {

                    			newCompositeNode(grammarAccess.getTopLevelOperationAccess().getDropOperationParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_DropOperation_9=ruleDropOperation();

                    state._fsp--;


                    			current = this_DropOperation_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalMyDsl.g:205:3: this_FilterOperation_10= ruleFilterOperation
                    {

                    			newCompositeNode(grammarAccess.getTopLevelOperationAccess().getFilterOperationParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_FilterOperation_10=ruleFilterOperation();

                    state._fsp--;


                    			current = this_FilterOperation_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalMyDsl.g:214:3: this_ProcessFoldersOperation_11= ruleProcessFoldersOperation
                    {

                    			newCompositeNode(grammarAccess.getTopLevelOperationAccess().getProcessFoldersOperationParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProcessFoldersOperation_11=ruleProcessFoldersOperation();

                    state._fsp--;


                    			current = this_ProcessFoldersOperation_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalMyDsl.g:223:3: ( () ruleEndOperation )
                    {
                    // InternalMyDsl.g:223:3: ( () ruleEndOperation )
                    // InternalMyDsl.g:224:4: () ruleEndOperation
                    {
                    // InternalMyDsl.g:224:4: ()
                    // InternalMyDsl.g:225:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTopLevelOperationAccess().getTopLevelOperationAction_12_0(),
                    						current);
                    				

                    }


                    				newCompositeNode(grammarAccess.getTopLevelOperationAccess().getEndOperationParserRuleCall_12_1());
                    			
                    pushFollow(FOLLOW_2);
                    ruleEndOperation();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTopLevelOperation"


    // $ANTLR start "entryRuleLoadOperation"
    // InternalMyDsl.g:243:1: entryRuleLoadOperation returns [EObject current=null] : iv_ruleLoadOperation= ruleLoadOperation EOF ;
    public final EObject entryRuleLoadOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoadOperation = null;


        try {
            // InternalMyDsl.g:243:54: (iv_ruleLoadOperation= ruleLoadOperation EOF )
            // InternalMyDsl.g:244:2: iv_ruleLoadOperation= ruleLoadOperation EOF
            {
             newCompositeNode(grammarAccess.getLoadOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoadOperation=ruleLoadOperation();

            state._fsp--;

             current =iv_ruleLoadOperation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLoadOperation"


    // $ANTLR start "ruleLoadOperation"
    // InternalMyDsl.g:250:1: ruleLoadOperation returns [EObject current=null] : (this_LoadJSON_0= ruleLoadJSON | this_LoadXML_1= ruleLoadXML | this_LoadYAML_2= ruleLoadYAML ) ;
    public final EObject ruleLoadOperation() throws RecognitionException {
        EObject current = null;

        EObject this_LoadJSON_0 = null;

        EObject this_LoadXML_1 = null;

        EObject this_LoadYAML_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:256:2: ( (this_LoadJSON_0= ruleLoadJSON | this_LoadXML_1= ruleLoadXML | this_LoadYAML_2= ruleLoadYAML ) )
            // InternalMyDsl.g:257:2: (this_LoadJSON_0= ruleLoadJSON | this_LoadXML_1= ruleLoadXML | this_LoadYAML_2= ruleLoadYAML )
            {
            // InternalMyDsl.g:257:2: (this_LoadJSON_0= ruleLoadJSON | this_LoadXML_1= ruleLoadXML | this_LoadYAML_2= ruleLoadYAML )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 19:
                {
                alt3=2;
                }
                break;
            case 20:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:258:3: this_LoadJSON_0= ruleLoadJSON
                    {

                    			newCompositeNode(grammarAccess.getLoadOperationAccess().getLoadJSONParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LoadJSON_0=ruleLoadJSON();

                    state._fsp--;


                    			current = this_LoadJSON_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:267:3: this_LoadXML_1= ruleLoadXML
                    {

                    			newCompositeNode(grammarAccess.getLoadOperationAccess().getLoadXMLParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LoadXML_1=ruleLoadXML();

                    state._fsp--;


                    			current = this_LoadXML_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:276:3: this_LoadYAML_2= ruleLoadYAML
                    {

                    			newCompositeNode(grammarAccess.getLoadOperationAccess().getLoadYAMLParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_LoadYAML_2=ruleLoadYAML();

                    state._fsp--;


                    			current = this_LoadYAML_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLoadOperation"


    // $ANTLR start "entryRuleLoadJSON"
    // InternalMyDsl.g:288:1: entryRuleLoadJSON returns [EObject current=null] : iv_ruleLoadJSON= ruleLoadJSON EOF ;
    public final EObject entryRuleLoadJSON() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoadJSON = null;


        try {
            // InternalMyDsl.g:288:49: (iv_ruleLoadJSON= ruleLoadJSON EOF )
            // InternalMyDsl.g:289:2: iv_ruleLoadJSON= ruleLoadJSON EOF
            {
             newCompositeNode(grammarAccess.getLoadJSONRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoadJSON=ruleLoadJSON();

            state._fsp--;

             current =iv_ruleLoadJSON; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLoadJSON"


    // $ANTLR start "ruleLoadJSON"
    // InternalMyDsl.g:295:1: ruleLoadJSON returns [EObject current=null] : (otherlv_0= '.loadJSON()' otherlv_1= '.from(' ( (lv_file_2_0= RULE_STRING ) ) otherlv_3= ')' otherlv_4= '.into(' ( (lv_table_5_0= RULE_STRING ) ) otherlv_6= ')' (otherlv_7= '.withAttributes' otherlv_8= '(' ( (lv_attributes_9_0= RULE_STRING ) ) (otherlv_10= ',' ( (lv_attributes_11_0= RULE_STRING ) ) )* otherlv_12= ')' )? (otherlv_13= '.nestedIn' otherlv_14= '(' ( (lv_nested_15_0= RULE_STRING ) ) (otherlv_16= ',' ( (lv_nested_17_0= RULE_STRING ) ) )* otherlv_18= ')' )? ) ;
    public final EObject ruleLoadJSON() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_file_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_table_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_attributes_9_0=null;
        Token otherlv_10=null;
        Token lv_attributes_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token lv_nested_15_0=null;
        Token otherlv_16=null;
        Token lv_nested_17_0=null;
        Token otherlv_18=null;


        	enterRule();

        try {
            // InternalMyDsl.g:301:2: ( (otherlv_0= '.loadJSON()' otherlv_1= '.from(' ( (lv_file_2_0= RULE_STRING ) ) otherlv_3= ')' otherlv_4= '.into(' ( (lv_table_5_0= RULE_STRING ) ) otherlv_6= ')' (otherlv_7= '.withAttributes' otherlv_8= '(' ( (lv_attributes_9_0= RULE_STRING ) ) (otherlv_10= ',' ( (lv_attributes_11_0= RULE_STRING ) ) )* otherlv_12= ')' )? (otherlv_13= '.nestedIn' otherlv_14= '(' ( (lv_nested_15_0= RULE_STRING ) ) (otherlv_16= ',' ( (lv_nested_17_0= RULE_STRING ) ) )* otherlv_18= ')' )? ) )
            // InternalMyDsl.g:302:2: (otherlv_0= '.loadJSON()' otherlv_1= '.from(' ( (lv_file_2_0= RULE_STRING ) ) otherlv_3= ')' otherlv_4= '.into(' ( (lv_table_5_0= RULE_STRING ) ) otherlv_6= ')' (otherlv_7= '.withAttributes' otherlv_8= '(' ( (lv_attributes_9_0= RULE_STRING ) ) (otherlv_10= ',' ( (lv_attributes_11_0= RULE_STRING ) ) )* otherlv_12= ')' )? (otherlv_13= '.nestedIn' otherlv_14= '(' ( (lv_nested_15_0= RULE_STRING ) ) (otherlv_16= ',' ( (lv_nested_17_0= RULE_STRING ) ) )* otherlv_18= ')' )? )
            {
            // InternalMyDsl.g:302:2: (otherlv_0= '.loadJSON()' otherlv_1= '.from(' ( (lv_file_2_0= RULE_STRING ) ) otherlv_3= ')' otherlv_4= '.into(' ( (lv_table_5_0= RULE_STRING ) ) otherlv_6= ')' (otherlv_7= '.withAttributes' otherlv_8= '(' ( (lv_attributes_9_0= RULE_STRING ) ) (otherlv_10= ',' ( (lv_attributes_11_0= RULE_STRING ) ) )* otherlv_12= ')' )? (otherlv_13= '.nestedIn' otherlv_14= '(' ( (lv_nested_15_0= RULE_STRING ) ) (otherlv_16= ',' ( (lv_nested_17_0= RULE_STRING ) ) )* otherlv_18= ')' )? )
            // InternalMyDsl.g:303:3: otherlv_0= '.loadJSON()' otherlv_1= '.from(' ( (lv_file_2_0= RULE_STRING ) ) otherlv_3= ')' otherlv_4= '.into(' ( (lv_table_5_0= RULE_STRING ) ) otherlv_6= ')' (otherlv_7= '.withAttributes' otherlv_8= '(' ( (lv_attributes_9_0= RULE_STRING ) ) (otherlv_10= ',' ( (lv_attributes_11_0= RULE_STRING ) ) )* otherlv_12= ')' )? (otherlv_13= '.nestedIn' otherlv_14= '(' ( (lv_nested_15_0= RULE_STRING ) ) (otherlv_16= ',' ( (lv_nested_17_0= RULE_STRING ) ) )* otherlv_18= ')' )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLoadJSONAccess().getLoadJSONKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getLoadJSONAccess().getFromKeyword_1());
            		
            // InternalMyDsl.g:311:3: ( (lv_file_2_0= RULE_STRING ) )
            // InternalMyDsl.g:312:4: (lv_file_2_0= RULE_STRING )
            {
            // InternalMyDsl.g:312:4: (lv_file_2_0= RULE_STRING )
            // InternalMyDsl.g:313:5: lv_file_2_0= RULE_STRING
            {
            lv_file_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_file_2_0, grammarAccess.getLoadJSONAccess().getFileSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLoadJSONRule());
            					}
            					setWithLastConsumed(
            						current,
            						"file",
            						lv_file_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getLoadJSONAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getLoadJSONAccess().getIntoKeyword_4());
            		
            // InternalMyDsl.g:337:3: ( (lv_table_5_0= RULE_STRING ) )
            // InternalMyDsl.g:338:4: (lv_table_5_0= RULE_STRING )
            {
            // InternalMyDsl.g:338:4: (lv_table_5_0= RULE_STRING )
            // InternalMyDsl.g:339:5: lv_table_5_0= RULE_STRING
            {
            lv_table_5_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_table_5_0, grammarAccess.getLoadJSONAccess().getTableSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLoadJSONRule());
            					}
            					setWithLastConsumed(
            						current,
            						"table",
            						lv_table_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getLoadJSONAccess().getRightParenthesisKeyword_6());
            		
            // InternalMyDsl.g:359:3: (otherlv_7= '.withAttributes' otherlv_8= '(' ( (lv_attributes_9_0= RULE_STRING ) ) (otherlv_10= ',' ( (lv_attributes_11_0= RULE_STRING ) ) )* otherlv_12= ')' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:360:4: otherlv_7= '.withAttributes' otherlv_8= '(' ( (lv_attributes_9_0= RULE_STRING ) ) (otherlv_10= ',' ( (lv_attributes_11_0= RULE_STRING ) ) )* otherlv_12= ')'
                    {
                    otherlv_7=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_7, grammarAccess.getLoadJSONAccess().getWithAttributesKeyword_7_0());
                    			
                    otherlv_8=(Token)match(input,16,FOLLOW_5); 

                    				newLeafNode(otherlv_8, grammarAccess.getLoadJSONAccess().getLeftParenthesisKeyword_7_1());
                    			
                    // InternalMyDsl.g:368:4: ( (lv_attributes_9_0= RULE_STRING ) )
                    // InternalMyDsl.g:369:5: (lv_attributes_9_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:369:5: (lv_attributes_9_0= RULE_STRING )
                    // InternalMyDsl.g:370:6: lv_attributes_9_0= RULE_STRING
                    {
                    lv_attributes_9_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

                    						newLeafNode(lv_attributes_9_0, grammarAccess.getLoadJSONAccess().getAttributesSTRINGTerminalRuleCall_7_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLoadJSONRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"attributes",
                    							lv_attributes_9_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalMyDsl.g:386:4: (otherlv_10= ',' ( (lv_attributes_11_0= RULE_STRING ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==17) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalMyDsl.g:387:5: otherlv_10= ',' ( (lv_attributes_11_0= RULE_STRING ) )
                    	    {
                    	    otherlv_10=(Token)match(input,17,FOLLOW_5); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getLoadJSONAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalMyDsl.g:391:5: ( (lv_attributes_11_0= RULE_STRING ) )
                    	    // InternalMyDsl.g:392:6: (lv_attributes_11_0= RULE_STRING )
                    	    {
                    	    // InternalMyDsl.g:392:6: (lv_attributes_11_0= RULE_STRING )
                    	    // InternalMyDsl.g:393:7: lv_attributes_11_0= RULE_STRING
                    	    {
                    	    lv_attributes_11_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

                    	    							newLeafNode(lv_attributes_11_0, grammarAccess.getLoadJSONAccess().getAttributesSTRINGTerminalRuleCall_7_3_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getLoadJSONRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"attributes",
                    	    								lv_attributes_11_0,
                    	    								"org.eclipse.xtext.common.Terminals.STRING");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,13,FOLLOW_11); 

                    				newLeafNode(otherlv_12, grammarAccess.getLoadJSONAccess().getRightParenthesisKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:415:3: (otherlv_13= '.nestedIn' otherlv_14= '(' ( (lv_nested_15_0= RULE_STRING ) ) (otherlv_16= ',' ( (lv_nested_17_0= RULE_STRING ) ) )* otherlv_18= ')' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:416:4: otherlv_13= '.nestedIn' otherlv_14= '(' ( (lv_nested_15_0= RULE_STRING ) ) (otherlv_16= ',' ( (lv_nested_17_0= RULE_STRING ) ) )* otherlv_18= ')'
                    {
                    otherlv_13=(Token)match(input,18,FOLLOW_9); 

                    				newLeafNode(otherlv_13, grammarAccess.getLoadJSONAccess().getNestedInKeyword_8_0());
                    			
                    otherlv_14=(Token)match(input,16,FOLLOW_5); 

                    				newLeafNode(otherlv_14, grammarAccess.getLoadJSONAccess().getLeftParenthesisKeyword_8_1());
                    			
                    // InternalMyDsl.g:424:4: ( (lv_nested_15_0= RULE_STRING ) )
                    // InternalMyDsl.g:425:5: (lv_nested_15_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:425:5: (lv_nested_15_0= RULE_STRING )
                    // InternalMyDsl.g:426:6: lv_nested_15_0= RULE_STRING
                    {
                    lv_nested_15_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

                    						newLeafNode(lv_nested_15_0, grammarAccess.getLoadJSONAccess().getNestedSTRINGTerminalRuleCall_8_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLoadJSONRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"nested",
                    							lv_nested_15_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalMyDsl.g:442:4: (otherlv_16= ',' ( (lv_nested_17_0= RULE_STRING ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==17) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalMyDsl.g:443:5: otherlv_16= ',' ( (lv_nested_17_0= RULE_STRING ) )
                    	    {
                    	    otherlv_16=(Token)match(input,17,FOLLOW_5); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getLoadJSONAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalMyDsl.g:447:5: ( (lv_nested_17_0= RULE_STRING ) )
                    	    // InternalMyDsl.g:448:6: (lv_nested_17_0= RULE_STRING )
                    	    {
                    	    // InternalMyDsl.g:448:6: (lv_nested_17_0= RULE_STRING )
                    	    // InternalMyDsl.g:449:7: lv_nested_17_0= RULE_STRING
                    	    {
                    	    lv_nested_17_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

                    	    							newLeafNode(lv_nested_17_0, grammarAccess.getLoadJSONAccess().getNestedSTRINGTerminalRuleCall_8_3_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getLoadJSONRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"nested",
                    	    								lv_nested_17_0,
                    	    								"org.eclipse.xtext.common.Terminals.STRING");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_18, grammarAccess.getLoadJSONAccess().getRightParenthesisKeyword_8_4());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLoadJSON"


    // $ANTLR start "entryRuleLoadXML"
    // InternalMyDsl.g:475:1: entryRuleLoadXML returns [EObject current=null] : iv_ruleLoadXML= ruleLoadXML EOF ;
    public final EObject entryRuleLoadXML() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoadXML = null;


        try {
            // InternalMyDsl.g:475:48: (iv_ruleLoadXML= ruleLoadXML EOF )
            // InternalMyDsl.g:476:2: iv_ruleLoadXML= ruleLoadXML EOF
            {
             newCompositeNode(grammarAccess.getLoadXMLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoadXML=ruleLoadXML();

            state._fsp--;

             current =iv_ruleLoadXML; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLoadXML"


    // $ANTLR start "ruleLoadXML"
    // InternalMyDsl.g:482:1: ruleLoadXML returns [EObject current=null] : (otherlv_0= '.loadXML()' otherlv_1= '.from(' ( (lv_file_2_0= RULE_STRING ) ) otherlv_3= ')' otherlv_4= '.into(' ( (lv_table_5_0= RULE_STRING ) ) otherlv_6= ')' (otherlv_7= '.nestedIn' otherlv_8= '(' ( (lv_nested_9_0= RULE_STRING ) ) (otherlv_10= ',' ( (lv_nested_11_0= RULE_STRING ) ) )* otherlv_12= ')' )? ) ;
    public final EObject ruleLoadXML() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_file_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_table_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_nested_9_0=null;
        Token otherlv_10=null;
        Token lv_nested_11_0=null;
        Token otherlv_12=null;


        	enterRule();

        try {
            // InternalMyDsl.g:488:2: ( (otherlv_0= '.loadXML()' otherlv_1= '.from(' ( (lv_file_2_0= RULE_STRING ) ) otherlv_3= ')' otherlv_4= '.into(' ( (lv_table_5_0= RULE_STRING ) ) otherlv_6= ')' (otherlv_7= '.nestedIn' otherlv_8= '(' ( (lv_nested_9_0= RULE_STRING ) ) (otherlv_10= ',' ( (lv_nested_11_0= RULE_STRING ) ) )* otherlv_12= ')' )? ) )
            // InternalMyDsl.g:489:2: (otherlv_0= '.loadXML()' otherlv_1= '.from(' ( (lv_file_2_0= RULE_STRING ) ) otherlv_3= ')' otherlv_4= '.into(' ( (lv_table_5_0= RULE_STRING ) ) otherlv_6= ')' (otherlv_7= '.nestedIn' otherlv_8= '(' ( (lv_nested_9_0= RULE_STRING ) ) (otherlv_10= ',' ( (lv_nested_11_0= RULE_STRING ) ) )* otherlv_12= ')' )? )
            {
            // InternalMyDsl.g:489:2: (otherlv_0= '.loadXML()' otherlv_1= '.from(' ( (lv_file_2_0= RULE_STRING ) ) otherlv_3= ')' otherlv_4= '.into(' ( (lv_table_5_0= RULE_STRING ) ) otherlv_6= ')' (otherlv_7= '.nestedIn' otherlv_8= '(' ( (lv_nested_9_0= RULE_STRING ) ) (otherlv_10= ',' ( (lv_nested_11_0= RULE_STRING ) ) )* otherlv_12= ')' )? )
            // InternalMyDsl.g:490:3: otherlv_0= '.loadXML()' otherlv_1= '.from(' ( (lv_file_2_0= RULE_STRING ) ) otherlv_3= ')' otherlv_4= '.into(' ( (lv_table_5_0= RULE_STRING ) ) otherlv_6= ')' (otherlv_7= '.nestedIn' otherlv_8= '(' ( (lv_nested_9_0= RULE_STRING ) ) (otherlv_10= ',' ( (lv_nested_11_0= RULE_STRING ) ) )* otherlv_12= ')' )?
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLoadXMLAccess().getLoadXMLKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getLoadXMLAccess().getFromKeyword_1());
            		
            // InternalMyDsl.g:498:3: ( (lv_file_2_0= RULE_STRING ) )
            // InternalMyDsl.g:499:4: (lv_file_2_0= RULE_STRING )
            {
            // InternalMyDsl.g:499:4: (lv_file_2_0= RULE_STRING )
            // InternalMyDsl.g:500:5: lv_file_2_0= RULE_STRING
            {
            lv_file_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_file_2_0, grammarAccess.getLoadXMLAccess().getFileSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLoadXMLRule());
            					}
            					setWithLastConsumed(
            						current,
            						"file",
            						lv_file_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getLoadXMLAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getLoadXMLAccess().getIntoKeyword_4());
            		
            // InternalMyDsl.g:524:3: ( (lv_table_5_0= RULE_STRING ) )
            // InternalMyDsl.g:525:4: (lv_table_5_0= RULE_STRING )
            {
            // InternalMyDsl.g:525:4: (lv_table_5_0= RULE_STRING )
            // InternalMyDsl.g:526:5: lv_table_5_0= RULE_STRING
            {
            lv_table_5_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_table_5_0, grammarAccess.getLoadXMLAccess().getTableSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLoadXMLRule());
            					}
            					setWithLastConsumed(
            						current,
            						"table",
            						lv_table_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,13,FOLLOW_11); 

            			newLeafNode(otherlv_6, grammarAccess.getLoadXMLAccess().getRightParenthesisKeyword_6());
            		
            // InternalMyDsl.g:546:3: (otherlv_7= '.nestedIn' otherlv_8= '(' ( (lv_nested_9_0= RULE_STRING ) ) (otherlv_10= ',' ( (lv_nested_11_0= RULE_STRING ) ) )* otherlv_12= ')' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:547:4: otherlv_7= '.nestedIn' otherlv_8= '(' ( (lv_nested_9_0= RULE_STRING ) ) (otherlv_10= ',' ( (lv_nested_11_0= RULE_STRING ) ) )* otherlv_12= ')'
                    {
                    otherlv_7=(Token)match(input,18,FOLLOW_9); 

                    				newLeafNode(otherlv_7, grammarAccess.getLoadXMLAccess().getNestedInKeyword_7_0());
                    			
                    otherlv_8=(Token)match(input,16,FOLLOW_5); 

                    				newLeafNode(otherlv_8, grammarAccess.getLoadXMLAccess().getLeftParenthesisKeyword_7_1());
                    			
                    // InternalMyDsl.g:555:4: ( (lv_nested_9_0= RULE_STRING ) )
                    // InternalMyDsl.g:556:5: (lv_nested_9_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:556:5: (lv_nested_9_0= RULE_STRING )
                    // InternalMyDsl.g:557:6: lv_nested_9_0= RULE_STRING
                    {
                    lv_nested_9_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

                    						newLeafNode(lv_nested_9_0, grammarAccess.getLoadXMLAccess().getNestedSTRINGTerminalRuleCall_7_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLoadXMLRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"nested",
                    							lv_nested_9_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalMyDsl.g:573:4: (otherlv_10= ',' ( (lv_nested_11_0= RULE_STRING ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==17) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalMyDsl.g:574:5: otherlv_10= ',' ( (lv_nested_11_0= RULE_STRING ) )
                    	    {
                    	    otherlv_10=(Token)match(input,17,FOLLOW_5); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getLoadXMLAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalMyDsl.g:578:5: ( (lv_nested_11_0= RULE_STRING ) )
                    	    // InternalMyDsl.g:579:6: (lv_nested_11_0= RULE_STRING )
                    	    {
                    	    // InternalMyDsl.g:579:6: (lv_nested_11_0= RULE_STRING )
                    	    // InternalMyDsl.g:580:7: lv_nested_11_0= RULE_STRING
                    	    {
                    	    lv_nested_11_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

                    	    							newLeafNode(lv_nested_11_0, grammarAccess.getLoadXMLAccess().getNestedSTRINGTerminalRuleCall_7_3_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getLoadXMLRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"nested",
                    	    								lv_nested_11_0,
                    	    								"org.eclipse.xtext.common.Terminals.STRING");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_12, grammarAccess.getLoadXMLAccess().getRightParenthesisKeyword_7_4());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLoadXML"


    // $ANTLR start "entryRuleLoadYAML"
    // InternalMyDsl.g:606:1: entryRuleLoadYAML returns [EObject current=null] : iv_ruleLoadYAML= ruleLoadYAML EOF ;
    public final EObject entryRuleLoadYAML() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoadYAML = null;


        try {
            // InternalMyDsl.g:606:49: (iv_ruleLoadYAML= ruleLoadYAML EOF )
            // InternalMyDsl.g:607:2: iv_ruleLoadYAML= ruleLoadYAML EOF
            {
             newCompositeNode(grammarAccess.getLoadYAMLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoadYAML=ruleLoadYAML();

            state._fsp--;

             current =iv_ruleLoadYAML; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLoadYAML"


    // $ANTLR start "ruleLoadYAML"
    // InternalMyDsl.g:613:1: ruleLoadYAML returns [EObject current=null] : (otherlv_0= '.loadYAML()' otherlv_1= '.from(' ( (lv_file_2_0= RULE_STRING ) ) otherlv_3= ')' otherlv_4= '.into(' ( (lv_table_5_0= RULE_STRING ) ) otherlv_6= ')' (otherlv_7= '.nestedIn' otherlv_8= '(' ( (lv_nested_9_0= RULE_STRING ) ) (otherlv_10= ',' ( (lv_nested_11_0= RULE_STRING ) ) )* otherlv_12= ')' )? ) ;
    public final EObject ruleLoadYAML() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_file_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_table_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_nested_9_0=null;
        Token otherlv_10=null;
        Token lv_nested_11_0=null;
        Token otherlv_12=null;


        	enterRule();

        try {
            // InternalMyDsl.g:619:2: ( (otherlv_0= '.loadYAML()' otherlv_1= '.from(' ( (lv_file_2_0= RULE_STRING ) ) otherlv_3= ')' otherlv_4= '.into(' ( (lv_table_5_0= RULE_STRING ) ) otherlv_6= ')' (otherlv_7= '.nestedIn' otherlv_8= '(' ( (lv_nested_9_0= RULE_STRING ) ) (otherlv_10= ',' ( (lv_nested_11_0= RULE_STRING ) ) )* otherlv_12= ')' )? ) )
            // InternalMyDsl.g:620:2: (otherlv_0= '.loadYAML()' otherlv_1= '.from(' ( (lv_file_2_0= RULE_STRING ) ) otherlv_3= ')' otherlv_4= '.into(' ( (lv_table_5_0= RULE_STRING ) ) otherlv_6= ')' (otherlv_7= '.nestedIn' otherlv_8= '(' ( (lv_nested_9_0= RULE_STRING ) ) (otherlv_10= ',' ( (lv_nested_11_0= RULE_STRING ) ) )* otherlv_12= ')' )? )
            {
            // InternalMyDsl.g:620:2: (otherlv_0= '.loadYAML()' otherlv_1= '.from(' ( (lv_file_2_0= RULE_STRING ) ) otherlv_3= ')' otherlv_4= '.into(' ( (lv_table_5_0= RULE_STRING ) ) otherlv_6= ')' (otherlv_7= '.nestedIn' otherlv_8= '(' ( (lv_nested_9_0= RULE_STRING ) ) (otherlv_10= ',' ( (lv_nested_11_0= RULE_STRING ) ) )* otherlv_12= ')' )? )
            // InternalMyDsl.g:621:3: otherlv_0= '.loadYAML()' otherlv_1= '.from(' ( (lv_file_2_0= RULE_STRING ) ) otherlv_3= ')' otherlv_4= '.into(' ( (lv_table_5_0= RULE_STRING ) ) otherlv_6= ')' (otherlv_7= '.nestedIn' otherlv_8= '(' ( (lv_nested_9_0= RULE_STRING ) ) (otherlv_10= ',' ( (lv_nested_11_0= RULE_STRING ) ) )* otherlv_12= ')' )?
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLoadYAMLAccess().getLoadYAMLKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getLoadYAMLAccess().getFromKeyword_1());
            		
            // InternalMyDsl.g:629:3: ( (lv_file_2_0= RULE_STRING ) )
            // InternalMyDsl.g:630:4: (lv_file_2_0= RULE_STRING )
            {
            // InternalMyDsl.g:630:4: (lv_file_2_0= RULE_STRING )
            // InternalMyDsl.g:631:5: lv_file_2_0= RULE_STRING
            {
            lv_file_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_file_2_0, grammarAccess.getLoadYAMLAccess().getFileSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLoadYAMLRule());
            					}
            					setWithLastConsumed(
            						current,
            						"file",
            						lv_file_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getLoadYAMLAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getLoadYAMLAccess().getIntoKeyword_4());
            		
            // InternalMyDsl.g:655:3: ( (lv_table_5_0= RULE_STRING ) )
            // InternalMyDsl.g:656:4: (lv_table_5_0= RULE_STRING )
            {
            // InternalMyDsl.g:656:4: (lv_table_5_0= RULE_STRING )
            // InternalMyDsl.g:657:5: lv_table_5_0= RULE_STRING
            {
            lv_table_5_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_table_5_0, grammarAccess.getLoadYAMLAccess().getTableSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLoadYAMLRule());
            					}
            					setWithLastConsumed(
            						current,
            						"table",
            						lv_table_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,13,FOLLOW_11); 

            			newLeafNode(otherlv_6, grammarAccess.getLoadYAMLAccess().getRightParenthesisKeyword_6());
            		
            // InternalMyDsl.g:677:3: (otherlv_7= '.nestedIn' otherlv_8= '(' ( (lv_nested_9_0= RULE_STRING ) ) (otherlv_10= ',' ( (lv_nested_11_0= RULE_STRING ) ) )* otherlv_12= ')' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==18) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:678:4: otherlv_7= '.nestedIn' otherlv_8= '(' ( (lv_nested_9_0= RULE_STRING ) ) (otherlv_10= ',' ( (lv_nested_11_0= RULE_STRING ) ) )* otherlv_12= ')'
                    {
                    otherlv_7=(Token)match(input,18,FOLLOW_9); 

                    				newLeafNode(otherlv_7, grammarAccess.getLoadYAMLAccess().getNestedInKeyword_7_0());
                    			
                    otherlv_8=(Token)match(input,16,FOLLOW_5); 

                    				newLeafNode(otherlv_8, grammarAccess.getLoadYAMLAccess().getLeftParenthesisKeyword_7_1());
                    			
                    // InternalMyDsl.g:686:4: ( (lv_nested_9_0= RULE_STRING ) )
                    // InternalMyDsl.g:687:5: (lv_nested_9_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:687:5: (lv_nested_9_0= RULE_STRING )
                    // InternalMyDsl.g:688:6: lv_nested_9_0= RULE_STRING
                    {
                    lv_nested_9_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

                    						newLeafNode(lv_nested_9_0, grammarAccess.getLoadYAMLAccess().getNestedSTRINGTerminalRuleCall_7_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLoadYAMLRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"nested",
                    							lv_nested_9_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalMyDsl.g:704:4: (otherlv_10= ',' ( (lv_nested_11_0= RULE_STRING ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==17) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalMyDsl.g:705:5: otherlv_10= ',' ( (lv_nested_11_0= RULE_STRING ) )
                    	    {
                    	    otherlv_10=(Token)match(input,17,FOLLOW_5); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getLoadYAMLAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalMyDsl.g:709:5: ( (lv_nested_11_0= RULE_STRING ) )
                    	    // InternalMyDsl.g:710:6: (lv_nested_11_0= RULE_STRING )
                    	    {
                    	    // InternalMyDsl.g:710:6: (lv_nested_11_0= RULE_STRING )
                    	    // InternalMyDsl.g:711:7: lv_nested_11_0= RULE_STRING
                    	    {
                    	    lv_nested_11_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

                    	    							newLeafNode(lv_nested_11_0, grammarAccess.getLoadYAMLAccess().getNestedSTRINGTerminalRuleCall_7_3_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getLoadYAMLRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"nested",
                    	    								lv_nested_11_0,
                    	    								"org.eclipse.xtext.common.Terminals.STRING");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_12, grammarAccess.getLoadYAMLAccess().getRightParenthesisKeyword_7_4());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLoadYAML"


    // $ANTLR start "entryRuleConcatOperation"
    // InternalMyDsl.g:737:1: entryRuleConcatOperation returns [EObject current=null] : iv_ruleConcatOperation= ruleConcatOperation EOF ;
    public final EObject entryRuleConcatOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcatOperation = null;


        try {
            // InternalMyDsl.g:737:56: (iv_ruleConcatOperation= ruleConcatOperation EOF )
            // InternalMyDsl.g:738:2: iv_ruleConcatOperation= ruleConcatOperation EOF
            {
             newCompositeNode(grammarAccess.getConcatOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConcatOperation=ruleConcatOperation();

            state._fsp--;

             current =iv_ruleConcatOperation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConcatOperation"


    // $ANTLR start "ruleConcatOperation"
    // InternalMyDsl.g:744:1: ruleConcatOperation returns [EObject current=null] : (otherlv_0= '.concatHorizontal()' otherlv_1= '.toTable(' ( (lv_target_2_0= RULE_STRING ) ) otherlv_3= ')' otherlv_4= '.onTables(' ( (lv_tables_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_tables_7_0= RULE_STRING ) ) )* otherlv_8= ')' ) ;
    public final EObject ruleConcatOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_target_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_tables_5_0=null;
        Token otherlv_6=null;
        Token lv_tables_7_0=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalMyDsl.g:750:2: ( (otherlv_0= '.concatHorizontal()' otherlv_1= '.toTable(' ( (lv_target_2_0= RULE_STRING ) ) otherlv_3= ')' otherlv_4= '.onTables(' ( (lv_tables_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_tables_7_0= RULE_STRING ) ) )* otherlv_8= ')' ) )
            // InternalMyDsl.g:751:2: (otherlv_0= '.concatHorizontal()' otherlv_1= '.toTable(' ( (lv_target_2_0= RULE_STRING ) ) otherlv_3= ')' otherlv_4= '.onTables(' ( (lv_tables_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_tables_7_0= RULE_STRING ) ) )* otherlv_8= ')' )
            {
            // InternalMyDsl.g:751:2: (otherlv_0= '.concatHorizontal()' otherlv_1= '.toTable(' ( (lv_target_2_0= RULE_STRING ) ) otherlv_3= ')' otherlv_4= '.onTables(' ( (lv_tables_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_tables_7_0= RULE_STRING ) ) )* otherlv_8= ')' )
            // InternalMyDsl.g:752:3: otherlv_0= '.concatHorizontal()' otherlv_1= '.toTable(' ( (lv_target_2_0= RULE_STRING ) ) otherlv_3= ')' otherlv_4= '.onTables(' ( (lv_tables_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_tables_7_0= RULE_STRING ) ) )* otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getConcatOperationAccess().getConcatHorizontalKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getConcatOperationAccess().getToTableKeyword_1());
            		
            // InternalMyDsl.g:760:3: ( (lv_target_2_0= RULE_STRING ) )
            // InternalMyDsl.g:761:4: (lv_target_2_0= RULE_STRING )
            {
            // InternalMyDsl.g:761:4: (lv_target_2_0= RULE_STRING )
            // InternalMyDsl.g:762:5: lv_target_2_0= RULE_STRING
            {
            lv_target_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_target_2_0, grammarAccess.getConcatOperationAccess().getTargetSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConcatOperationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"target",
            						lv_target_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getConcatOperationAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getConcatOperationAccess().getOnTablesKeyword_4());
            		
            // InternalMyDsl.g:786:3: ( (lv_tables_5_0= RULE_STRING ) )
            // InternalMyDsl.g:787:4: (lv_tables_5_0= RULE_STRING )
            {
            // InternalMyDsl.g:787:4: (lv_tables_5_0= RULE_STRING )
            // InternalMyDsl.g:788:5: lv_tables_5_0= RULE_STRING
            {
            lv_tables_5_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_tables_5_0, grammarAccess.getConcatOperationAccess().getTablesSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConcatOperationRule());
            					}
            					addWithLastConsumed(
            						current,
            						"tables",
            						lv_tables_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalMyDsl.g:804:3: (otherlv_6= ',' ( (lv_tables_7_0= RULE_STRING ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==17) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:805:4: otherlv_6= ',' ( (lv_tables_7_0= RULE_STRING ) )
            	    {
            	    otherlv_6=(Token)match(input,17,FOLLOW_5); 

            	    				newLeafNode(otherlv_6, grammarAccess.getConcatOperationAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalMyDsl.g:809:4: ( (lv_tables_7_0= RULE_STRING ) )
            	    // InternalMyDsl.g:810:5: (lv_tables_7_0= RULE_STRING )
            	    {
            	    // InternalMyDsl.g:810:5: (lv_tables_7_0= RULE_STRING )
            	    // InternalMyDsl.g:811:6: lv_tables_7_0= RULE_STRING
            	    {
            	    lv_tables_7_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            	    						newLeafNode(lv_tables_7_0, grammarAccess.getConcatOperationAccess().getTablesSTRINGTerminalRuleCall_6_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getConcatOperationRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"tables",
            	    							lv_tables_7_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_8=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getConcatOperationAccess().getRightParenthesisKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConcatOperation"


    // $ANTLR start "entryRuleFilterOperation"
    // InternalMyDsl.g:836:1: entryRuleFilterOperation returns [EObject current=null] : iv_ruleFilterOperation= ruleFilterOperation EOF ;
    public final EObject entryRuleFilterOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterOperation = null;


        try {
            // InternalMyDsl.g:836:56: (iv_ruleFilterOperation= ruleFilterOperation EOF )
            // InternalMyDsl.g:837:2: iv_ruleFilterOperation= ruleFilterOperation EOF
            {
             newCompositeNode(grammarAccess.getFilterOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFilterOperation=ruleFilterOperation();

            state._fsp--;

             current =iv_ruleFilterOperation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFilterOperation"


    // $ANTLR start "ruleFilterOperation"
    // InternalMyDsl.g:843:1: ruleFilterOperation returns [EObject current=null] : (otherlv_0= '.filter()' otherlv_1= '.onColumn(' ( (lv_column_2_0= RULE_STRING ) ) otherlv_3= ')' otherlv_4= '.onTable(' ( (lv_table_5_0= RULE_STRING ) ) otherlv_6= ')' otherlv_7= '.where(' ( (lv_condition_8_0= RULE_STRING ) ) otherlv_9= 'value' ( (lv_value_10_0= RULE_STRING ) ) (otherlv_11= 'toTable' ( (lv_target_12_0= RULE_STRING ) ) )? otherlv_13= ')' ) ;
    public final EObject ruleFilterOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_column_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_table_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_condition_8_0=null;
        Token otherlv_9=null;
        Token lv_value_10_0=null;
        Token otherlv_11=null;
        Token lv_target_12_0=null;
        Token otherlv_13=null;


        	enterRule();

        try {
            // InternalMyDsl.g:849:2: ( (otherlv_0= '.filter()' otherlv_1= '.onColumn(' ( (lv_column_2_0= RULE_STRING ) ) otherlv_3= ')' otherlv_4= '.onTable(' ( (lv_table_5_0= RULE_STRING ) ) otherlv_6= ')' otherlv_7= '.where(' ( (lv_condition_8_0= RULE_STRING ) ) otherlv_9= 'value' ( (lv_value_10_0= RULE_STRING ) ) (otherlv_11= 'toTable' ( (lv_target_12_0= RULE_STRING ) ) )? otherlv_13= ')' ) )
            // InternalMyDsl.g:850:2: (otherlv_0= '.filter()' otherlv_1= '.onColumn(' ( (lv_column_2_0= RULE_STRING ) ) otherlv_3= ')' otherlv_4= '.onTable(' ( (lv_table_5_0= RULE_STRING ) ) otherlv_6= ')' otherlv_7= '.where(' ( (lv_condition_8_0= RULE_STRING ) ) otherlv_9= 'value' ( (lv_value_10_0= RULE_STRING ) ) (otherlv_11= 'toTable' ( (lv_target_12_0= RULE_STRING ) ) )? otherlv_13= ')' )
            {
            // InternalMyDsl.g:850:2: (otherlv_0= '.filter()' otherlv_1= '.onColumn(' ( (lv_column_2_0= RULE_STRING ) ) otherlv_3= ')' otherlv_4= '.onTable(' ( (lv_table_5_0= RULE_STRING ) ) otherlv_6= ')' otherlv_7= '.where(' ( (lv_condition_8_0= RULE_STRING ) ) otherlv_9= 'value' ( (lv_value_10_0= RULE_STRING ) ) (otherlv_11= 'toTable' ( (lv_target_12_0= RULE_STRING ) ) )? otherlv_13= ')' )
            // InternalMyDsl.g:851:3: otherlv_0= '.filter()' otherlv_1= '.onColumn(' ( (lv_column_2_0= RULE_STRING ) ) otherlv_3= ')' otherlv_4= '.onTable(' ( (lv_table_5_0= RULE_STRING ) ) otherlv_6= ')' otherlv_7= '.where(' ( (lv_condition_8_0= RULE_STRING ) ) otherlv_9= 'value' ( (lv_value_10_0= RULE_STRING ) ) (otherlv_11= 'toTable' ( (lv_target_12_0= RULE_STRING ) ) )? otherlv_13= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getFilterOperationAccess().getFilterKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getFilterOperationAccess().getOnColumnKeyword_1());
            		
            // InternalMyDsl.g:859:3: ( (lv_column_2_0= RULE_STRING ) )
            // InternalMyDsl.g:860:4: (lv_column_2_0= RULE_STRING )
            {
            // InternalMyDsl.g:860:4: (lv_column_2_0= RULE_STRING )
            // InternalMyDsl.g:861:5: lv_column_2_0= RULE_STRING
            {
            lv_column_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_column_2_0, grammarAccess.getFilterOperationAccess().getColumnSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFilterOperationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"column",
            						lv_column_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getFilterOperationAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getFilterOperationAccess().getOnTableKeyword_4());
            		
            // InternalMyDsl.g:885:3: ( (lv_table_5_0= RULE_STRING ) )
            // InternalMyDsl.g:886:4: (lv_table_5_0= RULE_STRING )
            {
            // InternalMyDsl.g:886:4: (lv_table_5_0= RULE_STRING )
            // InternalMyDsl.g:887:5: lv_table_5_0= RULE_STRING
            {
            lv_table_5_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_table_5_0, grammarAccess.getFilterOperationAccess().getTableSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFilterOperationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"table",
            						lv_table_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,13,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getFilterOperationAccess().getRightParenthesisKeyword_6());
            		
            otherlv_7=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_7, grammarAccess.getFilterOperationAccess().getWhereKeyword_7());
            		
            // InternalMyDsl.g:911:3: ( (lv_condition_8_0= RULE_STRING ) )
            // InternalMyDsl.g:912:4: (lv_condition_8_0= RULE_STRING )
            {
            // InternalMyDsl.g:912:4: (lv_condition_8_0= RULE_STRING )
            // InternalMyDsl.g:913:5: lv_condition_8_0= RULE_STRING
            {
            lv_condition_8_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_condition_8_0, grammarAccess.getFilterOperationAccess().getConditionSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFilterOperationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"condition",
            						lv_condition_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_9=(Token)match(input,28,FOLLOW_5); 

            			newLeafNode(otherlv_9, grammarAccess.getFilterOperationAccess().getValueKeyword_9());
            		
            // InternalMyDsl.g:933:3: ( (lv_value_10_0= RULE_STRING ) )
            // InternalMyDsl.g:934:4: (lv_value_10_0= RULE_STRING )
            {
            // InternalMyDsl.g:934:4: (lv_value_10_0= RULE_STRING )
            // InternalMyDsl.g:935:5: lv_value_10_0= RULE_STRING
            {
            lv_value_10_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            					newLeafNode(lv_value_10_0, grammarAccess.getFilterOperationAccess().getValueSTRINGTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFilterOperationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_10_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalMyDsl.g:951:3: (otherlv_11= 'toTable' ( (lv_target_12_0= RULE_STRING ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==29) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:952:4: otherlv_11= 'toTable' ( (lv_target_12_0= RULE_STRING ) )
                    {
                    otherlv_11=(Token)match(input,29,FOLLOW_5); 

                    				newLeafNode(otherlv_11, grammarAccess.getFilterOperationAccess().getToTableKeyword_11_0());
                    			
                    // InternalMyDsl.g:956:4: ( (lv_target_12_0= RULE_STRING ) )
                    // InternalMyDsl.g:957:5: (lv_target_12_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:957:5: (lv_target_12_0= RULE_STRING )
                    // InternalMyDsl.g:958:6: lv_target_12_0= RULE_STRING
                    {
                    lv_target_12_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

                    						newLeafNode(lv_target_12_0, grammarAccess.getFilterOperationAccess().getTargetSTRINGTerminalRuleCall_11_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFilterOperationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"target",
                    							lv_target_12_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getFilterOperationAccess().getRightParenthesisKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFilterOperation"


    // $ANTLR start "entryRuleSaveOperation"
    // InternalMyDsl.g:983:1: entryRuleSaveOperation returns [EObject current=null] : iv_ruleSaveOperation= ruleSaveOperation EOF ;
    public final EObject entryRuleSaveOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSaveOperation = null;


        try {
            // InternalMyDsl.g:983:54: (iv_ruleSaveOperation= ruleSaveOperation EOF )
            // InternalMyDsl.g:984:2: iv_ruleSaveOperation= ruleSaveOperation EOF
            {
             newCompositeNode(grammarAccess.getSaveOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSaveOperation=ruleSaveOperation();

            state._fsp--;

             current =iv_ruleSaveOperation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSaveOperation"


    // $ANTLR start "ruleSaveOperation"
    // InternalMyDsl.g:990:1: ruleSaveOperation returns [EObject current=null] : (otherlv_0= '.save()' otherlv_1= '.tables(' ( (lv_tables_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_tables_4_0= RULE_STRING ) ) )* otherlv_5= ')' otherlv_6= '.to(' ( (lv_file_7_0= RULE_STRING ) ) otherlv_8= ')' otherlv_9= '.as(' ( (lv_format_10_0= RULE_STRING ) ) otherlv_11= ')' ) ;
    public final EObject ruleSaveOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_tables_2_0=null;
        Token otherlv_3=null;
        Token lv_tables_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_file_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_format_10_0=null;
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalMyDsl.g:996:2: ( (otherlv_0= '.save()' otherlv_1= '.tables(' ( (lv_tables_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_tables_4_0= RULE_STRING ) ) )* otherlv_5= ')' otherlv_6= '.to(' ( (lv_file_7_0= RULE_STRING ) ) otherlv_8= ')' otherlv_9= '.as(' ( (lv_format_10_0= RULE_STRING ) ) otherlv_11= ')' ) )
            // InternalMyDsl.g:997:2: (otherlv_0= '.save()' otherlv_1= '.tables(' ( (lv_tables_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_tables_4_0= RULE_STRING ) ) )* otherlv_5= ')' otherlv_6= '.to(' ( (lv_file_7_0= RULE_STRING ) ) otherlv_8= ')' otherlv_9= '.as(' ( (lv_format_10_0= RULE_STRING ) ) otherlv_11= ')' )
            {
            // InternalMyDsl.g:997:2: (otherlv_0= '.save()' otherlv_1= '.tables(' ( (lv_tables_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_tables_4_0= RULE_STRING ) ) )* otherlv_5= ')' otherlv_6= '.to(' ( (lv_file_7_0= RULE_STRING ) ) otherlv_8= ')' otherlv_9= '.as(' ( (lv_format_10_0= RULE_STRING ) ) otherlv_11= ')' )
            // InternalMyDsl.g:998:3: otherlv_0= '.save()' otherlv_1= '.tables(' ( (lv_tables_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_tables_4_0= RULE_STRING ) ) )* otherlv_5= ')' otherlv_6= '.to(' ( (lv_file_7_0= RULE_STRING ) ) otherlv_8= ')' otherlv_9= '.as(' ( (lv_format_10_0= RULE_STRING ) ) otherlv_11= ')'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getSaveOperationAccess().getSaveKeyword_0());
            		
            otherlv_1=(Token)match(input,31,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getSaveOperationAccess().getTablesKeyword_1());
            		
            // InternalMyDsl.g:1006:3: ( (lv_tables_2_0= RULE_STRING ) )
            // InternalMyDsl.g:1007:4: (lv_tables_2_0= RULE_STRING )
            {
            // InternalMyDsl.g:1007:4: (lv_tables_2_0= RULE_STRING )
            // InternalMyDsl.g:1008:5: lv_tables_2_0= RULE_STRING
            {
            lv_tables_2_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_tables_2_0, grammarAccess.getSaveOperationAccess().getTablesSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSaveOperationRule());
            					}
            					addWithLastConsumed(
            						current,
            						"tables",
            						lv_tables_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalMyDsl.g:1024:3: (otherlv_3= ',' ( (lv_tables_4_0= RULE_STRING ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==17) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:1025:4: otherlv_3= ',' ( (lv_tables_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,17,FOLLOW_5); 

            	    				newLeafNode(otherlv_3, grammarAccess.getSaveOperationAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalMyDsl.g:1029:4: ( (lv_tables_4_0= RULE_STRING ) )
            	    // InternalMyDsl.g:1030:5: (lv_tables_4_0= RULE_STRING )
            	    {
            	    // InternalMyDsl.g:1030:5: (lv_tables_4_0= RULE_STRING )
            	    // InternalMyDsl.g:1031:6: lv_tables_4_0= RULE_STRING
            	    {
            	    lv_tables_4_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            	    						newLeafNode(lv_tables_4_0, grammarAccess.getSaveOperationAccess().getTablesSTRINGTerminalRuleCall_3_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getSaveOperationRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"tables",
            	    							lv_tables_4_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_20); 

            			newLeafNode(otherlv_5, grammarAccess.getSaveOperationAccess().getRightParenthesisKeyword_4());
            		
            otherlv_6=(Token)match(input,32,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getSaveOperationAccess().getToKeyword_5());
            		
            // InternalMyDsl.g:1056:3: ( (lv_file_7_0= RULE_STRING ) )
            // InternalMyDsl.g:1057:4: (lv_file_7_0= RULE_STRING )
            {
            // InternalMyDsl.g:1057:4: (lv_file_7_0= RULE_STRING )
            // InternalMyDsl.g:1058:5: lv_file_7_0= RULE_STRING
            {
            lv_file_7_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_file_7_0, grammarAccess.getSaveOperationAccess().getFileSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSaveOperationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"file",
            						lv_file_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,13,FOLLOW_21); 

            			newLeafNode(otherlv_8, grammarAccess.getSaveOperationAccess().getRightParenthesisKeyword_7());
            		
            otherlv_9=(Token)match(input,33,FOLLOW_5); 

            			newLeafNode(otherlv_9, grammarAccess.getSaveOperationAccess().getAsKeyword_8());
            		
            // InternalMyDsl.g:1082:3: ( (lv_format_10_0= RULE_STRING ) )
            // InternalMyDsl.g:1083:4: (lv_format_10_0= RULE_STRING )
            {
            // InternalMyDsl.g:1083:4: (lv_format_10_0= RULE_STRING )
            // InternalMyDsl.g:1084:5: lv_format_10_0= RULE_STRING
            {
            lv_format_10_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_format_10_0, grammarAccess.getSaveOperationAccess().getFormatSTRINGTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSaveOperationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"format",
            						lv_format_10_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_11=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getSaveOperationAccess().getRightParenthesisKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSaveOperation"


    // $ANTLR start "entryRulePrintOperation"
    // InternalMyDsl.g:1108:1: entryRulePrintOperation returns [EObject current=null] : iv_rulePrintOperation= rulePrintOperation EOF ;
    public final EObject entryRulePrintOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrintOperation = null;


        try {
            // InternalMyDsl.g:1108:55: (iv_rulePrintOperation= rulePrintOperation EOF )
            // InternalMyDsl.g:1109:2: iv_rulePrintOperation= rulePrintOperation EOF
            {
             newCompositeNode(grammarAccess.getPrintOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrintOperation=rulePrintOperation();

            state._fsp--;

             current =iv_rulePrintOperation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrintOperation"


    // $ANTLR start "rulePrintOperation"
    // InternalMyDsl.g:1115:1: rulePrintOperation returns [EObject current=null] : ( ( () rulePrintAll ) | this_PrintTable_2= rulePrintTable ) ;
    public final EObject rulePrintOperation() throws RecognitionException {
        EObject current = null;

        EObject this_PrintTable_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1121:2: ( ( ( () rulePrintAll ) | this_PrintTable_2= rulePrintTable ) )
            // InternalMyDsl.g:1122:2: ( ( () rulePrintAll ) | this_PrintTable_2= rulePrintTable )
            {
            // InternalMyDsl.g:1122:2: ( ( () rulePrintAll ) | this_PrintTable_2= rulePrintTable )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==34) ) {
                alt15=1;
            }
            else if ( (LA15_0==35) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:1123:3: ( () rulePrintAll )
                    {
                    // InternalMyDsl.g:1123:3: ( () rulePrintAll )
                    // InternalMyDsl.g:1124:4: () rulePrintAll
                    {
                    // InternalMyDsl.g:1124:4: ()
                    // InternalMyDsl.g:1125:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrintOperationAccess().getPrintOperationAction_0_0(),
                    						current);
                    				

                    }


                    				newCompositeNode(grammarAccess.getPrintOperationAccess().getPrintAllParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_2);
                    rulePrintAll();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1140:3: this_PrintTable_2= rulePrintTable
                    {

                    			newCompositeNode(grammarAccess.getPrintOperationAccess().getPrintTableParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrintTable_2=rulePrintTable();

                    state._fsp--;


                    			current = this_PrintTable_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrintOperation"


    // $ANTLR start "entryRulePrintAll"
    // InternalMyDsl.g:1152:1: entryRulePrintAll returns [String current=null] : iv_rulePrintAll= rulePrintAll EOF ;
    public final String entryRulePrintAll() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrintAll = null;


        try {
            // InternalMyDsl.g:1152:48: (iv_rulePrintAll= rulePrintAll EOF )
            // InternalMyDsl.g:1153:2: iv_rulePrintAll= rulePrintAll EOF
            {
             newCompositeNode(grammarAccess.getPrintAllRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrintAll=rulePrintAll();

            state._fsp--;

             current =iv_rulePrintAll.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrintAll"


    // $ANTLR start "rulePrintAll"
    // InternalMyDsl.g:1159:1: rulePrintAll returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '.printAll()' ;
    public final AntlrDatatypeRuleToken rulePrintAll() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1165:2: (kw= '.printAll()' )
            // InternalMyDsl.g:1166:2: kw= '.printAll()'
            {
            kw=(Token)match(input,34,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getPrintAllAccess().getPrintAllKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrintAll"


    // $ANTLR start "entryRulePrintTable"
    // InternalMyDsl.g:1174:1: entryRulePrintTable returns [EObject current=null] : iv_rulePrintTable= rulePrintTable EOF ;
    public final EObject entryRulePrintTable() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrintTable = null;


        try {
            // InternalMyDsl.g:1174:51: (iv_rulePrintTable= rulePrintTable EOF )
            // InternalMyDsl.g:1175:2: iv_rulePrintTable= rulePrintTable EOF
            {
             newCompositeNode(grammarAccess.getPrintTableRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrintTable=rulePrintTable();

            state._fsp--;

             current =iv_rulePrintTable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrintTable"


    // $ANTLR start "rulePrintTable"
    // InternalMyDsl.g:1181:1: rulePrintTable returns [EObject current=null] : (otherlv_0= '.printTable(' ( (lv_table_1_0= RULE_STRING ) ) otherlv_2= ')' ) ;
    public final EObject rulePrintTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_table_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1187:2: ( (otherlv_0= '.printTable(' ( (lv_table_1_0= RULE_STRING ) ) otherlv_2= ')' ) )
            // InternalMyDsl.g:1188:2: (otherlv_0= '.printTable(' ( (lv_table_1_0= RULE_STRING ) ) otherlv_2= ')' )
            {
            // InternalMyDsl.g:1188:2: (otherlv_0= '.printTable(' ( (lv_table_1_0= RULE_STRING ) ) otherlv_2= ')' )
            // InternalMyDsl.g:1189:3: otherlv_0= '.printTable(' ( (lv_table_1_0= RULE_STRING ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getPrintTableAccess().getPrintTableKeyword_0());
            		
            // InternalMyDsl.g:1193:3: ( (lv_table_1_0= RULE_STRING ) )
            // InternalMyDsl.g:1194:4: (lv_table_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:1194:4: (lv_table_1_0= RULE_STRING )
            // InternalMyDsl.g:1195:5: lv_table_1_0= RULE_STRING
            {
            lv_table_1_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_table_1_0, grammarAccess.getPrintTableAccess().getTableSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPrintTableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"table",
            						lv_table_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getPrintTableAccess().getRightParenthesisKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrintTable"


    // $ANTLR start "entryRuleRenameOperation"
    // InternalMyDsl.g:1219:1: entryRuleRenameOperation returns [EObject current=null] : iv_ruleRenameOperation= ruleRenameOperation EOF ;
    public final EObject entryRuleRenameOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRenameOperation = null;


        try {
            // InternalMyDsl.g:1219:56: (iv_ruleRenameOperation= ruleRenameOperation EOF )
            // InternalMyDsl.g:1220:2: iv_ruleRenameOperation= ruleRenameOperation EOF
            {
             newCompositeNode(grammarAccess.getRenameOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRenameOperation=ruleRenameOperation();

            state._fsp--;

             current =iv_ruleRenameOperation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRenameOperation"


    // $ANTLR start "ruleRenameOperation"
    // InternalMyDsl.g:1226:1: ruleRenameOperation returns [EObject current=null] : (otherlv_0= '.renameColumn()' otherlv_1= '.from(' ( (lv_original_2_0= RULE_STRING ) ) otherlv_3= ')' otherlv_4= '.to(' ( (lv_renamed_5_0= RULE_STRING ) ) otherlv_6= ')' otherlv_7= '.onTable(' ( (lv_table_8_0= RULE_STRING ) ) otherlv_9= ')' ) ;
    public final EObject ruleRenameOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_original_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_renamed_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_table_8_0=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1232:2: ( (otherlv_0= '.renameColumn()' otherlv_1= '.from(' ( (lv_original_2_0= RULE_STRING ) ) otherlv_3= ')' otherlv_4= '.to(' ( (lv_renamed_5_0= RULE_STRING ) ) otherlv_6= ')' otherlv_7= '.onTable(' ( (lv_table_8_0= RULE_STRING ) ) otherlv_9= ')' ) )
            // InternalMyDsl.g:1233:2: (otherlv_0= '.renameColumn()' otherlv_1= '.from(' ( (lv_original_2_0= RULE_STRING ) ) otherlv_3= ')' otherlv_4= '.to(' ( (lv_renamed_5_0= RULE_STRING ) ) otherlv_6= ')' otherlv_7= '.onTable(' ( (lv_table_8_0= RULE_STRING ) ) otherlv_9= ')' )
            {
            // InternalMyDsl.g:1233:2: (otherlv_0= '.renameColumn()' otherlv_1= '.from(' ( (lv_original_2_0= RULE_STRING ) ) otherlv_3= ')' otherlv_4= '.to(' ( (lv_renamed_5_0= RULE_STRING ) ) otherlv_6= ')' otherlv_7= '.onTable(' ( (lv_table_8_0= RULE_STRING ) ) otherlv_9= ')' )
            // InternalMyDsl.g:1234:3: otherlv_0= '.renameColumn()' otherlv_1= '.from(' ( (lv_original_2_0= RULE_STRING ) ) otherlv_3= ')' otherlv_4= '.to(' ( (lv_renamed_5_0= RULE_STRING ) ) otherlv_6= ')' otherlv_7= '.onTable(' ( (lv_table_8_0= RULE_STRING ) ) otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRenameOperationAccess().getRenameColumnKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getRenameOperationAccess().getFromKeyword_1());
            		
            // InternalMyDsl.g:1242:3: ( (lv_original_2_0= RULE_STRING ) )
            // InternalMyDsl.g:1243:4: (lv_original_2_0= RULE_STRING )
            {
            // InternalMyDsl.g:1243:4: (lv_original_2_0= RULE_STRING )
            // InternalMyDsl.g:1244:5: lv_original_2_0= RULE_STRING
            {
            lv_original_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_original_2_0, grammarAccess.getRenameOperationAccess().getOriginalSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRenameOperationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"original",
            						lv_original_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getRenameOperationAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,32,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getRenameOperationAccess().getToKeyword_4());
            		
            // InternalMyDsl.g:1268:3: ( (lv_renamed_5_0= RULE_STRING ) )
            // InternalMyDsl.g:1269:4: (lv_renamed_5_0= RULE_STRING )
            {
            // InternalMyDsl.g:1269:4: (lv_renamed_5_0= RULE_STRING )
            // InternalMyDsl.g:1270:5: lv_renamed_5_0= RULE_STRING
            {
            lv_renamed_5_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_renamed_5_0, grammarAccess.getRenameOperationAccess().getRenamedSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRenameOperationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"renamed",
            						lv_renamed_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,13,FOLLOW_15); 

            			newLeafNode(otherlv_6, grammarAccess.getRenameOperationAccess().getRightParenthesisKeyword_6());
            		
            otherlv_7=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_7, grammarAccess.getRenameOperationAccess().getOnTableKeyword_7());
            		
            // InternalMyDsl.g:1294:3: ( (lv_table_8_0= RULE_STRING ) )
            // InternalMyDsl.g:1295:4: (lv_table_8_0= RULE_STRING )
            {
            // InternalMyDsl.g:1295:4: (lv_table_8_0= RULE_STRING )
            // InternalMyDsl.g:1296:5: lv_table_8_0= RULE_STRING
            {
            lv_table_8_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_table_8_0, grammarAccess.getRenameOperationAccess().getTableSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRenameOperationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"table",
            						lv_table_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_9=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getRenameOperationAccess().getRightParenthesisKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRenameOperation"


    // $ANTLR start "entryRuleLimitOperation"
    // InternalMyDsl.g:1320:1: entryRuleLimitOperation returns [EObject current=null] : iv_ruleLimitOperation= ruleLimitOperation EOF ;
    public final EObject entryRuleLimitOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLimitOperation = null;


        try {
            // InternalMyDsl.g:1320:55: (iv_ruleLimitOperation= ruleLimitOperation EOF )
            // InternalMyDsl.g:1321:2: iv_ruleLimitOperation= ruleLimitOperation EOF
            {
             newCompositeNode(grammarAccess.getLimitOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLimitOperation=ruleLimitOperation();

            state._fsp--;

             current =iv_ruleLimitOperation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLimitOperation"


    // $ANTLR start "ruleLimitOperation"
    // InternalMyDsl.g:1327:1: ruleLimitOperation returns [EObject current=null] : (otherlv_0= '.limit()' otherlv_1= '.table(' ( (lv_table_2_0= RULE_STRING ) ) otherlv_3= ')' otherlv_4= '.from(' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ')' otherlv_7= '.to(' ( (lv_end_8_0= RULE_INT ) ) otherlv_9= ')' ) ;
    public final EObject ruleLimitOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_table_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_start_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_end_8_0=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1333:2: ( (otherlv_0= '.limit()' otherlv_1= '.table(' ( (lv_table_2_0= RULE_STRING ) ) otherlv_3= ')' otherlv_4= '.from(' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ')' otherlv_7= '.to(' ( (lv_end_8_0= RULE_INT ) ) otherlv_9= ')' ) )
            // InternalMyDsl.g:1334:2: (otherlv_0= '.limit()' otherlv_1= '.table(' ( (lv_table_2_0= RULE_STRING ) ) otherlv_3= ')' otherlv_4= '.from(' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ')' otherlv_7= '.to(' ( (lv_end_8_0= RULE_INT ) ) otherlv_9= ')' )
            {
            // InternalMyDsl.g:1334:2: (otherlv_0= '.limit()' otherlv_1= '.table(' ( (lv_table_2_0= RULE_STRING ) ) otherlv_3= ')' otherlv_4= '.from(' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ')' otherlv_7= '.to(' ( (lv_end_8_0= RULE_INT ) ) otherlv_9= ')' )
            // InternalMyDsl.g:1335:3: otherlv_0= '.limit()' otherlv_1= '.table(' ( (lv_table_2_0= RULE_STRING ) ) otherlv_3= ')' otherlv_4= '.from(' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ')' otherlv_7= '.to(' ( (lv_end_8_0= RULE_INT ) ) otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getLimitOperationAccess().getLimitKeyword_0());
            		
            otherlv_1=(Token)match(input,38,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getLimitOperationAccess().getTableKeyword_1());
            		
            // InternalMyDsl.g:1343:3: ( (lv_table_2_0= RULE_STRING ) )
            // InternalMyDsl.g:1344:4: (lv_table_2_0= RULE_STRING )
            {
            // InternalMyDsl.g:1344:4: (lv_table_2_0= RULE_STRING )
            // InternalMyDsl.g:1345:5: lv_table_2_0= RULE_STRING
            {
            lv_table_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_table_2_0, grammarAccess.getLimitOperationAccess().getTableSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLimitOperationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"table",
            						lv_table_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getLimitOperationAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_23); 

            			newLeafNode(otherlv_4, grammarAccess.getLimitOperationAccess().getFromKeyword_4());
            		
            // InternalMyDsl.g:1369:3: ( (lv_start_5_0= RULE_INT ) )
            // InternalMyDsl.g:1370:4: (lv_start_5_0= RULE_INT )
            {
            // InternalMyDsl.g:1370:4: (lv_start_5_0= RULE_INT )
            // InternalMyDsl.g:1371:5: lv_start_5_0= RULE_INT
            {
            lv_start_5_0=(Token)match(input,RULE_INT,FOLLOW_6); 

            					newLeafNode(lv_start_5_0, grammarAccess.getLimitOperationAccess().getStartINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLimitOperationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"start",
            						lv_start_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,13,FOLLOW_20); 

            			newLeafNode(otherlv_6, grammarAccess.getLimitOperationAccess().getRightParenthesisKeyword_6());
            		
            otherlv_7=(Token)match(input,32,FOLLOW_23); 

            			newLeafNode(otherlv_7, grammarAccess.getLimitOperationAccess().getToKeyword_7());
            		
            // InternalMyDsl.g:1395:3: ( (lv_end_8_0= RULE_INT ) )
            // InternalMyDsl.g:1396:4: (lv_end_8_0= RULE_INT )
            {
            // InternalMyDsl.g:1396:4: (lv_end_8_0= RULE_INT )
            // InternalMyDsl.g:1397:5: lv_end_8_0= RULE_INT
            {
            lv_end_8_0=(Token)match(input,RULE_INT,FOLLOW_6); 

            					newLeafNode(lv_end_8_0, grammarAccess.getLimitOperationAccess().getEndINTTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLimitOperationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"end",
            						lv_end_8_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_9=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getLimitOperationAccess().getRightParenthesisKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLimitOperation"


    // $ANTLR start "entryRuleArgMaxOperation"
    // InternalMyDsl.g:1421:1: entryRuleArgMaxOperation returns [EObject current=null] : iv_ruleArgMaxOperation= ruleArgMaxOperation EOF ;
    public final EObject entryRuleArgMaxOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgMaxOperation = null;


        try {
            // InternalMyDsl.g:1421:56: (iv_ruleArgMaxOperation= ruleArgMaxOperation EOF )
            // InternalMyDsl.g:1422:2: iv_ruleArgMaxOperation= ruleArgMaxOperation EOF
            {
             newCompositeNode(grammarAccess.getArgMaxOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArgMaxOperation=ruleArgMaxOperation();

            state._fsp--;

             current =iv_ruleArgMaxOperation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArgMaxOperation"


    // $ANTLR start "ruleArgMaxOperation"
    // InternalMyDsl.g:1428:1: ruleArgMaxOperation returns [EObject current=null] : (otherlv_0= '.selectMax()' otherlv_1= '.onColumn(' ( (lv_column_2_0= RULE_STRING ) ) otherlv_3= ')' otherlv_4= '.onTable(' ( (lv_table_5_0= RULE_STRING ) ) otherlv_6= ')' otherlv_7= '.toTable(' ( (lv_target_8_0= RULE_STRING ) ) otherlv_9= ')' ) ;
    public final EObject ruleArgMaxOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_column_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_table_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_target_8_0=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1434:2: ( (otherlv_0= '.selectMax()' otherlv_1= '.onColumn(' ( (lv_column_2_0= RULE_STRING ) ) otherlv_3= ')' otherlv_4= '.onTable(' ( (lv_table_5_0= RULE_STRING ) ) otherlv_6= ')' otherlv_7= '.toTable(' ( (lv_target_8_0= RULE_STRING ) ) otherlv_9= ')' ) )
            // InternalMyDsl.g:1435:2: (otherlv_0= '.selectMax()' otherlv_1= '.onColumn(' ( (lv_column_2_0= RULE_STRING ) ) otherlv_3= ')' otherlv_4= '.onTable(' ( (lv_table_5_0= RULE_STRING ) ) otherlv_6= ')' otherlv_7= '.toTable(' ( (lv_target_8_0= RULE_STRING ) ) otherlv_9= ')' )
            {
            // InternalMyDsl.g:1435:2: (otherlv_0= '.selectMax()' otherlv_1= '.onColumn(' ( (lv_column_2_0= RULE_STRING ) ) otherlv_3= ')' otherlv_4= '.onTable(' ( (lv_table_5_0= RULE_STRING ) ) otherlv_6= ')' otherlv_7= '.toTable(' ( (lv_target_8_0= RULE_STRING ) ) otherlv_9= ')' )
            // InternalMyDsl.g:1436:3: otherlv_0= '.selectMax()' otherlv_1= '.onColumn(' ( (lv_column_2_0= RULE_STRING ) ) otherlv_3= ')' otherlv_4= '.onTable(' ( (lv_table_5_0= RULE_STRING ) ) otherlv_6= ')' otherlv_7= '.toTable(' ( (lv_target_8_0= RULE_STRING ) ) otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getArgMaxOperationAccess().getSelectMaxKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getArgMaxOperationAccess().getOnColumnKeyword_1());
            		
            // InternalMyDsl.g:1444:3: ( (lv_column_2_0= RULE_STRING ) )
            // InternalMyDsl.g:1445:4: (lv_column_2_0= RULE_STRING )
            {
            // InternalMyDsl.g:1445:4: (lv_column_2_0= RULE_STRING )
            // InternalMyDsl.g:1446:5: lv_column_2_0= RULE_STRING
            {
            lv_column_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_column_2_0, grammarAccess.getArgMaxOperationAccess().getColumnSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArgMaxOperationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"column",
            						lv_column_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getArgMaxOperationAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getArgMaxOperationAccess().getOnTableKeyword_4());
            		
            // InternalMyDsl.g:1470:3: ( (lv_table_5_0= RULE_STRING ) )
            // InternalMyDsl.g:1471:4: (lv_table_5_0= RULE_STRING )
            {
            // InternalMyDsl.g:1471:4: (lv_table_5_0= RULE_STRING )
            // InternalMyDsl.g:1472:5: lv_table_5_0= RULE_STRING
            {
            lv_table_5_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_table_5_0, grammarAccess.getArgMaxOperationAccess().getTableSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArgMaxOperationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"table",
            						lv_table_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,13,FOLLOW_12); 

            			newLeafNode(otherlv_6, grammarAccess.getArgMaxOperationAccess().getRightParenthesisKeyword_6());
            		
            otherlv_7=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_7, grammarAccess.getArgMaxOperationAccess().getToTableKeyword_7());
            		
            // InternalMyDsl.g:1496:3: ( (lv_target_8_0= RULE_STRING ) )
            // InternalMyDsl.g:1497:4: (lv_target_8_0= RULE_STRING )
            {
            // InternalMyDsl.g:1497:4: (lv_target_8_0= RULE_STRING )
            // InternalMyDsl.g:1498:5: lv_target_8_0= RULE_STRING
            {
            lv_target_8_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_target_8_0, grammarAccess.getArgMaxOperationAccess().getTargetSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArgMaxOperationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"target",
            						lv_target_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_9=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getArgMaxOperationAccess().getRightParenthesisKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArgMaxOperation"


    // $ANTLR start "entryRuleArgMinOperation"
    // InternalMyDsl.g:1522:1: entryRuleArgMinOperation returns [EObject current=null] : iv_ruleArgMinOperation= ruleArgMinOperation EOF ;
    public final EObject entryRuleArgMinOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgMinOperation = null;


        try {
            // InternalMyDsl.g:1522:56: (iv_ruleArgMinOperation= ruleArgMinOperation EOF )
            // InternalMyDsl.g:1523:2: iv_ruleArgMinOperation= ruleArgMinOperation EOF
            {
             newCompositeNode(grammarAccess.getArgMinOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArgMinOperation=ruleArgMinOperation();

            state._fsp--;

             current =iv_ruleArgMinOperation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArgMinOperation"


    // $ANTLR start "ruleArgMinOperation"
    // InternalMyDsl.g:1529:1: ruleArgMinOperation returns [EObject current=null] : (otherlv_0= '.selectMin()' otherlv_1= '.onColumn(' ( (lv_column_2_0= RULE_STRING ) ) otherlv_3= ')' otherlv_4= '.onTable(' ( (lv_table_5_0= RULE_STRING ) ) otherlv_6= ')' otherlv_7= '.toTable(' ( (lv_target_8_0= RULE_STRING ) ) otherlv_9= ')' ) ;
    public final EObject ruleArgMinOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_column_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_table_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_target_8_0=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1535:2: ( (otherlv_0= '.selectMin()' otherlv_1= '.onColumn(' ( (lv_column_2_0= RULE_STRING ) ) otherlv_3= ')' otherlv_4= '.onTable(' ( (lv_table_5_0= RULE_STRING ) ) otherlv_6= ')' otherlv_7= '.toTable(' ( (lv_target_8_0= RULE_STRING ) ) otherlv_9= ')' ) )
            // InternalMyDsl.g:1536:2: (otherlv_0= '.selectMin()' otherlv_1= '.onColumn(' ( (lv_column_2_0= RULE_STRING ) ) otherlv_3= ')' otherlv_4= '.onTable(' ( (lv_table_5_0= RULE_STRING ) ) otherlv_6= ')' otherlv_7= '.toTable(' ( (lv_target_8_0= RULE_STRING ) ) otherlv_9= ')' )
            {
            // InternalMyDsl.g:1536:2: (otherlv_0= '.selectMin()' otherlv_1= '.onColumn(' ( (lv_column_2_0= RULE_STRING ) ) otherlv_3= ')' otherlv_4= '.onTable(' ( (lv_table_5_0= RULE_STRING ) ) otherlv_6= ')' otherlv_7= '.toTable(' ( (lv_target_8_0= RULE_STRING ) ) otherlv_9= ')' )
            // InternalMyDsl.g:1537:3: otherlv_0= '.selectMin()' otherlv_1= '.onColumn(' ( (lv_column_2_0= RULE_STRING ) ) otherlv_3= ')' otherlv_4= '.onTable(' ( (lv_table_5_0= RULE_STRING ) ) otherlv_6= ')' otherlv_7= '.toTable(' ( (lv_target_8_0= RULE_STRING ) ) otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getArgMinOperationAccess().getSelectMinKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getArgMinOperationAccess().getOnColumnKeyword_1());
            		
            // InternalMyDsl.g:1545:3: ( (lv_column_2_0= RULE_STRING ) )
            // InternalMyDsl.g:1546:4: (lv_column_2_0= RULE_STRING )
            {
            // InternalMyDsl.g:1546:4: (lv_column_2_0= RULE_STRING )
            // InternalMyDsl.g:1547:5: lv_column_2_0= RULE_STRING
            {
            lv_column_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_column_2_0, grammarAccess.getArgMinOperationAccess().getColumnSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArgMinOperationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"column",
            						lv_column_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getArgMinOperationAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getArgMinOperationAccess().getOnTableKeyword_4());
            		
            // InternalMyDsl.g:1571:3: ( (lv_table_5_0= RULE_STRING ) )
            // InternalMyDsl.g:1572:4: (lv_table_5_0= RULE_STRING )
            {
            // InternalMyDsl.g:1572:4: (lv_table_5_0= RULE_STRING )
            // InternalMyDsl.g:1573:5: lv_table_5_0= RULE_STRING
            {
            lv_table_5_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_table_5_0, grammarAccess.getArgMinOperationAccess().getTableSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArgMinOperationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"table",
            						lv_table_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,13,FOLLOW_12); 

            			newLeafNode(otherlv_6, grammarAccess.getArgMinOperationAccess().getRightParenthesisKeyword_6());
            		
            otherlv_7=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_7, grammarAccess.getArgMinOperationAccess().getToTableKeyword_7());
            		
            // InternalMyDsl.g:1597:3: ( (lv_target_8_0= RULE_STRING ) )
            // InternalMyDsl.g:1598:4: (lv_target_8_0= RULE_STRING )
            {
            // InternalMyDsl.g:1598:4: (lv_target_8_0= RULE_STRING )
            // InternalMyDsl.g:1599:5: lv_target_8_0= RULE_STRING
            {
            lv_target_8_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_target_8_0, grammarAccess.getArgMinOperationAccess().getTargetSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArgMinOperationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"target",
            						lv_target_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_9=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getArgMinOperationAccess().getRightParenthesisKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArgMinOperation"


    // $ANTLR start "entryRuleSelectOperation"
    // InternalMyDsl.g:1623:1: entryRuleSelectOperation returns [EObject current=null] : iv_ruleSelectOperation= ruleSelectOperation EOF ;
    public final EObject entryRuleSelectOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectOperation = null;


        try {
            // InternalMyDsl.g:1623:56: (iv_ruleSelectOperation= ruleSelectOperation EOF )
            // InternalMyDsl.g:1624:2: iv_ruleSelectOperation= ruleSelectOperation EOF
            {
             newCompositeNode(grammarAccess.getSelectOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelectOperation=ruleSelectOperation();

            state._fsp--;

             current =iv_ruleSelectOperation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelectOperation"


    // $ANTLR start "ruleSelectOperation"
    // InternalMyDsl.g:1630:1: ruleSelectOperation returns [EObject current=null] : (otherlv_0= '.select()' otherlv_1= '.columns(' ( (lv_columns_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_columns_4_0= RULE_STRING ) ) )* otherlv_5= ')' otherlv_6= 'fromTable' ( (lv_table_7_0= RULE_STRING ) ) otherlv_8= 'toTable' ( (lv_target_9_0= RULE_STRING ) ) ) ;
    public final EObject ruleSelectOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_columns_2_0=null;
        Token otherlv_3=null;
        Token lv_columns_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_table_7_0=null;
        Token otherlv_8=null;
        Token lv_target_9_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1636:2: ( (otherlv_0= '.select()' otherlv_1= '.columns(' ( (lv_columns_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_columns_4_0= RULE_STRING ) ) )* otherlv_5= ')' otherlv_6= 'fromTable' ( (lv_table_7_0= RULE_STRING ) ) otherlv_8= 'toTable' ( (lv_target_9_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:1637:2: (otherlv_0= '.select()' otherlv_1= '.columns(' ( (lv_columns_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_columns_4_0= RULE_STRING ) ) )* otherlv_5= ')' otherlv_6= 'fromTable' ( (lv_table_7_0= RULE_STRING ) ) otherlv_8= 'toTable' ( (lv_target_9_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:1637:2: (otherlv_0= '.select()' otherlv_1= '.columns(' ( (lv_columns_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_columns_4_0= RULE_STRING ) ) )* otherlv_5= ')' otherlv_6= 'fromTable' ( (lv_table_7_0= RULE_STRING ) ) otherlv_8= 'toTable' ( (lv_target_9_0= RULE_STRING ) ) )
            // InternalMyDsl.g:1638:3: otherlv_0= '.select()' otherlv_1= '.columns(' ( (lv_columns_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_columns_4_0= RULE_STRING ) ) )* otherlv_5= ')' otherlv_6= 'fromTable' ( (lv_table_7_0= RULE_STRING ) ) otherlv_8= 'toTable' ( (lv_target_9_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getSelectOperationAccess().getSelectKeyword_0());
            		
            otherlv_1=(Token)match(input,42,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getSelectOperationAccess().getColumnsKeyword_1());
            		
            // InternalMyDsl.g:1646:3: ( (lv_columns_2_0= RULE_STRING ) )
            // InternalMyDsl.g:1647:4: (lv_columns_2_0= RULE_STRING )
            {
            // InternalMyDsl.g:1647:4: (lv_columns_2_0= RULE_STRING )
            // InternalMyDsl.g:1648:5: lv_columns_2_0= RULE_STRING
            {
            lv_columns_2_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_columns_2_0, grammarAccess.getSelectOperationAccess().getColumnsSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSelectOperationRule());
            					}
            					addWithLastConsumed(
            						current,
            						"columns",
            						lv_columns_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalMyDsl.g:1664:3: (otherlv_3= ',' ( (lv_columns_4_0= RULE_STRING ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==17) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMyDsl.g:1665:4: otherlv_3= ',' ( (lv_columns_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,17,FOLLOW_5); 

            	    				newLeafNode(otherlv_3, grammarAccess.getSelectOperationAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalMyDsl.g:1669:4: ( (lv_columns_4_0= RULE_STRING ) )
            	    // InternalMyDsl.g:1670:5: (lv_columns_4_0= RULE_STRING )
            	    {
            	    // InternalMyDsl.g:1670:5: (lv_columns_4_0= RULE_STRING )
            	    // InternalMyDsl.g:1671:6: lv_columns_4_0= RULE_STRING
            	    {
            	    lv_columns_4_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            	    						newLeafNode(lv_columns_4_0, grammarAccess.getSelectOperationAccess().getColumnsSTRINGTerminalRuleCall_3_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getSelectOperationRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"columns",
            	    							lv_columns_4_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_25); 

            			newLeafNode(otherlv_5, grammarAccess.getSelectOperationAccess().getRightParenthesisKeyword_4());
            		
            otherlv_6=(Token)match(input,43,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getSelectOperationAccess().getFromTableKeyword_5());
            		
            // InternalMyDsl.g:1696:3: ( (lv_table_7_0= RULE_STRING ) )
            // InternalMyDsl.g:1697:4: (lv_table_7_0= RULE_STRING )
            {
            // InternalMyDsl.g:1697:4: (lv_table_7_0= RULE_STRING )
            // InternalMyDsl.g:1698:5: lv_table_7_0= RULE_STRING
            {
            lv_table_7_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

            					newLeafNode(lv_table_7_0, grammarAccess.getSelectOperationAccess().getTableSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSelectOperationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"table",
            						lv_table_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,29,FOLLOW_5); 

            			newLeafNode(otherlv_8, grammarAccess.getSelectOperationAccess().getToTableKeyword_7());
            		
            // InternalMyDsl.g:1718:3: ( (lv_target_9_0= RULE_STRING ) )
            // InternalMyDsl.g:1719:4: (lv_target_9_0= RULE_STRING )
            {
            // InternalMyDsl.g:1719:4: (lv_target_9_0= RULE_STRING )
            // InternalMyDsl.g:1720:5: lv_target_9_0= RULE_STRING
            {
            lv_target_9_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_target_9_0, grammarAccess.getSelectOperationAccess().getTargetSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSelectOperationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"target",
            						lv_target_9_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelectOperation"


    // $ANTLR start "entryRuleDropOperation"
    // InternalMyDsl.g:1740:1: entryRuleDropOperation returns [EObject current=null] : iv_ruleDropOperation= ruleDropOperation EOF ;
    public final EObject entryRuleDropOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDropOperation = null;


        try {
            // InternalMyDsl.g:1740:54: (iv_ruleDropOperation= ruleDropOperation EOF )
            // InternalMyDsl.g:1741:2: iv_ruleDropOperation= ruleDropOperation EOF
            {
             newCompositeNode(grammarAccess.getDropOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDropOperation=ruleDropOperation();

            state._fsp--;

             current =iv_ruleDropOperation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDropOperation"


    // $ANTLR start "ruleDropOperation"
    // InternalMyDsl.g:1747:1: ruleDropOperation returns [EObject current=null] : (otherlv_0= '.dropTable(' ( (lv_table_1_0= RULE_STRING ) ) otherlv_2= ')' ) ;
    public final EObject ruleDropOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_table_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1753:2: ( (otherlv_0= '.dropTable(' ( (lv_table_1_0= RULE_STRING ) ) otherlv_2= ')' ) )
            // InternalMyDsl.g:1754:2: (otherlv_0= '.dropTable(' ( (lv_table_1_0= RULE_STRING ) ) otherlv_2= ')' )
            {
            // InternalMyDsl.g:1754:2: (otherlv_0= '.dropTable(' ( (lv_table_1_0= RULE_STRING ) ) otherlv_2= ')' )
            // InternalMyDsl.g:1755:3: otherlv_0= '.dropTable(' ( (lv_table_1_0= RULE_STRING ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDropOperationAccess().getDropTableKeyword_0());
            		
            // InternalMyDsl.g:1759:3: ( (lv_table_1_0= RULE_STRING ) )
            // InternalMyDsl.g:1760:4: (lv_table_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:1760:4: (lv_table_1_0= RULE_STRING )
            // InternalMyDsl.g:1761:5: lv_table_1_0= RULE_STRING
            {
            lv_table_1_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_table_1_0, grammarAccess.getDropOperationAccess().getTableSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDropOperationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"table",
            						lv_table_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getDropOperationAccess().getRightParenthesisKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDropOperation"


    // $ANTLR start "entryRuleProcessFoldersOperation"
    // InternalMyDsl.g:1785:1: entryRuleProcessFoldersOperation returns [EObject current=null] : iv_ruleProcessFoldersOperation= ruleProcessFoldersOperation EOF ;
    public final EObject entryRuleProcessFoldersOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessFoldersOperation = null;


        try {
            // InternalMyDsl.g:1785:64: (iv_ruleProcessFoldersOperation= ruleProcessFoldersOperation EOF )
            // InternalMyDsl.g:1786:2: iv_ruleProcessFoldersOperation= ruleProcessFoldersOperation EOF
            {
             newCompositeNode(grammarAccess.getProcessFoldersOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcessFoldersOperation=ruleProcessFoldersOperation();

            state._fsp--;

             current =iv_ruleProcessFoldersOperation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProcessFoldersOperation"


    // $ANTLR start "ruleProcessFoldersOperation"
    // InternalMyDsl.g:1792:1: ruleProcessFoldersOperation returns [EObject current=null] : (otherlv_0= '.processFolders(' ( (lv_folders_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_folders_3_0= RULE_STRING ) ) )* otherlv_4= ')' otherlv_5= 'with' otherlv_6= '{' ( (lv_folderOperations_7_0= ruleTopLevelOperation ) )+ otherlv_8= '}' ) ;
    public final EObject ruleProcessFoldersOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_folders_1_0=null;
        Token otherlv_2=null;
        Token lv_folders_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_folderOperations_7_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1798:2: ( (otherlv_0= '.processFolders(' ( (lv_folders_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_folders_3_0= RULE_STRING ) ) )* otherlv_4= ')' otherlv_5= 'with' otherlv_6= '{' ( (lv_folderOperations_7_0= ruleTopLevelOperation ) )+ otherlv_8= '}' ) )
            // InternalMyDsl.g:1799:2: (otherlv_0= '.processFolders(' ( (lv_folders_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_folders_3_0= RULE_STRING ) ) )* otherlv_4= ')' otherlv_5= 'with' otherlv_6= '{' ( (lv_folderOperations_7_0= ruleTopLevelOperation ) )+ otherlv_8= '}' )
            {
            // InternalMyDsl.g:1799:2: (otherlv_0= '.processFolders(' ( (lv_folders_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_folders_3_0= RULE_STRING ) ) )* otherlv_4= ')' otherlv_5= 'with' otherlv_6= '{' ( (lv_folderOperations_7_0= ruleTopLevelOperation ) )+ otherlv_8= '}' )
            // InternalMyDsl.g:1800:3: otherlv_0= '.processFolders(' ( (lv_folders_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_folders_3_0= RULE_STRING ) ) )* otherlv_4= ')' otherlv_5= 'with' otherlv_6= '{' ( (lv_folderOperations_7_0= ruleTopLevelOperation ) )+ otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getProcessFoldersOperationAccess().getProcessFoldersKeyword_0());
            		
            // InternalMyDsl.g:1804:3: ( (lv_folders_1_0= RULE_STRING ) )
            // InternalMyDsl.g:1805:4: (lv_folders_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:1805:4: (lv_folders_1_0= RULE_STRING )
            // InternalMyDsl.g:1806:5: lv_folders_1_0= RULE_STRING
            {
            lv_folders_1_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_folders_1_0, grammarAccess.getProcessFoldersOperationAccess().getFoldersSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProcessFoldersOperationRule());
            					}
            					addWithLastConsumed(
            						current,
            						"folders",
            						lv_folders_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalMyDsl.g:1822:3: (otherlv_2= ',' ( (lv_folders_3_0= RULE_STRING ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==17) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMyDsl.g:1823:4: otherlv_2= ',' ( (lv_folders_3_0= RULE_STRING ) )
            	    {
            	    otherlv_2=(Token)match(input,17,FOLLOW_5); 

            	    				newLeafNode(otherlv_2, grammarAccess.getProcessFoldersOperationAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalMyDsl.g:1827:4: ( (lv_folders_3_0= RULE_STRING ) )
            	    // InternalMyDsl.g:1828:5: (lv_folders_3_0= RULE_STRING )
            	    {
            	    // InternalMyDsl.g:1828:5: (lv_folders_3_0= RULE_STRING )
            	    // InternalMyDsl.g:1829:6: lv_folders_3_0= RULE_STRING
            	    {
            	    lv_folders_3_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            	    						newLeafNode(lv_folders_3_0, grammarAccess.getProcessFoldersOperationAccess().getFoldersSTRINGTerminalRuleCall_2_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getProcessFoldersOperationRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"folders",
            	    							lv_folders_3_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_27); 

            			newLeafNode(otherlv_4, grammarAccess.getProcessFoldersOperationAccess().getRightParenthesisKeyword_3());
            		
            otherlv_5=(Token)match(input,46,FOLLOW_28); 

            			newLeafNode(otherlv_5, grammarAccess.getProcessFoldersOperationAccess().getWithKeyword_4());
            		
            otherlv_6=(Token)match(input,47,FOLLOW_29); 

            			newLeafNode(otherlv_6, grammarAccess.getProcessFoldersOperationAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalMyDsl.g:1858:3: ( (lv_folderOperations_7_0= ruleTopLevelOperation ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==11||(LA18_0>=19 && LA18_0<=21)||LA18_0==24||LA18_0==30||(LA18_0>=34 && LA18_0<=37)||(LA18_0>=39 && LA18_0<=41)||(LA18_0>=44 && LA18_0<=45)||LA18_0==49) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMyDsl.g:1859:4: (lv_folderOperations_7_0= ruleTopLevelOperation )
            	    {
            	    // InternalMyDsl.g:1859:4: (lv_folderOperations_7_0= ruleTopLevelOperation )
            	    // InternalMyDsl.g:1860:5: lv_folderOperations_7_0= ruleTopLevelOperation
            	    {

            	    					newCompositeNode(grammarAccess.getProcessFoldersOperationAccess().getFolderOperationsTopLevelOperationParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_29);
            	    lv_folderOperations_7_0=ruleTopLevelOperation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProcessFoldersOperationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"folderOperations",
            	    						lv_folderOperations_7_0,
            	    						"org.xtext.example.mydsl.MyDsl.TopLevelOperation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);

            otherlv_8=(Token)match(input,48,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getProcessFoldersOperationAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProcessFoldersOperation"


    // $ANTLR start "entryRuleEndOperation"
    // InternalMyDsl.g:1885:1: entryRuleEndOperation returns [String current=null] : iv_ruleEndOperation= ruleEndOperation EOF ;
    public final String entryRuleEndOperation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEndOperation = null;


        try {
            // InternalMyDsl.g:1885:52: (iv_ruleEndOperation= ruleEndOperation EOF )
            // InternalMyDsl.g:1886:2: iv_ruleEndOperation= ruleEndOperation EOF
            {
             newCompositeNode(grammarAccess.getEndOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEndOperation=ruleEndOperation();

            state._fsp--;

             current =iv_ruleEndOperation.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEndOperation"


    // $ANTLR start "ruleEndOperation"
    // InternalMyDsl.g:1892:1: ruleEndOperation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '.end();' ;
    public final AntlrDatatypeRuleToken ruleEndOperation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1898:2: (kw= '.end();' )
            // InternalMyDsl.g:1899:2: kw= '.end();'
            {
            kw=(Token)match(input,49,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getEndOperationAccess().getEndKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEndOperation"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000233BC41380802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000048002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020002000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000333BC41380800L});

}