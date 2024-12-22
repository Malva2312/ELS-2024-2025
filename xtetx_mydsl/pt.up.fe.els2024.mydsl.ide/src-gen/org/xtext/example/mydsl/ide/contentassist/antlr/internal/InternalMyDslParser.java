package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.printAll()'", "'.loadJSON()'", "'.from('", "')'", "'.into('", "'.withAttributes('", "','", "'.nestedIn('", "'.loadXML()'", "'.loadYAML()'", "'.concatHorizontal()'", "'.toTable('", "'.onTables('", "'.filter()'", "'.onColumn('", "'.onTable('", "'.where('", "'value'", "'toTable'", "'.save()'", "'.tables('", "'.to('", "'.as('", "'.printTable('", "'.renameColumn()'", "'.limit()'", "'.table('", "'.selectMax()'", "'.selectMin()'", "'.select()'", "'.columns('", "'.fromTable('", "'.dropTable('", "'.processFolders('", "'.with'", "'{'", "'}'"
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

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleModel EOF )
            // InternalMyDsl.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:62:1: ruleModel : ( ( ( rule__Model__OperationsAssignment ) ) ( ( rule__Model__OperationsAssignment )* ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( ( rule__Model__OperationsAssignment ) ) ( ( rule__Model__OperationsAssignment )* ) ) )
            // InternalMyDsl.g:67:2: ( ( ( rule__Model__OperationsAssignment ) ) ( ( rule__Model__OperationsAssignment )* ) )
            {
            // InternalMyDsl.g:67:2: ( ( ( rule__Model__OperationsAssignment ) ) ( ( rule__Model__OperationsAssignment )* ) )
            // InternalMyDsl.g:68:3: ( ( rule__Model__OperationsAssignment ) ) ( ( rule__Model__OperationsAssignment )* )
            {
            // InternalMyDsl.g:68:3: ( ( rule__Model__OperationsAssignment ) )
            // InternalMyDsl.g:69:4: ( rule__Model__OperationsAssignment )
            {
             before(grammarAccess.getModelAccess().getOperationsAssignment()); 
            // InternalMyDsl.g:70:4: ( rule__Model__OperationsAssignment )
            // InternalMyDsl.g:70:5: rule__Model__OperationsAssignment
            {
            pushFollow(FOLLOW_3);
            rule__Model__OperationsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getOperationsAssignment()); 

            }

            // InternalMyDsl.g:73:3: ( ( rule__Model__OperationsAssignment )* )
            // InternalMyDsl.g:74:4: ( rule__Model__OperationsAssignment )*
            {
             before(grammarAccess.getModelAccess().getOperationsAssignment()); 
            // InternalMyDsl.g:75:4: ( rule__Model__OperationsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=11 && LA1_0<=12)||(LA1_0>=19 && LA1_0<=21)||LA1_0==24||LA1_0==30||(LA1_0>=34 && LA1_0<=36)||(LA1_0>=38 && LA1_0<=40)||(LA1_0>=43 && LA1_0<=44)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:75:5: rule__Model__OperationsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__OperationsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getOperationsAssignment()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleTopLevelOperation"
    // InternalMyDsl.g:85:1: entryRuleTopLevelOperation : ruleTopLevelOperation EOF ;
    public final void entryRuleTopLevelOperation() throws RecognitionException {
        try {
            // InternalMyDsl.g:86:1: ( ruleTopLevelOperation EOF )
            // InternalMyDsl.g:87:1: ruleTopLevelOperation EOF
            {
             before(grammarAccess.getTopLevelOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleTopLevelOperation();

            state._fsp--;

             after(grammarAccess.getTopLevelOperationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTopLevelOperation"


    // $ANTLR start "ruleTopLevelOperation"
    // InternalMyDsl.g:94:1: ruleTopLevelOperation : ( ( rule__TopLevelOperation__Alternatives ) ) ;
    public final void ruleTopLevelOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:98:2: ( ( ( rule__TopLevelOperation__Alternatives ) ) )
            // InternalMyDsl.g:99:2: ( ( rule__TopLevelOperation__Alternatives ) )
            {
            // InternalMyDsl.g:99:2: ( ( rule__TopLevelOperation__Alternatives ) )
            // InternalMyDsl.g:100:3: ( rule__TopLevelOperation__Alternatives )
            {
             before(grammarAccess.getTopLevelOperationAccess().getAlternatives()); 
            // InternalMyDsl.g:101:3: ( rule__TopLevelOperation__Alternatives )
            // InternalMyDsl.g:101:4: rule__TopLevelOperation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TopLevelOperation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTopLevelOperationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTopLevelOperation"


    // $ANTLR start "entryRuleLoadOperation"
    // InternalMyDsl.g:110:1: entryRuleLoadOperation : ruleLoadOperation EOF ;
    public final void entryRuleLoadOperation() throws RecognitionException {
        try {
            // InternalMyDsl.g:111:1: ( ruleLoadOperation EOF )
            // InternalMyDsl.g:112:1: ruleLoadOperation EOF
            {
             before(grammarAccess.getLoadOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleLoadOperation();

            state._fsp--;

             after(grammarAccess.getLoadOperationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLoadOperation"


    // $ANTLR start "ruleLoadOperation"
    // InternalMyDsl.g:119:1: ruleLoadOperation : ( ( rule__LoadOperation__Alternatives ) ) ;
    public final void ruleLoadOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:123:2: ( ( ( rule__LoadOperation__Alternatives ) ) )
            // InternalMyDsl.g:124:2: ( ( rule__LoadOperation__Alternatives ) )
            {
            // InternalMyDsl.g:124:2: ( ( rule__LoadOperation__Alternatives ) )
            // InternalMyDsl.g:125:3: ( rule__LoadOperation__Alternatives )
            {
             before(grammarAccess.getLoadOperationAccess().getAlternatives()); 
            // InternalMyDsl.g:126:3: ( rule__LoadOperation__Alternatives )
            // InternalMyDsl.g:126:4: rule__LoadOperation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LoadOperation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLoadOperationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLoadOperation"


    // $ANTLR start "entryRuleLoadJSON"
    // InternalMyDsl.g:135:1: entryRuleLoadJSON : ruleLoadJSON EOF ;
    public final void entryRuleLoadJSON() throws RecognitionException {
        try {
            // InternalMyDsl.g:136:1: ( ruleLoadJSON EOF )
            // InternalMyDsl.g:137:1: ruleLoadJSON EOF
            {
             before(grammarAccess.getLoadJSONRule()); 
            pushFollow(FOLLOW_1);
            ruleLoadJSON();

            state._fsp--;

             after(grammarAccess.getLoadJSONRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLoadJSON"


    // $ANTLR start "ruleLoadJSON"
    // InternalMyDsl.g:144:1: ruleLoadJSON : ( ( rule__LoadJSON__Group__0 ) ) ;
    public final void ruleLoadJSON() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:148:2: ( ( ( rule__LoadJSON__Group__0 ) ) )
            // InternalMyDsl.g:149:2: ( ( rule__LoadJSON__Group__0 ) )
            {
            // InternalMyDsl.g:149:2: ( ( rule__LoadJSON__Group__0 ) )
            // InternalMyDsl.g:150:3: ( rule__LoadJSON__Group__0 )
            {
             before(grammarAccess.getLoadJSONAccess().getGroup()); 
            // InternalMyDsl.g:151:3: ( rule__LoadJSON__Group__0 )
            // InternalMyDsl.g:151:4: rule__LoadJSON__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LoadJSON__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLoadJSONAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLoadJSON"


    // $ANTLR start "entryRuleLoadXML"
    // InternalMyDsl.g:160:1: entryRuleLoadXML : ruleLoadXML EOF ;
    public final void entryRuleLoadXML() throws RecognitionException {
        try {
            // InternalMyDsl.g:161:1: ( ruleLoadXML EOF )
            // InternalMyDsl.g:162:1: ruleLoadXML EOF
            {
             before(grammarAccess.getLoadXMLRule()); 
            pushFollow(FOLLOW_1);
            ruleLoadXML();

            state._fsp--;

             after(grammarAccess.getLoadXMLRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLoadXML"


    // $ANTLR start "ruleLoadXML"
    // InternalMyDsl.g:169:1: ruleLoadXML : ( ( rule__LoadXML__Group__0 ) ) ;
    public final void ruleLoadXML() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:173:2: ( ( ( rule__LoadXML__Group__0 ) ) )
            // InternalMyDsl.g:174:2: ( ( rule__LoadXML__Group__0 ) )
            {
            // InternalMyDsl.g:174:2: ( ( rule__LoadXML__Group__0 ) )
            // InternalMyDsl.g:175:3: ( rule__LoadXML__Group__0 )
            {
             before(grammarAccess.getLoadXMLAccess().getGroup()); 
            // InternalMyDsl.g:176:3: ( rule__LoadXML__Group__0 )
            // InternalMyDsl.g:176:4: rule__LoadXML__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LoadXML__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLoadXMLAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLoadXML"


    // $ANTLR start "entryRuleLoadYAML"
    // InternalMyDsl.g:185:1: entryRuleLoadYAML : ruleLoadYAML EOF ;
    public final void entryRuleLoadYAML() throws RecognitionException {
        try {
            // InternalMyDsl.g:186:1: ( ruleLoadYAML EOF )
            // InternalMyDsl.g:187:1: ruleLoadYAML EOF
            {
             before(grammarAccess.getLoadYAMLRule()); 
            pushFollow(FOLLOW_1);
            ruleLoadYAML();

            state._fsp--;

             after(grammarAccess.getLoadYAMLRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLoadYAML"


    // $ANTLR start "ruleLoadYAML"
    // InternalMyDsl.g:194:1: ruleLoadYAML : ( ( rule__LoadYAML__Group__0 ) ) ;
    public final void ruleLoadYAML() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:198:2: ( ( ( rule__LoadYAML__Group__0 ) ) )
            // InternalMyDsl.g:199:2: ( ( rule__LoadYAML__Group__0 ) )
            {
            // InternalMyDsl.g:199:2: ( ( rule__LoadYAML__Group__0 ) )
            // InternalMyDsl.g:200:3: ( rule__LoadYAML__Group__0 )
            {
             before(grammarAccess.getLoadYAMLAccess().getGroup()); 
            // InternalMyDsl.g:201:3: ( rule__LoadYAML__Group__0 )
            // InternalMyDsl.g:201:4: rule__LoadYAML__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LoadYAML__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLoadYAMLAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLoadYAML"


    // $ANTLR start "entryRuleConcatOperation"
    // InternalMyDsl.g:210:1: entryRuleConcatOperation : ruleConcatOperation EOF ;
    public final void entryRuleConcatOperation() throws RecognitionException {
        try {
            // InternalMyDsl.g:211:1: ( ruleConcatOperation EOF )
            // InternalMyDsl.g:212:1: ruleConcatOperation EOF
            {
             before(grammarAccess.getConcatOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleConcatOperation();

            state._fsp--;

             after(grammarAccess.getConcatOperationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConcatOperation"


    // $ANTLR start "ruleConcatOperation"
    // InternalMyDsl.g:219:1: ruleConcatOperation : ( ( rule__ConcatOperation__Group__0 ) ) ;
    public final void ruleConcatOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:223:2: ( ( ( rule__ConcatOperation__Group__0 ) ) )
            // InternalMyDsl.g:224:2: ( ( rule__ConcatOperation__Group__0 ) )
            {
            // InternalMyDsl.g:224:2: ( ( rule__ConcatOperation__Group__0 ) )
            // InternalMyDsl.g:225:3: ( rule__ConcatOperation__Group__0 )
            {
             before(grammarAccess.getConcatOperationAccess().getGroup()); 
            // InternalMyDsl.g:226:3: ( rule__ConcatOperation__Group__0 )
            // InternalMyDsl.g:226:4: rule__ConcatOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConcatOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConcatOperationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConcatOperation"


    // $ANTLR start "entryRuleFilterOperation"
    // InternalMyDsl.g:235:1: entryRuleFilterOperation : ruleFilterOperation EOF ;
    public final void entryRuleFilterOperation() throws RecognitionException {
        try {
            // InternalMyDsl.g:236:1: ( ruleFilterOperation EOF )
            // InternalMyDsl.g:237:1: ruleFilterOperation EOF
            {
             before(grammarAccess.getFilterOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleFilterOperation();

            state._fsp--;

             after(grammarAccess.getFilterOperationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFilterOperation"


    // $ANTLR start "ruleFilterOperation"
    // InternalMyDsl.g:244:1: ruleFilterOperation : ( ( rule__FilterOperation__Group__0 ) ) ;
    public final void ruleFilterOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:248:2: ( ( ( rule__FilterOperation__Group__0 ) ) )
            // InternalMyDsl.g:249:2: ( ( rule__FilterOperation__Group__0 ) )
            {
            // InternalMyDsl.g:249:2: ( ( rule__FilterOperation__Group__0 ) )
            // InternalMyDsl.g:250:3: ( rule__FilterOperation__Group__0 )
            {
             before(grammarAccess.getFilterOperationAccess().getGroup()); 
            // InternalMyDsl.g:251:3: ( rule__FilterOperation__Group__0 )
            // InternalMyDsl.g:251:4: rule__FilterOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FilterOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFilterOperationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFilterOperation"


    // $ANTLR start "entryRuleSaveOperation"
    // InternalMyDsl.g:260:1: entryRuleSaveOperation : ruleSaveOperation EOF ;
    public final void entryRuleSaveOperation() throws RecognitionException {
        try {
            // InternalMyDsl.g:261:1: ( ruleSaveOperation EOF )
            // InternalMyDsl.g:262:1: ruleSaveOperation EOF
            {
             before(grammarAccess.getSaveOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleSaveOperation();

            state._fsp--;

             after(grammarAccess.getSaveOperationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSaveOperation"


    // $ANTLR start "ruleSaveOperation"
    // InternalMyDsl.g:269:1: ruleSaveOperation : ( ( rule__SaveOperation__Group__0 ) ) ;
    public final void ruleSaveOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:273:2: ( ( ( rule__SaveOperation__Group__0 ) ) )
            // InternalMyDsl.g:274:2: ( ( rule__SaveOperation__Group__0 ) )
            {
            // InternalMyDsl.g:274:2: ( ( rule__SaveOperation__Group__0 ) )
            // InternalMyDsl.g:275:3: ( rule__SaveOperation__Group__0 )
            {
             before(grammarAccess.getSaveOperationAccess().getGroup()); 
            // InternalMyDsl.g:276:3: ( rule__SaveOperation__Group__0 )
            // InternalMyDsl.g:276:4: rule__SaveOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SaveOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSaveOperationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSaveOperation"


    // $ANTLR start "entryRulePrintOperation"
    // InternalMyDsl.g:285:1: entryRulePrintOperation : rulePrintOperation EOF ;
    public final void entryRulePrintOperation() throws RecognitionException {
        try {
            // InternalMyDsl.g:286:1: ( rulePrintOperation EOF )
            // InternalMyDsl.g:287:1: rulePrintOperation EOF
            {
             before(grammarAccess.getPrintOperationRule()); 
            pushFollow(FOLLOW_1);
            rulePrintOperation();

            state._fsp--;

             after(grammarAccess.getPrintOperationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrintOperation"


    // $ANTLR start "rulePrintOperation"
    // InternalMyDsl.g:294:1: rulePrintOperation : ( ( rule__PrintOperation__Alternatives ) ) ;
    public final void rulePrintOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:298:2: ( ( ( rule__PrintOperation__Alternatives ) ) )
            // InternalMyDsl.g:299:2: ( ( rule__PrintOperation__Alternatives ) )
            {
            // InternalMyDsl.g:299:2: ( ( rule__PrintOperation__Alternatives ) )
            // InternalMyDsl.g:300:3: ( rule__PrintOperation__Alternatives )
            {
             before(grammarAccess.getPrintOperationAccess().getAlternatives()); 
            // InternalMyDsl.g:301:3: ( rule__PrintOperation__Alternatives )
            // InternalMyDsl.g:301:4: rule__PrintOperation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrintOperation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrintOperationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrintOperation"


    // $ANTLR start "entryRulePrintAll"
    // InternalMyDsl.g:310:1: entryRulePrintAll : rulePrintAll EOF ;
    public final void entryRulePrintAll() throws RecognitionException {
        try {
            // InternalMyDsl.g:311:1: ( rulePrintAll EOF )
            // InternalMyDsl.g:312:1: rulePrintAll EOF
            {
             before(grammarAccess.getPrintAllRule()); 
            pushFollow(FOLLOW_1);
            rulePrintAll();

            state._fsp--;

             after(grammarAccess.getPrintAllRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrintAll"


    // $ANTLR start "rulePrintAll"
    // InternalMyDsl.g:319:1: rulePrintAll : ( '.printAll()' ) ;
    public final void rulePrintAll() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:323:2: ( ( '.printAll()' ) )
            // InternalMyDsl.g:324:2: ( '.printAll()' )
            {
            // InternalMyDsl.g:324:2: ( '.printAll()' )
            // InternalMyDsl.g:325:3: '.printAll()'
            {
             before(grammarAccess.getPrintAllAccess().getPrintAllKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getPrintAllAccess().getPrintAllKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrintAll"


    // $ANTLR start "entryRulePrintTable"
    // InternalMyDsl.g:335:1: entryRulePrintTable : rulePrintTable EOF ;
    public final void entryRulePrintTable() throws RecognitionException {
        try {
            // InternalMyDsl.g:336:1: ( rulePrintTable EOF )
            // InternalMyDsl.g:337:1: rulePrintTable EOF
            {
             before(grammarAccess.getPrintTableRule()); 
            pushFollow(FOLLOW_1);
            rulePrintTable();

            state._fsp--;

             after(grammarAccess.getPrintTableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrintTable"


    // $ANTLR start "rulePrintTable"
    // InternalMyDsl.g:344:1: rulePrintTable : ( ( rule__PrintTable__Group__0 ) ) ;
    public final void rulePrintTable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:348:2: ( ( ( rule__PrintTable__Group__0 ) ) )
            // InternalMyDsl.g:349:2: ( ( rule__PrintTable__Group__0 ) )
            {
            // InternalMyDsl.g:349:2: ( ( rule__PrintTable__Group__0 ) )
            // InternalMyDsl.g:350:3: ( rule__PrintTable__Group__0 )
            {
             before(grammarAccess.getPrintTableAccess().getGroup()); 
            // InternalMyDsl.g:351:3: ( rule__PrintTable__Group__0 )
            // InternalMyDsl.g:351:4: rule__PrintTable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PrintTable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrintTableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrintTable"


    // $ANTLR start "entryRuleRenameOperation"
    // InternalMyDsl.g:360:1: entryRuleRenameOperation : ruleRenameOperation EOF ;
    public final void entryRuleRenameOperation() throws RecognitionException {
        try {
            // InternalMyDsl.g:361:1: ( ruleRenameOperation EOF )
            // InternalMyDsl.g:362:1: ruleRenameOperation EOF
            {
             before(grammarAccess.getRenameOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleRenameOperation();

            state._fsp--;

             after(grammarAccess.getRenameOperationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRenameOperation"


    // $ANTLR start "ruleRenameOperation"
    // InternalMyDsl.g:369:1: ruleRenameOperation : ( ( rule__RenameOperation__Group__0 ) ) ;
    public final void ruleRenameOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:373:2: ( ( ( rule__RenameOperation__Group__0 ) ) )
            // InternalMyDsl.g:374:2: ( ( rule__RenameOperation__Group__0 ) )
            {
            // InternalMyDsl.g:374:2: ( ( rule__RenameOperation__Group__0 ) )
            // InternalMyDsl.g:375:3: ( rule__RenameOperation__Group__0 )
            {
             before(grammarAccess.getRenameOperationAccess().getGroup()); 
            // InternalMyDsl.g:376:3: ( rule__RenameOperation__Group__0 )
            // InternalMyDsl.g:376:4: rule__RenameOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RenameOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRenameOperationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRenameOperation"


    // $ANTLR start "entryRuleLimitOperation"
    // InternalMyDsl.g:385:1: entryRuleLimitOperation : ruleLimitOperation EOF ;
    public final void entryRuleLimitOperation() throws RecognitionException {
        try {
            // InternalMyDsl.g:386:1: ( ruleLimitOperation EOF )
            // InternalMyDsl.g:387:1: ruleLimitOperation EOF
            {
             before(grammarAccess.getLimitOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleLimitOperation();

            state._fsp--;

             after(grammarAccess.getLimitOperationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLimitOperation"


    // $ANTLR start "ruleLimitOperation"
    // InternalMyDsl.g:394:1: ruleLimitOperation : ( ( rule__LimitOperation__Group__0 ) ) ;
    public final void ruleLimitOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:398:2: ( ( ( rule__LimitOperation__Group__0 ) ) )
            // InternalMyDsl.g:399:2: ( ( rule__LimitOperation__Group__0 ) )
            {
            // InternalMyDsl.g:399:2: ( ( rule__LimitOperation__Group__0 ) )
            // InternalMyDsl.g:400:3: ( rule__LimitOperation__Group__0 )
            {
             before(grammarAccess.getLimitOperationAccess().getGroup()); 
            // InternalMyDsl.g:401:3: ( rule__LimitOperation__Group__0 )
            // InternalMyDsl.g:401:4: rule__LimitOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LimitOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLimitOperationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLimitOperation"


    // $ANTLR start "entryRuleArgMaxOperation"
    // InternalMyDsl.g:410:1: entryRuleArgMaxOperation : ruleArgMaxOperation EOF ;
    public final void entryRuleArgMaxOperation() throws RecognitionException {
        try {
            // InternalMyDsl.g:411:1: ( ruleArgMaxOperation EOF )
            // InternalMyDsl.g:412:1: ruleArgMaxOperation EOF
            {
             before(grammarAccess.getArgMaxOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleArgMaxOperation();

            state._fsp--;

             after(grammarAccess.getArgMaxOperationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArgMaxOperation"


    // $ANTLR start "ruleArgMaxOperation"
    // InternalMyDsl.g:419:1: ruleArgMaxOperation : ( ( rule__ArgMaxOperation__Group__0 ) ) ;
    public final void ruleArgMaxOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:423:2: ( ( ( rule__ArgMaxOperation__Group__0 ) ) )
            // InternalMyDsl.g:424:2: ( ( rule__ArgMaxOperation__Group__0 ) )
            {
            // InternalMyDsl.g:424:2: ( ( rule__ArgMaxOperation__Group__0 ) )
            // InternalMyDsl.g:425:3: ( rule__ArgMaxOperation__Group__0 )
            {
             before(grammarAccess.getArgMaxOperationAccess().getGroup()); 
            // InternalMyDsl.g:426:3: ( rule__ArgMaxOperation__Group__0 )
            // InternalMyDsl.g:426:4: rule__ArgMaxOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ArgMaxOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArgMaxOperationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArgMaxOperation"


    // $ANTLR start "entryRuleArgMinOperation"
    // InternalMyDsl.g:435:1: entryRuleArgMinOperation : ruleArgMinOperation EOF ;
    public final void entryRuleArgMinOperation() throws RecognitionException {
        try {
            // InternalMyDsl.g:436:1: ( ruleArgMinOperation EOF )
            // InternalMyDsl.g:437:1: ruleArgMinOperation EOF
            {
             before(grammarAccess.getArgMinOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleArgMinOperation();

            state._fsp--;

             after(grammarAccess.getArgMinOperationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArgMinOperation"


    // $ANTLR start "ruleArgMinOperation"
    // InternalMyDsl.g:444:1: ruleArgMinOperation : ( ( rule__ArgMinOperation__Group__0 ) ) ;
    public final void ruleArgMinOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:448:2: ( ( ( rule__ArgMinOperation__Group__0 ) ) )
            // InternalMyDsl.g:449:2: ( ( rule__ArgMinOperation__Group__0 ) )
            {
            // InternalMyDsl.g:449:2: ( ( rule__ArgMinOperation__Group__0 ) )
            // InternalMyDsl.g:450:3: ( rule__ArgMinOperation__Group__0 )
            {
             before(grammarAccess.getArgMinOperationAccess().getGroup()); 
            // InternalMyDsl.g:451:3: ( rule__ArgMinOperation__Group__0 )
            // InternalMyDsl.g:451:4: rule__ArgMinOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ArgMinOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArgMinOperationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArgMinOperation"


    // $ANTLR start "entryRuleSelectOperation"
    // InternalMyDsl.g:460:1: entryRuleSelectOperation : ruleSelectOperation EOF ;
    public final void entryRuleSelectOperation() throws RecognitionException {
        try {
            // InternalMyDsl.g:461:1: ( ruleSelectOperation EOF )
            // InternalMyDsl.g:462:1: ruleSelectOperation EOF
            {
             before(grammarAccess.getSelectOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleSelectOperation();

            state._fsp--;

             after(grammarAccess.getSelectOperationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSelectOperation"


    // $ANTLR start "ruleSelectOperation"
    // InternalMyDsl.g:469:1: ruleSelectOperation : ( ( rule__SelectOperation__Group__0 ) ) ;
    public final void ruleSelectOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:473:2: ( ( ( rule__SelectOperation__Group__0 ) ) )
            // InternalMyDsl.g:474:2: ( ( rule__SelectOperation__Group__0 ) )
            {
            // InternalMyDsl.g:474:2: ( ( rule__SelectOperation__Group__0 ) )
            // InternalMyDsl.g:475:3: ( rule__SelectOperation__Group__0 )
            {
             before(grammarAccess.getSelectOperationAccess().getGroup()); 
            // InternalMyDsl.g:476:3: ( rule__SelectOperation__Group__0 )
            // InternalMyDsl.g:476:4: rule__SelectOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SelectOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectOperationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelectOperation"


    // $ANTLR start "entryRuleDropOperation"
    // InternalMyDsl.g:485:1: entryRuleDropOperation : ruleDropOperation EOF ;
    public final void entryRuleDropOperation() throws RecognitionException {
        try {
            // InternalMyDsl.g:486:1: ( ruleDropOperation EOF )
            // InternalMyDsl.g:487:1: ruleDropOperation EOF
            {
             before(grammarAccess.getDropOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleDropOperation();

            state._fsp--;

             after(grammarAccess.getDropOperationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDropOperation"


    // $ANTLR start "ruleDropOperation"
    // InternalMyDsl.g:494:1: ruleDropOperation : ( ( rule__DropOperation__Group__0 ) ) ;
    public final void ruleDropOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:498:2: ( ( ( rule__DropOperation__Group__0 ) ) )
            // InternalMyDsl.g:499:2: ( ( rule__DropOperation__Group__0 ) )
            {
            // InternalMyDsl.g:499:2: ( ( rule__DropOperation__Group__0 ) )
            // InternalMyDsl.g:500:3: ( rule__DropOperation__Group__0 )
            {
             before(grammarAccess.getDropOperationAccess().getGroup()); 
            // InternalMyDsl.g:501:3: ( rule__DropOperation__Group__0 )
            // InternalMyDsl.g:501:4: rule__DropOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DropOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDropOperationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDropOperation"


    // $ANTLR start "entryRuleProcessFoldersOperation"
    // InternalMyDsl.g:510:1: entryRuleProcessFoldersOperation : ruleProcessFoldersOperation EOF ;
    public final void entryRuleProcessFoldersOperation() throws RecognitionException {
        try {
            // InternalMyDsl.g:511:1: ( ruleProcessFoldersOperation EOF )
            // InternalMyDsl.g:512:1: ruleProcessFoldersOperation EOF
            {
             before(grammarAccess.getProcessFoldersOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleProcessFoldersOperation();

            state._fsp--;

             after(grammarAccess.getProcessFoldersOperationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProcessFoldersOperation"


    // $ANTLR start "ruleProcessFoldersOperation"
    // InternalMyDsl.g:519:1: ruleProcessFoldersOperation : ( ( rule__ProcessFoldersOperation__Group__0 ) ) ;
    public final void ruleProcessFoldersOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:523:2: ( ( ( rule__ProcessFoldersOperation__Group__0 ) ) )
            // InternalMyDsl.g:524:2: ( ( rule__ProcessFoldersOperation__Group__0 ) )
            {
            // InternalMyDsl.g:524:2: ( ( rule__ProcessFoldersOperation__Group__0 ) )
            // InternalMyDsl.g:525:3: ( rule__ProcessFoldersOperation__Group__0 )
            {
             before(grammarAccess.getProcessFoldersOperationAccess().getGroup()); 
            // InternalMyDsl.g:526:3: ( rule__ProcessFoldersOperation__Group__0 )
            // InternalMyDsl.g:526:4: rule__ProcessFoldersOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProcessFoldersOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProcessFoldersOperationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProcessFoldersOperation"


    // $ANTLR start "rule__TopLevelOperation__Alternatives"
    // InternalMyDsl.g:534:1: rule__TopLevelOperation__Alternatives : ( ( ruleLoadOperation ) | ( ruleSelectOperation ) | ( ruleConcatOperation ) | ( ruleSaveOperation ) | ( rulePrintOperation ) | ( ruleRenameOperation ) | ( ruleLimitOperation ) | ( ruleArgMaxOperation ) | ( ruleArgMinOperation ) | ( ruleDropOperation ) | ( ruleFilterOperation ) | ( ruleProcessFoldersOperation ) );
    public final void rule__TopLevelOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:538:1: ( ( ruleLoadOperation ) | ( ruleSelectOperation ) | ( ruleConcatOperation ) | ( ruleSaveOperation ) | ( rulePrintOperation ) | ( ruleRenameOperation ) | ( ruleLimitOperation ) | ( ruleArgMaxOperation ) | ( ruleArgMinOperation ) | ( ruleDropOperation ) | ( ruleFilterOperation ) | ( ruleProcessFoldersOperation ) )
            int alt2=12;
            switch ( input.LA(1) ) {
            case 12:
            case 19:
            case 20:
                {
                alt2=1;
                }
                break;
            case 40:
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
            case 11:
            case 34:
                {
                alt2=5;
                }
                break;
            case 35:
                {
                alt2=6;
                }
                break;
            case 36:
                {
                alt2=7;
                }
                break;
            case 38:
                {
                alt2=8;
                }
                break;
            case 39:
                {
                alt2=9;
                }
                break;
            case 43:
                {
                alt2=10;
                }
                break;
            case 24:
                {
                alt2=11;
                }
                break;
            case 44:
                {
                alt2=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:539:2: ( ruleLoadOperation )
                    {
                    // InternalMyDsl.g:539:2: ( ruleLoadOperation )
                    // InternalMyDsl.g:540:3: ruleLoadOperation
                    {
                     before(grammarAccess.getTopLevelOperationAccess().getLoadOperationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLoadOperation();

                    state._fsp--;

                     after(grammarAccess.getTopLevelOperationAccess().getLoadOperationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:545:2: ( ruleSelectOperation )
                    {
                    // InternalMyDsl.g:545:2: ( ruleSelectOperation )
                    // InternalMyDsl.g:546:3: ruleSelectOperation
                    {
                     before(grammarAccess.getTopLevelOperationAccess().getSelectOperationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSelectOperation();

                    state._fsp--;

                     after(grammarAccess.getTopLevelOperationAccess().getSelectOperationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:551:2: ( ruleConcatOperation )
                    {
                    // InternalMyDsl.g:551:2: ( ruleConcatOperation )
                    // InternalMyDsl.g:552:3: ruleConcatOperation
                    {
                     before(grammarAccess.getTopLevelOperationAccess().getConcatOperationParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleConcatOperation();

                    state._fsp--;

                     after(grammarAccess.getTopLevelOperationAccess().getConcatOperationParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:557:2: ( ruleSaveOperation )
                    {
                    // InternalMyDsl.g:557:2: ( ruleSaveOperation )
                    // InternalMyDsl.g:558:3: ruleSaveOperation
                    {
                     before(grammarAccess.getTopLevelOperationAccess().getSaveOperationParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleSaveOperation();

                    state._fsp--;

                     after(grammarAccess.getTopLevelOperationAccess().getSaveOperationParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:563:2: ( rulePrintOperation )
                    {
                    // InternalMyDsl.g:563:2: ( rulePrintOperation )
                    // InternalMyDsl.g:564:3: rulePrintOperation
                    {
                     before(grammarAccess.getTopLevelOperationAccess().getPrintOperationParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    rulePrintOperation();

                    state._fsp--;

                     after(grammarAccess.getTopLevelOperationAccess().getPrintOperationParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:569:2: ( ruleRenameOperation )
                    {
                    // InternalMyDsl.g:569:2: ( ruleRenameOperation )
                    // InternalMyDsl.g:570:3: ruleRenameOperation
                    {
                     before(grammarAccess.getTopLevelOperationAccess().getRenameOperationParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleRenameOperation();

                    state._fsp--;

                     after(grammarAccess.getTopLevelOperationAccess().getRenameOperationParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:575:2: ( ruleLimitOperation )
                    {
                    // InternalMyDsl.g:575:2: ( ruleLimitOperation )
                    // InternalMyDsl.g:576:3: ruleLimitOperation
                    {
                     before(grammarAccess.getTopLevelOperationAccess().getLimitOperationParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleLimitOperation();

                    state._fsp--;

                     after(grammarAccess.getTopLevelOperationAccess().getLimitOperationParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:581:2: ( ruleArgMaxOperation )
                    {
                    // InternalMyDsl.g:581:2: ( ruleArgMaxOperation )
                    // InternalMyDsl.g:582:3: ruleArgMaxOperation
                    {
                     before(grammarAccess.getTopLevelOperationAccess().getArgMaxOperationParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleArgMaxOperation();

                    state._fsp--;

                     after(grammarAccess.getTopLevelOperationAccess().getArgMaxOperationParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:587:2: ( ruleArgMinOperation )
                    {
                    // InternalMyDsl.g:587:2: ( ruleArgMinOperation )
                    // InternalMyDsl.g:588:3: ruleArgMinOperation
                    {
                     before(grammarAccess.getTopLevelOperationAccess().getArgMinOperationParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleArgMinOperation();

                    state._fsp--;

                     after(grammarAccess.getTopLevelOperationAccess().getArgMinOperationParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:593:2: ( ruleDropOperation )
                    {
                    // InternalMyDsl.g:593:2: ( ruleDropOperation )
                    // InternalMyDsl.g:594:3: ruleDropOperation
                    {
                     before(grammarAccess.getTopLevelOperationAccess().getDropOperationParserRuleCall_9()); 
                    pushFollow(FOLLOW_2);
                    ruleDropOperation();

                    state._fsp--;

                     after(grammarAccess.getTopLevelOperationAccess().getDropOperationParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalMyDsl.g:599:2: ( ruleFilterOperation )
                    {
                    // InternalMyDsl.g:599:2: ( ruleFilterOperation )
                    // InternalMyDsl.g:600:3: ruleFilterOperation
                    {
                     before(grammarAccess.getTopLevelOperationAccess().getFilterOperationParserRuleCall_10()); 
                    pushFollow(FOLLOW_2);
                    ruleFilterOperation();

                    state._fsp--;

                     after(grammarAccess.getTopLevelOperationAccess().getFilterOperationParserRuleCall_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalMyDsl.g:605:2: ( ruleProcessFoldersOperation )
                    {
                    // InternalMyDsl.g:605:2: ( ruleProcessFoldersOperation )
                    // InternalMyDsl.g:606:3: ruleProcessFoldersOperation
                    {
                     before(grammarAccess.getTopLevelOperationAccess().getProcessFoldersOperationParserRuleCall_11()); 
                    pushFollow(FOLLOW_2);
                    ruleProcessFoldersOperation();

                    state._fsp--;

                     after(grammarAccess.getTopLevelOperationAccess().getProcessFoldersOperationParserRuleCall_11()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopLevelOperation__Alternatives"


    // $ANTLR start "rule__LoadOperation__Alternatives"
    // InternalMyDsl.g:615:1: rule__LoadOperation__Alternatives : ( ( ruleLoadJSON ) | ( ruleLoadXML ) | ( ruleLoadYAML ) );
    public final void rule__LoadOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:619:1: ( ( ruleLoadJSON ) | ( ruleLoadXML ) | ( ruleLoadYAML ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 12:
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
                    // InternalMyDsl.g:620:2: ( ruleLoadJSON )
                    {
                    // InternalMyDsl.g:620:2: ( ruleLoadJSON )
                    // InternalMyDsl.g:621:3: ruleLoadJSON
                    {
                     before(grammarAccess.getLoadOperationAccess().getLoadJSONParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLoadJSON();

                    state._fsp--;

                     after(grammarAccess.getLoadOperationAccess().getLoadJSONParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:626:2: ( ruleLoadXML )
                    {
                    // InternalMyDsl.g:626:2: ( ruleLoadXML )
                    // InternalMyDsl.g:627:3: ruleLoadXML
                    {
                     before(grammarAccess.getLoadOperationAccess().getLoadXMLParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLoadXML();

                    state._fsp--;

                     after(grammarAccess.getLoadOperationAccess().getLoadXMLParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:632:2: ( ruleLoadYAML )
                    {
                    // InternalMyDsl.g:632:2: ( ruleLoadYAML )
                    // InternalMyDsl.g:633:3: ruleLoadYAML
                    {
                     before(grammarAccess.getLoadOperationAccess().getLoadYAMLParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleLoadYAML();

                    state._fsp--;

                     after(grammarAccess.getLoadOperationAccess().getLoadYAMLParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadOperation__Alternatives"


    // $ANTLR start "rule__PrintOperation__Alternatives"
    // InternalMyDsl.g:642:1: rule__PrintOperation__Alternatives : ( ( ( rule__PrintOperation__Group_0__0 ) ) | ( rulePrintTable ) );
    public final void rule__PrintOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:646:1: ( ( ( rule__PrintOperation__Group_0__0 ) ) | ( rulePrintTable ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==34) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:647:2: ( ( rule__PrintOperation__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:647:2: ( ( rule__PrintOperation__Group_0__0 ) )
                    // InternalMyDsl.g:648:3: ( rule__PrintOperation__Group_0__0 )
                    {
                     before(grammarAccess.getPrintOperationAccess().getGroup_0()); 
                    // InternalMyDsl.g:649:3: ( rule__PrintOperation__Group_0__0 )
                    // InternalMyDsl.g:649:4: rule__PrintOperation__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrintOperation__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrintOperationAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:653:2: ( rulePrintTable )
                    {
                    // InternalMyDsl.g:653:2: ( rulePrintTable )
                    // InternalMyDsl.g:654:3: rulePrintTable
                    {
                     before(grammarAccess.getPrintOperationAccess().getPrintTableParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePrintTable();

                    state._fsp--;

                     after(grammarAccess.getPrintOperationAccess().getPrintTableParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintOperation__Alternatives"


    // $ANTLR start "rule__LoadJSON__Group__0"
    // InternalMyDsl.g:663:1: rule__LoadJSON__Group__0 : rule__LoadJSON__Group__0__Impl rule__LoadJSON__Group__1 ;
    public final void rule__LoadJSON__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:667:1: ( rule__LoadJSON__Group__0__Impl rule__LoadJSON__Group__1 )
            // InternalMyDsl.g:668:2: rule__LoadJSON__Group__0__Impl rule__LoadJSON__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__LoadJSON__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoadJSON__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadJSON__Group__0"


    // $ANTLR start "rule__LoadJSON__Group__0__Impl"
    // InternalMyDsl.g:675:1: rule__LoadJSON__Group__0__Impl : ( '.loadJSON()' ) ;
    public final void rule__LoadJSON__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:679:1: ( ( '.loadJSON()' ) )
            // InternalMyDsl.g:680:1: ( '.loadJSON()' )
            {
            // InternalMyDsl.g:680:1: ( '.loadJSON()' )
            // InternalMyDsl.g:681:2: '.loadJSON()'
            {
             before(grammarAccess.getLoadJSONAccess().getLoadJSONKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getLoadJSONAccess().getLoadJSONKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadJSON__Group__0__Impl"


    // $ANTLR start "rule__LoadJSON__Group__1"
    // InternalMyDsl.g:690:1: rule__LoadJSON__Group__1 : rule__LoadJSON__Group__1__Impl rule__LoadJSON__Group__2 ;
    public final void rule__LoadJSON__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:694:1: ( rule__LoadJSON__Group__1__Impl rule__LoadJSON__Group__2 )
            // InternalMyDsl.g:695:2: rule__LoadJSON__Group__1__Impl rule__LoadJSON__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__LoadJSON__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoadJSON__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadJSON__Group__1"


    // $ANTLR start "rule__LoadJSON__Group__1__Impl"
    // InternalMyDsl.g:702:1: rule__LoadJSON__Group__1__Impl : ( '.from(' ) ;
    public final void rule__LoadJSON__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:706:1: ( ( '.from(' ) )
            // InternalMyDsl.g:707:1: ( '.from(' )
            {
            // InternalMyDsl.g:707:1: ( '.from(' )
            // InternalMyDsl.g:708:2: '.from('
            {
             before(grammarAccess.getLoadJSONAccess().getFromKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getLoadJSONAccess().getFromKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadJSON__Group__1__Impl"


    // $ANTLR start "rule__LoadJSON__Group__2"
    // InternalMyDsl.g:717:1: rule__LoadJSON__Group__2 : rule__LoadJSON__Group__2__Impl rule__LoadJSON__Group__3 ;
    public final void rule__LoadJSON__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:721:1: ( rule__LoadJSON__Group__2__Impl rule__LoadJSON__Group__3 )
            // InternalMyDsl.g:722:2: rule__LoadJSON__Group__2__Impl rule__LoadJSON__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__LoadJSON__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoadJSON__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadJSON__Group__2"


    // $ANTLR start "rule__LoadJSON__Group__2__Impl"
    // InternalMyDsl.g:729:1: rule__LoadJSON__Group__2__Impl : ( ( rule__LoadJSON__FileAssignment_2 ) ) ;
    public final void rule__LoadJSON__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:733:1: ( ( ( rule__LoadJSON__FileAssignment_2 ) ) )
            // InternalMyDsl.g:734:1: ( ( rule__LoadJSON__FileAssignment_2 ) )
            {
            // InternalMyDsl.g:734:1: ( ( rule__LoadJSON__FileAssignment_2 ) )
            // InternalMyDsl.g:735:2: ( rule__LoadJSON__FileAssignment_2 )
            {
             before(grammarAccess.getLoadJSONAccess().getFileAssignment_2()); 
            // InternalMyDsl.g:736:2: ( rule__LoadJSON__FileAssignment_2 )
            // InternalMyDsl.g:736:3: rule__LoadJSON__FileAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LoadJSON__FileAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLoadJSONAccess().getFileAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadJSON__Group__2__Impl"


    // $ANTLR start "rule__LoadJSON__Group__3"
    // InternalMyDsl.g:744:1: rule__LoadJSON__Group__3 : rule__LoadJSON__Group__3__Impl rule__LoadJSON__Group__4 ;
    public final void rule__LoadJSON__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:748:1: ( rule__LoadJSON__Group__3__Impl rule__LoadJSON__Group__4 )
            // InternalMyDsl.g:749:2: rule__LoadJSON__Group__3__Impl rule__LoadJSON__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__LoadJSON__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoadJSON__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadJSON__Group__3"


    // $ANTLR start "rule__LoadJSON__Group__3__Impl"
    // InternalMyDsl.g:756:1: rule__LoadJSON__Group__3__Impl : ( ')' ) ;
    public final void rule__LoadJSON__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:760:1: ( ( ')' ) )
            // InternalMyDsl.g:761:1: ( ')' )
            {
            // InternalMyDsl.g:761:1: ( ')' )
            // InternalMyDsl.g:762:2: ')'
            {
             before(grammarAccess.getLoadJSONAccess().getRightParenthesisKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getLoadJSONAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadJSON__Group__3__Impl"


    // $ANTLR start "rule__LoadJSON__Group__4"
    // InternalMyDsl.g:771:1: rule__LoadJSON__Group__4 : rule__LoadJSON__Group__4__Impl rule__LoadJSON__Group__5 ;
    public final void rule__LoadJSON__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:775:1: ( rule__LoadJSON__Group__4__Impl rule__LoadJSON__Group__5 )
            // InternalMyDsl.g:776:2: rule__LoadJSON__Group__4__Impl rule__LoadJSON__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__LoadJSON__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoadJSON__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadJSON__Group__4"


    // $ANTLR start "rule__LoadJSON__Group__4__Impl"
    // InternalMyDsl.g:783:1: rule__LoadJSON__Group__4__Impl : ( '.into(' ) ;
    public final void rule__LoadJSON__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:787:1: ( ( '.into(' ) )
            // InternalMyDsl.g:788:1: ( '.into(' )
            {
            // InternalMyDsl.g:788:1: ( '.into(' )
            // InternalMyDsl.g:789:2: '.into('
            {
             before(grammarAccess.getLoadJSONAccess().getIntoKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getLoadJSONAccess().getIntoKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadJSON__Group__4__Impl"


    // $ANTLR start "rule__LoadJSON__Group__5"
    // InternalMyDsl.g:798:1: rule__LoadJSON__Group__5 : rule__LoadJSON__Group__5__Impl rule__LoadJSON__Group__6 ;
    public final void rule__LoadJSON__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:802:1: ( rule__LoadJSON__Group__5__Impl rule__LoadJSON__Group__6 )
            // InternalMyDsl.g:803:2: rule__LoadJSON__Group__5__Impl rule__LoadJSON__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__LoadJSON__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoadJSON__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadJSON__Group__5"


    // $ANTLR start "rule__LoadJSON__Group__5__Impl"
    // InternalMyDsl.g:810:1: rule__LoadJSON__Group__5__Impl : ( ( rule__LoadJSON__TableAssignment_5 ) ) ;
    public final void rule__LoadJSON__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:814:1: ( ( ( rule__LoadJSON__TableAssignment_5 ) ) )
            // InternalMyDsl.g:815:1: ( ( rule__LoadJSON__TableAssignment_5 ) )
            {
            // InternalMyDsl.g:815:1: ( ( rule__LoadJSON__TableAssignment_5 ) )
            // InternalMyDsl.g:816:2: ( rule__LoadJSON__TableAssignment_5 )
            {
             before(grammarAccess.getLoadJSONAccess().getTableAssignment_5()); 
            // InternalMyDsl.g:817:2: ( rule__LoadJSON__TableAssignment_5 )
            // InternalMyDsl.g:817:3: rule__LoadJSON__TableAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__LoadJSON__TableAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getLoadJSONAccess().getTableAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadJSON__Group__5__Impl"


    // $ANTLR start "rule__LoadJSON__Group__6"
    // InternalMyDsl.g:825:1: rule__LoadJSON__Group__6 : rule__LoadJSON__Group__6__Impl rule__LoadJSON__Group__7 ;
    public final void rule__LoadJSON__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:829:1: ( rule__LoadJSON__Group__6__Impl rule__LoadJSON__Group__7 )
            // InternalMyDsl.g:830:2: rule__LoadJSON__Group__6__Impl rule__LoadJSON__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__LoadJSON__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoadJSON__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadJSON__Group__6"


    // $ANTLR start "rule__LoadJSON__Group__6__Impl"
    // InternalMyDsl.g:837:1: rule__LoadJSON__Group__6__Impl : ( ')' ) ;
    public final void rule__LoadJSON__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:841:1: ( ( ')' ) )
            // InternalMyDsl.g:842:1: ( ')' )
            {
            // InternalMyDsl.g:842:1: ( ')' )
            // InternalMyDsl.g:843:2: ')'
            {
             before(grammarAccess.getLoadJSONAccess().getRightParenthesisKeyword_6()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getLoadJSONAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadJSON__Group__6__Impl"


    // $ANTLR start "rule__LoadJSON__Group__7"
    // InternalMyDsl.g:852:1: rule__LoadJSON__Group__7 : rule__LoadJSON__Group__7__Impl rule__LoadJSON__Group__8 ;
    public final void rule__LoadJSON__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:856:1: ( rule__LoadJSON__Group__7__Impl rule__LoadJSON__Group__8 )
            // InternalMyDsl.g:857:2: rule__LoadJSON__Group__7__Impl rule__LoadJSON__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__LoadJSON__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoadJSON__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadJSON__Group__7"


    // $ANTLR start "rule__LoadJSON__Group__7__Impl"
    // InternalMyDsl.g:864:1: rule__LoadJSON__Group__7__Impl : ( ( rule__LoadJSON__Group_7__0 )? ) ;
    public final void rule__LoadJSON__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:868:1: ( ( ( rule__LoadJSON__Group_7__0 )? ) )
            // InternalMyDsl.g:869:1: ( ( rule__LoadJSON__Group_7__0 )? )
            {
            // InternalMyDsl.g:869:1: ( ( rule__LoadJSON__Group_7__0 )? )
            // InternalMyDsl.g:870:2: ( rule__LoadJSON__Group_7__0 )?
            {
             before(grammarAccess.getLoadJSONAccess().getGroup_7()); 
            // InternalMyDsl.g:871:2: ( rule__LoadJSON__Group_7__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:871:3: rule__LoadJSON__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LoadJSON__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLoadJSONAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadJSON__Group__7__Impl"


    // $ANTLR start "rule__LoadJSON__Group__8"
    // InternalMyDsl.g:879:1: rule__LoadJSON__Group__8 : rule__LoadJSON__Group__8__Impl ;
    public final void rule__LoadJSON__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:883:1: ( rule__LoadJSON__Group__8__Impl )
            // InternalMyDsl.g:884:2: rule__LoadJSON__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LoadJSON__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadJSON__Group__8"


    // $ANTLR start "rule__LoadJSON__Group__8__Impl"
    // InternalMyDsl.g:890:1: rule__LoadJSON__Group__8__Impl : ( ( rule__LoadJSON__Group_8__0 )? ) ;
    public final void rule__LoadJSON__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:894:1: ( ( ( rule__LoadJSON__Group_8__0 )? ) )
            // InternalMyDsl.g:895:1: ( ( rule__LoadJSON__Group_8__0 )? )
            {
            // InternalMyDsl.g:895:1: ( ( rule__LoadJSON__Group_8__0 )? )
            // InternalMyDsl.g:896:2: ( rule__LoadJSON__Group_8__0 )?
            {
             before(grammarAccess.getLoadJSONAccess().getGroup_8()); 
            // InternalMyDsl.g:897:2: ( rule__LoadJSON__Group_8__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:897:3: rule__LoadJSON__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LoadJSON__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLoadJSONAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadJSON__Group__8__Impl"


    // $ANTLR start "rule__LoadJSON__Group_7__0"
    // InternalMyDsl.g:906:1: rule__LoadJSON__Group_7__0 : rule__LoadJSON__Group_7__0__Impl rule__LoadJSON__Group_7__1 ;
    public final void rule__LoadJSON__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:910:1: ( rule__LoadJSON__Group_7__0__Impl rule__LoadJSON__Group_7__1 )
            // InternalMyDsl.g:911:2: rule__LoadJSON__Group_7__0__Impl rule__LoadJSON__Group_7__1
            {
            pushFollow(FOLLOW_5);
            rule__LoadJSON__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoadJSON__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadJSON__Group_7__0"


    // $ANTLR start "rule__LoadJSON__Group_7__0__Impl"
    // InternalMyDsl.g:918:1: rule__LoadJSON__Group_7__0__Impl : ( '.withAttributes(' ) ;
    public final void rule__LoadJSON__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:922:1: ( ( '.withAttributes(' ) )
            // InternalMyDsl.g:923:1: ( '.withAttributes(' )
            {
            // InternalMyDsl.g:923:1: ( '.withAttributes(' )
            // InternalMyDsl.g:924:2: '.withAttributes('
            {
             before(grammarAccess.getLoadJSONAccess().getWithAttributesKeyword_7_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getLoadJSONAccess().getWithAttributesKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadJSON__Group_7__0__Impl"


    // $ANTLR start "rule__LoadJSON__Group_7__1"
    // InternalMyDsl.g:933:1: rule__LoadJSON__Group_7__1 : rule__LoadJSON__Group_7__1__Impl rule__LoadJSON__Group_7__2 ;
    public final void rule__LoadJSON__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:937:1: ( rule__LoadJSON__Group_7__1__Impl rule__LoadJSON__Group_7__2 )
            // InternalMyDsl.g:938:2: rule__LoadJSON__Group_7__1__Impl rule__LoadJSON__Group_7__2
            {
            pushFollow(FOLLOW_9);
            rule__LoadJSON__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoadJSON__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadJSON__Group_7__1"


    // $ANTLR start "rule__LoadJSON__Group_7__1__Impl"
    // InternalMyDsl.g:945:1: rule__LoadJSON__Group_7__1__Impl : ( ( rule__LoadJSON__AttributesAssignment_7_1 ) ) ;
    public final void rule__LoadJSON__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:949:1: ( ( ( rule__LoadJSON__AttributesAssignment_7_1 ) ) )
            // InternalMyDsl.g:950:1: ( ( rule__LoadJSON__AttributesAssignment_7_1 ) )
            {
            // InternalMyDsl.g:950:1: ( ( rule__LoadJSON__AttributesAssignment_7_1 ) )
            // InternalMyDsl.g:951:2: ( rule__LoadJSON__AttributesAssignment_7_1 )
            {
             before(grammarAccess.getLoadJSONAccess().getAttributesAssignment_7_1()); 
            // InternalMyDsl.g:952:2: ( rule__LoadJSON__AttributesAssignment_7_1 )
            // InternalMyDsl.g:952:3: rule__LoadJSON__AttributesAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__LoadJSON__AttributesAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getLoadJSONAccess().getAttributesAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadJSON__Group_7__1__Impl"


    // $ANTLR start "rule__LoadJSON__Group_7__2"
    // InternalMyDsl.g:960:1: rule__LoadJSON__Group_7__2 : rule__LoadJSON__Group_7__2__Impl rule__LoadJSON__Group_7__3 ;
    public final void rule__LoadJSON__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:964:1: ( rule__LoadJSON__Group_7__2__Impl rule__LoadJSON__Group_7__3 )
            // InternalMyDsl.g:965:2: rule__LoadJSON__Group_7__2__Impl rule__LoadJSON__Group_7__3
            {
            pushFollow(FOLLOW_9);
            rule__LoadJSON__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoadJSON__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadJSON__Group_7__2"


    // $ANTLR start "rule__LoadJSON__Group_7__2__Impl"
    // InternalMyDsl.g:972:1: rule__LoadJSON__Group_7__2__Impl : ( ( rule__LoadJSON__Group_7_2__0 )* ) ;
    public final void rule__LoadJSON__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:976:1: ( ( ( rule__LoadJSON__Group_7_2__0 )* ) )
            // InternalMyDsl.g:977:1: ( ( rule__LoadJSON__Group_7_2__0 )* )
            {
            // InternalMyDsl.g:977:1: ( ( rule__LoadJSON__Group_7_2__0 )* )
            // InternalMyDsl.g:978:2: ( rule__LoadJSON__Group_7_2__0 )*
            {
             before(grammarAccess.getLoadJSONAccess().getGroup_7_2()); 
            // InternalMyDsl.g:979:2: ( rule__LoadJSON__Group_7_2__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==17) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:979:3: rule__LoadJSON__Group_7_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__LoadJSON__Group_7_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getLoadJSONAccess().getGroup_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadJSON__Group_7__2__Impl"


    // $ANTLR start "rule__LoadJSON__Group_7__3"
    // InternalMyDsl.g:987:1: rule__LoadJSON__Group_7__3 : rule__LoadJSON__Group_7__3__Impl ;
    public final void rule__LoadJSON__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:991:1: ( rule__LoadJSON__Group_7__3__Impl )
            // InternalMyDsl.g:992:2: rule__LoadJSON__Group_7__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LoadJSON__Group_7__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadJSON__Group_7__3"


    // $ANTLR start "rule__LoadJSON__Group_7__3__Impl"
    // InternalMyDsl.g:998:1: rule__LoadJSON__Group_7__3__Impl : ( ')' ) ;
    public final void rule__LoadJSON__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1002:1: ( ( ')' ) )
            // InternalMyDsl.g:1003:1: ( ')' )
            {
            // InternalMyDsl.g:1003:1: ( ')' )
            // InternalMyDsl.g:1004:2: ')'
            {
             before(grammarAccess.getLoadJSONAccess().getRightParenthesisKeyword_7_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getLoadJSONAccess().getRightParenthesisKeyword_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadJSON__Group_7__3__Impl"


    // $ANTLR start "rule__LoadJSON__Group_7_2__0"
    // InternalMyDsl.g:1014:1: rule__LoadJSON__Group_7_2__0 : rule__LoadJSON__Group_7_2__0__Impl rule__LoadJSON__Group_7_2__1 ;
    public final void rule__LoadJSON__Group_7_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1018:1: ( rule__LoadJSON__Group_7_2__0__Impl rule__LoadJSON__Group_7_2__1 )
            // InternalMyDsl.g:1019:2: rule__LoadJSON__Group_7_2__0__Impl rule__LoadJSON__Group_7_2__1
            {
            pushFollow(FOLLOW_5);
            rule__LoadJSON__Group_7_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoadJSON__Group_7_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadJSON__Group_7_2__0"


    // $ANTLR start "rule__LoadJSON__Group_7_2__0__Impl"
    // InternalMyDsl.g:1026:1: rule__LoadJSON__Group_7_2__0__Impl : ( ',' ) ;
    public final void rule__LoadJSON__Group_7_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1030:1: ( ( ',' ) )
            // InternalMyDsl.g:1031:1: ( ',' )
            {
            // InternalMyDsl.g:1031:1: ( ',' )
            // InternalMyDsl.g:1032:2: ','
            {
             before(grammarAccess.getLoadJSONAccess().getCommaKeyword_7_2_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getLoadJSONAccess().getCommaKeyword_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadJSON__Group_7_2__0__Impl"


    // $ANTLR start "rule__LoadJSON__Group_7_2__1"
    // InternalMyDsl.g:1041:1: rule__LoadJSON__Group_7_2__1 : rule__LoadJSON__Group_7_2__1__Impl ;
    public final void rule__LoadJSON__Group_7_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1045:1: ( rule__LoadJSON__Group_7_2__1__Impl )
            // InternalMyDsl.g:1046:2: rule__LoadJSON__Group_7_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LoadJSON__Group_7_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadJSON__Group_7_2__1"


    // $ANTLR start "rule__LoadJSON__Group_7_2__1__Impl"
    // InternalMyDsl.g:1052:1: rule__LoadJSON__Group_7_2__1__Impl : ( ( rule__LoadJSON__AttributesAssignment_7_2_1 ) ) ;
    public final void rule__LoadJSON__Group_7_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1056:1: ( ( ( rule__LoadJSON__AttributesAssignment_7_2_1 ) ) )
            // InternalMyDsl.g:1057:1: ( ( rule__LoadJSON__AttributesAssignment_7_2_1 ) )
            {
            // InternalMyDsl.g:1057:1: ( ( rule__LoadJSON__AttributesAssignment_7_2_1 ) )
            // InternalMyDsl.g:1058:2: ( rule__LoadJSON__AttributesAssignment_7_2_1 )
            {
             before(grammarAccess.getLoadJSONAccess().getAttributesAssignment_7_2_1()); 
            // InternalMyDsl.g:1059:2: ( rule__LoadJSON__AttributesAssignment_7_2_1 )
            // InternalMyDsl.g:1059:3: rule__LoadJSON__AttributesAssignment_7_2_1
            {
            pushFollow(FOLLOW_2);
            rule__LoadJSON__AttributesAssignment_7_2_1();

            state._fsp--;


            }

             after(grammarAccess.getLoadJSONAccess().getAttributesAssignment_7_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadJSON__Group_7_2__1__Impl"


    // $ANTLR start "rule__LoadJSON__Group_8__0"
    // InternalMyDsl.g:1068:1: rule__LoadJSON__Group_8__0 : rule__LoadJSON__Group_8__0__Impl rule__LoadJSON__Group_8__1 ;
    public final void rule__LoadJSON__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1072:1: ( rule__LoadJSON__Group_8__0__Impl rule__LoadJSON__Group_8__1 )
            // InternalMyDsl.g:1073:2: rule__LoadJSON__Group_8__0__Impl rule__LoadJSON__Group_8__1
            {
            pushFollow(FOLLOW_5);
            rule__LoadJSON__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoadJSON__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadJSON__Group_8__0"


    // $ANTLR start "rule__LoadJSON__Group_8__0__Impl"
    // InternalMyDsl.g:1080:1: rule__LoadJSON__Group_8__0__Impl : ( '.nestedIn(' ) ;
    public final void rule__LoadJSON__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1084:1: ( ( '.nestedIn(' ) )
            // InternalMyDsl.g:1085:1: ( '.nestedIn(' )
            {
            // InternalMyDsl.g:1085:1: ( '.nestedIn(' )
            // InternalMyDsl.g:1086:2: '.nestedIn('
            {
             before(grammarAccess.getLoadJSONAccess().getNestedInKeyword_8_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getLoadJSONAccess().getNestedInKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadJSON__Group_8__0__Impl"


    // $ANTLR start "rule__LoadJSON__Group_8__1"
    // InternalMyDsl.g:1095:1: rule__LoadJSON__Group_8__1 : rule__LoadJSON__Group_8__1__Impl rule__LoadJSON__Group_8__2 ;
    public final void rule__LoadJSON__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1099:1: ( rule__LoadJSON__Group_8__1__Impl rule__LoadJSON__Group_8__2 )
            // InternalMyDsl.g:1100:2: rule__LoadJSON__Group_8__1__Impl rule__LoadJSON__Group_8__2
            {
            pushFollow(FOLLOW_9);
            rule__LoadJSON__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoadJSON__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadJSON__Group_8__1"


    // $ANTLR start "rule__LoadJSON__Group_8__1__Impl"
    // InternalMyDsl.g:1107:1: rule__LoadJSON__Group_8__1__Impl : ( ( rule__LoadJSON__NestedAssignment_8_1 ) ) ;
    public final void rule__LoadJSON__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1111:1: ( ( ( rule__LoadJSON__NestedAssignment_8_1 ) ) )
            // InternalMyDsl.g:1112:1: ( ( rule__LoadJSON__NestedAssignment_8_1 ) )
            {
            // InternalMyDsl.g:1112:1: ( ( rule__LoadJSON__NestedAssignment_8_1 ) )
            // InternalMyDsl.g:1113:2: ( rule__LoadJSON__NestedAssignment_8_1 )
            {
             before(grammarAccess.getLoadJSONAccess().getNestedAssignment_8_1()); 
            // InternalMyDsl.g:1114:2: ( rule__LoadJSON__NestedAssignment_8_1 )
            // InternalMyDsl.g:1114:3: rule__LoadJSON__NestedAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__LoadJSON__NestedAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getLoadJSONAccess().getNestedAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadJSON__Group_8__1__Impl"


    // $ANTLR start "rule__LoadJSON__Group_8__2"
    // InternalMyDsl.g:1122:1: rule__LoadJSON__Group_8__2 : rule__LoadJSON__Group_8__2__Impl rule__LoadJSON__Group_8__3 ;
    public final void rule__LoadJSON__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1126:1: ( rule__LoadJSON__Group_8__2__Impl rule__LoadJSON__Group_8__3 )
            // InternalMyDsl.g:1127:2: rule__LoadJSON__Group_8__2__Impl rule__LoadJSON__Group_8__3
            {
            pushFollow(FOLLOW_9);
            rule__LoadJSON__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoadJSON__Group_8__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadJSON__Group_8__2"


    // $ANTLR start "rule__LoadJSON__Group_8__2__Impl"
    // InternalMyDsl.g:1134:1: rule__LoadJSON__Group_8__2__Impl : ( ( rule__LoadJSON__Group_8_2__0 )* ) ;
    public final void rule__LoadJSON__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1138:1: ( ( ( rule__LoadJSON__Group_8_2__0 )* ) )
            // InternalMyDsl.g:1139:1: ( ( rule__LoadJSON__Group_8_2__0 )* )
            {
            // InternalMyDsl.g:1139:1: ( ( rule__LoadJSON__Group_8_2__0 )* )
            // InternalMyDsl.g:1140:2: ( rule__LoadJSON__Group_8_2__0 )*
            {
             before(grammarAccess.getLoadJSONAccess().getGroup_8_2()); 
            // InternalMyDsl.g:1141:2: ( rule__LoadJSON__Group_8_2__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==17) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:1141:3: rule__LoadJSON__Group_8_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__LoadJSON__Group_8_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getLoadJSONAccess().getGroup_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadJSON__Group_8__2__Impl"


    // $ANTLR start "rule__LoadJSON__Group_8__3"
    // InternalMyDsl.g:1149:1: rule__LoadJSON__Group_8__3 : rule__LoadJSON__Group_8__3__Impl ;
    public final void rule__LoadJSON__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1153:1: ( rule__LoadJSON__Group_8__3__Impl )
            // InternalMyDsl.g:1154:2: rule__LoadJSON__Group_8__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LoadJSON__Group_8__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadJSON__Group_8__3"


    // $ANTLR start "rule__LoadJSON__Group_8__3__Impl"
    // InternalMyDsl.g:1160:1: rule__LoadJSON__Group_8__3__Impl : ( ')' ) ;
    public final void rule__LoadJSON__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1164:1: ( ( ')' ) )
            // InternalMyDsl.g:1165:1: ( ')' )
            {
            // InternalMyDsl.g:1165:1: ( ')' )
            // InternalMyDsl.g:1166:2: ')'
            {
             before(grammarAccess.getLoadJSONAccess().getRightParenthesisKeyword_8_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getLoadJSONAccess().getRightParenthesisKeyword_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadJSON__Group_8__3__Impl"


    // $ANTLR start "rule__LoadJSON__Group_8_2__0"
    // InternalMyDsl.g:1176:1: rule__LoadJSON__Group_8_2__0 : rule__LoadJSON__Group_8_2__0__Impl rule__LoadJSON__Group_8_2__1 ;
    public final void rule__LoadJSON__Group_8_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1180:1: ( rule__LoadJSON__Group_8_2__0__Impl rule__LoadJSON__Group_8_2__1 )
            // InternalMyDsl.g:1181:2: rule__LoadJSON__Group_8_2__0__Impl rule__LoadJSON__Group_8_2__1
            {
            pushFollow(FOLLOW_5);
            rule__LoadJSON__Group_8_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoadJSON__Group_8_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadJSON__Group_8_2__0"


    // $ANTLR start "rule__LoadJSON__Group_8_2__0__Impl"
    // InternalMyDsl.g:1188:1: rule__LoadJSON__Group_8_2__0__Impl : ( ',' ) ;
    public final void rule__LoadJSON__Group_8_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1192:1: ( ( ',' ) )
            // InternalMyDsl.g:1193:1: ( ',' )
            {
            // InternalMyDsl.g:1193:1: ( ',' )
            // InternalMyDsl.g:1194:2: ','
            {
             before(grammarAccess.getLoadJSONAccess().getCommaKeyword_8_2_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getLoadJSONAccess().getCommaKeyword_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadJSON__Group_8_2__0__Impl"


    // $ANTLR start "rule__LoadJSON__Group_8_2__1"
    // InternalMyDsl.g:1203:1: rule__LoadJSON__Group_8_2__1 : rule__LoadJSON__Group_8_2__1__Impl ;
    public final void rule__LoadJSON__Group_8_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1207:1: ( rule__LoadJSON__Group_8_2__1__Impl )
            // InternalMyDsl.g:1208:2: rule__LoadJSON__Group_8_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LoadJSON__Group_8_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadJSON__Group_8_2__1"


    // $ANTLR start "rule__LoadJSON__Group_8_2__1__Impl"
    // InternalMyDsl.g:1214:1: rule__LoadJSON__Group_8_2__1__Impl : ( ( rule__LoadJSON__NestedAssignment_8_2_1 ) ) ;
    public final void rule__LoadJSON__Group_8_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1218:1: ( ( ( rule__LoadJSON__NestedAssignment_8_2_1 ) ) )
            // InternalMyDsl.g:1219:1: ( ( rule__LoadJSON__NestedAssignment_8_2_1 ) )
            {
            // InternalMyDsl.g:1219:1: ( ( rule__LoadJSON__NestedAssignment_8_2_1 ) )
            // InternalMyDsl.g:1220:2: ( rule__LoadJSON__NestedAssignment_8_2_1 )
            {
             before(grammarAccess.getLoadJSONAccess().getNestedAssignment_8_2_1()); 
            // InternalMyDsl.g:1221:2: ( rule__LoadJSON__NestedAssignment_8_2_1 )
            // InternalMyDsl.g:1221:3: rule__LoadJSON__NestedAssignment_8_2_1
            {
            pushFollow(FOLLOW_2);
            rule__LoadJSON__NestedAssignment_8_2_1();

            state._fsp--;


            }

             after(grammarAccess.getLoadJSONAccess().getNestedAssignment_8_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadJSON__Group_8_2__1__Impl"


    // $ANTLR start "rule__LoadXML__Group__0"
    // InternalMyDsl.g:1230:1: rule__LoadXML__Group__0 : rule__LoadXML__Group__0__Impl rule__LoadXML__Group__1 ;
    public final void rule__LoadXML__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1234:1: ( rule__LoadXML__Group__0__Impl rule__LoadXML__Group__1 )
            // InternalMyDsl.g:1235:2: rule__LoadXML__Group__0__Impl rule__LoadXML__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__LoadXML__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoadXML__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadXML__Group__0"


    // $ANTLR start "rule__LoadXML__Group__0__Impl"
    // InternalMyDsl.g:1242:1: rule__LoadXML__Group__0__Impl : ( '.loadXML()' ) ;
    public final void rule__LoadXML__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1246:1: ( ( '.loadXML()' ) )
            // InternalMyDsl.g:1247:1: ( '.loadXML()' )
            {
            // InternalMyDsl.g:1247:1: ( '.loadXML()' )
            // InternalMyDsl.g:1248:2: '.loadXML()'
            {
             before(grammarAccess.getLoadXMLAccess().getLoadXMLKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getLoadXMLAccess().getLoadXMLKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadXML__Group__0__Impl"


    // $ANTLR start "rule__LoadXML__Group__1"
    // InternalMyDsl.g:1257:1: rule__LoadXML__Group__1 : rule__LoadXML__Group__1__Impl rule__LoadXML__Group__2 ;
    public final void rule__LoadXML__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1261:1: ( rule__LoadXML__Group__1__Impl rule__LoadXML__Group__2 )
            // InternalMyDsl.g:1262:2: rule__LoadXML__Group__1__Impl rule__LoadXML__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__LoadXML__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoadXML__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadXML__Group__1"


    // $ANTLR start "rule__LoadXML__Group__1__Impl"
    // InternalMyDsl.g:1269:1: rule__LoadXML__Group__1__Impl : ( '.from(' ) ;
    public final void rule__LoadXML__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1273:1: ( ( '.from(' ) )
            // InternalMyDsl.g:1274:1: ( '.from(' )
            {
            // InternalMyDsl.g:1274:1: ( '.from(' )
            // InternalMyDsl.g:1275:2: '.from('
            {
             before(grammarAccess.getLoadXMLAccess().getFromKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getLoadXMLAccess().getFromKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadXML__Group__1__Impl"


    // $ANTLR start "rule__LoadXML__Group__2"
    // InternalMyDsl.g:1284:1: rule__LoadXML__Group__2 : rule__LoadXML__Group__2__Impl rule__LoadXML__Group__3 ;
    public final void rule__LoadXML__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1288:1: ( rule__LoadXML__Group__2__Impl rule__LoadXML__Group__3 )
            // InternalMyDsl.g:1289:2: rule__LoadXML__Group__2__Impl rule__LoadXML__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__LoadXML__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoadXML__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadXML__Group__2"


    // $ANTLR start "rule__LoadXML__Group__2__Impl"
    // InternalMyDsl.g:1296:1: rule__LoadXML__Group__2__Impl : ( ( rule__LoadXML__FileAssignment_2 ) ) ;
    public final void rule__LoadXML__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1300:1: ( ( ( rule__LoadXML__FileAssignment_2 ) ) )
            // InternalMyDsl.g:1301:1: ( ( rule__LoadXML__FileAssignment_2 ) )
            {
            // InternalMyDsl.g:1301:1: ( ( rule__LoadXML__FileAssignment_2 ) )
            // InternalMyDsl.g:1302:2: ( rule__LoadXML__FileAssignment_2 )
            {
             before(grammarAccess.getLoadXMLAccess().getFileAssignment_2()); 
            // InternalMyDsl.g:1303:2: ( rule__LoadXML__FileAssignment_2 )
            // InternalMyDsl.g:1303:3: rule__LoadXML__FileAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LoadXML__FileAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLoadXMLAccess().getFileAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadXML__Group__2__Impl"


    // $ANTLR start "rule__LoadXML__Group__3"
    // InternalMyDsl.g:1311:1: rule__LoadXML__Group__3 : rule__LoadXML__Group__3__Impl rule__LoadXML__Group__4 ;
    public final void rule__LoadXML__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1315:1: ( rule__LoadXML__Group__3__Impl rule__LoadXML__Group__4 )
            // InternalMyDsl.g:1316:2: rule__LoadXML__Group__3__Impl rule__LoadXML__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__LoadXML__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoadXML__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadXML__Group__3"


    // $ANTLR start "rule__LoadXML__Group__3__Impl"
    // InternalMyDsl.g:1323:1: rule__LoadXML__Group__3__Impl : ( ')' ) ;
    public final void rule__LoadXML__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1327:1: ( ( ')' ) )
            // InternalMyDsl.g:1328:1: ( ')' )
            {
            // InternalMyDsl.g:1328:1: ( ')' )
            // InternalMyDsl.g:1329:2: ')'
            {
             before(grammarAccess.getLoadXMLAccess().getRightParenthesisKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getLoadXMLAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadXML__Group__3__Impl"


    // $ANTLR start "rule__LoadXML__Group__4"
    // InternalMyDsl.g:1338:1: rule__LoadXML__Group__4 : rule__LoadXML__Group__4__Impl rule__LoadXML__Group__5 ;
    public final void rule__LoadXML__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1342:1: ( rule__LoadXML__Group__4__Impl rule__LoadXML__Group__5 )
            // InternalMyDsl.g:1343:2: rule__LoadXML__Group__4__Impl rule__LoadXML__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__LoadXML__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoadXML__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadXML__Group__4"


    // $ANTLR start "rule__LoadXML__Group__4__Impl"
    // InternalMyDsl.g:1350:1: rule__LoadXML__Group__4__Impl : ( '.into(' ) ;
    public final void rule__LoadXML__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1354:1: ( ( '.into(' ) )
            // InternalMyDsl.g:1355:1: ( '.into(' )
            {
            // InternalMyDsl.g:1355:1: ( '.into(' )
            // InternalMyDsl.g:1356:2: '.into('
            {
             before(grammarAccess.getLoadXMLAccess().getIntoKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getLoadXMLAccess().getIntoKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadXML__Group__4__Impl"


    // $ANTLR start "rule__LoadXML__Group__5"
    // InternalMyDsl.g:1365:1: rule__LoadXML__Group__5 : rule__LoadXML__Group__5__Impl rule__LoadXML__Group__6 ;
    public final void rule__LoadXML__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1369:1: ( rule__LoadXML__Group__5__Impl rule__LoadXML__Group__6 )
            // InternalMyDsl.g:1370:2: rule__LoadXML__Group__5__Impl rule__LoadXML__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__LoadXML__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoadXML__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadXML__Group__5"


    // $ANTLR start "rule__LoadXML__Group__5__Impl"
    // InternalMyDsl.g:1377:1: rule__LoadXML__Group__5__Impl : ( ( rule__LoadXML__TableAssignment_5 ) ) ;
    public final void rule__LoadXML__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1381:1: ( ( ( rule__LoadXML__TableAssignment_5 ) ) )
            // InternalMyDsl.g:1382:1: ( ( rule__LoadXML__TableAssignment_5 ) )
            {
            // InternalMyDsl.g:1382:1: ( ( rule__LoadXML__TableAssignment_5 ) )
            // InternalMyDsl.g:1383:2: ( rule__LoadXML__TableAssignment_5 )
            {
             before(grammarAccess.getLoadXMLAccess().getTableAssignment_5()); 
            // InternalMyDsl.g:1384:2: ( rule__LoadXML__TableAssignment_5 )
            // InternalMyDsl.g:1384:3: rule__LoadXML__TableAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__LoadXML__TableAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getLoadXMLAccess().getTableAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadXML__Group__5__Impl"


    // $ANTLR start "rule__LoadXML__Group__6"
    // InternalMyDsl.g:1392:1: rule__LoadXML__Group__6 : rule__LoadXML__Group__6__Impl rule__LoadXML__Group__7 ;
    public final void rule__LoadXML__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1396:1: ( rule__LoadXML__Group__6__Impl rule__LoadXML__Group__7 )
            // InternalMyDsl.g:1397:2: rule__LoadXML__Group__6__Impl rule__LoadXML__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__LoadXML__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoadXML__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadXML__Group__6"


    // $ANTLR start "rule__LoadXML__Group__6__Impl"
    // InternalMyDsl.g:1404:1: rule__LoadXML__Group__6__Impl : ( ')' ) ;
    public final void rule__LoadXML__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1408:1: ( ( ')' ) )
            // InternalMyDsl.g:1409:1: ( ')' )
            {
            // InternalMyDsl.g:1409:1: ( ')' )
            // InternalMyDsl.g:1410:2: ')'
            {
             before(grammarAccess.getLoadXMLAccess().getRightParenthesisKeyword_6()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getLoadXMLAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadXML__Group__6__Impl"


    // $ANTLR start "rule__LoadXML__Group__7"
    // InternalMyDsl.g:1419:1: rule__LoadXML__Group__7 : rule__LoadXML__Group__7__Impl ;
    public final void rule__LoadXML__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1423:1: ( rule__LoadXML__Group__7__Impl )
            // InternalMyDsl.g:1424:2: rule__LoadXML__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LoadXML__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadXML__Group__7"


    // $ANTLR start "rule__LoadXML__Group__7__Impl"
    // InternalMyDsl.g:1430:1: rule__LoadXML__Group__7__Impl : ( ( rule__LoadXML__Group_7__0 )? ) ;
    public final void rule__LoadXML__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1434:1: ( ( ( rule__LoadXML__Group_7__0 )? ) )
            // InternalMyDsl.g:1435:1: ( ( rule__LoadXML__Group_7__0 )? )
            {
            // InternalMyDsl.g:1435:1: ( ( rule__LoadXML__Group_7__0 )? )
            // InternalMyDsl.g:1436:2: ( rule__LoadXML__Group_7__0 )?
            {
             before(grammarAccess.getLoadXMLAccess().getGroup_7()); 
            // InternalMyDsl.g:1437:2: ( rule__LoadXML__Group_7__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:1437:3: rule__LoadXML__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LoadXML__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLoadXMLAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadXML__Group__7__Impl"


    // $ANTLR start "rule__LoadXML__Group_7__0"
    // InternalMyDsl.g:1446:1: rule__LoadXML__Group_7__0 : rule__LoadXML__Group_7__0__Impl rule__LoadXML__Group_7__1 ;
    public final void rule__LoadXML__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1450:1: ( rule__LoadXML__Group_7__0__Impl rule__LoadXML__Group_7__1 )
            // InternalMyDsl.g:1451:2: rule__LoadXML__Group_7__0__Impl rule__LoadXML__Group_7__1
            {
            pushFollow(FOLLOW_5);
            rule__LoadXML__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoadXML__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadXML__Group_7__0"


    // $ANTLR start "rule__LoadXML__Group_7__0__Impl"
    // InternalMyDsl.g:1458:1: rule__LoadXML__Group_7__0__Impl : ( '.nestedIn(' ) ;
    public final void rule__LoadXML__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1462:1: ( ( '.nestedIn(' ) )
            // InternalMyDsl.g:1463:1: ( '.nestedIn(' )
            {
            // InternalMyDsl.g:1463:1: ( '.nestedIn(' )
            // InternalMyDsl.g:1464:2: '.nestedIn('
            {
             before(grammarAccess.getLoadXMLAccess().getNestedInKeyword_7_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getLoadXMLAccess().getNestedInKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadXML__Group_7__0__Impl"


    // $ANTLR start "rule__LoadXML__Group_7__1"
    // InternalMyDsl.g:1473:1: rule__LoadXML__Group_7__1 : rule__LoadXML__Group_7__1__Impl rule__LoadXML__Group_7__2 ;
    public final void rule__LoadXML__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1477:1: ( rule__LoadXML__Group_7__1__Impl rule__LoadXML__Group_7__2 )
            // InternalMyDsl.g:1478:2: rule__LoadXML__Group_7__1__Impl rule__LoadXML__Group_7__2
            {
            pushFollow(FOLLOW_9);
            rule__LoadXML__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoadXML__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadXML__Group_7__1"


    // $ANTLR start "rule__LoadXML__Group_7__1__Impl"
    // InternalMyDsl.g:1485:1: rule__LoadXML__Group_7__1__Impl : ( ( rule__LoadXML__NestedAssignment_7_1 ) ) ;
    public final void rule__LoadXML__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1489:1: ( ( ( rule__LoadXML__NestedAssignment_7_1 ) ) )
            // InternalMyDsl.g:1490:1: ( ( rule__LoadXML__NestedAssignment_7_1 ) )
            {
            // InternalMyDsl.g:1490:1: ( ( rule__LoadXML__NestedAssignment_7_1 ) )
            // InternalMyDsl.g:1491:2: ( rule__LoadXML__NestedAssignment_7_1 )
            {
             before(grammarAccess.getLoadXMLAccess().getNestedAssignment_7_1()); 
            // InternalMyDsl.g:1492:2: ( rule__LoadXML__NestedAssignment_7_1 )
            // InternalMyDsl.g:1492:3: rule__LoadXML__NestedAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__LoadXML__NestedAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getLoadXMLAccess().getNestedAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadXML__Group_7__1__Impl"


    // $ANTLR start "rule__LoadXML__Group_7__2"
    // InternalMyDsl.g:1500:1: rule__LoadXML__Group_7__2 : rule__LoadXML__Group_7__2__Impl rule__LoadXML__Group_7__3 ;
    public final void rule__LoadXML__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1504:1: ( rule__LoadXML__Group_7__2__Impl rule__LoadXML__Group_7__3 )
            // InternalMyDsl.g:1505:2: rule__LoadXML__Group_7__2__Impl rule__LoadXML__Group_7__3
            {
            pushFollow(FOLLOW_9);
            rule__LoadXML__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoadXML__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadXML__Group_7__2"


    // $ANTLR start "rule__LoadXML__Group_7__2__Impl"
    // InternalMyDsl.g:1512:1: rule__LoadXML__Group_7__2__Impl : ( ( rule__LoadXML__Group_7_2__0 )* ) ;
    public final void rule__LoadXML__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1516:1: ( ( ( rule__LoadXML__Group_7_2__0 )* ) )
            // InternalMyDsl.g:1517:1: ( ( rule__LoadXML__Group_7_2__0 )* )
            {
            // InternalMyDsl.g:1517:1: ( ( rule__LoadXML__Group_7_2__0 )* )
            // InternalMyDsl.g:1518:2: ( rule__LoadXML__Group_7_2__0 )*
            {
             before(grammarAccess.getLoadXMLAccess().getGroup_7_2()); 
            // InternalMyDsl.g:1519:2: ( rule__LoadXML__Group_7_2__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==17) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:1519:3: rule__LoadXML__Group_7_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__LoadXML__Group_7_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getLoadXMLAccess().getGroup_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadXML__Group_7__2__Impl"


    // $ANTLR start "rule__LoadXML__Group_7__3"
    // InternalMyDsl.g:1527:1: rule__LoadXML__Group_7__3 : rule__LoadXML__Group_7__3__Impl ;
    public final void rule__LoadXML__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1531:1: ( rule__LoadXML__Group_7__3__Impl )
            // InternalMyDsl.g:1532:2: rule__LoadXML__Group_7__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LoadXML__Group_7__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadXML__Group_7__3"


    // $ANTLR start "rule__LoadXML__Group_7__3__Impl"
    // InternalMyDsl.g:1538:1: rule__LoadXML__Group_7__3__Impl : ( ')' ) ;
    public final void rule__LoadXML__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1542:1: ( ( ')' ) )
            // InternalMyDsl.g:1543:1: ( ')' )
            {
            // InternalMyDsl.g:1543:1: ( ')' )
            // InternalMyDsl.g:1544:2: ')'
            {
             before(grammarAccess.getLoadXMLAccess().getRightParenthesisKeyword_7_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getLoadXMLAccess().getRightParenthesisKeyword_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadXML__Group_7__3__Impl"


    // $ANTLR start "rule__LoadXML__Group_7_2__0"
    // InternalMyDsl.g:1554:1: rule__LoadXML__Group_7_2__0 : rule__LoadXML__Group_7_2__0__Impl rule__LoadXML__Group_7_2__1 ;
    public final void rule__LoadXML__Group_7_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1558:1: ( rule__LoadXML__Group_7_2__0__Impl rule__LoadXML__Group_7_2__1 )
            // InternalMyDsl.g:1559:2: rule__LoadXML__Group_7_2__0__Impl rule__LoadXML__Group_7_2__1
            {
            pushFollow(FOLLOW_5);
            rule__LoadXML__Group_7_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoadXML__Group_7_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadXML__Group_7_2__0"


    // $ANTLR start "rule__LoadXML__Group_7_2__0__Impl"
    // InternalMyDsl.g:1566:1: rule__LoadXML__Group_7_2__0__Impl : ( ',' ) ;
    public final void rule__LoadXML__Group_7_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1570:1: ( ( ',' ) )
            // InternalMyDsl.g:1571:1: ( ',' )
            {
            // InternalMyDsl.g:1571:1: ( ',' )
            // InternalMyDsl.g:1572:2: ','
            {
             before(grammarAccess.getLoadXMLAccess().getCommaKeyword_7_2_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getLoadXMLAccess().getCommaKeyword_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadXML__Group_7_2__0__Impl"


    // $ANTLR start "rule__LoadXML__Group_7_2__1"
    // InternalMyDsl.g:1581:1: rule__LoadXML__Group_7_2__1 : rule__LoadXML__Group_7_2__1__Impl ;
    public final void rule__LoadXML__Group_7_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1585:1: ( rule__LoadXML__Group_7_2__1__Impl )
            // InternalMyDsl.g:1586:2: rule__LoadXML__Group_7_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LoadXML__Group_7_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadXML__Group_7_2__1"


    // $ANTLR start "rule__LoadXML__Group_7_2__1__Impl"
    // InternalMyDsl.g:1592:1: rule__LoadXML__Group_7_2__1__Impl : ( ( rule__LoadXML__NestedAssignment_7_2_1 ) ) ;
    public final void rule__LoadXML__Group_7_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1596:1: ( ( ( rule__LoadXML__NestedAssignment_7_2_1 ) ) )
            // InternalMyDsl.g:1597:1: ( ( rule__LoadXML__NestedAssignment_7_2_1 ) )
            {
            // InternalMyDsl.g:1597:1: ( ( rule__LoadXML__NestedAssignment_7_2_1 ) )
            // InternalMyDsl.g:1598:2: ( rule__LoadXML__NestedAssignment_7_2_1 )
            {
             before(grammarAccess.getLoadXMLAccess().getNestedAssignment_7_2_1()); 
            // InternalMyDsl.g:1599:2: ( rule__LoadXML__NestedAssignment_7_2_1 )
            // InternalMyDsl.g:1599:3: rule__LoadXML__NestedAssignment_7_2_1
            {
            pushFollow(FOLLOW_2);
            rule__LoadXML__NestedAssignment_7_2_1();

            state._fsp--;


            }

             after(grammarAccess.getLoadXMLAccess().getNestedAssignment_7_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadXML__Group_7_2__1__Impl"


    // $ANTLR start "rule__LoadYAML__Group__0"
    // InternalMyDsl.g:1608:1: rule__LoadYAML__Group__0 : rule__LoadYAML__Group__0__Impl rule__LoadYAML__Group__1 ;
    public final void rule__LoadYAML__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1612:1: ( rule__LoadYAML__Group__0__Impl rule__LoadYAML__Group__1 )
            // InternalMyDsl.g:1613:2: rule__LoadYAML__Group__0__Impl rule__LoadYAML__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__LoadYAML__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoadYAML__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadYAML__Group__0"


    // $ANTLR start "rule__LoadYAML__Group__0__Impl"
    // InternalMyDsl.g:1620:1: rule__LoadYAML__Group__0__Impl : ( '.loadYAML()' ) ;
    public final void rule__LoadYAML__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1624:1: ( ( '.loadYAML()' ) )
            // InternalMyDsl.g:1625:1: ( '.loadYAML()' )
            {
            // InternalMyDsl.g:1625:1: ( '.loadYAML()' )
            // InternalMyDsl.g:1626:2: '.loadYAML()'
            {
             before(grammarAccess.getLoadYAMLAccess().getLoadYAMLKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getLoadYAMLAccess().getLoadYAMLKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadYAML__Group__0__Impl"


    // $ANTLR start "rule__LoadYAML__Group__1"
    // InternalMyDsl.g:1635:1: rule__LoadYAML__Group__1 : rule__LoadYAML__Group__1__Impl rule__LoadYAML__Group__2 ;
    public final void rule__LoadYAML__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1639:1: ( rule__LoadYAML__Group__1__Impl rule__LoadYAML__Group__2 )
            // InternalMyDsl.g:1640:2: rule__LoadYAML__Group__1__Impl rule__LoadYAML__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__LoadYAML__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoadYAML__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadYAML__Group__1"


    // $ANTLR start "rule__LoadYAML__Group__1__Impl"
    // InternalMyDsl.g:1647:1: rule__LoadYAML__Group__1__Impl : ( '.from(' ) ;
    public final void rule__LoadYAML__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1651:1: ( ( '.from(' ) )
            // InternalMyDsl.g:1652:1: ( '.from(' )
            {
            // InternalMyDsl.g:1652:1: ( '.from(' )
            // InternalMyDsl.g:1653:2: '.from('
            {
             before(grammarAccess.getLoadYAMLAccess().getFromKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getLoadYAMLAccess().getFromKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadYAML__Group__1__Impl"


    // $ANTLR start "rule__LoadYAML__Group__2"
    // InternalMyDsl.g:1662:1: rule__LoadYAML__Group__2 : rule__LoadYAML__Group__2__Impl rule__LoadYAML__Group__3 ;
    public final void rule__LoadYAML__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1666:1: ( rule__LoadYAML__Group__2__Impl rule__LoadYAML__Group__3 )
            // InternalMyDsl.g:1667:2: rule__LoadYAML__Group__2__Impl rule__LoadYAML__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__LoadYAML__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoadYAML__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadYAML__Group__2"


    // $ANTLR start "rule__LoadYAML__Group__2__Impl"
    // InternalMyDsl.g:1674:1: rule__LoadYAML__Group__2__Impl : ( ( rule__LoadYAML__FileAssignment_2 ) ) ;
    public final void rule__LoadYAML__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1678:1: ( ( ( rule__LoadYAML__FileAssignment_2 ) ) )
            // InternalMyDsl.g:1679:1: ( ( rule__LoadYAML__FileAssignment_2 ) )
            {
            // InternalMyDsl.g:1679:1: ( ( rule__LoadYAML__FileAssignment_2 ) )
            // InternalMyDsl.g:1680:2: ( rule__LoadYAML__FileAssignment_2 )
            {
             before(grammarAccess.getLoadYAMLAccess().getFileAssignment_2()); 
            // InternalMyDsl.g:1681:2: ( rule__LoadYAML__FileAssignment_2 )
            // InternalMyDsl.g:1681:3: rule__LoadYAML__FileAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LoadYAML__FileAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLoadYAMLAccess().getFileAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadYAML__Group__2__Impl"


    // $ANTLR start "rule__LoadYAML__Group__3"
    // InternalMyDsl.g:1689:1: rule__LoadYAML__Group__3 : rule__LoadYAML__Group__3__Impl rule__LoadYAML__Group__4 ;
    public final void rule__LoadYAML__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1693:1: ( rule__LoadYAML__Group__3__Impl rule__LoadYAML__Group__4 )
            // InternalMyDsl.g:1694:2: rule__LoadYAML__Group__3__Impl rule__LoadYAML__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__LoadYAML__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoadYAML__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadYAML__Group__3"


    // $ANTLR start "rule__LoadYAML__Group__3__Impl"
    // InternalMyDsl.g:1701:1: rule__LoadYAML__Group__3__Impl : ( ')' ) ;
    public final void rule__LoadYAML__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1705:1: ( ( ')' ) )
            // InternalMyDsl.g:1706:1: ( ')' )
            {
            // InternalMyDsl.g:1706:1: ( ')' )
            // InternalMyDsl.g:1707:2: ')'
            {
             before(grammarAccess.getLoadYAMLAccess().getRightParenthesisKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getLoadYAMLAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadYAML__Group__3__Impl"


    // $ANTLR start "rule__LoadYAML__Group__4"
    // InternalMyDsl.g:1716:1: rule__LoadYAML__Group__4 : rule__LoadYAML__Group__4__Impl rule__LoadYAML__Group__5 ;
    public final void rule__LoadYAML__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1720:1: ( rule__LoadYAML__Group__4__Impl rule__LoadYAML__Group__5 )
            // InternalMyDsl.g:1721:2: rule__LoadYAML__Group__4__Impl rule__LoadYAML__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__LoadYAML__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoadYAML__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadYAML__Group__4"


    // $ANTLR start "rule__LoadYAML__Group__4__Impl"
    // InternalMyDsl.g:1728:1: rule__LoadYAML__Group__4__Impl : ( '.into(' ) ;
    public final void rule__LoadYAML__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1732:1: ( ( '.into(' ) )
            // InternalMyDsl.g:1733:1: ( '.into(' )
            {
            // InternalMyDsl.g:1733:1: ( '.into(' )
            // InternalMyDsl.g:1734:2: '.into('
            {
             before(grammarAccess.getLoadYAMLAccess().getIntoKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getLoadYAMLAccess().getIntoKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadYAML__Group__4__Impl"


    // $ANTLR start "rule__LoadYAML__Group__5"
    // InternalMyDsl.g:1743:1: rule__LoadYAML__Group__5 : rule__LoadYAML__Group__5__Impl rule__LoadYAML__Group__6 ;
    public final void rule__LoadYAML__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1747:1: ( rule__LoadYAML__Group__5__Impl rule__LoadYAML__Group__6 )
            // InternalMyDsl.g:1748:2: rule__LoadYAML__Group__5__Impl rule__LoadYAML__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__LoadYAML__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoadYAML__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadYAML__Group__5"


    // $ANTLR start "rule__LoadYAML__Group__5__Impl"
    // InternalMyDsl.g:1755:1: rule__LoadYAML__Group__5__Impl : ( ( rule__LoadYAML__TableAssignment_5 ) ) ;
    public final void rule__LoadYAML__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1759:1: ( ( ( rule__LoadYAML__TableAssignment_5 ) ) )
            // InternalMyDsl.g:1760:1: ( ( rule__LoadYAML__TableAssignment_5 ) )
            {
            // InternalMyDsl.g:1760:1: ( ( rule__LoadYAML__TableAssignment_5 ) )
            // InternalMyDsl.g:1761:2: ( rule__LoadYAML__TableAssignment_5 )
            {
             before(grammarAccess.getLoadYAMLAccess().getTableAssignment_5()); 
            // InternalMyDsl.g:1762:2: ( rule__LoadYAML__TableAssignment_5 )
            // InternalMyDsl.g:1762:3: rule__LoadYAML__TableAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__LoadYAML__TableAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getLoadYAMLAccess().getTableAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadYAML__Group__5__Impl"


    // $ANTLR start "rule__LoadYAML__Group__6"
    // InternalMyDsl.g:1770:1: rule__LoadYAML__Group__6 : rule__LoadYAML__Group__6__Impl rule__LoadYAML__Group__7 ;
    public final void rule__LoadYAML__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1774:1: ( rule__LoadYAML__Group__6__Impl rule__LoadYAML__Group__7 )
            // InternalMyDsl.g:1775:2: rule__LoadYAML__Group__6__Impl rule__LoadYAML__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__LoadYAML__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoadYAML__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadYAML__Group__6"


    // $ANTLR start "rule__LoadYAML__Group__6__Impl"
    // InternalMyDsl.g:1782:1: rule__LoadYAML__Group__6__Impl : ( ')' ) ;
    public final void rule__LoadYAML__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1786:1: ( ( ')' ) )
            // InternalMyDsl.g:1787:1: ( ')' )
            {
            // InternalMyDsl.g:1787:1: ( ')' )
            // InternalMyDsl.g:1788:2: ')'
            {
             before(grammarAccess.getLoadYAMLAccess().getRightParenthesisKeyword_6()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getLoadYAMLAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadYAML__Group__6__Impl"


    // $ANTLR start "rule__LoadYAML__Group__7"
    // InternalMyDsl.g:1797:1: rule__LoadYAML__Group__7 : rule__LoadYAML__Group__7__Impl ;
    public final void rule__LoadYAML__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1801:1: ( rule__LoadYAML__Group__7__Impl )
            // InternalMyDsl.g:1802:2: rule__LoadYAML__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LoadYAML__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadYAML__Group__7"


    // $ANTLR start "rule__LoadYAML__Group__7__Impl"
    // InternalMyDsl.g:1808:1: rule__LoadYAML__Group__7__Impl : ( ( rule__LoadYAML__Group_7__0 )? ) ;
    public final void rule__LoadYAML__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1812:1: ( ( ( rule__LoadYAML__Group_7__0 )? ) )
            // InternalMyDsl.g:1813:1: ( ( rule__LoadYAML__Group_7__0 )? )
            {
            // InternalMyDsl.g:1813:1: ( ( rule__LoadYAML__Group_7__0 )? )
            // InternalMyDsl.g:1814:2: ( rule__LoadYAML__Group_7__0 )?
            {
             before(grammarAccess.getLoadYAMLAccess().getGroup_7()); 
            // InternalMyDsl.g:1815:2: ( rule__LoadYAML__Group_7__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==18) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:1815:3: rule__LoadYAML__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LoadYAML__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLoadYAMLAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadYAML__Group__7__Impl"


    // $ANTLR start "rule__LoadYAML__Group_7__0"
    // InternalMyDsl.g:1824:1: rule__LoadYAML__Group_7__0 : rule__LoadYAML__Group_7__0__Impl rule__LoadYAML__Group_7__1 ;
    public final void rule__LoadYAML__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1828:1: ( rule__LoadYAML__Group_7__0__Impl rule__LoadYAML__Group_7__1 )
            // InternalMyDsl.g:1829:2: rule__LoadYAML__Group_7__0__Impl rule__LoadYAML__Group_7__1
            {
            pushFollow(FOLLOW_5);
            rule__LoadYAML__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoadYAML__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadYAML__Group_7__0"


    // $ANTLR start "rule__LoadYAML__Group_7__0__Impl"
    // InternalMyDsl.g:1836:1: rule__LoadYAML__Group_7__0__Impl : ( '.nestedIn(' ) ;
    public final void rule__LoadYAML__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1840:1: ( ( '.nestedIn(' ) )
            // InternalMyDsl.g:1841:1: ( '.nestedIn(' )
            {
            // InternalMyDsl.g:1841:1: ( '.nestedIn(' )
            // InternalMyDsl.g:1842:2: '.nestedIn('
            {
             before(grammarAccess.getLoadYAMLAccess().getNestedInKeyword_7_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getLoadYAMLAccess().getNestedInKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadYAML__Group_7__0__Impl"


    // $ANTLR start "rule__LoadYAML__Group_7__1"
    // InternalMyDsl.g:1851:1: rule__LoadYAML__Group_7__1 : rule__LoadYAML__Group_7__1__Impl rule__LoadYAML__Group_7__2 ;
    public final void rule__LoadYAML__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1855:1: ( rule__LoadYAML__Group_7__1__Impl rule__LoadYAML__Group_7__2 )
            // InternalMyDsl.g:1856:2: rule__LoadYAML__Group_7__1__Impl rule__LoadYAML__Group_7__2
            {
            pushFollow(FOLLOW_9);
            rule__LoadYAML__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoadYAML__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadYAML__Group_7__1"


    // $ANTLR start "rule__LoadYAML__Group_7__1__Impl"
    // InternalMyDsl.g:1863:1: rule__LoadYAML__Group_7__1__Impl : ( ( rule__LoadYAML__NestedAssignment_7_1 ) ) ;
    public final void rule__LoadYAML__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1867:1: ( ( ( rule__LoadYAML__NestedAssignment_7_1 ) ) )
            // InternalMyDsl.g:1868:1: ( ( rule__LoadYAML__NestedAssignment_7_1 ) )
            {
            // InternalMyDsl.g:1868:1: ( ( rule__LoadYAML__NestedAssignment_7_1 ) )
            // InternalMyDsl.g:1869:2: ( rule__LoadYAML__NestedAssignment_7_1 )
            {
             before(grammarAccess.getLoadYAMLAccess().getNestedAssignment_7_1()); 
            // InternalMyDsl.g:1870:2: ( rule__LoadYAML__NestedAssignment_7_1 )
            // InternalMyDsl.g:1870:3: rule__LoadYAML__NestedAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__LoadYAML__NestedAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getLoadYAMLAccess().getNestedAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadYAML__Group_7__1__Impl"


    // $ANTLR start "rule__LoadYAML__Group_7__2"
    // InternalMyDsl.g:1878:1: rule__LoadYAML__Group_7__2 : rule__LoadYAML__Group_7__2__Impl rule__LoadYAML__Group_7__3 ;
    public final void rule__LoadYAML__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1882:1: ( rule__LoadYAML__Group_7__2__Impl rule__LoadYAML__Group_7__3 )
            // InternalMyDsl.g:1883:2: rule__LoadYAML__Group_7__2__Impl rule__LoadYAML__Group_7__3
            {
            pushFollow(FOLLOW_9);
            rule__LoadYAML__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoadYAML__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadYAML__Group_7__2"


    // $ANTLR start "rule__LoadYAML__Group_7__2__Impl"
    // InternalMyDsl.g:1890:1: rule__LoadYAML__Group_7__2__Impl : ( ( rule__LoadYAML__Group_7_2__0 )* ) ;
    public final void rule__LoadYAML__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1894:1: ( ( ( rule__LoadYAML__Group_7_2__0 )* ) )
            // InternalMyDsl.g:1895:1: ( ( rule__LoadYAML__Group_7_2__0 )* )
            {
            // InternalMyDsl.g:1895:1: ( ( rule__LoadYAML__Group_7_2__0 )* )
            // InternalMyDsl.g:1896:2: ( rule__LoadYAML__Group_7_2__0 )*
            {
             before(grammarAccess.getLoadYAMLAccess().getGroup_7_2()); 
            // InternalMyDsl.g:1897:2: ( rule__LoadYAML__Group_7_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==17) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:1897:3: rule__LoadYAML__Group_7_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__LoadYAML__Group_7_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getLoadYAMLAccess().getGroup_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadYAML__Group_7__2__Impl"


    // $ANTLR start "rule__LoadYAML__Group_7__3"
    // InternalMyDsl.g:1905:1: rule__LoadYAML__Group_7__3 : rule__LoadYAML__Group_7__3__Impl ;
    public final void rule__LoadYAML__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1909:1: ( rule__LoadYAML__Group_7__3__Impl )
            // InternalMyDsl.g:1910:2: rule__LoadYAML__Group_7__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LoadYAML__Group_7__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadYAML__Group_7__3"


    // $ANTLR start "rule__LoadYAML__Group_7__3__Impl"
    // InternalMyDsl.g:1916:1: rule__LoadYAML__Group_7__3__Impl : ( ')' ) ;
    public final void rule__LoadYAML__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1920:1: ( ( ')' ) )
            // InternalMyDsl.g:1921:1: ( ')' )
            {
            // InternalMyDsl.g:1921:1: ( ')' )
            // InternalMyDsl.g:1922:2: ')'
            {
             before(grammarAccess.getLoadYAMLAccess().getRightParenthesisKeyword_7_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getLoadYAMLAccess().getRightParenthesisKeyword_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadYAML__Group_7__3__Impl"


    // $ANTLR start "rule__LoadYAML__Group_7_2__0"
    // InternalMyDsl.g:1932:1: rule__LoadYAML__Group_7_2__0 : rule__LoadYAML__Group_7_2__0__Impl rule__LoadYAML__Group_7_2__1 ;
    public final void rule__LoadYAML__Group_7_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1936:1: ( rule__LoadYAML__Group_7_2__0__Impl rule__LoadYAML__Group_7_2__1 )
            // InternalMyDsl.g:1937:2: rule__LoadYAML__Group_7_2__0__Impl rule__LoadYAML__Group_7_2__1
            {
            pushFollow(FOLLOW_5);
            rule__LoadYAML__Group_7_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoadYAML__Group_7_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadYAML__Group_7_2__0"


    // $ANTLR start "rule__LoadYAML__Group_7_2__0__Impl"
    // InternalMyDsl.g:1944:1: rule__LoadYAML__Group_7_2__0__Impl : ( ',' ) ;
    public final void rule__LoadYAML__Group_7_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1948:1: ( ( ',' ) )
            // InternalMyDsl.g:1949:1: ( ',' )
            {
            // InternalMyDsl.g:1949:1: ( ',' )
            // InternalMyDsl.g:1950:2: ','
            {
             before(grammarAccess.getLoadYAMLAccess().getCommaKeyword_7_2_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getLoadYAMLAccess().getCommaKeyword_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadYAML__Group_7_2__0__Impl"


    // $ANTLR start "rule__LoadYAML__Group_7_2__1"
    // InternalMyDsl.g:1959:1: rule__LoadYAML__Group_7_2__1 : rule__LoadYAML__Group_7_2__1__Impl ;
    public final void rule__LoadYAML__Group_7_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1963:1: ( rule__LoadYAML__Group_7_2__1__Impl )
            // InternalMyDsl.g:1964:2: rule__LoadYAML__Group_7_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LoadYAML__Group_7_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadYAML__Group_7_2__1"


    // $ANTLR start "rule__LoadYAML__Group_7_2__1__Impl"
    // InternalMyDsl.g:1970:1: rule__LoadYAML__Group_7_2__1__Impl : ( ( rule__LoadYAML__NestedAssignment_7_2_1 ) ) ;
    public final void rule__LoadYAML__Group_7_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1974:1: ( ( ( rule__LoadYAML__NestedAssignment_7_2_1 ) ) )
            // InternalMyDsl.g:1975:1: ( ( rule__LoadYAML__NestedAssignment_7_2_1 ) )
            {
            // InternalMyDsl.g:1975:1: ( ( rule__LoadYAML__NestedAssignment_7_2_1 ) )
            // InternalMyDsl.g:1976:2: ( rule__LoadYAML__NestedAssignment_7_2_1 )
            {
             before(grammarAccess.getLoadYAMLAccess().getNestedAssignment_7_2_1()); 
            // InternalMyDsl.g:1977:2: ( rule__LoadYAML__NestedAssignment_7_2_1 )
            // InternalMyDsl.g:1977:3: rule__LoadYAML__NestedAssignment_7_2_1
            {
            pushFollow(FOLLOW_2);
            rule__LoadYAML__NestedAssignment_7_2_1();

            state._fsp--;


            }

             after(grammarAccess.getLoadYAMLAccess().getNestedAssignment_7_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadYAML__Group_7_2__1__Impl"


    // $ANTLR start "rule__ConcatOperation__Group__0"
    // InternalMyDsl.g:1986:1: rule__ConcatOperation__Group__0 : rule__ConcatOperation__Group__0__Impl rule__ConcatOperation__Group__1 ;
    public final void rule__ConcatOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1990:1: ( rule__ConcatOperation__Group__0__Impl rule__ConcatOperation__Group__1 )
            // InternalMyDsl.g:1991:2: rule__ConcatOperation__Group__0__Impl rule__ConcatOperation__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__ConcatOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConcatOperation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcatOperation__Group__0"


    // $ANTLR start "rule__ConcatOperation__Group__0__Impl"
    // InternalMyDsl.g:1998:1: rule__ConcatOperation__Group__0__Impl : ( '.concatHorizontal()' ) ;
    public final void rule__ConcatOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2002:1: ( ( '.concatHorizontal()' ) )
            // InternalMyDsl.g:2003:1: ( '.concatHorizontal()' )
            {
            // InternalMyDsl.g:2003:1: ( '.concatHorizontal()' )
            // InternalMyDsl.g:2004:2: '.concatHorizontal()'
            {
             before(grammarAccess.getConcatOperationAccess().getConcatHorizontalKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getConcatOperationAccess().getConcatHorizontalKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcatOperation__Group__0__Impl"


    // $ANTLR start "rule__ConcatOperation__Group__1"
    // InternalMyDsl.g:2013:1: rule__ConcatOperation__Group__1 : rule__ConcatOperation__Group__1__Impl rule__ConcatOperation__Group__2 ;
    public final void rule__ConcatOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2017:1: ( rule__ConcatOperation__Group__1__Impl rule__ConcatOperation__Group__2 )
            // InternalMyDsl.g:2018:2: rule__ConcatOperation__Group__1__Impl rule__ConcatOperation__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ConcatOperation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConcatOperation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcatOperation__Group__1"


    // $ANTLR start "rule__ConcatOperation__Group__1__Impl"
    // InternalMyDsl.g:2025:1: rule__ConcatOperation__Group__1__Impl : ( '.toTable(' ) ;
    public final void rule__ConcatOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2029:1: ( ( '.toTable(' ) )
            // InternalMyDsl.g:2030:1: ( '.toTable(' )
            {
            // InternalMyDsl.g:2030:1: ( '.toTable(' )
            // InternalMyDsl.g:2031:2: '.toTable('
            {
             before(grammarAccess.getConcatOperationAccess().getToTableKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getConcatOperationAccess().getToTableKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcatOperation__Group__1__Impl"


    // $ANTLR start "rule__ConcatOperation__Group__2"
    // InternalMyDsl.g:2040:1: rule__ConcatOperation__Group__2 : rule__ConcatOperation__Group__2__Impl rule__ConcatOperation__Group__3 ;
    public final void rule__ConcatOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2044:1: ( rule__ConcatOperation__Group__2__Impl rule__ConcatOperation__Group__3 )
            // InternalMyDsl.g:2045:2: rule__ConcatOperation__Group__2__Impl rule__ConcatOperation__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__ConcatOperation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConcatOperation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcatOperation__Group__2"


    // $ANTLR start "rule__ConcatOperation__Group__2__Impl"
    // InternalMyDsl.g:2052:1: rule__ConcatOperation__Group__2__Impl : ( ( rule__ConcatOperation__TargetAssignment_2 ) ) ;
    public final void rule__ConcatOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2056:1: ( ( ( rule__ConcatOperation__TargetAssignment_2 ) ) )
            // InternalMyDsl.g:2057:1: ( ( rule__ConcatOperation__TargetAssignment_2 ) )
            {
            // InternalMyDsl.g:2057:1: ( ( rule__ConcatOperation__TargetAssignment_2 ) )
            // InternalMyDsl.g:2058:2: ( rule__ConcatOperation__TargetAssignment_2 )
            {
             before(grammarAccess.getConcatOperationAccess().getTargetAssignment_2()); 
            // InternalMyDsl.g:2059:2: ( rule__ConcatOperation__TargetAssignment_2 )
            // InternalMyDsl.g:2059:3: rule__ConcatOperation__TargetAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ConcatOperation__TargetAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConcatOperationAccess().getTargetAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcatOperation__Group__2__Impl"


    // $ANTLR start "rule__ConcatOperation__Group__3"
    // InternalMyDsl.g:2067:1: rule__ConcatOperation__Group__3 : rule__ConcatOperation__Group__3__Impl rule__ConcatOperation__Group__4 ;
    public final void rule__ConcatOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2071:1: ( rule__ConcatOperation__Group__3__Impl rule__ConcatOperation__Group__4 )
            // InternalMyDsl.g:2072:2: rule__ConcatOperation__Group__3__Impl rule__ConcatOperation__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__ConcatOperation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConcatOperation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcatOperation__Group__3"


    // $ANTLR start "rule__ConcatOperation__Group__3__Impl"
    // InternalMyDsl.g:2079:1: rule__ConcatOperation__Group__3__Impl : ( ')' ) ;
    public final void rule__ConcatOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2083:1: ( ( ')' ) )
            // InternalMyDsl.g:2084:1: ( ')' )
            {
            // InternalMyDsl.g:2084:1: ( ')' )
            // InternalMyDsl.g:2085:2: ')'
            {
             before(grammarAccess.getConcatOperationAccess().getRightParenthesisKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getConcatOperationAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcatOperation__Group__3__Impl"


    // $ANTLR start "rule__ConcatOperation__Group__4"
    // InternalMyDsl.g:2094:1: rule__ConcatOperation__Group__4 : rule__ConcatOperation__Group__4__Impl rule__ConcatOperation__Group__5 ;
    public final void rule__ConcatOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2098:1: ( rule__ConcatOperation__Group__4__Impl rule__ConcatOperation__Group__5 )
            // InternalMyDsl.g:2099:2: rule__ConcatOperation__Group__4__Impl rule__ConcatOperation__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__ConcatOperation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConcatOperation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcatOperation__Group__4"


    // $ANTLR start "rule__ConcatOperation__Group__4__Impl"
    // InternalMyDsl.g:2106:1: rule__ConcatOperation__Group__4__Impl : ( '.onTables(' ) ;
    public final void rule__ConcatOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2110:1: ( ( '.onTables(' ) )
            // InternalMyDsl.g:2111:1: ( '.onTables(' )
            {
            // InternalMyDsl.g:2111:1: ( '.onTables(' )
            // InternalMyDsl.g:2112:2: '.onTables('
            {
             before(grammarAccess.getConcatOperationAccess().getOnTablesKeyword_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getConcatOperationAccess().getOnTablesKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcatOperation__Group__4__Impl"


    // $ANTLR start "rule__ConcatOperation__Group__5"
    // InternalMyDsl.g:2121:1: rule__ConcatOperation__Group__5 : rule__ConcatOperation__Group__5__Impl rule__ConcatOperation__Group__6 ;
    public final void rule__ConcatOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2125:1: ( rule__ConcatOperation__Group__5__Impl rule__ConcatOperation__Group__6 )
            // InternalMyDsl.g:2126:2: rule__ConcatOperation__Group__5__Impl rule__ConcatOperation__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__ConcatOperation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConcatOperation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcatOperation__Group__5"


    // $ANTLR start "rule__ConcatOperation__Group__5__Impl"
    // InternalMyDsl.g:2133:1: rule__ConcatOperation__Group__5__Impl : ( ( rule__ConcatOperation__TablesAssignment_5 ) ) ;
    public final void rule__ConcatOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2137:1: ( ( ( rule__ConcatOperation__TablesAssignment_5 ) ) )
            // InternalMyDsl.g:2138:1: ( ( rule__ConcatOperation__TablesAssignment_5 ) )
            {
            // InternalMyDsl.g:2138:1: ( ( rule__ConcatOperation__TablesAssignment_5 ) )
            // InternalMyDsl.g:2139:2: ( rule__ConcatOperation__TablesAssignment_5 )
            {
             before(grammarAccess.getConcatOperationAccess().getTablesAssignment_5()); 
            // InternalMyDsl.g:2140:2: ( rule__ConcatOperation__TablesAssignment_5 )
            // InternalMyDsl.g:2140:3: rule__ConcatOperation__TablesAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ConcatOperation__TablesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getConcatOperationAccess().getTablesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcatOperation__Group__5__Impl"


    // $ANTLR start "rule__ConcatOperation__Group__6"
    // InternalMyDsl.g:2148:1: rule__ConcatOperation__Group__6 : rule__ConcatOperation__Group__6__Impl rule__ConcatOperation__Group__7 ;
    public final void rule__ConcatOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2152:1: ( rule__ConcatOperation__Group__6__Impl rule__ConcatOperation__Group__7 )
            // InternalMyDsl.g:2153:2: rule__ConcatOperation__Group__6__Impl rule__ConcatOperation__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__ConcatOperation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConcatOperation__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcatOperation__Group__6"


    // $ANTLR start "rule__ConcatOperation__Group__6__Impl"
    // InternalMyDsl.g:2160:1: rule__ConcatOperation__Group__6__Impl : ( ( rule__ConcatOperation__Group_6__0 )* ) ;
    public final void rule__ConcatOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2164:1: ( ( ( rule__ConcatOperation__Group_6__0 )* ) )
            // InternalMyDsl.g:2165:1: ( ( rule__ConcatOperation__Group_6__0 )* )
            {
            // InternalMyDsl.g:2165:1: ( ( rule__ConcatOperation__Group_6__0 )* )
            // InternalMyDsl.g:2166:2: ( rule__ConcatOperation__Group_6__0 )*
            {
             before(grammarAccess.getConcatOperationAccess().getGroup_6()); 
            // InternalMyDsl.g:2167:2: ( rule__ConcatOperation__Group_6__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==17) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:2167:3: rule__ConcatOperation__Group_6__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ConcatOperation__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getConcatOperationAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcatOperation__Group__6__Impl"


    // $ANTLR start "rule__ConcatOperation__Group__7"
    // InternalMyDsl.g:2175:1: rule__ConcatOperation__Group__7 : rule__ConcatOperation__Group__7__Impl ;
    public final void rule__ConcatOperation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2179:1: ( rule__ConcatOperation__Group__7__Impl )
            // InternalMyDsl.g:2180:2: rule__ConcatOperation__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConcatOperation__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcatOperation__Group__7"


    // $ANTLR start "rule__ConcatOperation__Group__7__Impl"
    // InternalMyDsl.g:2186:1: rule__ConcatOperation__Group__7__Impl : ( ')' ) ;
    public final void rule__ConcatOperation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2190:1: ( ( ')' ) )
            // InternalMyDsl.g:2191:1: ( ')' )
            {
            // InternalMyDsl.g:2191:1: ( ')' )
            // InternalMyDsl.g:2192:2: ')'
            {
             before(grammarAccess.getConcatOperationAccess().getRightParenthesisKeyword_7()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getConcatOperationAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcatOperation__Group__7__Impl"


    // $ANTLR start "rule__ConcatOperation__Group_6__0"
    // InternalMyDsl.g:2202:1: rule__ConcatOperation__Group_6__0 : rule__ConcatOperation__Group_6__0__Impl rule__ConcatOperation__Group_6__1 ;
    public final void rule__ConcatOperation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2206:1: ( rule__ConcatOperation__Group_6__0__Impl rule__ConcatOperation__Group_6__1 )
            // InternalMyDsl.g:2207:2: rule__ConcatOperation__Group_6__0__Impl rule__ConcatOperation__Group_6__1
            {
            pushFollow(FOLLOW_5);
            rule__ConcatOperation__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConcatOperation__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcatOperation__Group_6__0"


    // $ANTLR start "rule__ConcatOperation__Group_6__0__Impl"
    // InternalMyDsl.g:2214:1: rule__ConcatOperation__Group_6__0__Impl : ( ',' ) ;
    public final void rule__ConcatOperation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2218:1: ( ( ',' ) )
            // InternalMyDsl.g:2219:1: ( ',' )
            {
            // InternalMyDsl.g:2219:1: ( ',' )
            // InternalMyDsl.g:2220:2: ','
            {
             before(grammarAccess.getConcatOperationAccess().getCommaKeyword_6_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getConcatOperationAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcatOperation__Group_6__0__Impl"


    // $ANTLR start "rule__ConcatOperation__Group_6__1"
    // InternalMyDsl.g:2229:1: rule__ConcatOperation__Group_6__1 : rule__ConcatOperation__Group_6__1__Impl ;
    public final void rule__ConcatOperation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2233:1: ( rule__ConcatOperation__Group_6__1__Impl )
            // InternalMyDsl.g:2234:2: rule__ConcatOperation__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConcatOperation__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcatOperation__Group_6__1"


    // $ANTLR start "rule__ConcatOperation__Group_6__1__Impl"
    // InternalMyDsl.g:2240:1: rule__ConcatOperation__Group_6__1__Impl : ( ( rule__ConcatOperation__TablesAssignment_6_1 ) ) ;
    public final void rule__ConcatOperation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2244:1: ( ( ( rule__ConcatOperation__TablesAssignment_6_1 ) ) )
            // InternalMyDsl.g:2245:1: ( ( rule__ConcatOperation__TablesAssignment_6_1 ) )
            {
            // InternalMyDsl.g:2245:1: ( ( rule__ConcatOperation__TablesAssignment_6_1 ) )
            // InternalMyDsl.g:2246:2: ( rule__ConcatOperation__TablesAssignment_6_1 )
            {
             before(grammarAccess.getConcatOperationAccess().getTablesAssignment_6_1()); 
            // InternalMyDsl.g:2247:2: ( rule__ConcatOperation__TablesAssignment_6_1 )
            // InternalMyDsl.g:2247:3: rule__ConcatOperation__TablesAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__ConcatOperation__TablesAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getConcatOperationAccess().getTablesAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcatOperation__Group_6__1__Impl"


    // $ANTLR start "rule__FilterOperation__Group__0"
    // InternalMyDsl.g:2256:1: rule__FilterOperation__Group__0 : rule__FilterOperation__Group__0__Impl rule__FilterOperation__Group__1 ;
    public final void rule__FilterOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2260:1: ( rule__FilterOperation__Group__0__Impl rule__FilterOperation__Group__1 )
            // InternalMyDsl.g:2261:2: rule__FilterOperation__Group__0__Impl rule__FilterOperation__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__FilterOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterOperation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterOperation__Group__0"


    // $ANTLR start "rule__FilterOperation__Group__0__Impl"
    // InternalMyDsl.g:2268:1: rule__FilterOperation__Group__0__Impl : ( '.filter()' ) ;
    public final void rule__FilterOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2272:1: ( ( '.filter()' ) )
            // InternalMyDsl.g:2273:1: ( '.filter()' )
            {
            // InternalMyDsl.g:2273:1: ( '.filter()' )
            // InternalMyDsl.g:2274:2: '.filter()'
            {
             before(grammarAccess.getFilterOperationAccess().getFilterKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getFilterOperationAccess().getFilterKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterOperation__Group__0__Impl"


    // $ANTLR start "rule__FilterOperation__Group__1"
    // InternalMyDsl.g:2283:1: rule__FilterOperation__Group__1 : rule__FilterOperation__Group__1__Impl rule__FilterOperation__Group__2 ;
    public final void rule__FilterOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2287:1: ( rule__FilterOperation__Group__1__Impl rule__FilterOperation__Group__2 )
            // InternalMyDsl.g:2288:2: rule__FilterOperation__Group__1__Impl rule__FilterOperation__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__FilterOperation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterOperation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterOperation__Group__1"


    // $ANTLR start "rule__FilterOperation__Group__1__Impl"
    // InternalMyDsl.g:2295:1: rule__FilterOperation__Group__1__Impl : ( '.onColumn(' ) ;
    public final void rule__FilterOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2299:1: ( ( '.onColumn(' ) )
            // InternalMyDsl.g:2300:1: ( '.onColumn(' )
            {
            // InternalMyDsl.g:2300:1: ( '.onColumn(' )
            // InternalMyDsl.g:2301:2: '.onColumn('
            {
             before(grammarAccess.getFilterOperationAccess().getOnColumnKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getFilterOperationAccess().getOnColumnKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterOperation__Group__1__Impl"


    // $ANTLR start "rule__FilterOperation__Group__2"
    // InternalMyDsl.g:2310:1: rule__FilterOperation__Group__2 : rule__FilterOperation__Group__2__Impl rule__FilterOperation__Group__3 ;
    public final void rule__FilterOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2314:1: ( rule__FilterOperation__Group__2__Impl rule__FilterOperation__Group__3 )
            // InternalMyDsl.g:2315:2: rule__FilterOperation__Group__2__Impl rule__FilterOperation__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__FilterOperation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterOperation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterOperation__Group__2"


    // $ANTLR start "rule__FilterOperation__Group__2__Impl"
    // InternalMyDsl.g:2322:1: rule__FilterOperation__Group__2__Impl : ( ( rule__FilterOperation__ColumnAssignment_2 ) ) ;
    public final void rule__FilterOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2326:1: ( ( ( rule__FilterOperation__ColumnAssignment_2 ) ) )
            // InternalMyDsl.g:2327:1: ( ( rule__FilterOperation__ColumnAssignment_2 ) )
            {
            // InternalMyDsl.g:2327:1: ( ( rule__FilterOperation__ColumnAssignment_2 ) )
            // InternalMyDsl.g:2328:2: ( rule__FilterOperation__ColumnAssignment_2 )
            {
             before(grammarAccess.getFilterOperationAccess().getColumnAssignment_2()); 
            // InternalMyDsl.g:2329:2: ( rule__FilterOperation__ColumnAssignment_2 )
            // InternalMyDsl.g:2329:3: rule__FilterOperation__ColumnAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FilterOperation__ColumnAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFilterOperationAccess().getColumnAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterOperation__Group__2__Impl"


    // $ANTLR start "rule__FilterOperation__Group__3"
    // InternalMyDsl.g:2337:1: rule__FilterOperation__Group__3 : rule__FilterOperation__Group__3__Impl rule__FilterOperation__Group__4 ;
    public final void rule__FilterOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2341:1: ( rule__FilterOperation__Group__3__Impl rule__FilterOperation__Group__4 )
            // InternalMyDsl.g:2342:2: rule__FilterOperation__Group__3__Impl rule__FilterOperation__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__FilterOperation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterOperation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterOperation__Group__3"


    // $ANTLR start "rule__FilterOperation__Group__3__Impl"
    // InternalMyDsl.g:2349:1: rule__FilterOperation__Group__3__Impl : ( ')' ) ;
    public final void rule__FilterOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2353:1: ( ( ')' ) )
            // InternalMyDsl.g:2354:1: ( ')' )
            {
            // InternalMyDsl.g:2354:1: ( ')' )
            // InternalMyDsl.g:2355:2: ')'
            {
             before(grammarAccess.getFilterOperationAccess().getRightParenthesisKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getFilterOperationAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterOperation__Group__3__Impl"


    // $ANTLR start "rule__FilterOperation__Group__4"
    // InternalMyDsl.g:2364:1: rule__FilterOperation__Group__4 : rule__FilterOperation__Group__4__Impl rule__FilterOperation__Group__5 ;
    public final void rule__FilterOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2368:1: ( rule__FilterOperation__Group__4__Impl rule__FilterOperation__Group__5 )
            // InternalMyDsl.g:2369:2: rule__FilterOperation__Group__4__Impl rule__FilterOperation__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__FilterOperation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterOperation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterOperation__Group__4"


    // $ANTLR start "rule__FilterOperation__Group__4__Impl"
    // InternalMyDsl.g:2376:1: rule__FilterOperation__Group__4__Impl : ( '.onTable(' ) ;
    public final void rule__FilterOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2380:1: ( ( '.onTable(' ) )
            // InternalMyDsl.g:2381:1: ( '.onTable(' )
            {
            // InternalMyDsl.g:2381:1: ( '.onTable(' )
            // InternalMyDsl.g:2382:2: '.onTable('
            {
             before(grammarAccess.getFilterOperationAccess().getOnTableKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getFilterOperationAccess().getOnTableKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterOperation__Group__4__Impl"


    // $ANTLR start "rule__FilterOperation__Group__5"
    // InternalMyDsl.g:2391:1: rule__FilterOperation__Group__5 : rule__FilterOperation__Group__5__Impl rule__FilterOperation__Group__6 ;
    public final void rule__FilterOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2395:1: ( rule__FilterOperation__Group__5__Impl rule__FilterOperation__Group__6 )
            // InternalMyDsl.g:2396:2: rule__FilterOperation__Group__5__Impl rule__FilterOperation__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__FilterOperation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterOperation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterOperation__Group__5"


    // $ANTLR start "rule__FilterOperation__Group__5__Impl"
    // InternalMyDsl.g:2403:1: rule__FilterOperation__Group__5__Impl : ( ( rule__FilterOperation__TableAssignment_5 ) ) ;
    public final void rule__FilterOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2407:1: ( ( ( rule__FilterOperation__TableAssignment_5 ) ) )
            // InternalMyDsl.g:2408:1: ( ( rule__FilterOperation__TableAssignment_5 ) )
            {
            // InternalMyDsl.g:2408:1: ( ( rule__FilterOperation__TableAssignment_5 ) )
            // InternalMyDsl.g:2409:2: ( rule__FilterOperation__TableAssignment_5 )
            {
             before(grammarAccess.getFilterOperationAccess().getTableAssignment_5()); 
            // InternalMyDsl.g:2410:2: ( rule__FilterOperation__TableAssignment_5 )
            // InternalMyDsl.g:2410:3: rule__FilterOperation__TableAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__FilterOperation__TableAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getFilterOperationAccess().getTableAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterOperation__Group__5__Impl"


    // $ANTLR start "rule__FilterOperation__Group__6"
    // InternalMyDsl.g:2418:1: rule__FilterOperation__Group__6 : rule__FilterOperation__Group__6__Impl rule__FilterOperation__Group__7 ;
    public final void rule__FilterOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2422:1: ( rule__FilterOperation__Group__6__Impl rule__FilterOperation__Group__7 )
            // InternalMyDsl.g:2423:2: rule__FilterOperation__Group__6__Impl rule__FilterOperation__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__FilterOperation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterOperation__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterOperation__Group__6"


    // $ANTLR start "rule__FilterOperation__Group__6__Impl"
    // InternalMyDsl.g:2430:1: rule__FilterOperation__Group__6__Impl : ( ')' ) ;
    public final void rule__FilterOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2434:1: ( ( ')' ) )
            // InternalMyDsl.g:2435:1: ( ')' )
            {
            // InternalMyDsl.g:2435:1: ( ')' )
            // InternalMyDsl.g:2436:2: ')'
            {
             before(grammarAccess.getFilterOperationAccess().getRightParenthesisKeyword_6()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getFilterOperationAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterOperation__Group__6__Impl"


    // $ANTLR start "rule__FilterOperation__Group__7"
    // InternalMyDsl.g:2445:1: rule__FilterOperation__Group__7 : rule__FilterOperation__Group__7__Impl rule__FilterOperation__Group__8 ;
    public final void rule__FilterOperation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2449:1: ( rule__FilterOperation__Group__7__Impl rule__FilterOperation__Group__8 )
            // InternalMyDsl.g:2450:2: rule__FilterOperation__Group__7__Impl rule__FilterOperation__Group__8
            {
            pushFollow(FOLLOW_5);
            rule__FilterOperation__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterOperation__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterOperation__Group__7"


    // $ANTLR start "rule__FilterOperation__Group__7__Impl"
    // InternalMyDsl.g:2457:1: rule__FilterOperation__Group__7__Impl : ( '.where(' ) ;
    public final void rule__FilterOperation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2461:1: ( ( '.where(' ) )
            // InternalMyDsl.g:2462:1: ( '.where(' )
            {
            // InternalMyDsl.g:2462:1: ( '.where(' )
            // InternalMyDsl.g:2463:2: '.where('
            {
             before(grammarAccess.getFilterOperationAccess().getWhereKeyword_7()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getFilterOperationAccess().getWhereKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterOperation__Group__7__Impl"


    // $ANTLR start "rule__FilterOperation__Group__8"
    // InternalMyDsl.g:2472:1: rule__FilterOperation__Group__8 : rule__FilterOperation__Group__8__Impl rule__FilterOperation__Group__9 ;
    public final void rule__FilterOperation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2476:1: ( rule__FilterOperation__Group__8__Impl rule__FilterOperation__Group__9 )
            // InternalMyDsl.g:2477:2: rule__FilterOperation__Group__8__Impl rule__FilterOperation__Group__9
            {
            pushFollow(FOLLOW_17);
            rule__FilterOperation__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterOperation__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterOperation__Group__8"


    // $ANTLR start "rule__FilterOperation__Group__8__Impl"
    // InternalMyDsl.g:2484:1: rule__FilterOperation__Group__8__Impl : ( ( rule__FilterOperation__ConditionAssignment_8 ) ) ;
    public final void rule__FilterOperation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2488:1: ( ( ( rule__FilterOperation__ConditionAssignment_8 ) ) )
            // InternalMyDsl.g:2489:1: ( ( rule__FilterOperation__ConditionAssignment_8 ) )
            {
            // InternalMyDsl.g:2489:1: ( ( rule__FilterOperation__ConditionAssignment_8 ) )
            // InternalMyDsl.g:2490:2: ( rule__FilterOperation__ConditionAssignment_8 )
            {
             before(grammarAccess.getFilterOperationAccess().getConditionAssignment_8()); 
            // InternalMyDsl.g:2491:2: ( rule__FilterOperation__ConditionAssignment_8 )
            // InternalMyDsl.g:2491:3: rule__FilterOperation__ConditionAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__FilterOperation__ConditionAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getFilterOperationAccess().getConditionAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterOperation__Group__8__Impl"


    // $ANTLR start "rule__FilterOperation__Group__9"
    // InternalMyDsl.g:2499:1: rule__FilterOperation__Group__9 : rule__FilterOperation__Group__9__Impl rule__FilterOperation__Group__10 ;
    public final void rule__FilterOperation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2503:1: ( rule__FilterOperation__Group__9__Impl rule__FilterOperation__Group__10 )
            // InternalMyDsl.g:2504:2: rule__FilterOperation__Group__9__Impl rule__FilterOperation__Group__10
            {
            pushFollow(FOLLOW_5);
            rule__FilterOperation__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterOperation__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterOperation__Group__9"


    // $ANTLR start "rule__FilterOperation__Group__9__Impl"
    // InternalMyDsl.g:2511:1: rule__FilterOperation__Group__9__Impl : ( 'value' ) ;
    public final void rule__FilterOperation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2515:1: ( ( 'value' ) )
            // InternalMyDsl.g:2516:1: ( 'value' )
            {
            // InternalMyDsl.g:2516:1: ( 'value' )
            // InternalMyDsl.g:2517:2: 'value'
            {
             before(grammarAccess.getFilterOperationAccess().getValueKeyword_9()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getFilterOperationAccess().getValueKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterOperation__Group__9__Impl"


    // $ANTLR start "rule__FilterOperation__Group__10"
    // InternalMyDsl.g:2526:1: rule__FilterOperation__Group__10 : rule__FilterOperation__Group__10__Impl rule__FilterOperation__Group__11 ;
    public final void rule__FilterOperation__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2530:1: ( rule__FilterOperation__Group__10__Impl rule__FilterOperation__Group__11 )
            // InternalMyDsl.g:2531:2: rule__FilterOperation__Group__10__Impl rule__FilterOperation__Group__11
            {
            pushFollow(FOLLOW_18);
            rule__FilterOperation__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterOperation__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterOperation__Group__10"


    // $ANTLR start "rule__FilterOperation__Group__10__Impl"
    // InternalMyDsl.g:2538:1: rule__FilterOperation__Group__10__Impl : ( ( rule__FilterOperation__ValueAssignment_10 ) ) ;
    public final void rule__FilterOperation__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2542:1: ( ( ( rule__FilterOperation__ValueAssignment_10 ) ) )
            // InternalMyDsl.g:2543:1: ( ( rule__FilterOperation__ValueAssignment_10 ) )
            {
            // InternalMyDsl.g:2543:1: ( ( rule__FilterOperation__ValueAssignment_10 ) )
            // InternalMyDsl.g:2544:2: ( rule__FilterOperation__ValueAssignment_10 )
            {
             before(grammarAccess.getFilterOperationAccess().getValueAssignment_10()); 
            // InternalMyDsl.g:2545:2: ( rule__FilterOperation__ValueAssignment_10 )
            // InternalMyDsl.g:2545:3: rule__FilterOperation__ValueAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__FilterOperation__ValueAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getFilterOperationAccess().getValueAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterOperation__Group__10__Impl"


    // $ANTLR start "rule__FilterOperation__Group__11"
    // InternalMyDsl.g:2553:1: rule__FilterOperation__Group__11 : rule__FilterOperation__Group__11__Impl rule__FilterOperation__Group__12 ;
    public final void rule__FilterOperation__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2557:1: ( rule__FilterOperation__Group__11__Impl rule__FilterOperation__Group__12 )
            // InternalMyDsl.g:2558:2: rule__FilterOperation__Group__11__Impl rule__FilterOperation__Group__12
            {
            pushFollow(FOLLOW_18);
            rule__FilterOperation__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterOperation__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterOperation__Group__11"


    // $ANTLR start "rule__FilterOperation__Group__11__Impl"
    // InternalMyDsl.g:2565:1: rule__FilterOperation__Group__11__Impl : ( ( rule__FilterOperation__Group_11__0 )? ) ;
    public final void rule__FilterOperation__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2569:1: ( ( ( rule__FilterOperation__Group_11__0 )? ) )
            // InternalMyDsl.g:2570:1: ( ( rule__FilterOperation__Group_11__0 )? )
            {
            // InternalMyDsl.g:2570:1: ( ( rule__FilterOperation__Group_11__0 )? )
            // InternalMyDsl.g:2571:2: ( rule__FilterOperation__Group_11__0 )?
            {
             before(grammarAccess.getFilterOperationAccess().getGroup_11()); 
            // InternalMyDsl.g:2572:2: ( rule__FilterOperation__Group_11__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:2572:3: rule__FilterOperation__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FilterOperation__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFilterOperationAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterOperation__Group__11__Impl"


    // $ANTLR start "rule__FilterOperation__Group__12"
    // InternalMyDsl.g:2580:1: rule__FilterOperation__Group__12 : rule__FilterOperation__Group__12__Impl ;
    public final void rule__FilterOperation__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2584:1: ( rule__FilterOperation__Group__12__Impl )
            // InternalMyDsl.g:2585:2: rule__FilterOperation__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FilterOperation__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterOperation__Group__12"


    // $ANTLR start "rule__FilterOperation__Group__12__Impl"
    // InternalMyDsl.g:2591:1: rule__FilterOperation__Group__12__Impl : ( ')' ) ;
    public final void rule__FilterOperation__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2595:1: ( ( ')' ) )
            // InternalMyDsl.g:2596:1: ( ')' )
            {
            // InternalMyDsl.g:2596:1: ( ')' )
            // InternalMyDsl.g:2597:2: ')'
            {
             before(grammarAccess.getFilterOperationAccess().getRightParenthesisKeyword_12()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getFilterOperationAccess().getRightParenthesisKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterOperation__Group__12__Impl"


    // $ANTLR start "rule__FilterOperation__Group_11__0"
    // InternalMyDsl.g:2607:1: rule__FilterOperation__Group_11__0 : rule__FilterOperation__Group_11__0__Impl rule__FilterOperation__Group_11__1 ;
    public final void rule__FilterOperation__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2611:1: ( rule__FilterOperation__Group_11__0__Impl rule__FilterOperation__Group_11__1 )
            // InternalMyDsl.g:2612:2: rule__FilterOperation__Group_11__0__Impl rule__FilterOperation__Group_11__1
            {
            pushFollow(FOLLOW_5);
            rule__FilterOperation__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterOperation__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterOperation__Group_11__0"


    // $ANTLR start "rule__FilterOperation__Group_11__0__Impl"
    // InternalMyDsl.g:2619:1: rule__FilterOperation__Group_11__0__Impl : ( 'toTable' ) ;
    public final void rule__FilterOperation__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2623:1: ( ( 'toTable' ) )
            // InternalMyDsl.g:2624:1: ( 'toTable' )
            {
            // InternalMyDsl.g:2624:1: ( 'toTable' )
            // InternalMyDsl.g:2625:2: 'toTable'
            {
             before(grammarAccess.getFilterOperationAccess().getToTableKeyword_11_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getFilterOperationAccess().getToTableKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterOperation__Group_11__0__Impl"


    // $ANTLR start "rule__FilterOperation__Group_11__1"
    // InternalMyDsl.g:2634:1: rule__FilterOperation__Group_11__1 : rule__FilterOperation__Group_11__1__Impl ;
    public final void rule__FilterOperation__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2638:1: ( rule__FilterOperation__Group_11__1__Impl )
            // InternalMyDsl.g:2639:2: rule__FilterOperation__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FilterOperation__Group_11__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterOperation__Group_11__1"


    // $ANTLR start "rule__FilterOperation__Group_11__1__Impl"
    // InternalMyDsl.g:2645:1: rule__FilterOperation__Group_11__1__Impl : ( ( rule__FilterOperation__TargetAssignment_11_1 ) ) ;
    public final void rule__FilterOperation__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2649:1: ( ( ( rule__FilterOperation__TargetAssignment_11_1 ) ) )
            // InternalMyDsl.g:2650:1: ( ( rule__FilterOperation__TargetAssignment_11_1 ) )
            {
            // InternalMyDsl.g:2650:1: ( ( rule__FilterOperation__TargetAssignment_11_1 ) )
            // InternalMyDsl.g:2651:2: ( rule__FilterOperation__TargetAssignment_11_1 )
            {
             before(grammarAccess.getFilterOperationAccess().getTargetAssignment_11_1()); 
            // InternalMyDsl.g:2652:2: ( rule__FilterOperation__TargetAssignment_11_1 )
            // InternalMyDsl.g:2652:3: rule__FilterOperation__TargetAssignment_11_1
            {
            pushFollow(FOLLOW_2);
            rule__FilterOperation__TargetAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getFilterOperationAccess().getTargetAssignment_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterOperation__Group_11__1__Impl"


    // $ANTLR start "rule__SaveOperation__Group__0"
    // InternalMyDsl.g:2661:1: rule__SaveOperation__Group__0 : rule__SaveOperation__Group__0__Impl rule__SaveOperation__Group__1 ;
    public final void rule__SaveOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2665:1: ( rule__SaveOperation__Group__0__Impl rule__SaveOperation__Group__1 )
            // InternalMyDsl.g:2666:2: rule__SaveOperation__Group__0__Impl rule__SaveOperation__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__SaveOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SaveOperation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SaveOperation__Group__0"


    // $ANTLR start "rule__SaveOperation__Group__0__Impl"
    // InternalMyDsl.g:2673:1: rule__SaveOperation__Group__0__Impl : ( '.save()' ) ;
    public final void rule__SaveOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2677:1: ( ( '.save()' ) )
            // InternalMyDsl.g:2678:1: ( '.save()' )
            {
            // InternalMyDsl.g:2678:1: ( '.save()' )
            // InternalMyDsl.g:2679:2: '.save()'
            {
             before(grammarAccess.getSaveOperationAccess().getSaveKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getSaveOperationAccess().getSaveKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SaveOperation__Group__0__Impl"


    // $ANTLR start "rule__SaveOperation__Group__1"
    // InternalMyDsl.g:2688:1: rule__SaveOperation__Group__1 : rule__SaveOperation__Group__1__Impl rule__SaveOperation__Group__2 ;
    public final void rule__SaveOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2692:1: ( rule__SaveOperation__Group__1__Impl rule__SaveOperation__Group__2 )
            // InternalMyDsl.g:2693:2: rule__SaveOperation__Group__1__Impl rule__SaveOperation__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__SaveOperation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SaveOperation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SaveOperation__Group__1"


    // $ANTLR start "rule__SaveOperation__Group__1__Impl"
    // InternalMyDsl.g:2700:1: rule__SaveOperation__Group__1__Impl : ( '.tables(' ) ;
    public final void rule__SaveOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2704:1: ( ( '.tables(' ) )
            // InternalMyDsl.g:2705:1: ( '.tables(' )
            {
            // InternalMyDsl.g:2705:1: ( '.tables(' )
            // InternalMyDsl.g:2706:2: '.tables('
            {
             before(grammarAccess.getSaveOperationAccess().getTablesKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getSaveOperationAccess().getTablesKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SaveOperation__Group__1__Impl"


    // $ANTLR start "rule__SaveOperation__Group__2"
    // InternalMyDsl.g:2715:1: rule__SaveOperation__Group__2 : rule__SaveOperation__Group__2__Impl rule__SaveOperation__Group__3 ;
    public final void rule__SaveOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2719:1: ( rule__SaveOperation__Group__2__Impl rule__SaveOperation__Group__3 )
            // InternalMyDsl.g:2720:2: rule__SaveOperation__Group__2__Impl rule__SaveOperation__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__SaveOperation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SaveOperation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SaveOperation__Group__2"


    // $ANTLR start "rule__SaveOperation__Group__2__Impl"
    // InternalMyDsl.g:2727:1: rule__SaveOperation__Group__2__Impl : ( ( rule__SaveOperation__TablesAssignment_2 ) ) ;
    public final void rule__SaveOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2731:1: ( ( ( rule__SaveOperation__TablesAssignment_2 ) ) )
            // InternalMyDsl.g:2732:1: ( ( rule__SaveOperation__TablesAssignment_2 ) )
            {
            // InternalMyDsl.g:2732:1: ( ( rule__SaveOperation__TablesAssignment_2 ) )
            // InternalMyDsl.g:2733:2: ( rule__SaveOperation__TablesAssignment_2 )
            {
             before(grammarAccess.getSaveOperationAccess().getTablesAssignment_2()); 
            // InternalMyDsl.g:2734:2: ( rule__SaveOperation__TablesAssignment_2 )
            // InternalMyDsl.g:2734:3: rule__SaveOperation__TablesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SaveOperation__TablesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSaveOperationAccess().getTablesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SaveOperation__Group__2__Impl"


    // $ANTLR start "rule__SaveOperation__Group__3"
    // InternalMyDsl.g:2742:1: rule__SaveOperation__Group__3 : rule__SaveOperation__Group__3__Impl rule__SaveOperation__Group__4 ;
    public final void rule__SaveOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2746:1: ( rule__SaveOperation__Group__3__Impl rule__SaveOperation__Group__4 )
            // InternalMyDsl.g:2747:2: rule__SaveOperation__Group__3__Impl rule__SaveOperation__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__SaveOperation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SaveOperation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SaveOperation__Group__3"


    // $ANTLR start "rule__SaveOperation__Group__3__Impl"
    // InternalMyDsl.g:2754:1: rule__SaveOperation__Group__3__Impl : ( ( rule__SaveOperation__Group_3__0 )* ) ;
    public final void rule__SaveOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2758:1: ( ( ( rule__SaveOperation__Group_3__0 )* ) )
            // InternalMyDsl.g:2759:1: ( ( rule__SaveOperation__Group_3__0 )* )
            {
            // InternalMyDsl.g:2759:1: ( ( rule__SaveOperation__Group_3__0 )* )
            // InternalMyDsl.g:2760:2: ( rule__SaveOperation__Group_3__0 )*
            {
             before(grammarAccess.getSaveOperationAccess().getGroup_3()); 
            // InternalMyDsl.g:2761:2: ( rule__SaveOperation__Group_3__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==17) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyDsl.g:2761:3: rule__SaveOperation__Group_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__SaveOperation__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getSaveOperationAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SaveOperation__Group__3__Impl"


    // $ANTLR start "rule__SaveOperation__Group__4"
    // InternalMyDsl.g:2769:1: rule__SaveOperation__Group__4 : rule__SaveOperation__Group__4__Impl rule__SaveOperation__Group__5 ;
    public final void rule__SaveOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2773:1: ( rule__SaveOperation__Group__4__Impl rule__SaveOperation__Group__5 )
            // InternalMyDsl.g:2774:2: rule__SaveOperation__Group__4__Impl rule__SaveOperation__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__SaveOperation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SaveOperation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SaveOperation__Group__4"


    // $ANTLR start "rule__SaveOperation__Group__4__Impl"
    // InternalMyDsl.g:2781:1: rule__SaveOperation__Group__4__Impl : ( ')' ) ;
    public final void rule__SaveOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2785:1: ( ( ')' ) )
            // InternalMyDsl.g:2786:1: ( ')' )
            {
            // InternalMyDsl.g:2786:1: ( ')' )
            // InternalMyDsl.g:2787:2: ')'
            {
             before(grammarAccess.getSaveOperationAccess().getRightParenthesisKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSaveOperationAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SaveOperation__Group__4__Impl"


    // $ANTLR start "rule__SaveOperation__Group__5"
    // InternalMyDsl.g:2796:1: rule__SaveOperation__Group__5 : rule__SaveOperation__Group__5__Impl rule__SaveOperation__Group__6 ;
    public final void rule__SaveOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2800:1: ( rule__SaveOperation__Group__5__Impl rule__SaveOperation__Group__6 )
            // InternalMyDsl.g:2801:2: rule__SaveOperation__Group__5__Impl rule__SaveOperation__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__SaveOperation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SaveOperation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SaveOperation__Group__5"


    // $ANTLR start "rule__SaveOperation__Group__5__Impl"
    // InternalMyDsl.g:2808:1: rule__SaveOperation__Group__5__Impl : ( '.to(' ) ;
    public final void rule__SaveOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2812:1: ( ( '.to(' ) )
            // InternalMyDsl.g:2813:1: ( '.to(' )
            {
            // InternalMyDsl.g:2813:1: ( '.to(' )
            // InternalMyDsl.g:2814:2: '.to('
            {
             before(grammarAccess.getSaveOperationAccess().getToKeyword_5()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getSaveOperationAccess().getToKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SaveOperation__Group__5__Impl"


    // $ANTLR start "rule__SaveOperation__Group__6"
    // InternalMyDsl.g:2823:1: rule__SaveOperation__Group__6 : rule__SaveOperation__Group__6__Impl rule__SaveOperation__Group__7 ;
    public final void rule__SaveOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2827:1: ( rule__SaveOperation__Group__6__Impl rule__SaveOperation__Group__7 )
            // InternalMyDsl.g:2828:2: rule__SaveOperation__Group__6__Impl rule__SaveOperation__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__SaveOperation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SaveOperation__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SaveOperation__Group__6"


    // $ANTLR start "rule__SaveOperation__Group__6__Impl"
    // InternalMyDsl.g:2835:1: rule__SaveOperation__Group__6__Impl : ( ( rule__SaveOperation__FileAssignment_6 ) ) ;
    public final void rule__SaveOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2839:1: ( ( ( rule__SaveOperation__FileAssignment_6 ) ) )
            // InternalMyDsl.g:2840:1: ( ( rule__SaveOperation__FileAssignment_6 ) )
            {
            // InternalMyDsl.g:2840:1: ( ( rule__SaveOperation__FileAssignment_6 ) )
            // InternalMyDsl.g:2841:2: ( rule__SaveOperation__FileAssignment_6 )
            {
             before(grammarAccess.getSaveOperationAccess().getFileAssignment_6()); 
            // InternalMyDsl.g:2842:2: ( rule__SaveOperation__FileAssignment_6 )
            // InternalMyDsl.g:2842:3: rule__SaveOperation__FileAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__SaveOperation__FileAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getSaveOperationAccess().getFileAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SaveOperation__Group__6__Impl"


    // $ANTLR start "rule__SaveOperation__Group__7"
    // InternalMyDsl.g:2850:1: rule__SaveOperation__Group__7 : rule__SaveOperation__Group__7__Impl rule__SaveOperation__Group__8 ;
    public final void rule__SaveOperation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2854:1: ( rule__SaveOperation__Group__7__Impl rule__SaveOperation__Group__8 )
            // InternalMyDsl.g:2855:2: rule__SaveOperation__Group__7__Impl rule__SaveOperation__Group__8
            {
            pushFollow(FOLLOW_21);
            rule__SaveOperation__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SaveOperation__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SaveOperation__Group__7"


    // $ANTLR start "rule__SaveOperation__Group__7__Impl"
    // InternalMyDsl.g:2862:1: rule__SaveOperation__Group__7__Impl : ( ')' ) ;
    public final void rule__SaveOperation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2866:1: ( ( ')' ) )
            // InternalMyDsl.g:2867:1: ( ')' )
            {
            // InternalMyDsl.g:2867:1: ( ')' )
            // InternalMyDsl.g:2868:2: ')'
            {
             before(grammarAccess.getSaveOperationAccess().getRightParenthesisKeyword_7()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSaveOperationAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SaveOperation__Group__7__Impl"


    // $ANTLR start "rule__SaveOperation__Group__8"
    // InternalMyDsl.g:2877:1: rule__SaveOperation__Group__8 : rule__SaveOperation__Group__8__Impl rule__SaveOperation__Group__9 ;
    public final void rule__SaveOperation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2881:1: ( rule__SaveOperation__Group__8__Impl rule__SaveOperation__Group__9 )
            // InternalMyDsl.g:2882:2: rule__SaveOperation__Group__8__Impl rule__SaveOperation__Group__9
            {
            pushFollow(FOLLOW_5);
            rule__SaveOperation__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SaveOperation__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SaveOperation__Group__8"


    // $ANTLR start "rule__SaveOperation__Group__8__Impl"
    // InternalMyDsl.g:2889:1: rule__SaveOperation__Group__8__Impl : ( '.as(' ) ;
    public final void rule__SaveOperation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2893:1: ( ( '.as(' ) )
            // InternalMyDsl.g:2894:1: ( '.as(' )
            {
            // InternalMyDsl.g:2894:1: ( '.as(' )
            // InternalMyDsl.g:2895:2: '.as('
            {
             before(grammarAccess.getSaveOperationAccess().getAsKeyword_8()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getSaveOperationAccess().getAsKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SaveOperation__Group__8__Impl"


    // $ANTLR start "rule__SaveOperation__Group__9"
    // InternalMyDsl.g:2904:1: rule__SaveOperation__Group__9 : rule__SaveOperation__Group__9__Impl rule__SaveOperation__Group__10 ;
    public final void rule__SaveOperation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2908:1: ( rule__SaveOperation__Group__9__Impl rule__SaveOperation__Group__10 )
            // InternalMyDsl.g:2909:2: rule__SaveOperation__Group__9__Impl rule__SaveOperation__Group__10
            {
            pushFollow(FOLLOW_6);
            rule__SaveOperation__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SaveOperation__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SaveOperation__Group__9"


    // $ANTLR start "rule__SaveOperation__Group__9__Impl"
    // InternalMyDsl.g:2916:1: rule__SaveOperation__Group__9__Impl : ( ( rule__SaveOperation__FormatAssignment_9 ) ) ;
    public final void rule__SaveOperation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2920:1: ( ( ( rule__SaveOperation__FormatAssignment_9 ) ) )
            // InternalMyDsl.g:2921:1: ( ( rule__SaveOperation__FormatAssignment_9 ) )
            {
            // InternalMyDsl.g:2921:1: ( ( rule__SaveOperation__FormatAssignment_9 ) )
            // InternalMyDsl.g:2922:2: ( rule__SaveOperation__FormatAssignment_9 )
            {
             before(grammarAccess.getSaveOperationAccess().getFormatAssignment_9()); 
            // InternalMyDsl.g:2923:2: ( rule__SaveOperation__FormatAssignment_9 )
            // InternalMyDsl.g:2923:3: rule__SaveOperation__FormatAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__SaveOperation__FormatAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getSaveOperationAccess().getFormatAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SaveOperation__Group__9__Impl"


    // $ANTLR start "rule__SaveOperation__Group__10"
    // InternalMyDsl.g:2931:1: rule__SaveOperation__Group__10 : rule__SaveOperation__Group__10__Impl ;
    public final void rule__SaveOperation__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2935:1: ( rule__SaveOperation__Group__10__Impl )
            // InternalMyDsl.g:2936:2: rule__SaveOperation__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SaveOperation__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SaveOperation__Group__10"


    // $ANTLR start "rule__SaveOperation__Group__10__Impl"
    // InternalMyDsl.g:2942:1: rule__SaveOperation__Group__10__Impl : ( ')' ) ;
    public final void rule__SaveOperation__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2946:1: ( ( ')' ) )
            // InternalMyDsl.g:2947:1: ( ')' )
            {
            // InternalMyDsl.g:2947:1: ( ')' )
            // InternalMyDsl.g:2948:2: ')'
            {
             before(grammarAccess.getSaveOperationAccess().getRightParenthesisKeyword_10()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSaveOperationAccess().getRightParenthesisKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SaveOperation__Group__10__Impl"


    // $ANTLR start "rule__SaveOperation__Group_3__0"
    // InternalMyDsl.g:2958:1: rule__SaveOperation__Group_3__0 : rule__SaveOperation__Group_3__0__Impl rule__SaveOperation__Group_3__1 ;
    public final void rule__SaveOperation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2962:1: ( rule__SaveOperation__Group_3__0__Impl rule__SaveOperation__Group_3__1 )
            // InternalMyDsl.g:2963:2: rule__SaveOperation__Group_3__0__Impl rule__SaveOperation__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__SaveOperation__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SaveOperation__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SaveOperation__Group_3__0"


    // $ANTLR start "rule__SaveOperation__Group_3__0__Impl"
    // InternalMyDsl.g:2970:1: rule__SaveOperation__Group_3__0__Impl : ( ',' ) ;
    public final void rule__SaveOperation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2974:1: ( ( ',' ) )
            // InternalMyDsl.g:2975:1: ( ',' )
            {
            // InternalMyDsl.g:2975:1: ( ',' )
            // InternalMyDsl.g:2976:2: ','
            {
             before(grammarAccess.getSaveOperationAccess().getCommaKeyword_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSaveOperationAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SaveOperation__Group_3__0__Impl"


    // $ANTLR start "rule__SaveOperation__Group_3__1"
    // InternalMyDsl.g:2985:1: rule__SaveOperation__Group_3__1 : rule__SaveOperation__Group_3__1__Impl ;
    public final void rule__SaveOperation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2989:1: ( rule__SaveOperation__Group_3__1__Impl )
            // InternalMyDsl.g:2990:2: rule__SaveOperation__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SaveOperation__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SaveOperation__Group_3__1"


    // $ANTLR start "rule__SaveOperation__Group_3__1__Impl"
    // InternalMyDsl.g:2996:1: rule__SaveOperation__Group_3__1__Impl : ( ( rule__SaveOperation__TablesAssignment_3_1 ) ) ;
    public final void rule__SaveOperation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3000:1: ( ( ( rule__SaveOperation__TablesAssignment_3_1 ) ) )
            // InternalMyDsl.g:3001:1: ( ( rule__SaveOperation__TablesAssignment_3_1 ) )
            {
            // InternalMyDsl.g:3001:1: ( ( rule__SaveOperation__TablesAssignment_3_1 ) )
            // InternalMyDsl.g:3002:2: ( rule__SaveOperation__TablesAssignment_3_1 )
            {
             before(grammarAccess.getSaveOperationAccess().getTablesAssignment_3_1()); 
            // InternalMyDsl.g:3003:2: ( rule__SaveOperation__TablesAssignment_3_1 )
            // InternalMyDsl.g:3003:3: rule__SaveOperation__TablesAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__SaveOperation__TablesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSaveOperationAccess().getTablesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SaveOperation__Group_3__1__Impl"


    // $ANTLR start "rule__PrintOperation__Group_0__0"
    // InternalMyDsl.g:3012:1: rule__PrintOperation__Group_0__0 : rule__PrintOperation__Group_0__0__Impl rule__PrintOperation__Group_0__1 ;
    public final void rule__PrintOperation__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3016:1: ( rule__PrintOperation__Group_0__0__Impl rule__PrintOperation__Group_0__1 )
            // InternalMyDsl.g:3017:2: rule__PrintOperation__Group_0__0__Impl rule__PrintOperation__Group_0__1
            {
            pushFollow(FOLLOW_22);
            rule__PrintOperation__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrintOperation__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintOperation__Group_0__0"


    // $ANTLR start "rule__PrintOperation__Group_0__0__Impl"
    // InternalMyDsl.g:3024:1: rule__PrintOperation__Group_0__0__Impl : ( () ) ;
    public final void rule__PrintOperation__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3028:1: ( ( () ) )
            // InternalMyDsl.g:3029:1: ( () )
            {
            // InternalMyDsl.g:3029:1: ( () )
            // InternalMyDsl.g:3030:2: ()
            {
             before(grammarAccess.getPrintOperationAccess().getPrintOperationAction_0_0()); 
            // InternalMyDsl.g:3031:2: ()
            // InternalMyDsl.g:3031:3: 
            {
            }

             after(grammarAccess.getPrintOperationAccess().getPrintOperationAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintOperation__Group_0__0__Impl"


    // $ANTLR start "rule__PrintOperation__Group_0__1"
    // InternalMyDsl.g:3039:1: rule__PrintOperation__Group_0__1 : rule__PrintOperation__Group_0__1__Impl ;
    public final void rule__PrintOperation__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3043:1: ( rule__PrintOperation__Group_0__1__Impl )
            // InternalMyDsl.g:3044:2: rule__PrintOperation__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrintOperation__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintOperation__Group_0__1"


    // $ANTLR start "rule__PrintOperation__Group_0__1__Impl"
    // InternalMyDsl.g:3050:1: rule__PrintOperation__Group_0__1__Impl : ( rulePrintAll ) ;
    public final void rule__PrintOperation__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3054:1: ( ( rulePrintAll ) )
            // InternalMyDsl.g:3055:1: ( rulePrintAll )
            {
            // InternalMyDsl.g:3055:1: ( rulePrintAll )
            // InternalMyDsl.g:3056:2: rulePrintAll
            {
             before(grammarAccess.getPrintOperationAccess().getPrintAllParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            rulePrintAll();

            state._fsp--;

             after(grammarAccess.getPrintOperationAccess().getPrintAllParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintOperation__Group_0__1__Impl"


    // $ANTLR start "rule__PrintTable__Group__0"
    // InternalMyDsl.g:3066:1: rule__PrintTable__Group__0 : rule__PrintTable__Group__0__Impl rule__PrintTable__Group__1 ;
    public final void rule__PrintTable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3070:1: ( rule__PrintTable__Group__0__Impl rule__PrintTable__Group__1 )
            // InternalMyDsl.g:3071:2: rule__PrintTable__Group__0__Impl rule__PrintTable__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__PrintTable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrintTable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintTable__Group__0"


    // $ANTLR start "rule__PrintTable__Group__0__Impl"
    // InternalMyDsl.g:3078:1: rule__PrintTable__Group__0__Impl : ( '.printTable(' ) ;
    public final void rule__PrintTable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3082:1: ( ( '.printTable(' ) )
            // InternalMyDsl.g:3083:1: ( '.printTable(' )
            {
            // InternalMyDsl.g:3083:1: ( '.printTable(' )
            // InternalMyDsl.g:3084:2: '.printTable('
            {
             before(grammarAccess.getPrintTableAccess().getPrintTableKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getPrintTableAccess().getPrintTableKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintTable__Group__0__Impl"


    // $ANTLR start "rule__PrintTable__Group__1"
    // InternalMyDsl.g:3093:1: rule__PrintTable__Group__1 : rule__PrintTable__Group__1__Impl rule__PrintTable__Group__2 ;
    public final void rule__PrintTable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3097:1: ( rule__PrintTable__Group__1__Impl rule__PrintTable__Group__2 )
            // InternalMyDsl.g:3098:2: rule__PrintTable__Group__1__Impl rule__PrintTable__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__PrintTable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrintTable__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintTable__Group__1"


    // $ANTLR start "rule__PrintTable__Group__1__Impl"
    // InternalMyDsl.g:3105:1: rule__PrintTable__Group__1__Impl : ( ( rule__PrintTable__TableAssignment_1 ) ) ;
    public final void rule__PrintTable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3109:1: ( ( ( rule__PrintTable__TableAssignment_1 ) ) )
            // InternalMyDsl.g:3110:1: ( ( rule__PrintTable__TableAssignment_1 ) )
            {
            // InternalMyDsl.g:3110:1: ( ( rule__PrintTable__TableAssignment_1 ) )
            // InternalMyDsl.g:3111:2: ( rule__PrintTable__TableAssignment_1 )
            {
             before(grammarAccess.getPrintTableAccess().getTableAssignment_1()); 
            // InternalMyDsl.g:3112:2: ( rule__PrintTable__TableAssignment_1 )
            // InternalMyDsl.g:3112:3: rule__PrintTable__TableAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PrintTable__TableAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPrintTableAccess().getTableAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintTable__Group__1__Impl"


    // $ANTLR start "rule__PrintTable__Group__2"
    // InternalMyDsl.g:3120:1: rule__PrintTable__Group__2 : rule__PrintTable__Group__2__Impl ;
    public final void rule__PrintTable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3124:1: ( rule__PrintTable__Group__2__Impl )
            // InternalMyDsl.g:3125:2: rule__PrintTable__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrintTable__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintTable__Group__2"


    // $ANTLR start "rule__PrintTable__Group__2__Impl"
    // InternalMyDsl.g:3131:1: rule__PrintTable__Group__2__Impl : ( ')' ) ;
    public final void rule__PrintTable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3135:1: ( ( ')' ) )
            // InternalMyDsl.g:3136:1: ( ')' )
            {
            // InternalMyDsl.g:3136:1: ( ')' )
            // InternalMyDsl.g:3137:2: ')'
            {
             before(grammarAccess.getPrintTableAccess().getRightParenthesisKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPrintTableAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintTable__Group__2__Impl"


    // $ANTLR start "rule__RenameOperation__Group__0"
    // InternalMyDsl.g:3147:1: rule__RenameOperation__Group__0 : rule__RenameOperation__Group__0__Impl rule__RenameOperation__Group__1 ;
    public final void rule__RenameOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3151:1: ( rule__RenameOperation__Group__0__Impl rule__RenameOperation__Group__1 )
            // InternalMyDsl.g:3152:2: rule__RenameOperation__Group__0__Impl rule__RenameOperation__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__RenameOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RenameOperation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameOperation__Group__0"


    // $ANTLR start "rule__RenameOperation__Group__0__Impl"
    // InternalMyDsl.g:3159:1: rule__RenameOperation__Group__0__Impl : ( '.renameColumn()' ) ;
    public final void rule__RenameOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3163:1: ( ( '.renameColumn()' ) )
            // InternalMyDsl.g:3164:1: ( '.renameColumn()' )
            {
            // InternalMyDsl.g:3164:1: ( '.renameColumn()' )
            // InternalMyDsl.g:3165:2: '.renameColumn()'
            {
             before(grammarAccess.getRenameOperationAccess().getRenameColumnKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getRenameOperationAccess().getRenameColumnKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameOperation__Group__0__Impl"


    // $ANTLR start "rule__RenameOperation__Group__1"
    // InternalMyDsl.g:3174:1: rule__RenameOperation__Group__1 : rule__RenameOperation__Group__1__Impl rule__RenameOperation__Group__2 ;
    public final void rule__RenameOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3178:1: ( rule__RenameOperation__Group__1__Impl rule__RenameOperation__Group__2 )
            // InternalMyDsl.g:3179:2: rule__RenameOperation__Group__1__Impl rule__RenameOperation__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__RenameOperation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RenameOperation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameOperation__Group__1"


    // $ANTLR start "rule__RenameOperation__Group__1__Impl"
    // InternalMyDsl.g:3186:1: rule__RenameOperation__Group__1__Impl : ( '.from(' ) ;
    public final void rule__RenameOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3190:1: ( ( '.from(' ) )
            // InternalMyDsl.g:3191:1: ( '.from(' )
            {
            // InternalMyDsl.g:3191:1: ( '.from(' )
            // InternalMyDsl.g:3192:2: '.from('
            {
             before(grammarAccess.getRenameOperationAccess().getFromKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRenameOperationAccess().getFromKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameOperation__Group__1__Impl"


    // $ANTLR start "rule__RenameOperation__Group__2"
    // InternalMyDsl.g:3201:1: rule__RenameOperation__Group__2 : rule__RenameOperation__Group__2__Impl rule__RenameOperation__Group__3 ;
    public final void rule__RenameOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3205:1: ( rule__RenameOperation__Group__2__Impl rule__RenameOperation__Group__3 )
            // InternalMyDsl.g:3206:2: rule__RenameOperation__Group__2__Impl rule__RenameOperation__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__RenameOperation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RenameOperation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameOperation__Group__2"


    // $ANTLR start "rule__RenameOperation__Group__2__Impl"
    // InternalMyDsl.g:3213:1: rule__RenameOperation__Group__2__Impl : ( ( rule__RenameOperation__OriginalAssignment_2 ) ) ;
    public final void rule__RenameOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3217:1: ( ( ( rule__RenameOperation__OriginalAssignment_2 ) ) )
            // InternalMyDsl.g:3218:1: ( ( rule__RenameOperation__OriginalAssignment_2 ) )
            {
            // InternalMyDsl.g:3218:1: ( ( rule__RenameOperation__OriginalAssignment_2 ) )
            // InternalMyDsl.g:3219:2: ( rule__RenameOperation__OriginalAssignment_2 )
            {
             before(grammarAccess.getRenameOperationAccess().getOriginalAssignment_2()); 
            // InternalMyDsl.g:3220:2: ( rule__RenameOperation__OriginalAssignment_2 )
            // InternalMyDsl.g:3220:3: rule__RenameOperation__OriginalAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RenameOperation__OriginalAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRenameOperationAccess().getOriginalAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameOperation__Group__2__Impl"


    // $ANTLR start "rule__RenameOperation__Group__3"
    // InternalMyDsl.g:3228:1: rule__RenameOperation__Group__3 : rule__RenameOperation__Group__3__Impl rule__RenameOperation__Group__4 ;
    public final void rule__RenameOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3232:1: ( rule__RenameOperation__Group__3__Impl rule__RenameOperation__Group__4 )
            // InternalMyDsl.g:3233:2: rule__RenameOperation__Group__3__Impl rule__RenameOperation__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__RenameOperation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RenameOperation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameOperation__Group__3"


    // $ANTLR start "rule__RenameOperation__Group__3__Impl"
    // InternalMyDsl.g:3240:1: rule__RenameOperation__Group__3__Impl : ( ')' ) ;
    public final void rule__RenameOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3244:1: ( ( ')' ) )
            // InternalMyDsl.g:3245:1: ( ')' )
            {
            // InternalMyDsl.g:3245:1: ( ')' )
            // InternalMyDsl.g:3246:2: ')'
            {
             before(grammarAccess.getRenameOperationAccess().getRightParenthesisKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRenameOperationAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameOperation__Group__3__Impl"


    // $ANTLR start "rule__RenameOperation__Group__4"
    // InternalMyDsl.g:3255:1: rule__RenameOperation__Group__4 : rule__RenameOperation__Group__4__Impl rule__RenameOperation__Group__5 ;
    public final void rule__RenameOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3259:1: ( rule__RenameOperation__Group__4__Impl rule__RenameOperation__Group__5 )
            // InternalMyDsl.g:3260:2: rule__RenameOperation__Group__4__Impl rule__RenameOperation__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__RenameOperation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RenameOperation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameOperation__Group__4"


    // $ANTLR start "rule__RenameOperation__Group__4__Impl"
    // InternalMyDsl.g:3267:1: rule__RenameOperation__Group__4__Impl : ( '.to(' ) ;
    public final void rule__RenameOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3271:1: ( ( '.to(' ) )
            // InternalMyDsl.g:3272:1: ( '.to(' )
            {
            // InternalMyDsl.g:3272:1: ( '.to(' )
            // InternalMyDsl.g:3273:2: '.to('
            {
             before(grammarAccess.getRenameOperationAccess().getToKeyword_4()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getRenameOperationAccess().getToKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameOperation__Group__4__Impl"


    // $ANTLR start "rule__RenameOperation__Group__5"
    // InternalMyDsl.g:3282:1: rule__RenameOperation__Group__5 : rule__RenameOperation__Group__5__Impl rule__RenameOperation__Group__6 ;
    public final void rule__RenameOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3286:1: ( rule__RenameOperation__Group__5__Impl rule__RenameOperation__Group__6 )
            // InternalMyDsl.g:3287:2: rule__RenameOperation__Group__5__Impl rule__RenameOperation__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__RenameOperation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RenameOperation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameOperation__Group__5"


    // $ANTLR start "rule__RenameOperation__Group__5__Impl"
    // InternalMyDsl.g:3294:1: rule__RenameOperation__Group__5__Impl : ( ( rule__RenameOperation__RenamedAssignment_5 ) ) ;
    public final void rule__RenameOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3298:1: ( ( ( rule__RenameOperation__RenamedAssignment_5 ) ) )
            // InternalMyDsl.g:3299:1: ( ( rule__RenameOperation__RenamedAssignment_5 ) )
            {
            // InternalMyDsl.g:3299:1: ( ( rule__RenameOperation__RenamedAssignment_5 ) )
            // InternalMyDsl.g:3300:2: ( rule__RenameOperation__RenamedAssignment_5 )
            {
             before(grammarAccess.getRenameOperationAccess().getRenamedAssignment_5()); 
            // InternalMyDsl.g:3301:2: ( rule__RenameOperation__RenamedAssignment_5 )
            // InternalMyDsl.g:3301:3: rule__RenameOperation__RenamedAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__RenameOperation__RenamedAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRenameOperationAccess().getRenamedAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameOperation__Group__5__Impl"


    // $ANTLR start "rule__RenameOperation__Group__6"
    // InternalMyDsl.g:3309:1: rule__RenameOperation__Group__6 : rule__RenameOperation__Group__6__Impl rule__RenameOperation__Group__7 ;
    public final void rule__RenameOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3313:1: ( rule__RenameOperation__Group__6__Impl rule__RenameOperation__Group__7 )
            // InternalMyDsl.g:3314:2: rule__RenameOperation__Group__6__Impl rule__RenameOperation__Group__7
            {
            pushFollow(FOLLOW_15);
            rule__RenameOperation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RenameOperation__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameOperation__Group__6"


    // $ANTLR start "rule__RenameOperation__Group__6__Impl"
    // InternalMyDsl.g:3321:1: rule__RenameOperation__Group__6__Impl : ( ')' ) ;
    public final void rule__RenameOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3325:1: ( ( ')' ) )
            // InternalMyDsl.g:3326:1: ( ')' )
            {
            // InternalMyDsl.g:3326:1: ( ')' )
            // InternalMyDsl.g:3327:2: ')'
            {
             before(grammarAccess.getRenameOperationAccess().getRightParenthesisKeyword_6()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRenameOperationAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameOperation__Group__6__Impl"


    // $ANTLR start "rule__RenameOperation__Group__7"
    // InternalMyDsl.g:3336:1: rule__RenameOperation__Group__7 : rule__RenameOperation__Group__7__Impl rule__RenameOperation__Group__8 ;
    public final void rule__RenameOperation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3340:1: ( rule__RenameOperation__Group__7__Impl rule__RenameOperation__Group__8 )
            // InternalMyDsl.g:3341:2: rule__RenameOperation__Group__7__Impl rule__RenameOperation__Group__8
            {
            pushFollow(FOLLOW_5);
            rule__RenameOperation__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RenameOperation__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameOperation__Group__7"


    // $ANTLR start "rule__RenameOperation__Group__7__Impl"
    // InternalMyDsl.g:3348:1: rule__RenameOperation__Group__7__Impl : ( '.onTable(' ) ;
    public final void rule__RenameOperation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3352:1: ( ( '.onTable(' ) )
            // InternalMyDsl.g:3353:1: ( '.onTable(' )
            {
            // InternalMyDsl.g:3353:1: ( '.onTable(' )
            // InternalMyDsl.g:3354:2: '.onTable('
            {
             before(grammarAccess.getRenameOperationAccess().getOnTableKeyword_7()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getRenameOperationAccess().getOnTableKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameOperation__Group__7__Impl"


    // $ANTLR start "rule__RenameOperation__Group__8"
    // InternalMyDsl.g:3363:1: rule__RenameOperation__Group__8 : rule__RenameOperation__Group__8__Impl rule__RenameOperation__Group__9 ;
    public final void rule__RenameOperation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3367:1: ( rule__RenameOperation__Group__8__Impl rule__RenameOperation__Group__9 )
            // InternalMyDsl.g:3368:2: rule__RenameOperation__Group__8__Impl rule__RenameOperation__Group__9
            {
            pushFollow(FOLLOW_6);
            rule__RenameOperation__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RenameOperation__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameOperation__Group__8"


    // $ANTLR start "rule__RenameOperation__Group__8__Impl"
    // InternalMyDsl.g:3375:1: rule__RenameOperation__Group__8__Impl : ( ( rule__RenameOperation__TableAssignment_8 ) ) ;
    public final void rule__RenameOperation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3379:1: ( ( ( rule__RenameOperation__TableAssignment_8 ) ) )
            // InternalMyDsl.g:3380:1: ( ( rule__RenameOperation__TableAssignment_8 ) )
            {
            // InternalMyDsl.g:3380:1: ( ( rule__RenameOperation__TableAssignment_8 ) )
            // InternalMyDsl.g:3381:2: ( rule__RenameOperation__TableAssignment_8 )
            {
             before(grammarAccess.getRenameOperationAccess().getTableAssignment_8()); 
            // InternalMyDsl.g:3382:2: ( rule__RenameOperation__TableAssignment_8 )
            // InternalMyDsl.g:3382:3: rule__RenameOperation__TableAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__RenameOperation__TableAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getRenameOperationAccess().getTableAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameOperation__Group__8__Impl"


    // $ANTLR start "rule__RenameOperation__Group__9"
    // InternalMyDsl.g:3390:1: rule__RenameOperation__Group__9 : rule__RenameOperation__Group__9__Impl ;
    public final void rule__RenameOperation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3394:1: ( rule__RenameOperation__Group__9__Impl )
            // InternalMyDsl.g:3395:2: rule__RenameOperation__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RenameOperation__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameOperation__Group__9"


    // $ANTLR start "rule__RenameOperation__Group__9__Impl"
    // InternalMyDsl.g:3401:1: rule__RenameOperation__Group__9__Impl : ( ')' ) ;
    public final void rule__RenameOperation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3405:1: ( ( ')' ) )
            // InternalMyDsl.g:3406:1: ( ')' )
            {
            // InternalMyDsl.g:3406:1: ( ')' )
            // InternalMyDsl.g:3407:2: ')'
            {
             before(grammarAccess.getRenameOperationAccess().getRightParenthesisKeyword_9()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRenameOperationAccess().getRightParenthesisKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameOperation__Group__9__Impl"


    // $ANTLR start "rule__LimitOperation__Group__0"
    // InternalMyDsl.g:3417:1: rule__LimitOperation__Group__0 : rule__LimitOperation__Group__0__Impl rule__LimitOperation__Group__1 ;
    public final void rule__LimitOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3421:1: ( rule__LimitOperation__Group__0__Impl rule__LimitOperation__Group__1 )
            // InternalMyDsl.g:3422:2: rule__LimitOperation__Group__0__Impl rule__LimitOperation__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__LimitOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LimitOperation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LimitOperation__Group__0"


    // $ANTLR start "rule__LimitOperation__Group__0__Impl"
    // InternalMyDsl.g:3429:1: rule__LimitOperation__Group__0__Impl : ( '.limit()' ) ;
    public final void rule__LimitOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3433:1: ( ( '.limit()' ) )
            // InternalMyDsl.g:3434:1: ( '.limit()' )
            {
            // InternalMyDsl.g:3434:1: ( '.limit()' )
            // InternalMyDsl.g:3435:2: '.limit()'
            {
             before(grammarAccess.getLimitOperationAccess().getLimitKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getLimitOperationAccess().getLimitKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LimitOperation__Group__0__Impl"


    // $ANTLR start "rule__LimitOperation__Group__1"
    // InternalMyDsl.g:3444:1: rule__LimitOperation__Group__1 : rule__LimitOperation__Group__1__Impl rule__LimitOperation__Group__2 ;
    public final void rule__LimitOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3448:1: ( rule__LimitOperation__Group__1__Impl rule__LimitOperation__Group__2 )
            // InternalMyDsl.g:3449:2: rule__LimitOperation__Group__1__Impl rule__LimitOperation__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__LimitOperation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LimitOperation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LimitOperation__Group__1"


    // $ANTLR start "rule__LimitOperation__Group__1__Impl"
    // InternalMyDsl.g:3456:1: rule__LimitOperation__Group__1__Impl : ( '.table(' ) ;
    public final void rule__LimitOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3460:1: ( ( '.table(' ) )
            // InternalMyDsl.g:3461:1: ( '.table(' )
            {
            // InternalMyDsl.g:3461:1: ( '.table(' )
            // InternalMyDsl.g:3462:2: '.table('
            {
             before(grammarAccess.getLimitOperationAccess().getTableKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getLimitOperationAccess().getTableKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LimitOperation__Group__1__Impl"


    // $ANTLR start "rule__LimitOperation__Group__2"
    // InternalMyDsl.g:3471:1: rule__LimitOperation__Group__2 : rule__LimitOperation__Group__2__Impl rule__LimitOperation__Group__3 ;
    public final void rule__LimitOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3475:1: ( rule__LimitOperation__Group__2__Impl rule__LimitOperation__Group__3 )
            // InternalMyDsl.g:3476:2: rule__LimitOperation__Group__2__Impl rule__LimitOperation__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__LimitOperation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LimitOperation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LimitOperation__Group__2"


    // $ANTLR start "rule__LimitOperation__Group__2__Impl"
    // InternalMyDsl.g:3483:1: rule__LimitOperation__Group__2__Impl : ( ( rule__LimitOperation__TableAssignment_2 ) ) ;
    public final void rule__LimitOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3487:1: ( ( ( rule__LimitOperation__TableAssignment_2 ) ) )
            // InternalMyDsl.g:3488:1: ( ( rule__LimitOperation__TableAssignment_2 ) )
            {
            // InternalMyDsl.g:3488:1: ( ( rule__LimitOperation__TableAssignment_2 ) )
            // InternalMyDsl.g:3489:2: ( rule__LimitOperation__TableAssignment_2 )
            {
             before(grammarAccess.getLimitOperationAccess().getTableAssignment_2()); 
            // InternalMyDsl.g:3490:2: ( rule__LimitOperation__TableAssignment_2 )
            // InternalMyDsl.g:3490:3: rule__LimitOperation__TableAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LimitOperation__TableAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLimitOperationAccess().getTableAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LimitOperation__Group__2__Impl"


    // $ANTLR start "rule__LimitOperation__Group__3"
    // InternalMyDsl.g:3498:1: rule__LimitOperation__Group__3 : rule__LimitOperation__Group__3__Impl rule__LimitOperation__Group__4 ;
    public final void rule__LimitOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3502:1: ( rule__LimitOperation__Group__3__Impl rule__LimitOperation__Group__4 )
            // InternalMyDsl.g:3503:2: rule__LimitOperation__Group__3__Impl rule__LimitOperation__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__LimitOperation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LimitOperation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LimitOperation__Group__3"


    // $ANTLR start "rule__LimitOperation__Group__3__Impl"
    // InternalMyDsl.g:3510:1: rule__LimitOperation__Group__3__Impl : ( ')' ) ;
    public final void rule__LimitOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3514:1: ( ( ')' ) )
            // InternalMyDsl.g:3515:1: ( ')' )
            {
            // InternalMyDsl.g:3515:1: ( ')' )
            // InternalMyDsl.g:3516:2: ')'
            {
             before(grammarAccess.getLimitOperationAccess().getRightParenthesisKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getLimitOperationAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LimitOperation__Group__3__Impl"


    // $ANTLR start "rule__LimitOperation__Group__4"
    // InternalMyDsl.g:3525:1: rule__LimitOperation__Group__4 : rule__LimitOperation__Group__4__Impl rule__LimitOperation__Group__5 ;
    public final void rule__LimitOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3529:1: ( rule__LimitOperation__Group__4__Impl rule__LimitOperation__Group__5 )
            // InternalMyDsl.g:3530:2: rule__LimitOperation__Group__4__Impl rule__LimitOperation__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__LimitOperation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LimitOperation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LimitOperation__Group__4"


    // $ANTLR start "rule__LimitOperation__Group__4__Impl"
    // InternalMyDsl.g:3537:1: rule__LimitOperation__Group__4__Impl : ( '.from(' ) ;
    public final void rule__LimitOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3541:1: ( ( '.from(' ) )
            // InternalMyDsl.g:3542:1: ( '.from(' )
            {
            // InternalMyDsl.g:3542:1: ( '.from(' )
            // InternalMyDsl.g:3543:2: '.from('
            {
             before(grammarAccess.getLimitOperationAccess().getFromKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getLimitOperationAccess().getFromKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LimitOperation__Group__4__Impl"


    // $ANTLR start "rule__LimitOperation__Group__5"
    // InternalMyDsl.g:3552:1: rule__LimitOperation__Group__5 : rule__LimitOperation__Group__5__Impl rule__LimitOperation__Group__6 ;
    public final void rule__LimitOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3556:1: ( rule__LimitOperation__Group__5__Impl rule__LimitOperation__Group__6 )
            // InternalMyDsl.g:3557:2: rule__LimitOperation__Group__5__Impl rule__LimitOperation__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__LimitOperation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LimitOperation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LimitOperation__Group__5"


    // $ANTLR start "rule__LimitOperation__Group__5__Impl"
    // InternalMyDsl.g:3564:1: rule__LimitOperation__Group__5__Impl : ( ( rule__LimitOperation__StartAssignment_5 ) ) ;
    public final void rule__LimitOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3568:1: ( ( ( rule__LimitOperation__StartAssignment_5 ) ) )
            // InternalMyDsl.g:3569:1: ( ( rule__LimitOperation__StartAssignment_5 ) )
            {
            // InternalMyDsl.g:3569:1: ( ( rule__LimitOperation__StartAssignment_5 ) )
            // InternalMyDsl.g:3570:2: ( rule__LimitOperation__StartAssignment_5 )
            {
             before(grammarAccess.getLimitOperationAccess().getStartAssignment_5()); 
            // InternalMyDsl.g:3571:2: ( rule__LimitOperation__StartAssignment_5 )
            // InternalMyDsl.g:3571:3: rule__LimitOperation__StartAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__LimitOperation__StartAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getLimitOperationAccess().getStartAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LimitOperation__Group__5__Impl"


    // $ANTLR start "rule__LimitOperation__Group__6"
    // InternalMyDsl.g:3579:1: rule__LimitOperation__Group__6 : rule__LimitOperation__Group__6__Impl rule__LimitOperation__Group__7 ;
    public final void rule__LimitOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3583:1: ( rule__LimitOperation__Group__6__Impl rule__LimitOperation__Group__7 )
            // InternalMyDsl.g:3584:2: rule__LimitOperation__Group__6__Impl rule__LimitOperation__Group__7
            {
            pushFollow(FOLLOW_20);
            rule__LimitOperation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LimitOperation__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LimitOperation__Group__6"


    // $ANTLR start "rule__LimitOperation__Group__6__Impl"
    // InternalMyDsl.g:3591:1: rule__LimitOperation__Group__6__Impl : ( ')' ) ;
    public final void rule__LimitOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3595:1: ( ( ')' ) )
            // InternalMyDsl.g:3596:1: ( ')' )
            {
            // InternalMyDsl.g:3596:1: ( ')' )
            // InternalMyDsl.g:3597:2: ')'
            {
             before(grammarAccess.getLimitOperationAccess().getRightParenthesisKeyword_6()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getLimitOperationAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LimitOperation__Group__6__Impl"


    // $ANTLR start "rule__LimitOperation__Group__7"
    // InternalMyDsl.g:3606:1: rule__LimitOperation__Group__7 : rule__LimitOperation__Group__7__Impl rule__LimitOperation__Group__8 ;
    public final void rule__LimitOperation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3610:1: ( rule__LimitOperation__Group__7__Impl rule__LimitOperation__Group__8 )
            // InternalMyDsl.g:3611:2: rule__LimitOperation__Group__7__Impl rule__LimitOperation__Group__8
            {
            pushFollow(FOLLOW_24);
            rule__LimitOperation__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LimitOperation__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LimitOperation__Group__7"


    // $ANTLR start "rule__LimitOperation__Group__7__Impl"
    // InternalMyDsl.g:3618:1: rule__LimitOperation__Group__7__Impl : ( '.to(' ) ;
    public final void rule__LimitOperation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3622:1: ( ( '.to(' ) )
            // InternalMyDsl.g:3623:1: ( '.to(' )
            {
            // InternalMyDsl.g:3623:1: ( '.to(' )
            // InternalMyDsl.g:3624:2: '.to('
            {
             before(grammarAccess.getLimitOperationAccess().getToKeyword_7()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getLimitOperationAccess().getToKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LimitOperation__Group__7__Impl"


    // $ANTLR start "rule__LimitOperation__Group__8"
    // InternalMyDsl.g:3633:1: rule__LimitOperation__Group__8 : rule__LimitOperation__Group__8__Impl rule__LimitOperation__Group__9 ;
    public final void rule__LimitOperation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3637:1: ( rule__LimitOperation__Group__8__Impl rule__LimitOperation__Group__9 )
            // InternalMyDsl.g:3638:2: rule__LimitOperation__Group__8__Impl rule__LimitOperation__Group__9
            {
            pushFollow(FOLLOW_6);
            rule__LimitOperation__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LimitOperation__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LimitOperation__Group__8"


    // $ANTLR start "rule__LimitOperation__Group__8__Impl"
    // InternalMyDsl.g:3645:1: rule__LimitOperation__Group__8__Impl : ( ( rule__LimitOperation__EndAssignment_8 ) ) ;
    public final void rule__LimitOperation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3649:1: ( ( ( rule__LimitOperation__EndAssignment_8 ) ) )
            // InternalMyDsl.g:3650:1: ( ( rule__LimitOperation__EndAssignment_8 ) )
            {
            // InternalMyDsl.g:3650:1: ( ( rule__LimitOperation__EndAssignment_8 ) )
            // InternalMyDsl.g:3651:2: ( rule__LimitOperation__EndAssignment_8 )
            {
             before(grammarAccess.getLimitOperationAccess().getEndAssignment_8()); 
            // InternalMyDsl.g:3652:2: ( rule__LimitOperation__EndAssignment_8 )
            // InternalMyDsl.g:3652:3: rule__LimitOperation__EndAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__LimitOperation__EndAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getLimitOperationAccess().getEndAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LimitOperation__Group__8__Impl"


    // $ANTLR start "rule__LimitOperation__Group__9"
    // InternalMyDsl.g:3660:1: rule__LimitOperation__Group__9 : rule__LimitOperation__Group__9__Impl ;
    public final void rule__LimitOperation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3664:1: ( rule__LimitOperation__Group__9__Impl )
            // InternalMyDsl.g:3665:2: rule__LimitOperation__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LimitOperation__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LimitOperation__Group__9"


    // $ANTLR start "rule__LimitOperation__Group__9__Impl"
    // InternalMyDsl.g:3671:1: rule__LimitOperation__Group__9__Impl : ( ')' ) ;
    public final void rule__LimitOperation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3675:1: ( ( ')' ) )
            // InternalMyDsl.g:3676:1: ( ')' )
            {
            // InternalMyDsl.g:3676:1: ( ')' )
            // InternalMyDsl.g:3677:2: ')'
            {
             before(grammarAccess.getLimitOperationAccess().getRightParenthesisKeyword_9()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getLimitOperationAccess().getRightParenthesisKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LimitOperation__Group__9__Impl"


    // $ANTLR start "rule__ArgMaxOperation__Group__0"
    // InternalMyDsl.g:3687:1: rule__ArgMaxOperation__Group__0 : rule__ArgMaxOperation__Group__0__Impl rule__ArgMaxOperation__Group__1 ;
    public final void rule__ArgMaxOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3691:1: ( rule__ArgMaxOperation__Group__0__Impl rule__ArgMaxOperation__Group__1 )
            // InternalMyDsl.g:3692:2: rule__ArgMaxOperation__Group__0__Impl rule__ArgMaxOperation__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__ArgMaxOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArgMaxOperation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgMaxOperation__Group__0"


    // $ANTLR start "rule__ArgMaxOperation__Group__0__Impl"
    // InternalMyDsl.g:3699:1: rule__ArgMaxOperation__Group__0__Impl : ( '.selectMax()' ) ;
    public final void rule__ArgMaxOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3703:1: ( ( '.selectMax()' ) )
            // InternalMyDsl.g:3704:1: ( '.selectMax()' )
            {
            // InternalMyDsl.g:3704:1: ( '.selectMax()' )
            // InternalMyDsl.g:3705:2: '.selectMax()'
            {
             before(grammarAccess.getArgMaxOperationAccess().getSelectMaxKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getArgMaxOperationAccess().getSelectMaxKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgMaxOperation__Group__0__Impl"


    // $ANTLR start "rule__ArgMaxOperation__Group__1"
    // InternalMyDsl.g:3714:1: rule__ArgMaxOperation__Group__1 : rule__ArgMaxOperation__Group__1__Impl rule__ArgMaxOperation__Group__2 ;
    public final void rule__ArgMaxOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3718:1: ( rule__ArgMaxOperation__Group__1__Impl rule__ArgMaxOperation__Group__2 )
            // InternalMyDsl.g:3719:2: rule__ArgMaxOperation__Group__1__Impl rule__ArgMaxOperation__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ArgMaxOperation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArgMaxOperation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgMaxOperation__Group__1"


    // $ANTLR start "rule__ArgMaxOperation__Group__1__Impl"
    // InternalMyDsl.g:3726:1: rule__ArgMaxOperation__Group__1__Impl : ( '.onColumn(' ) ;
    public final void rule__ArgMaxOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3730:1: ( ( '.onColumn(' ) )
            // InternalMyDsl.g:3731:1: ( '.onColumn(' )
            {
            // InternalMyDsl.g:3731:1: ( '.onColumn(' )
            // InternalMyDsl.g:3732:2: '.onColumn('
            {
             before(grammarAccess.getArgMaxOperationAccess().getOnColumnKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getArgMaxOperationAccess().getOnColumnKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgMaxOperation__Group__1__Impl"


    // $ANTLR start "rule__ArgMaxOperation__Group__2"
    // InternalMyDsl.g:3741:1: rule__ArgMaxOperation__Group__2 : rule__ArgMaxOperation__Group__2__Impl rule__ArgMaxOperation__Group__3 ;
    public final void rule__ArgMaxOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3745:1: ( rule__ArgMaxOperation__Group__2__Impl rule__ArgMaxOperation__Group__3 )
            // InternalMyDsl.g:3746:2: rule__ArgMaxOperation__Group__2__Impl rule__ArgMaxOperation__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__ArgMaxOperation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArgMaxOperation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgMaxOperation__Group__2"


    // $ANTLR start "rule__ArgMaxOperation__Group__2__Impl"
    // InternalMyDsl.g:3753:1: rule__ArgMaxOperation__Group__2__Impl : ( ( rule__ArgMaxOperation__ColumnAssignment_2 ) ) ;
    public final void rule__ArgMaxOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3757:1: ( ( ( rule__ArgMaxOperation__ColumnAssignment_2 ) ) )
            // InternalMyDsl.g:3758:1: ( ( rule__ArgMaxOperation__ColumnAssignment_2 ) )
            {
            // InternalMyDsl.g:3758:1: ( ( rule__ArgMaxOperation__ColumnAssignment_2 ) )
            // InternalMyDsl.g:3759:2: ( rule__ArgMaxOperation__ColumnAssignment_2 )
            {
             before(grammarAccess.getArgMaxOperationAccess().getColumnAssignment_2()); 
            // InternalMyDsl.g:3760:2: ( rule__ArgMaxOperation__ColumnAssignment_2 )
            // InternalMyDsl.g:3760:3: rule__ArgMaxOperation__ColumnAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ArgMaxOperation__ColumnAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getArgMaxOperationAccess().getColumnAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgMaxOperation__Group__2__Impl"


    // $ANTLR start "rule__ArgMaxOperation__Group__3"
    // InternalMyDsl.g:3768:1: rule__ArgMaxOperation__Group__3 : rule__ArgMaxOperation__Group__3__Impl rule__ArgMaxOperation__Group__4 ;
    public final void rule__ArgMaxOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3772:1: ( rule__ArgMaxOperation__Group__3__Impl rule__ArgMaxOperation__Group__4 )
            // InternalMyDsl.g:3773:2: rule__ArgMaxOperation__Group__3__Impl rule__ArgMaxOperation__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__ArgMaxOperation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArgMaxOperation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgMaxOperation__Group__3"


    // $ANTLR start "rule__ArgMaxOperation__Group__3__Impl"
    // InternalMyDsl.g:3780:1: rule__ArgMaxOperation__Group__3__Impl : ( ')' ) ;
    public final void rule__ArgMaxOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3784:1: ( ( ')' ) )
            // InternalMyDsl.g:3785:1: ( ')' )
            {
            // InternalMyDsl.g:3785:1: ( ')' )
            // InternalMyDsl.g:3786:2: ')'
            {
             before(grammarAccess.getArgMaxOperationAccess().getRightParenthesisKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getArgMaxOperationAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgMaxOperation__Group__3__Impl"


    // $ANTLR start "rule__ArgMaxOperation__Group__4"
    // InternalMyDsl.g:3795:1: rule__ArgMaxOperation__Group__4 : rule__ArgMaxOperation__Group__4__Impl rule__ArgMaxOperation__Group__5 ;
    public final void rule__ArgMaxOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3799:1: ( rule__ArgMaxOperation__Group__4__Impl rule__ArgMaxOperation__Group__5 )
            // InternalMyDsl.g:3800:2: rule__ArgMaxOperation__Group__4__Impl rule__ArgMaxOperation__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__ArgMaxOperation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArgMaxOperation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgMaxOperation__Group__4"


    // $ANTLR start "rule__ArgMaxOperation__Group__4__Impl"
    // InternalMyDsl.g:3807:1: rule__ArgMaxOperation__Group__4__Impl : ( '.onTable(' ) ;
    public final void rule__ArgMaxOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3811:1: ( ( '.onTable(' ) )
            // InternalMyDsl.g:3812:1: ( '.onTable(' )
            {
            // InternalMyDsl.g:3812:1: ( '.onTable(' )
            // InternalMyDsl.g:3813:2: '.onTable('
            {
             before(grammarAccess.getArgMaxOperationAccess().getOnTableKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getArgMaxOperationAccess().getOnTableKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgMaxOperation__Group__4__Impl"


    // $ANTLR start "rule__ArgMaxOperation__Group__5"
    // InternalMyDsl.g:3822:1: rule__ArgMaxOperation__Group__5 : rule__ArgMaxOperation__Group__5__Impl rule__ArgMaxOperation__Group__6 ;
    public final void rule__ArgMaxOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3826:1: ( rule__ArgMaxOperation__Group__5__Impl rule__ArgMaxOperation__Group__6 )
            // InternalMyDsl.g:3827:2: rule__ArgMaxOperation__Group__5__Impl rule__ArgMaxOperation__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__ArgMaxOperation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArgMaxOperation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgMaxOperation__Group__5"


    // $ANTLR start "rule__ArgMaxOperation__Group__5__Impl"
    // InternalMyDsl.g:3834:1: rule__ArgMaxOperation__Group__5__Impl : ( ( rule__ArgMaxOperation__TableAssignment_5 ) ) ;
    public final void rule__ArgMaxOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3838:1: ( ( ( rule__ArgMaxOperation__TableAssignment_5 ) ) )
            // InternalMyDsl.g:3839:1: ( ( rule__ArgMaxOperation__TableAssignment_5 ) )
            {
            // InternalMyDsl.g:3839:1: ( ( rule__ArgMaxOperation__TableAssignment_5 ) )
            // InternalMyDsl.g:3840:2: ( rule__ArgMaxOperation__TableAssignment_5 )
            {
             before(grammarAccess.getArgMaxOperationAccess().getTableAssignment_5()); 
            // InternalMyDsl.g:3841:2: ( rule__ArgMaxOperation__TableAssignment_5 )
            // InternalMyDsl.g:3841:3: rule__ArgMaxOperation__TableAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ArgMaxOperation__TableAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getArgMaxOperationAccess().getTableAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgMaxOperation__Group__5__Impl"


    // $ANTLR start "rule__ArgMaxOperation__Group__6"
    // InternalMyDsl.g:3849:1: rule__ArgMaxOperation__Group__6 : rule__ArgMaxOperation__Group__6__Impl rule__ArgMaxOperation__Group__7 ;
    public final void rule__ArgMaxOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3853:1: ( rule__ArgMaxOperation__Group__6__Impl rule__ArgMaxOperation__Group__7 )
            // InternalMyDsl.g:3854:2: rule__ArgMaxOperation__Group__6__Impl rule__ArgMaxOperation__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__ArgMaxOperation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArgMaxOperation__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgMaxOperation__Group__6"


    // $ANTLR start "rule__ArgMaxOperation__Group__6__Impl"
    // InternalMyDsl.g:3861:1: rule__ArgMaxOperation__Group__6__Impl : ( ')' ) ;
    public final void rule__ArgMaxOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3865:1: ( ( ')' ) )
            // InternalMyDsl.g:3866:1: ( ')' )
            {
            // InternalMyDsl.g:3866:1: ( ')' )
            // InternalMyDsl.g:3867:2: ')'
            {
             before(grammarAccess.getArgMaxOperationAccess().getRightParenthesisKeyword_6()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getArgMaxOperationAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgMaxOperation__Group__6__Impl"


    // $ANTLR start "rule__ArgMaxOperation__Group__7"
    // InternalMyDsl.g:3876:1: rule__ArgMaxOperation__Group__7 : rule__ArgMaxOperation__Group__7__Impl rule__ArgMaxOperation__Group__8 ;
    public final void rule__ArgMaxOperation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3880:1: ( rule__ArgMaxOperation__Group__7__Impl rule__ArgMaxOperation__Group__8 )
            // InternalMyDsl.g:3881:2: rule__ArgMaxOperation__Group__7__Impl rule__ArgMaxOperation__Group__8
            {
            pushFollow(FOLLOW_5);
            rule__ArgMaxOperation__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArgMaxOperation__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgMaxOperation__Group__7"


    // $ANTLR start "rule__ArgMaxOperation__Group__7__Impl"
    // InternalMyDsl.g:3888:1: rule__ArgMaxOperation__Group__7__Impl : ( '.toTable(' ) ;
    public final void rule__ArgMaxOperation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3892:1: ( ( '.toTable(' ) )
            // InternalMyDsl.g:3893:1: ( '.toTable(' )
            {
            // InternalMyDsl.g:3893:1: ( '.toTable(' )
            // InternalMyDsl.g:3894:2: '.toTable('
            {
             before(grammarAccess.getArgMaxOperationAccess().getToTableKeyword_7()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getArgMaxOperationAccess().getToTableKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgMaxOperation__Group__7__Impl"


    // $ANTLR start "rule__ArgMaxOperation__Group__8"
    // InternalMyDsl.g:3903:1: rule__ArgMaxOperation__Group__8 : rule__ArgMaxOperation__Group__8__Impl rule__ArgMaxOperation__Group__9 ;
    public final void rule__ArgMaxOperation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3907:1: ( rule__ArgMaxOperation__Group__8__Impl rule__ArgMaxOperation__Group__9 )
            // InternalMyDsl.g:3908:2: rule__ArgMaxOperation__Group__8__Impl rule__ArgMaxOperation__Group__9
            {
            pushFollow(FOLLOW_6);
            rule__ArgMaxOperation__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArgMaxOperation__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgMaxOperation__Group__8"


    // $ANTLR start "rule__ArgMaxOperation__Group__8__Impl"
    // InternalMyDsl.g:3915:1: rule__ArgMaxOperation__Group__8__Impl : ( ( rule__ArgMaxOperation__TargetAssignment_8 ) ) ;
    public final void rule__ArgMaxOperation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3919:1: ( ( ( rule__ArgMaxOperation__TargetAssignment_8 ) ) )
            // InternalMyDsl.g:3920:1: ( ( rule__ArgMaxOperation__TargetAssignment_8 ) )
            {
            // InternalMyDsl.g:3920:1: ( ( rule__ArgMaxOperation__TargetAssignment_8 ) )
            // InternalMyDsl.g:3921:2: ( rule__ArgMaxOperation__TargetAssignment_8 )
            {
             before(grammarAccess.getArgMaxOperationAccess().getTargetAssignment_8()); 
            // InternalMyDsl.g:3922:2: ( rule__ArgMaxOperation__TargetAssignment_8 )
            // InternalMyDsl.g:3922:3: rule__ArgMaxOperation__TargetAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__ArgMaxOperation__TargetAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getArgMaxOperationAccess().getTargetAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgMaxOperation__Group__8__Impl"


    // $ANTLR start "rule__ArgMaxOperation__Group__9"
    // InternalMyDsl.g:3930:1: rule__ArgMaxOperation__Group__9 : rule__ArgMaxOperation__Group__9__Impl ;
    public final void rule__ArgMaxOperation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3934:1: ( rule__ArgMaxOperation__Group__9__Impl )
            // InternalMyDsl.g:3935:2: rule__ArgMaxOperation__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArgMaxOperation__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgMaxOperation__Group__9"


    // $ANTLR start "rule__ArgMaxOperation__Group__9__Impl"
    // InternalMyDsl.g:3941:1: rule__ArgMaxOperation__Group__9__Impl : ( ')' ) ;
    public final void rule__ArgMaxOperation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3945:1: ( ( ')' ) )
            // InternalMyDsl.g:3946:1: ( ')' )
            {
            // InternalMyDsl.g:3946:1: ( ')' )
            // InternalMyDsl.g:3947:2: ')'
            {
             before(grammarAccess.getArgMaxOperationAccess().getRightParenthesisKeyword_9()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getArgMaxOperationAccess().getRightParenthesisKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgMaxOperation__Group__9__Impl"


    // $ANTLR start "rule__ArgMinOperation__Group__0"
    // InternalMyDsl.g:3957:1: rule__ArgMinOperation__Group__0 : rule__ArgMinOperation__Group__0__Impl rule__ArgMinOperation__Group__1 ;
    public final void rule__ArgMinOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3961:1: ( rule__ArgMinOperation__Group__0__Impl rule__ArgMinOperation__Group__1 )
            // InternalMyDsl.g:3962:2: rule__ArgMinOperation__Group__0__Impl rule__ArgMinOperation__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__ArgMinOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArgMinOperation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgMinOperation__Group__0"


    // $ANTLR start "rule__ArgMinOperation__Group__0__Impl"
    // InternalMyDsl.g:3969:1: rule__ArgMinOperation__Group__0__Impl : ( '.selectMin()' ) ;
    public final void rule__ArgMinOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3973:1: ( ( '.selectMin()' ) )
            // InternalMyDsl.g:3974:1: ( '.selectMin()' )
            {
            // InternalMyDsl.g:3974:1: ( '.selectMin()' )
            // InternalMyDsl.g:3975:2: '.selectMin()'
            {
             before(grammarAccess.getArgMinOperationAccess().getSelectMinKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getArgMinOperationAccess().getSelectMinKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgMinOperation__Group__0__Impl"


    // $ANTLR start "rule__ArgMinOperation__Group__1"
    // InternalMyDsl.g:3984:1: rule__ArgMinOperation__Group__1 : rule__ArgMinOperation__Group__1__Impl rule__ArgMinOperation__Group__2 ;
    public final void rule__ArgMinOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3988:1: ( rule__ArgMinOperation__Group__1__Impl rule__ArgMinOperation__Group__2 )
            // InternalMyDsl.g:3989:2: rule__ArgMinOperation__Group__1__Impl rule__ArgMinOperation__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ArgMinOperation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArgMinOperation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgMinOperation__Group__1"


    // $ANTLR start "rule__ArgMinOperation__Group__1__Impl"
    // InternalMyDsl.g:3996:1: rule__ArgMinOperation__Group__1__Impl : ( '.onColumn(' ) ;
    public final void rule__ArgMinOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4000:1: ( ( '.onColumn(' ) )
            // InternalMyDsl.g:4001:1: ( '.onColumn(' )
            {
            // InternalMyDsl.g:4001:1: ( '.onColumn(' )
            // InternalMyDsl.g:4002:2: '.onColumn('
            {
             before(grammarAccess.getArgMinOperationAccess().getOnColumnKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getArgMinOperationAccess().getOnColumnKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgMinOperation__Group__1__Impl"


    // $ANTLR start "rule__ArgMinOperation__Group__2"
    // InternalMyDsl.g:4011:1: rule__ArgMinOperation__Group__2 : rule__ArgMinOperation__Group__2__Impl rule__ArgMinOperation__Group__3 ;
    public final void rule__ArgMinOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4015:1: ( rule__ArgMinOperation__Group__2__Impl rule__ArgMinOperation__Group__3 )
            // InternalMyDsl.g:4016:2: rule__ArgMinOperation__Group__2__Impl rule__ArgMinOperation__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__ArgMinOperation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArgMinOperation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgMinOperation__Group__2"


    // $ANTLR start "rule__ArgMinOperation__Group__2__Impl"
    // InternalMyDsl.g:4023:1: rule__ArgMinOperation__Group__2__Impl : ( ( rule__ArgMinOperation__ColumnAssignment_2 ) ) ;
    public final void rule__ArgMinOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4027:1: ( ( ( rule__ArgMinOperation__ColumnAssignment_2 ) ) )
            // InternalMyDsl.g:4028:1: ( ( rule__ArgMinOperation__ColumnAssignment_2 ) )
            {
            // InternalMyDsl.g:4028:1: ( ( rule__ArgMinOperation__ColumnAssignment_2 ) )
            // InternalMyDsl.g:4029:2: ( rule__ArgMinOperation__ColumnAssignment_2 )
            {
             before(grammarAccess.getArgMinOperationAccess().getColumnAssignment_2()); 
            // InternalMyDsl.g:4030:2: ( rule__ArgMinOperation__ColumnAssignment_2 )
            // InternalMyDsl.g:4030:3: rule__ArgMinOperation__ColumnAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ArgMinOperation__ColumnAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getArgMinOperationAccess().getColumnAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgMinOperation__Group__2__Impl"


    // $ANTLR start "rule__ArgMinOperation__Group__3"
    // InternalMyDsl.g:4038:1: rule__ArgMinOperation__Group__3 : rule__ArgMinOperation__Group__3__Impl rule__ArgMinOperation__Group__4 ;
    public final void rule__ArgMinOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4042:1: ( rule__ArgMinOperation__Group__3__Impl rule__ArgMinOperation__Group__4 )
            // InternalMyDsl.g:4043:2: rule__ArgMinOperation__Group__3__Impl rule__ArgMinOperation__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__ArgMinOperation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArgMinOperation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgMinOperation__Group__3"


    // $ANTLR start "rule__ArgMinOperation__Group__3__Impl"
    // InternalMyDsl.g:4050:1: rule__ArgMinOperation__Group__3__Impl : ( ')' ) ;
    public final void rule__ArgMinOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4054:1: ( ( ')' ) )
            // InternalMyDsl.g:4055:1: ( ')' )
            {
            // InternalMyDsl.g:4055:1: ( ')' )
            // InternalMyDsl.g:4056:2: ')'
            {
             before(grammarAccess.getArgMinOperationAccess().getRightParenthesisKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getArgMinOperationAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgMinOperation__Group__3__Impl"


    // $ANTLR start "rule__ArgMinOperation__Group__4"
    // InternalMyDsl.g:4065:1: rule__ArgMinOperation__Group__4 : rule__ArgMinOperation__Group__4__Impl rule__ArgMinOperation__Group__5 ;
    public final void rule__ArgMinOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4069:1: ( rule__ArgMinOperation__Group__4__Impl rule__ArgMinOperation__Group__5 )
            // InternalMyDsl.g:4070:2: rule__ArgMinOperation__Group__4__Impl rule__ArgMinOperation__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__ArgMinOperation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArgMinOperation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgMinOperation__Group__4"


    // $ANTLR start "rule__ArgMinOperation__Group__4__Impl"
    // InternalMyDsl.g:4077:1: rule__ArgMinOperation__Group__4__Impl : ( '.onTable(' ) ;
    public final void rule__ArgMinOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4081:1: ( ( '.onTable(' ) )
            // InternalMyDsl.g:4082:1: ( '.onTable(' )
            {
            // InternalMyDsl.g:4082:1: ( '.onTable(' )
            // InternalMyDsl.g:4083:2: '.onTable('
            {
             before(grammarAccess.getArgMinOperationAccess().getOnTableKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getArgMinOperationAccess().getOnTableKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgMinOperation__Group__4__Impl"


    // $ANTLR start "rule__ArgMinOperation__Group__5"
    // InternalMyDsl.g:4092:1: rule__ArgMinOperation__Group__5 : rule__ArgMinOperation__Group__5__Impl rule__ArgMinOperation__Group__6 ;
    public final void rule__ArgMinOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4096:1: ( rule__ArgMinOperation__Group__5__Impl rule__ArgMinOperation__Group__6 )
            // InternalMyDsl.g:4097:2: rule__ArgMinOperation__Group__5__Impl rule__ArgMinOperation__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__ArgMinOperation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArgMinOperation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgMinOperation__Group__5"


    // $ANTLR start "rule__ArgMinOperation__Group__5__Impl"
    // InternalMyDsl.g:4104:1: rule__ArgMinOperation__Group__5__Impl : ( ( rule__ArgMinOperation__TableAssignment_5 ) ) ;
    public final void rule__ArgMinOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4108:1: ( ( ( rule__ArgMinOperation__TableAssignment_5 ) ) )
            // InternalMyDsl.g:4109:1: ( ( rule__ArgMinOperation__TableAssignment_5 ) )
            {
            // InternalMyDsl.g:4109:1: ( ( rule__ArgMinOperation__TableAssignment_5 ) )
            // InternalMyDsl.g:4110:2: ( rule__ArgMinOperation__TableAssignment_5 )
            {
             before(grammarAccess.getArgMinOperationAccess().getTableAssignment_5()); 
            // InternalMyDsl.g:4111:2: ( rule__ArgMinOperation__TableAssignment_5 )
            // InternalMyDsl.g:4111:3: rule__ArgMinOperation__TableAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ArgMinOperation__TableAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getArgMinOperationAccess().getTableAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgMinOperation__Group__5__Impl"


    // $ANTLR start "rule__ArgMinOperation__Group__6"
    // InternalMyDsl.g:4119:1: rule__ArgMinOperation__Group__6 : rule__ArgMinOperation__Group__6__Impl rule__ArgMinOperation__Group__7 ;
    public final void rule__ArgMinOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4123:1: ( rule__ArgMinOperation__Group__6__Impl rule__ArgMinOperation__Group__7 )
            // InternalMyDsl.g:4124:2: rule__ArgMinOperation__Group__6__Impl rule__ArgMinOperation__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__ArgMinOperation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArgMinOperation__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgMinOperation__Group__6"


    // $ANTLR start "rule__ArgMinOperation__Group__6__Impl"
    // InternalMyDsl.g:4131:1: rule__ArgMinOperation__Group__6__Impl : ( ')' ) ;
    public final void rule__ArgMinOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4135:1: ( ( ')' ) )
            // InternalMyDsl.g:4136:1: ( ')' )
            {
            // InternalMyDsl.g:4136:1: ( ')' )
            // InternalMyDsl.g:4137:2: ')'
            {
             before(grammarAccess.getArgMinOperationAccess().getRightParenthesisKeyword_6()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getArgMinOperationAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgMinOperation__Group__6__Impl"


    // $ANTLR start "rule__ArgMinOperation__Group__7"
    // InternalMyDsl.g:4146:1: rule__ArgMinOperation__Group__7 : rule__ArgMinOperation__Group__7__Impl rule__ArgMinOperation__Group__8 ;
    public final void rule__ArgMinOperation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4150:1: ( rule__ArgMinOperation__Group__7__Impl rule__ArgMinOperation__Group__8 )
            // InternalMyDsl.g:4151:2: rule__ArgMinOperation__Group__7__Impl rule__ArgMinOperation__Group__8
            {
            pushFollow(FOLLOW_5);
            rule__ArgMinOperation__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArgMinOperation__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgMinOperation__Group__7"


    // $ANTLR start "rule__ArgMinOperation__Group__7__Impl"
    // InternalMyDsl.g:4158:1: rule__ArgMinOperation__Group__7__Impl : ( '.toTable(' ) ;
    public final void rule__ArgMinOperation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4162:1: ( ( '.toTable(' ) )
            // InternalMyDsl.g:4163:1: ( '.toTable(' )
            {
            // InternalMyDsl.g:4163:1: ( '.toTable(' )
            // InternalMyDsl.g:4164:2: '.toTable('
            {
             before(grammarAccess.getArgMinOperationAccess().getToTableKeyword_7()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getArgMinOperationAccess().getToTableKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgMinOperation__Group__7__Impl"


    // $ANTLR start "rule__ArgMinOperation__Group__8"
    // InternalMyDsl.g:4173:1: rule__ArgMinOperation__Group__8 : rule__ArgMinOperation__Group__8__Impl rule__ArgMinOperation__Group__9 ;
    public final void rule__ArgMinOperation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4177:1: ( rule__ArgMinOperation__Group__8__Impl rule__ArgMinOperation__Group__9 )
            // InternalMyDsl.g:4178:2: rule__ArgMinOperation__Group__8__Impl rule__ArgMinOperation__Group__9
            {
            pushFollow(FOLLOW_6);
            rule__ArgMinOperation__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArgMinOperation__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgMinOperation__Group__8"


    // $ANTLR start "rule__ArgMinOperation__Group__8__Impl"
    // InternalMyDsl.g:4185:1: rule__ArgMinOperation__Group__8__Impl : ( ( rule__ArgMinOperation__TargetAssignment_8 ) ) ;
    public final void rule__ArgMinOperation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4189:1: ( ( ( rule__ArgMinOperation__TargetAssignment_8 ) ) )
            // InternalMyDsl.g:4190:1: ( ( rule__ArgMinOperation__TargetAssignment_8 ) )
            {
            // InternalMyDsl.g:4190:1: ( ( rule__ArgMinOperation__TargetAssignment_8 ) )
            // InternalMyDsl.g:4191:2: ( rule__ArgMinOperation__TargetAssignment_8 )
            {
             before(grammarAccess.getArgMinOperationAccess().getTargetAssignment_8()); 
            // InternalMyDsl.g:4192:2: ( rule__ArgMinOperation__TargetAssignment_8 )
            // InternalMyDsl.g:4192:3: rule__ArgMinOperation__TargetAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__ArgMinOperation__TargetAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getArgMinOperationAccess().getTargetAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgMinOperation__Group__8__Impl"


    // $ANTLR start "rule__ArgMinOperation__Group__9"
    // InternalMyDsl.g:4200:1: rule__ArgMinOperation__Group__9 : rule__ArgMinOperation__Group__9__Impl ;
    public final void rule__ArgMinOperation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4204:1: ( rule__ArgMinOperation__Group__9__Impl )
            // InternalMyDsl.g:4205:2: rule__ArgMinOperation__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArgMinOperation__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgMinOperation__Group__9"


    // $ANTLR start "rule__ArgMinOperation__Group__9__Impl"
    // InternalMyDsl.g:4211:1: rule__ArgMinOperation__Group__9__Impl : ( ')' ) ;
    public final void rule__ArgMinOperation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4215:1: ( ( ')' ) )
            // InternalMyDsl.g:4216:1: ( ')' )
            {
            // InternalMyDsl.g:4216:1: ( ')' )
            // InternalMyDsl.g:4217:2: ')'
            {
             before(grammarAccess.getArgMinOperationAccess().getRightParenthesisKeyword_9()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getArgMinOperationAccess().getRightParenthesisKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgMinOperation__Group__9__Impl"


    // $ANTLR start "rule__SelectOperation__Group__0"
    // InternalMyDsl.g:4227:1: rule__SelectOperation__Group__0 : rule__SelectOperation__Group__0__Impl rule__SelectOperation__Group__1 ;
    public final void rule__SelectOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4231:1: ( rule__SelectOperation__Group__0__Impl rule__SelectOperation__Group__1 )
            // InternalMyDsl.g:4232:2: rule__SelectOperation__Group__0__Impl rule__SelectOperation__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__SelectOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectOperation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectOperation__Group__0"


    // $ANTLR start "rule__SelectOperation__Group__0__Impl"
    // InternalMyDsl.g:4239:1: rule__SelectOperation__Group__0__Impl : ( '.select()' ) ;
    public final void rule__SelectOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4243:1: ( ( '.select()' ) )
            // InternalMyDsl.g:4244:1: ( '.select()' )
            {
            // InternalMyDsl.g:4244:1: ( '.select()' )
            // InternalMyDsl.g:4245:2: '.select()'
            {
             before(grammarAccess.getSelectOperationAccess().getSelectKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getSelectOperationAccess().getSelectKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectOperation__Group__0__Impl"


    // $ANTLR start "rule__SelectOperation__Group__1"
    // InternalMyDsl.g:4254:1: rule__SelectOperation__Group__1 : rule__SelectOperation__Group__1__Impl rule__SelectOperation__Group__2 ;
    public final void rule__SelectOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4258:1: ( rule__SelectOperation__Group__1__Impl rule__SelectOperation__Group__2 )
            // InternalMyDsl.g:4259:2: rule__SelectOperation__Group__1__Impl rule__SelectOperation__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__SelectOperation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectOperation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectOperation__Group__1"


    // $ANTLR start "rule__SelectOperation__Group__1__Impl"
    // InternalMyDsl.g:4266:1: rule__SelectOperation__Group__1__Impl : ( '.columns(' ) ;
    public final void rule__SelectOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4270:1: ( ( '.columns(' ) )
            // InternalMyDsl.g:4271:1: ( '.columns(' )
            {
            // InternalMyDsl.g:4271:1: ( '.columns(' )
            // InternalMyDsl.g:4272:2: '.columns('
            {
             before(grammarAccess.getSelectOperationAccess().getColumnsKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getSelectOperationAccess().getColumnsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectOperation__Group__1__Impl"


    // $ANTLR start "rule__SelectOperation__Group__2"
    // InternalMyDsl.g:4281:1: rule__SelectOperation__Group__2 : rule__SelectOperation__Group__2__Impl rule__SelectOperation__Group__3 ;
    public final void rule__SelectOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4285:1: ( rule__SelectOperation__Group__2__Impl rule__SelectOperation__Group__3 )
            // InternalMyDsl.g:4286:2: rule__SelectOperation__Group__2__Impl rule__SelectOperation__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__SelectOperation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectOperation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectOperation__Group__2"


    // $ANTLR start "rule__SelectOperation__Group__2__Impl"
    // InternalMyDsl.g:4293:1: rule__SelectOperation__Group__2__Impl : ( ( rule__SelectOperation__ColumnsAssignment_2 ) ) ;
    public final void rule__SelectOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4297:1: ( ( ( rule__SelectOperation__ColumnsAssignment_2 ) ) )
            // InternalMyDsl.g:4298:1: ( ( rule__SelectOperation__ColumnsAssignment_2 ) )
            {
            // InternalMyDsl.g:4298:1: ( ( rule__SelectOperation__ColumnsAssignment_2 ) )
            // InternalMyDsl.g:4299:2: ( rule__SelectOperation__ColumnsAssignment_2 )
            {
             before(grammarAccess.getSelectOperationAccess().getColumnsAssignment_2()); 
            // InternalMyDsl.g:4300:2: ( rule__SelectOperation__ColumnsAssignment_2 )
            // InternalMyDsl.g:4300:3: rule__SelectOperation__ColumnsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SelectOperation__ColumnsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSelectOperationAccess().getColumnsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectOperation__Group__2__Impl"


    // $ANTLR start "rule__SelectOperation__Group__3"
    // InternalMyDsl.g:4308:1: rule__SelectOperation__Group__3 : rule__SelectOperation__Group__3__Impl rule__SelectOperation__Group__4 ;
    public final void rule__SelectOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4312:1: ( rule__SelectOperation__Group__3__Impl rule__SelectOperation__Group__4 )
            // InternalMyDsl.g:4313:2: rule__SelectOperation__Group__3__Impl rule__SelectOperation__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__SelectOperation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectOperation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectOperation__Group__3"


    // $ANTLR start "rule__SelectOperation__Group__3__Impl"
    // InternalMyDsl.g:4320:1: rule__SelectOperation__Group__3__Impl : ( ( rule__SelectOperation__Group_3__0 )* ) ;
    public final void rule__SelectOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4324:1: ( ( ( rule__SelectOperation__Group_3__0 )* ) )
            // InternalMyDsl.g:4325:1: ( ( rule__SelectOperation__Group_3__0 )* )
            {
            // InternalMyDsl.g:4325:1: ( ( rule__SelectOperation__Group_3__0 )* )
            // InternalMyDsl.g:4326:2: ( rule__SelectOperation__Group_3__0 )*
            {
             before(grammarAccess.getSelectOperationAccess().getGroup_3()); 
            // InternalMyDsl.g:4327:2: ( rule__SelectOperation__Group_3__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==17) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMyDsl.g:4327:3: rule__SelectOperation__Group_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__SelectOperation__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getSelectOperationAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectOperation__Group__3__Impl"


    // $ANTLR start "rule__SelectOperation__Group__4"
    // InternalMyDsl.g:4335:1: rule__SelectOperation__Group__4 : rule__SelectOperation__Group__4__Impl rule__SelectOperation__Group__5 ;
    public final void rule__SelectOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4339:1: ( rule__SelectOperation__Group__4__Impl rule__SelectOperation__Group__5 )
            // InternalMyDsl.g:4340:2: rule__SelectOperation__Group__4__Impl rule__SelectOperation__Group__5
            {
            pushFollow(FOLLOW_26);
            rule__SelectOperation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectOperation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectOperation__Group__4"


    // $ANTLR start "rule__SelectOperation__Group__4__Impl"
    // InternalMyDsl.g:4347:1: rule__SelectOperation__Group__4__Impl : ( ')' ) ;
    public final void rule__SelectOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4351:1: ( ( ')' ) )
            // InternalMyDsl.g:4352:1: ( ')' )
            {
            // InternalMyDsl.g:4352:1: ( ')' )
            // InternalMyDsl.g:4353:2: ')'
            {
             before(grammarAccess.getSelectOperationAccess().getRightParenthesisKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSelectOperationAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectOperation__Group__4__Impl"


    // $ANTLR start "rule__SelectOperation__Group__5"
    // InternalMyDsl.g:4362:1: rule__SelectOperation__Group__5 : rule__SelectOperation__Group__5__Impl rule__SelectOperation__Group__6 ;
    public final void rule__SelectOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4366:1: ( rule__SelectOperation__Group__5__Impl rule__SelectOperation__Group__6 )
            // InternalMyDsl.g:4367:2: rule__SelectOperation__Group__5__Impl rule__SelectOperation__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__SelectOperation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectOperation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectOperation__Group__5"


    // $ANTLR start "rule__SelectOperation__Group__5__Impl"
    // InternalMyDsl.g:4374:1: rule__SelectOperation__Group__5__Impl : ( '.fromTable(' ) ;
    public final void rule__SelectOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4378:1: ( ( '.fromTable(' ) )
            // InternalMyDsl.g:4379:1: ( '.fromTable(' )
            {
            // InternalMyDsl.g:4379:1: ( '.fromTable(' )
            // InternalMyDsl.g:4380:2: '.fromTable('
            {
             before(grammarAccess.getSelectOperationAccess().getFromTableKeyword_5()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getSelectOperationAccess().getFromTableKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectOperation__Group__5__Impl"


    // $ANTLR start "rule__SelectOperation__Group__6"
    // InternalMyDsl.g:4389:1: rule__SelectOperation__Group__6 : rule__SelectOperation__Group__6__Impl rule__SelectOperation__Group__7 ;
    public final void rule__SelectOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4393:1: ( rule__SelectOperation__Group__6__Impl rule__SelectOperation__Group__7 )
            // InternalMyDsl.g:4394:2: rule__SelectOperation__Group__6__Impl rule__SelectOperation__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__SelectOperation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectOperation__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectOperation__Group__6"


    // $ANTLR start "rule__SelectOperation__Group__6__Impl"
    // InternalMyDsl.g:4401:1: rule__SelectOperation__Group__6__Impl : ( ( rule__SelectOperation__TableAssignment_6 ) ) ;
    public final void rule__SelectOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4405:1: ( ( ( rule__SelectOperation__TableAssignment_6 ) ) )
            // InternalMyDsl.g:4406:1: ( ( rule__SelectOperation__TableAssignment_6 ) )
            {
            // InternalMyDsl.g:4406:1: ( ( rule__SelectOperation__TableAssignment_6 ) )
            // InternalMyDsl.g:4407:2: ( rule__SelectOperation__TableAssignment_6 )
            {
             before(grammarAccess.getSelectOperationAccess().getTableAssignment_6()); 
            // InternalMyDsl.g:4408:2: ( rule__SelectOperation__TableAssignment_6 )
            // InternalMyDsl.g:4408:3: rule__SelectOperation__TableAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__SelectOperation__TableAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getSelectOperationAccess().getTableAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectOperation__Group__6__Impl"


    // $ANTLR start "rule__SelectOperation__Group__7"
    // InternalMyDsl.g:4416:1: rule__SelectOperation__Group__7 : rule__SelectOperation__Group__7__Impl rule__SelectOperation__Group__8 ;
    public final void rule__SelectOperation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4420:1: ( rule__SelectOperation__Group__7__Impl rule__SelectOperation__Group__8 )
            // InternalMyDsl.g:4421:2: rule__SelectOperation__Group__7__Impl rule__SelectOperation__Group__8
            {
            pushFollow(FOLLOW_12);
            rule__SelectOperation__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectOperation__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectOperation__Group__7"


    // $ANTLR start "rule__SelectOperation__Group__7__Impl"
    // InternalMyDsl.g:4428:1: rule__SelectOperation__Group__7__Impl : ( ')' ) ;
    public final void rule__SelectOperation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4432:1: ( ( ')' ) )
            // InternalMyDsl.g:4433:1: ( ')' )
            {
            // InternalMyDsl.g:4433:1: ( ')' )
            // InternalMyDsl.g:4434:2: ')'
            {
             before(grammarAccess.getSelectOperationAccess().getRightParenthesisKeyword_7()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSelectOperationAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectOperation__Group__7__Impl"


    // $ANTLR start "rule__SelectOperation__Group__8"
    // InternalMyDsl.g:4443:1: rule__SelectOperation__Group__8 : rule__SelectOperation__Group__8__Impl rule__SelectOperation__Group__9 ;
    public final void rule__SelectOperation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4447:1: ( rule__SelectOperation__Group__8__Impl rule__SelectOperation__Group__9 )
            // InternalMyDsl.g:4448:2: rule__SelectOperation__Group__8__Impl rule__SelectOperation__Group__9
            {
            pushFollow(FOLLOW_5);
            rule__SelectOperation__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectOperation__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectOperation__Group__8"


    // $ANTLR start "rule__SelectOperation__Group__8__Impl"
    // InternalMyDsl.g:4455:1: rule__SelectOperation__Group__8__Impl : ( '.toTable(' ) ;
    public final void rule__SelectOperation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4459:1: ( ( '.toTable(' ) )
            // InternalMyDsl.g:4460:1: ( '.toTable(' )
            {
            // InternalMyDsl.g:4460:1: ( '.toTable(' )
            // InternalMyDsl.g:4461:2: '.toTable('
            {
             before(grammarAccess.getSelectOperationAccess().getToTableKeyword_8()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSelectOperationAccess().getToTableKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectOperation__Group__8__Impl"


    // $ANTLR start "rule__SelectOperation__Group__9"
    // InternalMyDsl.g:4470:1: rule__SelectOperation__Group__9 : rule__SelectOperation__Group__9__Impl rule__SelectOperation__Group__10 ;
    public final void rule__SelectOperation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4474:1: ( rule__SelectOperation__Group__9__Impl rule__SelectOperation__Group__10 )
            // InternalMyDsl.g:4475:2: rule__SelectOperation__Group__9__Impl rule__SelectOperation__Group__10
            {
            pushFollow(FOLLOW_6);
            rule__SelectOperation__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectOperation__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectOperation__Group__9"


    // $ANTLR start "rule__SelectOperation__Group__9__Impl"
    // InternalMyDsl.g:4482:1: rule__SelectOperation__Group__9__Impl : ( ( rule__SelectOperation__TargetAssignment_9 ) ) ;
    public final void rule__SelectOperation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4486:1: ( ( ( rule__SelectOperation__TargetAssignment_9 ) ) )
            // InternalMyDsl.g:4487:1: ( ( rule__SelectOperation__TargetAssignment_9 ) )
            {
            // InternalMyDsl.g:4487:1: ( ( rule__SelectOperation__TargetAssignment_9 ) )
            // InternalMyDsl.g:4488:2: ( rule__SelectOperation__TargetAssignment_9 )
            {
             before(grammarAccess.getSelectOperationAccess().getTargetAssignment_9()); 
            // InternalMyDsl.g:4489:2: ( rule__SelectOperation__TargetAssignment_9 )
            // InternalMyDsl.g:4489:3: rule__SelectOperation__TargetAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__SelectOperation__TargetAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getSelectOperationAccess().getTargetAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectOperation__Group__9__Impl"


    // $ANTLR start "rule__SelectOperation__Group__10"
    // InternalMyDsl.g:4497:1: rule__SelectOperation__Group__10 : rule__SelectOperation__Group__10__Impl ;
    public final void rule__SelectOperation__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4501:1: ( rule__SelectOperation__Group__10__Impl )
            // InternalMyDsl.g:4502:2: rule__SelectOperation__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectOperation__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectOperation__Group__10"


    // $ANTLR start "rule__SelectOperation__Group__10__Impl"
    // InternalMyDsl.g:4508:1: rule__SelectOperation__Group__10__Impl : ( ')' ) ;
    public final void rule__SelectOperation__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4512:1: ( ( ')' ) )
            // InternalMyDsl.g:4513:1: ( ')' )
            {
            // InternalMyDsl.g:4513:1: ( ')' )
            // InternalMyDsl.g:4514:2: ')'
            {
             before(grammarAccess.getSelectOperationAccess().getRightParenthesisKeyword_10()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSelectOperationAccess().getRightParenthesisKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectOperation__Group__10__Impl"


    // $ANTLR start "rule__SelectOperation__Group_3__0"
    // InternalMyDsl.g:4524:1: rule__SelectOperation__Group_3__0 : rule__SelectOperation__Group_3__0__Impl rule__SelectOperation__Group_3__1 ;
    public final void rule__SelectOperation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4528:1: ( rule__SelectOperation__Group_3__0__Impl rule__SelectOperation__Group_3__1 )
            // InternalMyDsl.g:4529:2: rule__SelectOperation__Group_3__0__Impl rule__SelectOperation__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__SelectOperation__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectOperation__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectOperation__Group_3__0"


    // $ANTLR start "rule__SelectOperation__Group_3__0__Impl"
    // InternalMyDsl.g:4536:1: rule__SelectOperation__Group_3__0__Impl : ( ',' ) ;
    public final void rule__SelectOperation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4540:1: ( ( ',' ) )
            // InternalMyDsl.g:4541:1: ( ',' )
            {
            // InternalMyDsl.g:4541:1: ( ',' )
            // InternalMyDsl.g:4542:2: ','
            {
             before(grammarAccess.getSelectOperationAccess().getCommaKeyword_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSelectOperationAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectOperation__Group_3__0__Impl"


    // $ANTLR start "rule__SelectOperation__Group_3__1"
    // InternalMyDsl.g:4551:1: rule__SelectOperation__Group_3__1 : rule__SelectOperation__Group_3__1__Impl ;
    public final void rule__SelectOperation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4555:1: ( rule__SelectOperation__Group_3__1__Impl )
            // InternalMyDsl.g:4556:2: rule__SelectOperation__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectOperation__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectOperation__Group_3__1"


    // $ANTLR start "rule__SelectOperation__Group_3__1__Impl"
    // InternalMyDsl.g:4562:1: rule__SelectOperation__Group_3__1__Impl : ( ( rule__SelectOperation__ColumnsAssignment_3_1 ) ) ;
    public final void rule__SelectOperation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4566:1: ( ( ( rule__SelectOperation__ColumnsAssignment_3_1 ) ) )
            // InternalMyDsl.g:4567:1: ( ( rule__SelectOperation__ColumnsAssignment_3_1 ) )
            {
            // InternalMyDsl.g:4567:1: ( ( rule__SelectOperation__ColumnsAssignment_3_1 ) )
            // InternalMyDsl.g:4568:2: ( rule__SelectOperation__ColumnsAssignment_3_1 )
            {
             before(grammarAccess.getSelectOperationAccess().getColumnsAssignment_3_1()); 
            // InternalMyDsl.g:4569:2: ( rule__SelectOperation__ColumnsAssignment_3_1 )
            // InternalMyDsl.g:4569:3: rule__SelectOperation__ColumnsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__SelectOperation__ColumnsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectOperationAccess().getColumnsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectOperation__Group_3__1__Impl"


    // $ANTLR start "rule__DropOperation__Group__0"
    // InternalMyDsl.g:4578:1: rule__DropOperation__Group__0 : rule__DropOperation__Group__0__Impl rule__DropOperation__Group__1 ;
    public final void rule__DropOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4582:1: ( rule__DropOperation__Group__0__Impl rule__DropOperation__Group__1 )
            // InternalMyDsl.g:4583:2: rule__DropOperation__Group__0__Impl rule__DropOperation__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__DropOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DropOperation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DropOperation__Group__0"


    // $ANTLR start "rule__DropOperation__Group__0__Impl"
    // InternalMyDsl.g:4590:1: rule__DropOperation__Group__0__Impl : ( '.dropTable(' ) ;
    public final void rule__DropOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4594:1: ( ( '.dropTable(' ) )
            // InternalMyDsl.g:4595:1: ( '.dropTable(' )
            {
            // InternalMyDsl.g:4595:1: ( '.dropTable(' )
            // InternalMyDsl.g:4596:2: '.dropTable('
            {
             before(grammarAccess.getDropOperationAccess().getDropTableKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getDropOperationAccess().getDropTableKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DropOperation__Group__0__Impl"


    // $ANTLR start "rule__DropOperation__Group__1"
    // InternalMyDsl.g:4605:1: rule__DropOperation__Group__1 : rule__DropOperation__Group__1__Impl rule__DropOperation__Group__2 ;
    public final void rule__DropOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4609:1: ( rule__DropOperation__Group__1__Impl rule__DropOperation__Group__2 )
            // InternalMyDsl.g:4610:2: rule__DropOperation__Group__1__Impl rule__DropOperation__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__DropOperation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DropOperation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DropOperation__Group__1"


    // $ANTLR start "rule__DropOperation__Group__1__Impl"
    // InternalMyDsl.g:4617:1: rule__DropOperation__Group__1__Impl : ( ( rule__DropOperation__TableAssignment_1 ) ) ;
    public final void rule__DropOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4621:1: ( ( ( rule__DropOperation__TableAssignment_1 ) ) )
            // InternalMyDsl.g:4622:1: ( ( rule__DropOperation__TableAssignment_1 ) )
            {
            // InternalMyDsl.g:4622:1: ( ( rule__DropOperation__TableAssignment_1 ) )
            // InternalMyDsl.g:4623:2: ( rule__DropOperation__TableAssignment_1 )
            {
             before(grammarAccess.getDropOperationAccess().getTableAssignment_1()); 
            // InternalMyDsl.g:4624:2: ( rule__DropOperation__TableAssignment_1 )
            // InternalMyDsl.g:4624:3: rule__DropOperation__TableAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DropOperation__TableAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDropOperationAccess().getTableAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DropOperation__Group__1__Impl"


    // $ANTLR start "rule__DropOperation__Group__2"
    // InternalMyDsl.g:4632:1: rule__DropOperation__Group__2 : rule__DropOperation__Group__2__Impl ;
    public final void rule__DropOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4636:1: ( rule__DropOperation__Group__2__Impl )
            // InternalMyDsl.g:4637:2: rule__DropOperation__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DropOperation__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DropOperation__Group__2"


    // $ANTLR start "rule__DropOperation__Group__2__Impl"
    // InternalMyDsl.g:4643:1: rule__DropOperation__Group__2__Impl : ( ')' ) ;
    public final void rule__DropOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4647:1: ( ( ')' ) )
            // InternalMyDsl.g:4648:1: ( ')' )
            {
            // InternalMyDsl.g:4648:1: ( ')' )
            // InternalMyDsl.g:4649:2: ')'
            {
             before(grammarAccess.getDropOperationAccess().getRightParenthesisKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getDropOperationAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DropOperation__Group__2__Impl"


    // $ANTLR start "rule__ProcessFoldersOperation__Group__0"
    // InternalMyDsl.g:4659:1: rule__ProcessFoldersOperation__Group__0 : rule__ProcessFoldersOperation__Group__0__Impl rule__ProcessFoldersOperation__Group__1 ;
    public final void rule__ProcessFoldersOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4663:1: ( rule__ProcessFoldersOperation__Group__0__Impl rule__ProcessFoldersOperation__Group__1 )
            // InternalMyDsl.g:4664:2: rule__ProcessFoldersOperation__Group__0__Impl rule__ProcessFoldersOperation__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__ProcessFoldersOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProcessFoldersOperation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessFoldersOperation__Group__0"


    // $ANTLR start "rule__ProcessFoldersOperation__Group__0__Impl"
    // InternalMyDsl.g:4671:1: rule__ProcessFoldersOperation__Group__0__Impl : ( '.processFolders(' ) ;
    public final void rule__ProcessFoldersOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4675:1: ( ( '.processFolders(' ) )
            // InternalMyDsl.g:4676:1: ( '.processFolders(' )
            {
            // InternalMyDsl.g:4676:1: ( '.processFolders(' )
            // InternalMyDsl.g:4677:2: '.processFolders('
            {
             before(grammarAccess.getProcessFoldersOperationAccess().getProcessFoldersKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getProcessFoldersOperationAccess().getProcessFoldersKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessFoldersOperation__Group__0__Impl"


    // $ANTLR start "rule__ProcessFoldersOperation__Group__1"
    // InternalMyDsl.g:4686:1: rule__ProcessFoldersOperation__Group__1 : rule__ProcessFoldersOperation__Group__1__Impl rule__ProcessFoldersOperation__Group__2 ;
    public final void rule__ProcessFoldersOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4690:1: ( rule__ProcessFoldersOperation__Group__1__Impl rule__ProcessFoldersOperation__Group__2 )
            // InternalMyDsl.g:4691:2: rule__ProcessFoldersOperation__Group__1__Impl rule__ProcessFoldersOperation__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__ProcessFoldersOperation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProcessFoldersOperation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessFoldersOperation__Group__1"


    // $ANTLR start "rule__ProcessFoldersOperation__Group__1__Impl"
    // InternalMyDsl.g:4698:1: rule__ProcessFoldersOperation__Group__1__Impl : ( ( rule__ProcessFoldersOperation__FoldersAssignment_1 ) ) ;
    public final void rule__ProcessFoldersOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4702:1: ( ( ( rule__ProcessFoldersOperation__FoldersAssignment_1 ) ) )
            // InternalMyDsl.g:4703:1: ( ( rule__ProcessFoldersOperation__FoldersAssignment_1 ) )
            {
            // InternalMyDsl.g:4703:1: ( ( rule__ProcessFoldersOperation__FoldersAssignment_1 ) )
            // InternalMyDsl.g:4704:2: ( rule__ProcessFoldersOperation__FoldersAssignment_1 )
            {
             before(grammarAccess.getProcessFoldersOperationAccess().getFoldersAssignment_1()); 
            // InternalMyDsl.g:4705:2: ( rule__ProcessFoldersOperation__FoldersAssignment_1 )
            // InternalMyDsl.g:4705:3: rule__ProcessFoldersOperation__FoldersAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ProcessFoldersOperation__FoldersAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProcessFoldersOperationAccess().getFoldersAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessFoldersOperation__Group__1__Impl"


    // $ANTLR start "rule__ProcessFoldersOperation__Group__2"
    // InternalMyDsl.g:4713:1: rule__ProcessFoldersOperation__Group__2 : rule__ProcessFoldersOperation__Group__2__Impl rule__ProcessFoldersOperation__Group__3 ;
    public final void rule__ProcessFoldersOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4717:1: ( rule__ProcessFoldersOperation__Group__2__Impl rule__ProcessFoldersOperation__Group__3 )
            // InternalMyDsl.g:4718:2: rule__ProcessFoldersOperation__Group__2__Impl rule__ProcessFoldersOperation__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__ProcessFoldersOperation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProcessFoldersOperation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessFoldersOperation__Group__2"


    // $ANTLR start "rule__ProcessFoldersOperation__Group__2__Impl"
    // InternalMyDsl.g:4725:1: rule__ProcessFoldersOperation__Group__2__Impl : ( ( rule__ProcessFoldersOperation__Group_2__0 )* ) ;
    public final void rule__ProcessFoldersOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4729:1: ( ( ( rule__ProcessFoldersOperation__Group_2__0 )* ) )
            // InternalMyDsl.g:4730:1: ( ( rule__ProcessFoldersOperation__Group_2__0 )* )
            {
            // InternalMyDsl.g:4730:1: ( ( rule__ProcessFoldersOperation__Group_2__0 )* )
            // InternalMyDsl.g:4731:2: ( rule__ProcessFoldersOperation__Group_2__0 )*
            {
             before(grammarAccess.getProcessFoldersOperationAccess().getGroup_2()); 
            // InternalMyDsl.g:4732:2: ( rule__ProcessFoldersOperation__Group_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==17) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMyDsl.g:4732:3: rule__ProcessFoldersOperation__Group_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ProcessFoldersOperation__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getProcessFoldersOperationAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessFoldersOperation__Group__2__Impl"


    // $ANTLR start "rule__ProcessFoldersOperation__Group__3"
    // InternalMyDsl.g:4740:1: rule__ProcessFoldersOperation__Group__3 : rule__ProcessFoldersOperation__Group__3__Impl rule__ProcessFoldersOperation__Group__4 ;
    public final void rule__ProcessFoldersOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4744:1: ( rule__ProcessFoldersOperation__Group__3__Impl rule__ProcessFoldersOperation__Group__4 )
            // InternalMyDsl.g:4745:2: rule__ProcessFoldersOperation__Group__3__Impl rule__ProcessFoldersOperation__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__ProcessFoldersOperation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProcessFoldersOperation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessFoldersOperation__Group__3"


    // $ANTLR start "rule__ProcessFoldersOperation__Group__3__Impl"
    // InternalMyDsl.g:4752:1: rule__ProcessFoldersOperation__Group__3__Impl : ( ')' ) ;
    public final void rule__ProcessFoldersOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4756:1: ( ( ')' ) )
            // InternalMyDsl.g:4757:1: ( ')' )
            {
            // InternalMyDsl.g:4757:1: ( ')' )
            // InternalMyDsl.g:4758:2: ')'
            {
             before(grammarAccess.getProcessFoldersOperationAccess().getRightParenthesisKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getProcessFoldersOperationAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessFoldersOperation__Group__3__Impl"


    // $ANTLR start "rule__ProcessFoldersOperation__Group__4"
    // InternalMyDsl.g:4767:1: rule__ProcessFoldersOperation__Group__4 : rule__ProcessFoldersOperation__Group__4__Impl rule__ProcessFoldersOperation__Group__5 ;
    public final void rule__ProcessFoldersOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4771:1: ( rule__ProcessFoldersOperation__Group__4__Impl rule__ProcessFoldersOperation__Group__5 )
            // InternalMyDsl.g:4772:2: rule__ProcessFoldersOperation__Group__4__Impl rule__ProcessFoldersOperation__Group__5
            {
            pushFollow(FOLLOW_28);
            rule__ProcessFoldersOperation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProcessFoldersOperation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessFoldersOperation__Group__4"


    // $ANTLR start "rule__ProcessFoldersOperation__Group__4__Impl"
    // InternalMyDsl.g:4779:1: rule__ProcessFoldersOperation__Group__4__Impl : ( '.with' ) ;
    public final void rule__ProcessFoldersOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4783:1: ( ( '.with' ) )
            // InternalMyDsl.g:4784:1: ( '.with' )
            {
            // InternalMyDsl.g:4784:1: ( '.with' )
            // InternalMyDsl.g:4785:2: '.with'
            {
             before(grammarAccess.getProcessFoldersOperationAccess().getWithKeyword_4()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getProcessFoldersOperationAccess().getWithKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessFoldersOperation__Group__4__Impl"


    // $ANTLR start "rule__ProcessFoldersOperation__Group__5"
    // InternalMyDsl.g:4794:1: rule__ProcessFoldersOperation__Group__5 : rule__ProcessFoldersOperation__Group__5__Impl rule__ProcessFoldersOperation__Group__6 ;
    public final void rule__ProcessFoldersOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4798:1: ( rule__ProcessFoldersOperation__Group__5__Impl rule__ProcessFoldersOperation__Group__6 )
            // InternalMyDsl.g:4799:2: rule__ProcessFoldersOperation__Group__5__Impl rule__ProcessFoldersOperation__Group__6
            {
            pushFollow(FOLLOW_29);
            rule__ProcessFoldersOperation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProcessFoldersOperation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessFoldersOperation__Group__5"


    // $ANTLR start "rule__ProcessFoldersOperation__Group__5__Impl"
    // InternalMyDsl.g:4806:1: rule__ProcessFoldersOperation__Group__5__Impl : ( '{' ) ;
    public final void rule__ProcessFoldersOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4810:1: ( ( '{' ) )
            // InternalMyDsl.g:4811:1: ( '{' )
            {
            // InternalMyDsl.g:4811:1: ( '{' )
            // InternalMyDsl.g:4812:2: '{'
            {
             before(grammarAccess.getProcessFoldersOperationAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getProcessFoldersOperationAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessFoldersOperation__Group__5__Impl"


    // $ANTLR start "rule__ProcessFoldersOperation__Group__6"
    // InternalMyDsl.g:4821:1: rule__ProcessFoldersOperation__Group__6 : rule__ProcessFoldersOperation__Group__6__Impl rule__ProcessFoldersOperation__Group__7 ;
    public final void rule__ProcessFoldersOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4825:1: ( rule__ProcessFoldersOperation__Group__6__Impl rule__ProcessFoldersOperation__Group__7 )
            // InternalMyDsl.g:4826:2: rule__ProcessFoldersOperation__Group__6__Impl rule__ProcessFoldersOperation__Group__7
            {
            pushFollow(FOLLOW_30);
            rule__ProcessFoldersOperation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProcessFoldersOperation__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessFoldersOperation__Group__6"


    // $ANTLR start "rule__ProcessFoldersOperation__Group__6__Impl"
    // InternalMyDsl.g:4833:1: rule__ProcessFoldersOperation__Group__6__Impl : ( ( ( rule__ProcessFoldersOperation__FolderOperationsAssignment_6 ) ) ( ( rule__ProcessFoldersOperation__FolderOperationsAssignment_6 )* ) ) ;
    public final void rule__ProcessFoldersOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4837:1: ( ( ( ( rule__ProcessFoldersOperation__FolderOperationsAssignment_6 ) ) ( ( rule__ProcessFoldersOperation__FolderOperationsAssignment_6 )* ) ) )
            // InternalMyDsl.g:4838:1: ( ( ( rule__ProcessFoldersOperation__FolderOperationsAssignment_6 ) ) ( ( rule__ProcessFoldersOperation__FolderOperationsAssignment_6 )* ) )
            {
            // InternalMyDsl.g:4838:1: ( ( ( rule__ProcessFoldersOperation__FolderOperationsAssignment_6 ) ) ( ( rule__ProcessFoldersOperation__FolderOperationsAssignment_6 )* ) )
            // InternalMyDsl.g:4839:2: ( ( rule__ProcessFoldersOperation__FolderOperationsAssignment_6 ) ) ( ( rule__ProcessFoldersOperation__FolderOperationsAssignment_6 )* )
            {
            // InternalMyDsl.g:4839:2: ( ( rule__ProcessFoldersOperation__FolderOperationsAssignment_6 ) )
            // InternalMyDsl.g:4840:3: ( rule__ProcessFoldersOperation__FolderOperationsAssignment_6 )
            {
             before(grammarAccess.getProcessFoldersOperationAccess().getFolderOperationsAssignment_6()); 
            // InternalMyDsl.g:4841:3: ( rule__ProcessFoldersOperation__FolderOperationsAssignment_6 )
            // InternalMyDsl.g:4841:4: rule__ProcessFoldersOperation__FolderOperationsAssignment_6
            {
            pushFollow(FOLLOW_3);
            rule__ProcessFoldersOperation__FolderOperationsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getProcessFoldersOperationAccess().getFolderOperationsAssignment_6()); 

            }

            // InternalMyDsl.g:4844:2: ( ( rule__ProcessFoldersOperation__FolderOperationsAssignment_6 )* )
            // InternalMyDsl.g:4845:3: ( rule__ProcessFoldersOperation__FolderOperationsAssignment_6 )*
            {
             before(grammarAccess.getProcessFoldersOperationAccess().getFolderOperationsAssignment_6()); 
            // InternalMyDsl.g:4846:3: ( rule__ProcessFoldersOperation__FolderOperationsAssignment_6 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=11 && LA18_0<=12)||(LA18_0>=19 && LA18_0<=21)||LA18_0==24||LA18_0==30||(LA18_0>=34 && LA18_0<=36)||(LA18_0>=38 && LA18_0<=40)||(LA18_0>=43 && LA18_0<=44)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMyDsl.g:4846:4: rule__ProcessFoldersOperation__FolderOperationsAssignment_6
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__ProcessFoldersOperation__FolderOperationsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getProcessFoldersOperationAccess().getFolderOperationsAssignment_6()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessFoldersOperation__Group__6__Impl"


    // $ANTLR start "rule__ProcessFoldersOperation__Group__7"
    // InternalMyDsl.g:4855:1: rule__ProcessFoldersOperation__Group__7 : rule__ProcessFoldersOperation__Group__7__Impl ;
    public final void rule__ProcessFoldersOperation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4859:1: ( rule__ProcessFoldersOperation__Group__7__Impl )
            // InternalMyDsl.g:4860:2: rule__ProcessFoldersOperation__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProcessFoldersOperation__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessFoldersOperation__Group__7"


    // $ANTLR start "rule__ProcessFoldersOperation__Group__7__Impl"
    // InternalMyDsl.g:4866:1: rule__ProcessFoldersOperation__Group__7__Impl : ( '}' ) ;
    public final void rule__ProcessFoldersOperation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4870:1: ( ( '}' ) )
            // InternalMyDsl.g:4871:1: ( '}' )
            {
            // InternalMyDsl.g:4871:1: ( '}' )
            // InternalMyDsl.g:4872:2: '}'
            {
             before(grammarAccess.getProcessFoldersOperationAccess().getRightCurlyBracketKeyword_7()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getProcessFoldersOperationAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessFoldersOperation__Group__7__Impl"


    // $ANTLR start "rule__ProcessFoldersOperation__Group_2__0"
    // InternalMyDsl.g:4882:1: rule__ProcessFoldersOperation__Group_2__0 : rule__ProcessFoldersOperation__Group_2__0__Impl rule__ProcessFoldersOperation__Group_2__1 ;
    public final void rule__ProcessFoldersOperation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4886:1: ( rule__ProcessFoldersOperation__Group_2__0__Impl rule__ProcessFoldersOperation__Group_2__1 )
            // InternalMyDsl.g:4887:2: rule__ProcessFoldersOperation__Group_2__0__Impl rule__ProcessFoldersOperation__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__ProcessFoldersOperation__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProcessFoldersOperation__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessFoldersOperation__Group_2__0"


    // $ANTLR start "rule__ProcessFoldersOperation__Group_2__0__Impl"
    // InternalMyDsl.g:4894:1: rule__ProcessFoldersOperation__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ProcessFoldersOperation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4898:1: ( ( ',' ) )
            // InternalMyDsl.g:4899:1: ( ',' )
            {
            // InternalMyDsl.g:4899:1: ( ',' )
            // InternalMyDsl.g:4900:2: ','
            {
             before(grammarAccess.getProcessFoldersOperationAccess().getCommaKeyword_2_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getProcessFoldersOperationAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessFoldersOperation__Group_2__0__Impl"


    // $ANTLR start "rule__ProcessFoldersOperation__Group_2__1"
    // InternalMyDsl.g:4909:1: rule__ProcessFoldersOperation__Group_2__1 : rule__ProcessFoldersOperation__Group_2__1__Impl ;
    public final void rule__ProcessFoldersOperation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4913:1: ( rule__ProcessFoldersOperation__Group_2__1__Impl )
            // InternalMyDsl.g:4914:2: rule__ProcessFoldersOperation__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProcessFoldersOperation__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessFoldersOperation__Group_2__1"


    // $ANTLR start "rule__ProcessFoldersOperation__Group_2__1__Impl"
    // InternalMyDsl.g:4920:1: rule__ProcessFoldersOperation__Group_2__1__Impl : ( ( rule__ProcessFoldersOperation__FoldersAssignment_2_1 ) ) ;
    public final void rule__ProcessFoldersOperation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4924:1: ( ( ( rule__ProcessFoldersOperation__FoldersAssignment_2_1 ) ) )
            // InternalMyDsl.g:4925:1: ( ( rule__ProcessFoldersOperation__FoldersAssignment_2_1 ) )
            {
            // InternalMyDsl.g:4925:1: ( ( rule__ProcessFoldersOperation__FoldersAssignment_2_1 ) )
            // InternalMyDsl.g:4926:2: ( rule__ProcessFoldersOperation__FoldersAssignment_2_1 )
            {
             before(grammarAccess.getProcessFoldersOperationAccess().getFoldersAssignment_2_1()); 
            // InternalMyDsl.g:4927:2: ( rule__ProcessFoldersOperation__FoldersAssignment_2_1 )
            // InternalMyDsl.g:4927:3: rule__ProcessFoldersOperation__FoldersAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ProcessFoldersOperation__FoldersAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getProcessFoldersOperationAccess().getFoldersAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessFoldersOperation__Group_2__1__Impl"


    // $ANTLR start "rule__Model__OperationsAssignment"
    // InternalMyDsl.g:4936:1: rule__Model__OperationsAssignment : ( ruleTopLevelOperation ) ;
    public final void rule__Model__OperationsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4940:1: ( ( ruleTopLevelOperation ) )
            // InternalMyDsl.g:4941:2: ( ruleTopLevelOperation )
            {
            // InternalMyDsl.g:4941:2: ( ruleTopLevelOperation )
            // InternalMyDsl.g:4942:3: ruleTopLevelOperation
            {
             before(grammarAccess.getModelAccess().getOperationsTopLevelOperationParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleTopLevelOperation();

            state._fsp--;

             after(grammarAccess.getModelAccess().getOperationsTopLevelOperationParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__OperationsAssignment"


    // $ANTLR start "rule__LoadJSON__FileAssignment_2"
    // InternalMyDsl.g:4951:1: rule__LoadJSON__FileAssignment_2 : ( RULE_STRING ) ;
    public final void rule__LoadJSON__FileAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4955:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:4956:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:4956:2: ( RULE_STRING )
            // InternalMyDsl.g:4957:3: RULE_STRING
            {
             before(grammarAccess.getLoadJSONAccess().getFileSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLoadJSONAccess().getFileSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadJSON__FileAssignment_2"


    // $ANTLR start "rule__LoadJSON__TableAssignment_5"
    // InternalMyDsl.g:4966:1: rule__LoadJSON__TableAssignment_5 : ( RULE_STRING ) ;
    public final void rule__LoadJSON__TableAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4970:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:4971:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:4971:2: ( RULE_STRING )
            // InternalMyDsl.g:4972:3: RULE_STRING
            {
             before(grammarAccess.getLoadJSONAccess().getTableSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLoadJSONAccess().getTableSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadJSON__TableAssignment_5"


    // $ANTLR start "rule__LoadJSON__AttributesAssignment_7_1"
    // InternalMyDsl.g:4981:1: rule__LoadJSON__AttributesAssignment_7_1 : ( RULE_STRING ) ;
    public final void rule__LoadJSON__AttributesAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4985:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:4986:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:4986:2: ( RULE_STRING )
            // InternalMyDsl.g:4987:3: RULE_STRING
            {
             before(grammarAccess.getLoadJSONAccess().getAttributesSTRINGTerminalRuleCall_7_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLoadJSONAccess().getAttributesSTRINGTerminalRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadJSON__AttributesAssignment_7_1"


    // $ANTLR start "rule__LoadJSON__AttributesAssignment_7_2_1"
    // InternalMyDsl.g:4996:1: rule__LoadJSON__AttributesAssignment_7_2_1 : ( RULE_STRING ) ;
    public final void rule__LoadJSON__AttributesAssignment_7_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5000:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5001:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5001:2: ( RULE_STRING )
            // InternalMyDsl.g:5002:3: RULE_STRING
            {
             before(grammarAccess.getLoadJSONAccess().getAttributesSTRINGTerminalRuleCall_7_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLoadJSONAccess().getAttributesSTRINGTerminalRuleCall_7_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadJSON__AttributesAssignment_7_2_1"


    // $ANTLR start "rule__LoadJSON__NestedAssignment_8_1"
    // InternalMyDsl.g:5011:1: rule__LoadJSON__NestedAssignment_8_1 : ( RULE_STRING ) ;
    public final void rule__LoadJSON__NestedAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5015:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5016:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5016:2: ( RULE_STRING )
            // InternalMyDsl.g:5017:3: RULE_STRING
            {
             before(grammarAccess.getLoadJSONAccess().getNestedSTRINGTerminalRuleCall_8_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLoadJSONAccess().getNestedSTRINGTerminalRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadJSON__NestedAssignment_8_1"


    // $ANTLR start "rule__LoadJSON__NestedAssignment_8_2_1"
    // InternalMyDsl.g:5026:1: rule__LoadJSON__NestedAssignment_8_2_1 : ( RULE_STRING ) ;
    public final void rule__LoadJSON__NestedAssignment_8_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5030:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5031:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5031:2: ( RULE_STRING )
            // InternalMyDsl.g:5032:3: RULE_STRING
            {
             before(grammarAccess.getLoadJSONAccess().getNestedSTRINGTerminalRuleCall_8_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLoadJSONAccess().getNestedSTRINGTerminalRuleCall_8_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadJSON__NestedAssignment_8_2_1"


    // $ANTLR start "rule__LoadXML__FileAssignment_2"
    // InternalMyDsl.g:5041:1: rule__LoadXML__FileAssignment_2 : ( RULE_STRING ) ;
    public final void rule__LoadXML__FileAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5045:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5046:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5046:2: ( RULE_STRING )
            // InternalMyDsl.g:5047:3: RULE_STRING
            {
             before(grammarAccess.getLoadXMLAccess().getFileSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLoadXMLAccess().getFileSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadXML__FileAssignment_2"


    // $ANTLR start "rule__LoadXML__TableAssignment_5"
    // InternalMyDsl.g:5056:1: rule__LoadXML__TableAssignment_5 : ( RULE_STRING ) ;
    public final void rule__LoadXML__TableAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5060:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5061:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5061:2: ( RULE_STRING )
            // InternalMyDsl.g:5062:3: RULE_STRING
            {
             before(grammarAccess.getLoadXMLAccess().getTableSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLoadXMLAccess().getTableSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadXML__TableAssignment_5"


    // $ANTLR start "rule__LoadXML__NestedAssignment_7_1"
    // InternalMyDsl.g:5071:1: rule__LoadXML__NestedAssignment_7_1 : ( RULE_STRING ) ;
    public final void rule__LoadXML__NestedAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5075:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5076:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5076:2: ( RULE_STRING )
            // InternalMyDsl.g:5077:3: RULE_STRING
            {
             before(grammarAccess.getLoadXMLAccess().getNestedSTRINGTerminalRuleCall_7_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLoadXMLAccess().getNestedSTRINGTerminalRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadXML__NestedAssignment_7_1"


    // $ANTLR start "rule__LoadXML__NestedAssignment_7_2_1"
    // InternalMyDsl.g:5086:1: rule__LoadXML__NestedAssignment_7_2_1 : ( RULE_STRING ) ;
    public final void rule__LoadXML__NestedAssignment_7_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5090:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5091:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5091:2: ( RULE_STRING )
            // InternalMyDsl.g:5092:3: RULE_STRING
            {
             before(grammarAccess.getLoadXMLAccess().getNestedSTRINGTerminalRuleCall_7_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLoadXMLAccess().getNestedSTRINGTerminalRuleCall_7_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadXML__NestedAssignment_7_2_1"


    // $ANTLR start "rule__LoadYAML__FileAssignment_2"
    // InternalMyDsl.g:5101:1: rule__LoadYAML__FileAssignment_2 : ( RULE_STRING ) ;
    public final void rule__LoadYAML__FileAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5105:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5106:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5106:2: ( RULE_STRING )
            // InternalMyDsl.g:5107:3: RULE_STRING
            {
             before(grammarAccess.getLoadYAMLAccess().getFileSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLoadYAMLAccess().getFileSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadYAML__FileAssignment_2"


    // $ANTLR start "rule__LoadYAML__TableAssignment_5"
    // InternalMyDsl.g:5116:1: rule__LoadYAML__TableAssignment_5 : ( RULE_STRING ) ;
    public final void rule__LoadYAML__TableAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5120:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5121:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5121:2: ( RULE_STRING )
            // InternalMyDsl.g:5122:3: RULE_STRING
            {
             before(grammarAccess.getLoadYAMLAccess().getTableSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLoadYAMLAccess().getTableSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadYAML__TableAssignment_5"


    // $ANTLR start "rule__LoadYAML__NestedAssignment_7_1"
    // InternalMyDsl.g:5131:1: rule__LoadYAML__NestedAssignment_7_1 : ( RULE_STRING ) ;
    public final void rule__LoadYAML__NestedAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5135:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5136:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5136:2: ( RULE_STRING )
            // InternalMyDsl.g:5137:3: RULE_STRING
            {
             before(grammarAccess.getLoadYAMLAccess().getNestedSTRINGTerminalRuleCall_7_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLoadYAMLAccess().getNestedSTRINGTerminalRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadYAML__NestedAssignment_7_1"


    // $ANTLR start "rule__LoadYAML__NestedAssignment_7_2_1"
    // InternalMyDsl.g:5146:1: rule__LoadYAML__NestedAssignment_7_2_1 : ( RULE_STRING ) ;
    public final void rule__LoadYAML__NestedAssignment_7_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5150:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5151:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5151:2: ( RULE_STRING )
            // InternalMyDsl.g:5152:3: RULE_STRING
            {
             before(grammarAccess.getLoadYAMLAccess().getNestedSTRINGTerminalRuleCall_7_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLoadYAMLAccess().getNestedSTRINGTerminalRuleCall_7_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadYAML__NestedAssignment_7_2_1"


    // $ANTLR start "rule__ConcatOperation__TargetAssignment_2"
    // InternalMyDsl.g:5161:1: rule__ConcatOperation__TargetAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ConcatOperation__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5165:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5166:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5166:2: ( RULE_STRING )
            // InternalMyDsl.g:5167:3: RULE_STRING
            {
             before(grammarAccess.getConcatOperationAccess().getTargetSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getConcatOperationAccess().getTargetSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcatOperation__TargetAssignment_2"


    // $ANTLR start "rule__ConcatOperation__TablesAssignment_5"
    // InternalMyDsl.g:5176:1: rule__ConcatOperation__TablesAssignment_5 : ( RULE_STRING ) ;
    public final void rule__ConcatOperation__TablesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5180:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5181:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5181:2: ( RULE_STRING )
            // InternalMyDsl.g:5182:3: RULE_STRING
            {
             before(grammarAccess.getConcatOperationAccess().getTablesSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getConcatOperationAccess().getTablesSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcatOperation__TablesAssignment_5"


    // $ANTLR start "rule__ConcatOperation__TablesAssignment_6_1"
    // InternalMyDsl.g:5191:1: rule__ConcatOperation__TablesAssignment_6_1 : ( RULE_STRING ) ;
    public final void rule__ConcatOperation__TablesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5195:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5196:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5196:2: ( RULE_STRING )
            // InternalMyDsl.g:5197:3: RULE_STRING
            {
             before(grammarAccess.getConcatOperationAccess().getTablesSTRINGTerminalRuleCall_6_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getConcatOperationAccess().getTablesSTRINGTerminalRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcatOperation__TablesAssignment_6_1"


    // $ANTLR start "rule__FilterOperation__ColumnAssignment_2"
    // InternalMyDsl.g:5206:1: rule__FilterOperation__ColumnAssignment_2 : ( RULE_STRING ) ;
    public final void rule__FilterOperation__ColumnAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5210:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5211:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5211:2: ( RULE_STRING )
            // InternalMyDsl.g:5212:3: RULE_STRING
            {
             before(grammarAccess.getFilterOperationAccess().getColumnSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFilterOperationAccess().getColumnSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterOperation__ColumnAssignment_2"


    // $ANTLR start "rule__FilterOperation__TableAssignment_5"
    // InternalMyDsl.g:5221:1: rule__FilterOperation__TableAssignment_5 : ( RULE_STRING ) ;
    public final void rule__FilterOperation__TableAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5225:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5226:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5226:2: ( RULE_STRING )
            // InternalMyDsl.g:5227:3: RULE_STRING
            {
             before(grammarAccess.getFilterOperationAccess().getTableSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFilterOperationAccess().getTableSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterOperation__TableAssignment_5"


    // $ANTLR start "rule__FilterOperation__ConditionAssignment_8"
    // InternalMyDsl.g:5236:1: rule__FilterOperation__ConditionAssignment_8 : ( RULE_STRING ) ;
    public final void rule__FilterOperation__ConditionAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5240:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5241:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5241:2: ( RULE_STRING )
            // InternalMyDsl.g:5242:3: RULE_STRING
            {
             before(grammarAccess.getFilterOperationAccess().getConditionSTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFilterOperationAccess().getConditionSTRINGTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterOperation__ConditionAssignment_8"


    // $ANTLR start "rule__FilterOperation__ValueAssignment_10"
    // InternalMyDsl.g:5251:1: rule__FilterOperation__ValueAssignment_10 : ( RULE_STRING ) ;
    public final void rule__FilterOperation__ValueAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5255:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5256:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5256:2: ( RULE_STRING )
            // InternalMyDsl.g:5257:3: RULE_STRING
            {
             before(grammarAccess.getFilterOperationAccess().getValueSTRINGTerminalRuleCall_10_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFilterOperationAccess().getValueSTRINGTerminalRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterOperation__ValueAssignment_10"


    // $ANTLR start "rule__FilterOperation__TargetAssignment_11_1"
    // InternalMyDsl.g:5266:1: rule__FilterOperation__TargetAssignment_11_1 : ( RULE_STRING ) ;
    public final void rule__FilterOperation__TargetAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5270:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5271:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5271:2: ( RULE_STRING )
            // InternalMyDsl.g:5272:3: RULE_STRING
            {
             before(grammarAccess.getFilterOperationAccess().getTargetSTRINGTerminalRuleCall_11_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFilterOperationAccess().getTargetSTRINGTerminalRuleCall_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterOperation__TargetAssignment_11_1"


    // $ANTLR start "rule__SaveOperation__TablesAssignment_2"
    // InternalMyDsl.g:5281:1: rule__SaveOperation__TablesAssignment_2 : ( RULE_STRING ) ;
    public final void rule__SaveOperation__TablesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5285:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5286:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5286:2: ( RULE_STRING )
            // InternalMyDsl.g:5287:3: RULE_STRING
            {
             before(grammarAccess.getSaveOperationAccess().getTablesSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSaveOperationAccess().getTablesSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SaveOperation__TablesAssignment_2"


    // $ANTLR start "rule__SaveOperation__TablesAssignment_3_1"
    // InternalMyDsl.g:5296:1: rule__SaveOperation__TablesAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__SaveOperation__TablesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5300:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5301:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5301:2: ( RULE_STRING )
            // InternalMyDsl.g:5302:3: RULE_STRING
            {
             before(grammarAccess.getSaveOperationAccess().getTablesSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSaveOperationAccess().getTablesSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SaveOperation__TablesAssignment_3_1"


    // $ANTLR start "rule__SaveOperation__FileAssignment_6"
    // InternalMyDsl.g:5311:1: rule__SaveOperation__FileAssignment_6 : ( RULE_STRING ) ;
    public final void rule__SaveOperation__FileAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5315:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5316:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5316:2: ( RULE_STRING )
            // InternalMyDsl.g:5317:3: RULE_STRING
            {
             before(grammarAccess.getSaveOperationAccess().getFileSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSaveOperationAccess().getFileSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SaveOperation__FileAssignment_6"


    // $ANTLR start "rule__SaveOperation__FormatAssignment_9"
    // InternalMyDsl.g:5326:1: rule__SaveOperation__FormatAssignment_9 : ( RULE_STRING ) ;
    public final void rule__SaveOperation__FormatAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5330:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5331:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5331:2: ( RULE_STRING )
            // InternalMyDsl.g:5332:3: RULE_STRING
            {
             before(grammarAccess.getSaveOperationAccess().getFormatSTRINGTerminalRuleCall_9_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSaveOperationAccess().getFormatSTRINGTerminalRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SaveOperation__FormatAssignment_9"


    // $ANTLR start "rule__PrintTable__TableAssignment_1"
    // InternalMyDsl.g:5341:1: rule__PrintTable__TableAssignment_1 : ( RULE_STRING ) ;
    public final void rule__PrintTable__TableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5345:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5346:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5346:2: ( RULE_STRING )
            // InternalMyDsl.g:5347:3: RULE_STRING
            {
             before(grammarAccess.getPrintTableAccess().getTableSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPrintTableAccess().getTableSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintTable__TableAssignment_1"


    // $ANTLR start "rule__RenameOperation__OriginalAssignment_2"
    // InternalMyDsl.g:5356:1: rule__RenameOperation__OriginalAssignment_2 : ( RULE_STRING ) ;
    public final void rule__RenameOperation__OriginalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5360:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5361:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5361:2: ( RULE_STRING )
            // InternalMyDsl.g:5362:3: RULE_STRING
            {
             before(grammarAccess.getRenameOperationAccess().getOriginalSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRenameOperationAccess().getOriginalSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameOperation__OriginalAssignment_2"


    // $ANTLR start "rule__RenameOperation__RenamedAssignment_5"
    // InternalMyDsl.g:5371:1: rule__RenameOperation__RenamedAssignment_5 : ( RULE_STRING ) ;
    public final void rule__RenameOperation__RenamedAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5375:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5376:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5376:2: ( RULE_STRING )
            // InternalMyDsl.g:5377:3: RULE_STRING
            {
             before(grammarAccess.getRenameOperationAccess().getRenamedSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRenameOperationAccess().getRenamedSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameOperation__RenamedAssignment_5"


    // $ANTLR start "rule__RenameOperation__TableAssignment_8"
    // InternalMyDsl.g:5386:1: rule__RenameOperation__TableAssignment_8 : ( RULE_STRING ) ;
    public final void rule__RenameOperation__TableAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5390:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5391:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5391:2: ( RULE_STRING )
            // InternalMyDsl.g:5392:3: RULE_STRING
            {
             before(grammarAccess.getRenameOperationAccess().getTableSTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRenameOperationAccess().getTableSTRINGTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameOperation__TableAssignment_8"


    // $ANTLR start "rule__LimitOperation__TableAssignment_2"
    // InternalMyDsl.g:5401:1: rule__LimitOperation__TableAssignment_2 : ( RULE_STRING ) ;
    public final void rule__LimitOperation__TableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5405:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5406:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5406:2: ( RULE_STRING )
            // InternalMyDsl.g:5407:3: RULE_STRING
            {
             before(grammarAccess.getLimitOperationAccess().getTableSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLimitOperationAccess().getTableSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LimitOperation__TableAssignment_2"


    // $ANTLR start "rule__LimitOperation__StartAssignment_5"
    // InternalMyDsl.g:5416:1: rule__LimitOperation__StartAssignment_5 : ( RULE_INT ) ;
    public final void rule__LimitOperation__StartAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5420:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:5421:2: ( RULE_INT )
            {
            // InternalMyDsl.g:5421:2: ( RULE_INT )
            // InternalMyDsl.g:5422:3: RULE_INT
            {
             before(grammarAccess.getLimitOperationAccess().getStartINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLimitOperationAccess().getStartINTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LimitOperation__StartAssignment_5"


    // $ANTLR start "rule__LimitOperation__EndAssignment_8"
    // InternalMyDsl.g:5431:1: rule__LimitOperation__EndAssignment_8 : ( RULE_INT ) ;
    public final void rule__LimitOperation__EndAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5435:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:5436:2: ( RULE_INT )
            {
            // InternalMyDsl.g:5436:2: ( RULE_INT )
            // InternalMyDsl.g:5437:3: RULE_INT
            {
             before(grammarAccess.getLimitOperationAccess().getEndINTTerminalRuleCall_8_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLimitOperationAccess().getEndINTTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LimitOperation__EndAssignment_8"


    // $ANTLR start "rule__ArgMaxOperation__ColumnAssignment_2"
    // InternalMyDsl.g:5446:1: rule__ArgMaxOperation__ColumnAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ArgMaxOperation__ColumnAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5450:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5451:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5451:2: ( RULE_STRING )
            // InternalMyDsl.g:5452:3: RULE_STRING
            {
             before(grammarAccess.getArgMaxOperationAccess().getColumnSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getArgMaxOperationAccess().getColumnSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgMaxOperation__ColumnAssignment_2"


    // $ANTLR start "rule__ArgMaxOperation__TableAssignment_5"
    // InternalMyDsl.g:5461:1: rule__ArgMaxOperation__TableAssignment_5 : ( RULE_STRING ) ;
    public final void rule__ArgMaxOperation__TableAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5465:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5466:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5466:2: ( RULE_STRING )
            // InternalMyDsl.g:5467:3: RULE_STRING
            {
             before(grammarAccess.getArgMaxOperationAccess().getTableSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getArgMaxOperationAccess().getTableSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgMaxOperation__TableAssignment_5"


    // $ANTLR start "rule__ArgMaxOperation__TargetAssignment_8"
    // InternalMyDsl.g:5476:1: rule__ArgMaxOperation__TargetAssignment_8 : ( RULE_STRING ) ;
    public final void rule__ArgMaxOperation__TargetAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5480:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5481:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5481:2: ( RULE_STRING )
            // InternalMyDsl.g:5482:3: RULE_STRING
            {
             before(grammarAccess.getArgMaxOperationAccess().getTargetSTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getArgMaxOperationAccess().getTargetSTRINGTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgMaxOperation__TargetAssignment_8"


    // $ANTLR start "rule__ArgMinOperation__ColumnAssignment_2"
    // InternalMyDsl.g:5491:1: rule__ArgMinOperation__ColumnAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ArgMinOperation__ColumnAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5495:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5496:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5496:2: ( RULE_STRING )
            // InternalMyDsl.g:5497:3: RULE_STRING
            {
             before(grammarAccess.getArgMinOperationAccess().getColumnSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getArgMinOperationAccess().getColumnSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgMinOperation__ColumnAssignment_2"


    // $ANTLR start "rule__ArgMinOperation__TableAssignment_5"
    // InternalMyDsl.g:5506:1: rule__ArgMinOperation__TableAssignment_5 : ( RULE_STRING ) ;
    public final void rule__ArgMinOperation__TableAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5510:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5511:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5511:2: ( RULE_STRING )
            // InternalMyDsl.g:5512:3: RULE_STRING
            {
             before(grammarAccess.getArgMinOperationAccess().getTableSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getArgMinOperationAccess().getTableSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgMinOperation__TableAssignment_5"


    // $ANTLR start "rule__ArgMinOperation__TargetAssignment_8"
    // InternalMyDsl.g:5521:1: rule__ArgMinOperation__TargetAssignment_8 : ( RULE_STRING ) ;
    public final void rule__ArgMinOperation__TargetAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5525:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5526:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5526:2: ( RULE_STRING )
            // InternalMyDsl.g:5527:3: RULE_STRING
            {
             before(grammarAccess.getArgMinOperationAccess().getTargetSTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getArgMinOperationAccess().getTargetSTRINGTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgMinOperation__TargetAssignment_8"


    // $ANTLR start "rule__SelectOperation__ColumnsAssignment_2"
    // InternalMyDsl.g:5536:1: rule__SelectOperation__ColumnsAssignment_2 : ( RULE_STRING ) ;
    public final void rule__SelectOperation__ColumnsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5540:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5541:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5541:2: ( RULE_STRING )
            // InternalMyDsl.g:5542:3: RULE_STRING
            {
             before(grammarAccess.getSelectOperationAccess().getColumnsSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSelectOperationAccess().getColumnsSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectOperation__ColumnsAssignment_2"


    // $ANTLR start "rule__SelectOperation__ColumnsAssignment_3_1"
    // InternalMyDsl.g:5551:1: rule__SelectOperation__ColumnsAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__SelectOperation__ColumnsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5555:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5556:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5556:2: ( RULE_STRING )
            // InternalMyDsl.g:5557:3: RULE_STRING
            {
             before(grammarAccess.getSelectOperationAccess().getColumnsSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSelectOperationAccess().getColumnsSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectOperation__ColumnsAssignment_3_1"


    // $ANTLR start "rule__SelectOperation__TableAssignment_6"
    // InternalMyDsl.g:5566:1: rule__SelectOperation__TableAssignment_6 : ( RULE_STRING ) ;
    public final void rule__SelectOperation__TableAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5570:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5571:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5571:2: ( RULE_STRING )
            // InternalMyDsl.g:5572:3: RULE_STRING
            {
             before(grammarAccess.getSelectOperationAccess().getTableSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSelectOperationAccess().getTableSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectOperation__TableAssignment_6"


    // $ANTLR start "rule__SelectOperation__TargetAssignment_9"
    // InternalMyDsl.g:5581:1: rule__SelectOperation__TargetAssignment_9 : ( RULE_STRING ) ;
    public final void rule__SelectOperation__TargetAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5585:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5586:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5586:2: ( RULE_STRING )
            // InternalMyDsl.g:5587:3: RULE_STRING
            {
             before(grammarAccess.getSelectOperationAccess().getTargetSTRINGTerminalRuleCall_9_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSelectOperationAccess().getTargetSTRINGTerminalRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectOperation__TargetAssignment_9"


    // $ANTLR start "rule__DropOperation__TableAssignment_1"
    // InternalMyDsl.g:5596:1: rule__DropOperation__TableAssignment_1 : ( RULE_STRING ) ;
    public final void rule__DropOperation__TableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5600:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5601:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5601:2: ( RULE_STRING )
            // InternalMyDsl.g:5602:3: RULE_STRING
            {
             before(grammarAccess.getDropOperationAccess().getTableSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDropOperationAccess().getTableSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DropOperation__TableAssignment_1"


    // $ANTLR start "rule__ProcessFoldersOperation__FoldersAssignment_1"
    // InternalMyDsl.g:5611:1: rule__ProcessFoldersOperation__FoldersAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ProcessFoldersOperation__FoldersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5615:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5616:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5616:2: ( RULE_STRING )
            // InternalMyDsl.g:5617:3: RULE_STRING
            {
             before(grammarAccess.getProcessFoldersOperationAccess().getFoldersSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getProcessFoldersOperationAccess().getFoldersSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessFoldersOperation__FoldersAssignment_1"


    // $ANTLR start "rule__ProcessFoldersOperation__FoldersAssignment_2_1"
    // InternalMyDsl.g:5626:1: rule__ProcessFoldersOperation__FoldersAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__ProcessFoldersOperation__FoldersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5630:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5631:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5631:2: ( RULE_STRING )
            // InternalMyDsl.g:5632:3: RULE_STRING
            {
             before(grammarAccess.getProcessFoldersOperationAccess().getFoldersSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getProcessFoldersOperationAccess().getFoldersSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessFoldersOperation__FoldersAssignment_2_1"


    // $ANTLR start "rule__ProcessFoldersOperation__FolderOperationsAssignment_6"
    // InternalMyDsl.g:5641:1: rule__ProcessFoldersOperation__FolderOperationsAssignment_6 : ( ruleTopLevelOperation ) ;
    public final void rule__ProcessFoldersOperation__FolderOperationsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5645:1: ( ( ruleTopLevelOperation ) )
            // InternalMyDsl.g:5646:2: ( ruleTopLevelOperation )
            {
            // InternalMyDsl.g:5646:2: ( ruleTopLevelOperation )
            // InternalMyDsl.g:5647:3: ruleTopLevelOperation
            {
             before(grammarAccess.getProcessFoldersOperationAccess().getFolderOperationsTopLevelOperationParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleTopLevelOperation();

            state._fsp--;

             after(grammarAccess.getProcessFoldersOperationAccess().getFolderOperationsTopLevelOperationParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessFoldersOperation__FolderOperationsAssignment_6"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000019DC41381802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020004000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000019DC41381800L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000800000000000L});

}