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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'printAll'", "'end'", "'loadJSON'", "'from'", "'into'", "'withAttributes'", "'('", "')'", "','", "'nestedIn'", "'loadXML'", "'loadYAML'", "'select'", "'columns'", "'fromTable'", "'toTable'", "'concatHorizontal'", "'onTables'", "'filter'", "'onColumn'", "'onTable'", "'where'", "'value'", "'save'", "'tables'", "'to'", "'as'", "'printTable'", "'renameColumn'", "'limit'", "'table'", "'argMax'", "'argMin'", "'dropTable'", "'processFolders'", "'with'", "'{'", "'}'"
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

                if ( ((LA1_0>=11 && LA1_0<=13)||(LA1_0>=21 && LA1_0<=23)||LA1_0==27||LA1_0==29||LA1_0==34||(LA1_0>=38 && LA1_0<=40)||(LA1_0>=42 && LA1_0<=45)) ) {
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


    // $ANTLR start "entryRuleSelectOperation"
    // InternalMyDsl.g:210:1: entryRuleSelectOperation : ruleSelectOperation EOF ;
    public final void entryRuleSelectOperation() throws RecognitionException {
        try {
            // InternalMyDsl.g:211:1: ( ruleSelectOperation EOF )
            // InternalMyDsl.g:212:1: ruleSelectOperation EOF
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
    // InternalMyDsl.g:219:1: ruleSelectOperation : ( ( rule__SelectOperation__Group__0 ) ) ;
    public final void ruleSelectOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:223:2: ( ( ( rule__SelectOperation__Group__0 ) ) )
            // InternalMyDsl.g:224:2: ( ( rule__SelectOperation__Group__0 ) )
            {
            // InternalMyDsl.g:224:2: ( ( rule__SelectOperation__Group__0 ) )
            // InternalMyDsl.g:225:3: ( rule__SelectOperation__Group__0 )
            {
             before(grammarAccess.getSelectOperationAccess().getGroup()); 
            // InternalMyDsl.g:226:3: ( rule__SelectOperation__Group__0 )
            // InternalMyDsl.g:226:4: rule__SelectOperation__Group__0
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


    // $ANTLR start "entryRuleConcatOperation"
    // InternalMyDsl.g:235:1: entryRuleConcatOperation : ruleConcatOperation EOF ;
    public final void entryRuleConcatOperation() throws RecognitionException {
        try {
            // InternalMyDsl.g:236:1: ( ruleConcatOperation EOF )
            // InternalMyDsl.g:237:1: ruleConcatOperation EOF
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
    // InternalMyDsl.g:244:1: ruleConcatOperation : ( ( rule__ConcatOperation__Group__0 ) ) ;
    public final void ruleConcatOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:248:2: ( ( ( rule__ConcatOperation__Group__0 ) ) )
            // InternalMyDsl.g:249:2: ( ( rule__ConcatOperation__Group__0 ) )
            {
            // InternalMyDsl.g:249:2: ( ( rule__ConcatOperation__Group__0 ) )
            // InternalMyDsl.g:250:3: ( rule__ConcatOperation__Group__0 )
            {
             before(grammarAccess.getConcatOperationAccess().getGroup()); 
            // InternalMyDsl.g:251:3: ( rule__ConcatOperation__Group__0 )
            // InternalMyDsl.g:251:4: rule__ConcatOperation__Group__0
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
    // InternalMyDsl.g:260:1: entryRuleFilterOperation : ruleFilterOperation EOF ;
    public final void entryRuleFilterOperation() throws RecognitionException {
        try {
            // InternalMyDsl.g:261:1: ( ruleFilterOperation EOF )
            // InternalMyDsl.g:262:1: ruleFilterOperation EOF
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
    // InternalMyDsl.g:269:1: ruleFilterOperation : ( ( rule__FilterOperation__Group__0 ) ) ;
    public final void ruleFilterOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:273:2: ( ( ( rule__FilterOperation__Group__0 ) ) )
            // InternalMyDsl.g:274:2: ( ( rule__FilterOperation__Group__0 ) )
            {
            // InternalMyDsl.g:274:2: ( ( rule__FilterOperation__Group__0 ) )
            // InternalMyDsl.g:275:3: ( rule__FilterOperation__Group__0 )
            {
             before(grammarAccess.getFilterOperationAccess().getGroup()); 
            // InternalMyDsl.g:276:3: ( rule__FilterOperation__Group__0 )
            // InternalMyDsl.g:276:4: rule__FilterOperation__Group__0
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
    // InternalMyDsl.g:285:1: entryRuleSaveOperation : ruleSaveOperation EOF ;
    public final void entryRuleSaveOperation() throws RecognitionException {
        try {
            // InternalMyDsl.g:286:1: ( ruleSaveOperation EOF )
            // InternalMyDsl.g:287:1: ruleSaveOperation EOF
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
    // InternalMyDsl.g:294:1: ruleSaveOperation : ( ( rule__SaveOperation__Group__0 ) ) ;
    public final void ruleSaveOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:298:2: ( ( ( rule__SaveOperation__Group__0 ) ) )
            // InternalMyDsl.g:299:2: ( ( rule__SaveOperation__Group__0 ) )
            {
            // InternalMyDsl.g:299:2: ( ( rule__SaveOperation__Group__0 ) )
            // InternalMyDsl.g:300:3: ( rule__SaveOperation__Group__0 )
            {
             before(grammarAccess.getSaveOperationAccess().getGroup()); 
            // InternalMyDsl.g:301:3: ( rule__SaveOperation__Group__0 )
            // InternalMyDsl.g:301:4: rule__SaveOperation__Group__0
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
    // InternalMyDsl.g:310:1: entryRulePrintOperation : rulePrintOperation EOF ;
    public final void entryRulePrintOperation() throws RecognitionException {
        try {
            // InternalMyDsl.g:311:1: ( rulePrintOperation EOF )
            // InternalMyDsl.g:312:1: rulePrintOperation EOF
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
    // InternalMyDsl.g:319:1: rulePrintOperation : ( ( rule__PrintOperation__Alternatives ) ) ;
    public final void rulePrintOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:323:2: ( ( ( rule__PrintOperation__Alternatives ) ) )
            // InternalMyDsl.g:324:2: ( ( rule__PrintOperation__Alternatives ) )
            {
            // InternalMyDsl.g:324:2: ( ( rule__PrintOperation__Alternatives ) )
            // InternalMyDsl.g:325:3: ( rule__PrintOperation__Alternatives )
            {
             before(grammarAccess.getPrintOperationAccess().getAlternatives()); 
            // InternalMyDsl.g:326:3: ( rule__PrintOperation__Alternatives )
            // InternalMyDsl.g:326:4: rule__PrintOperation__Alternatives
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
    // InternalMyDsl.g:335:1: entryRulePrintAll : rulePrintAll EOF ;
    public final void entryRulePrintAll() throws RecognitionException {
        try {
            // InternalMyDsl.g:336:1: ( rulePrintAll EOF )
            // InternalMyDsl.g:337:1: rulePrintAll EOF
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
    // InternalMyDsl.g:344:1: rulePrintAll : ( 'printAll' ) ;
    public final void rulePrintAll() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:348:2: ( ( 'printAll' ) )
            // InternalMyDsl.g:349:2: ( 'printAll' )
            {
            // InternalMyDsl.g:349:2: ( 'printAll' )
            // InternalMyDsl.g:350:3: 'printAll'
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
    // InternalMyDsl.g:360:1: entryRulePrintTable : rulePrintTable EOF ;
    public final void entryRulePrintTable() throws RecognitionException {
        try {
            // InternalMyDsl.g:361:1: ( rulePrintTable EOF )
            // InternalMyDsl.g:362:1: rulePrintTable EOF
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
    // InternalMyDsl.g:369:1: rulePrintTable : ( ( rule__PrintTable__Group__0 ) ) ;
    public final void rulePrintTable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:373:2: ( ( ( rule__PrintTable__Group__0 ) ) )
            // InternalMyDsl.g:374:2: ( ( rule__PrintTable__Group__0 ) )
            {
            // InternalMyDsl.g:374:2: ( ( rule__PrintTable__Group__0 ) )
            // InternalMyDsl.g:375:3: ( rule__PrintTable__Group__0 )
            {
             before(grammarAccess.getPrintTableAccess().getGroup()); 
            // InternalMyDsl.g:376:3: ( rule__PrintTable__Group__0 )
            // InternalMyDsl.g:376:4: rule__PrintTable__Group__0
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
    // InternalMyDsl.g:385:1: entryRuleRenameOperation : ruleRenameOperation EOF ;
    public final void entryRuleRenameOperation() throws RecognitionException {
        try {
            // InternalMyDsl.g:386:1: ( ruleRenameOperation EOF )
            // InternalMyDsl.g:387:1: ruleRenameOperation EOF
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
    // InternalMyDsl.g:394:1: ruleRenameOperation : ( ( rule__RenameOperation__Group__0 ) ) ;
    public final void ruleRenameOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:398:2: ( ( ( rule__RenameOperation__Group__0 ) ) )
            // InternalMyDsl.g:399:2: ( ( rule__RenameOperation__Group__0 ) )
            {
            // InternalMyDsl.g:399:2: ( ( rule__RenameOperation__Group__0 ) )
            // InternalMyDsl.g:400:3: ( rule__RenameOperation__Group__0 )
            {
             before(grammarAccess.getRenameOperationAccess().getGroup()); 
            // InternalMyDsl.g:401:3: ( rule__RenameOperation__Group__0 )
            // InternalMyDsl.g:401:4: rule__RenameOperation__Group__0
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
    // InternalMyDsl.g:410:1: entryRuleLimitOperation : ruleLimitOperation EOF ;
    public final void entryRuleLimitOperation() throws RecognitionException {
        try {
            // InternalMyDsl.g:411:1: ( ruleLimitOperation EOF )
            // InternalMyDsl.g:412:1: ruleLimitOperation EOF
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
    // InternalMyDsl.g:419:1: ruleLimitOperation : ( ( rule__LimitOperation__Group__0 ) ) ;
    public final void ruleLimitOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:423:2: ( ( ( rule__LimitOperation__Group__0 ) ) )
            // InternalMyDsl.g:424:2: ( ( rule__LimitOperation__Group__0 ) )
            {
            // InternalMyDsl.g:424:2: ( ( rule__LimitOperation__Group__0 ) )
            // InternalMyDsl.g:425:3: ( rule__LimitOperation__Group__0 )
            {
             before(grammarAccess.getLimitOperationAccess().getGroup()); 
            // InternalMyDsl.g:426:3: ( rule__LimitOperation__Group__0 )
            // InternalMyDsl.g:426:4: rule__LimitOperation__Group__0
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
    // InternalMyDsl.g:435:1: entryRuleArgMaxOperation : ruleArgMaxOperation EOF ;
    public final void entryRuleArgMaxOperation() throws RecognitionException {
        try {
            // InternalMyDsl.g:436:1: ( ruleArgMaxOperation EOF )
            // InternalMyDsl.g:437:1: ruleArgMaxOperation EOF
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
    // InternalMyDsl.g:444:1: ruleArgMaxOperation : ( ( rule__ArgMaxOperation__Group__0 ) ) ;
    public final void ruleArgMaxOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:448:2: ( ( ( rule__ArgMaxOperation__Group__0 ) ) )
            // InternalMyDsl.g:449:2: ( ( rule__ArgMaxOperation__Group__0 ) )
            {
            // InternalMyDsl.g:449:2: ( ( rule__ArgMaxOperation__Group__0 ) )
            // InternalMyDsl.g:450:3: ( rule__ArgMaxOperation__Group__0 )
            {
             before(grammarAccess.getArgMaxOperationAccess().getGroup()); 
            // InternalMyDsl.g:451:3: ( rule__ArgMaxOperation__Group__0 )
            // InternalMyDsl.g:451:4: rule__ArgMaxOperation__Group__0
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
    // InternalMyDsl.g:460:1: entryRuleArgMinOperation : ruleArgMinOperation EOF ;
    public final void entryRuleArgMinOperation() throws RecognitionException {
        try {
            // InternalMyDsl.g:461:1: ( ruleArgMinOperation EOF )
            // InternalMyDsl.g:462:1: ruleArgMinOperation EOF
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
    // InternalMyDsl.g:469:1: ruleArgMinOperation : ( ( rule__ArgMinOperation__Group__0 ) ) ;
    public final void ruleArgMinOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:473:2: ( ( ( rule__ArgMinOperation__Group__0 ) ) )
            // InternalMyDsl.g:474:2: ( ( rule__ArgMinOperation__Group__0 ) )
            {
            // InternalMyDsl.g:474:2: ( ( rule__ArgMinOperation__Group__0 ) )
            // InternalMyDsl.g:475:3: ( rule__ArgMinOperation__Group__0 )
            {
             before(grammarAccess.getArgMinOperationAccess().getGroup()); 
            // InternalMyDsl.g:476:3: ( rule__ArgMinOperation__Group__0 )
            // InternalMyDsl.g:476:4: rule__ArgMinOperation__Group__0
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


    // $ANTLR start "entryRuleEndOperation"
    // InternalMyDsl.g:535:1: entryRuleEndOperation : ruleEndOperation EOF ;
    public final void entryRuleEndOperation() throws RecognitionException {
        try {
            // InternalMyDsl.g:536:1: ( ruleEndOperation EOF )
            // InternalMyDsl.g:537:1: ruleEndOperation EOF
            {
             before(grammarAccess.getEndOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleEndOperation();

            state._fsp--;

             after(grammarAccess.getEndOperationRule()); 
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
    // $ANTLR end "entryRuleEndOperation"


    // $ANTLR start "ruleEndOperation"
    // InternalMyDsl.g:544:1: ruleEndOperation : ( 'end' ) ;
    public final void ruleEndOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:548:2: ( ( 'end' ) )
            // InternalMyDsl.g:549:2: ( 'end' )
            {
            // InternalMyDsl.g:549:2: ( 'end' )
            // InternalMyDsl.g:550:3: 'end'
            {
             before(grammarAccess.getEndOperationAccess().getEndKeyword()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getEndOperationAccess().getEndKeyword()); 

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
    // $ANTLR end "ruleEndOperation"


    // $ANTLR start "rule__TopLevelOperation__Alternatives"
    // InternalMyDsl.g:559:1: rule__TopLevelOperation__Alternatives : ( ( ruleLoadOperation ) | ( ruleSelectOperation ) | ( ruleConcatOperation ) | ( ruleFilterOperation ) | ( ruleSaveOperation ) | ( rulePrintOperation ) | ( ruleRenameOperation ) | ( ruleLimitOperation ) | ( ruleArgMaxOperation ) | ( ruleArgMinOperation ) | ( ruleDropOperation ) | ( ruleProcessFoldersOperation ) | ( ( rule__TopLevelOperation__Group_12__0 ) ) );
    public final void rule__TopLevelOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:563:1: ( ( ruleLoadOperation ) | ( ruleSelectOperation ) | ( ruleConcatOperation ) | ( ruleFilterOperation ) | ( ruleSaveOperation ) | ( rulePrintOperation ) | ( ruleRenameOperation ) | ( ruleLimitOperation ) | ( ruleArgMaxOperation ) | ( ruleArgMinOperation ) | ( ruleDropOperation ) | ( ruleProcessFoldersOperation ) | ( ( rule__TopLevelOperation__Group_12__0 ) ) )
            int alt2=13;
            switch ( input.LA(1) ) {
            case 13:
            case 21:
            case 22:
                {
                alt2=1;
                }
                break;
            case 23:
                {
                alt2=2;
                }
                break;
            case 27:
                {
                alt2=3;
                }
                break;
            case 29:
                {
                alt2=4;
                }
                break;
            case 34:
                {
                alt2=5;
                }
                break;
            case 11:
            case 38:
                {
                alt2=6;
                }
                break;
            case 39:
                {
                alt2=7;
                }
                break;
            case 40:
                {
                alt2=8;
                }
                break;
            case 42:
                {
                alt2=9;
                }
                break;
            case 43:
                {
                alt2=10;
                }
                break;
            case 44:
                {
                alt2=11;
                }
                break;
            case 45:
                {
                alt2=12;
                }
                break;
            case 12:
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
                    // InternalMyDsl.g:564:2: ( ruleLoadOperation )
                    {
                    // InternalMyDsl.g:564:2: ( ruleLoadOperation )
                    // InternalMyDsl.g:565:3: ruleLoadOperation
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
                    // InternalMyDsl.g:570:2: ( ruleSelectOperation )
                    {
                    // InternalMyDsl.g:570:2: ( ruleSelectOperation )
                    // InternalMyDsl.g:571:3: ruleSelectOperation
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
                    // InternalMyDsl.g:576:2: ( ruleConcatOperation )
                    {
                    // InternalMyDsl.g:576:2: ( ruleConcatOperation )
                    // InternalMyDsl.g:577:3: ruleConcatOperation
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
                    // InternalMyDsl.g:582:2: ( ruleFilterOperation )
                    {
                    // InternalMyDsl.g:582:2: ( ruleFilterOperation )
                    // InternalMyDsl.g:583:3: ruleFilterOperation
                    {
                     before(grammarAccess.getTopLevelOperationAccess().getFilterOperationParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleFilterOperation();

                    state._fsp--;

                     after(grammarAccess.getTopLevelOperationAccess().getFilterOperationParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:588:2: ( ruleSaveOperation )
                    {
                    // InternalMyDsl.g:588:2: ( ruleSaveOperation )
                    // InternalMyDsl.g:589:3: ruleSaveOperation
                    {
                     before(grammarAccess.getTopLevelOperationAccess().getSaveOperationParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleSaveOperation();

                    state._fsp--;

                     after(grammarAccess.getTopLevelOperationAccess().getSaveOperationParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:594:2: ( rulePrintOperation )
                    {
                    // InternalMyDsl.g:594:2: ( rulePrintOperation )
                    // InternalMyDsl.g:595:3: rulePrintOperation
                    {
                     before(grammarAccess.getTopLevelOperationAccess().getPrintOperationParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    rulePrintOperation();

                    state._fsp--;

                     after(grammarAccess.getTopLevelOperationAccess().getPrintOperationParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:600:2: ( ruleRenameOperation )
                    {
                    // InternalMyDsl.g:600:2: ( ruleRenameOperation )
                    // InternalMyDsl.g:601:3: ruleRenameOperation
                    {
                     before(grammarAccess.getTopLevelOperationAccess().getRenameOperationParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleRenameOperation();

                    state._fsp--;

                     after(grammarAccess.getTopLevelOperationAccess().getRenameOperationParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:606:2: ( ruleLimitOperation )
                    {
                    // InternalMyDsl.g:606:2: ( ruleLimitOperation )
                    // InternalMyDsl.g:607:3: ruleLimitOperation
                    {
                     before(grammarAccess.getTopLevelOperationAccess().getLimitOperationParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleLimitOperation();

                    state._fsp--;

                     after(grammarAccess.getTopLevelOperationAccess().getLimitOperationParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:612:2: ( ruleArgMaxOperation )
                    {
                    // InternalMyDsl.g:612:2: ( ruleArgMaxOperation )
                    // InternalMyDsl.g:613:3: ruleArgMaxOperation
                    {
                     before(grammarAccess.getTopLevelOperationAccess().getArgMaxOperationParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleArgMaxOperation();

                    state._fsp--;

                     after(grammarAccess.getTopLevelOperationAccess().getArgMaxOperationParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:618:2: ( ruleArgMinOperation )
                    {
                    // InternalMyDsl.g:618:2: ( ruleArgMinOperation )
                    // InternalMyDsl.g:619:3: ruleArgMinOperation
                    {
                     before(grammarAccess.getTopLevelOperationAccess().getArgMinOperationParserRuleCall_9()); 
                    pushFollow(FOLLOW_2);
                    ruleArgMinOperation();

                    state._fsp--;

                     after(grammarAccess.getTopLevelOperationAccess().getArgMinOperationParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalMyDsl.g:624:2: ( ruleDropOperation )
                    {
                    // InternalMyDsl.g:624:2: ( ruleDropOperation )
                    // InternalMyDsl.g:625:3: ruleDropOperation
                    {
                     before(grammarAccess.getTopLevelOperationAccess().getDropOperationParserRuleCall_10()); 
                    pushFollow(FOLLOW_2);
                    ruleDropOperation();

                    state._fsp--;

                     after(grammarAccess.getTopLevelOperationAccess().getDropOperationParserRuleCall_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalMyDsl.g:630:2: ( ruleProcessFoldersOperation )
                    {
                    // InternalMyDsl.g:630:2: ( ruleProcessFoldersOperation )
                    // InternalMyDsl.g:631:3: ruleProcessFoldersOperation
                    {
                     before(grammarAccess.getTopLevelOperationAccess().getProcessFoldersOperationParserRuleCall_11()); 
                    pushFollow(FOLLOW_2);
                    ruleProcessFoldersOperation();

                    state._fsp--;

                     after(grammarAccess.getTopLevelOperationAccess().getProcessFoldersOperationParserRuleCall_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalMyDsl.g:636:2: ( ( rule__TopLevelOperation__Group_12__0 ) )
                    {
                    // InternalMyDsl.g:636:2: ( ( rule__TopLevelOperation__Group_12__0 ) )
                    // InternalMyDsl.g:637:3: ( rule__TopLevelOperation__Group_12__0 )
                    {
                     before(grammarAccess.getTopLevelOperationAccess().getGroup_12()); 
                    // InternalMyDsl.g:638:3: ( rule__TopLevelOperation__Group_12__0 )
                    // InternalMyDsl.g:638:4: rule__TopLevelOperation__Group_12__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TopLevelOperation__Group_12__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTopLevelOperationAccess().getGroup_12()); 

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
    // InternalMyDsl.g:646:1: rule__LoadOperation__Alternatives : ( ( ruleLoadJSON ) | ( ruleLoadXML ) | ( ruleLoadYAML ) );
    public final void rule__LoadOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:650:1: ( ( ruleLoadJSON ) | ( ruleLoadXML ) | ( ruleLoadYAML ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt3=1;
                }
                break;
            case 21:
                {
                alt3=2;
                }
                break;
            case 22:
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
                    // InternalMyDsl.g:651:2: ( ruleLoadJSON )
                    {
                    // InternalMyDsl.g:651:2: ( ruleLoadJSON )
                    // InternalMyDsl.g:652:3: ruleLoadJSON
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
                    // InternalMyDsl.g:657:2: ( ruleLoadXML )
                    {
                    // InternalMyDsl.g:657:2: ( ruleLoadXML )
                    // InternalMyDsl.g:658:3: ruleLoadXML
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
                    // InternalMyDsl.g:663:2: ( ruleLoadYAML )
                    {
                    // InternalMyDsl.g:663:2: ( ruleLoadYAML )
                    // InternalMyDsl.g:664:3: ruleLoadYAML
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
    // InternalMyDsl.g:673:1: rule__PrintOperation__Alternatives : ( ( ( rule__PrintOperation__Group_0__0 ) ) | ( rulePrintTable ) );
    public final void rule__PrintOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:677:1: ( ( ( rule__PrintOperation__Group_0__0 ) ) | ( rulePrintTable ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==38) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:678:2: ( ( rule__PrintOperation__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:678:2: ( ( rule__PrintOperation__Group_0__0 ) )
                    // InternalMyDsl.g:679:3: ( rule__PrintOperation__Group_0__0 )
                    {
                     before(grammarAccess.getPrintOperationAccess().getGroup_0()); 
                    // InternalMyDsl.g:680:3: ( rule__PrintOperation__Group_0__0 )
                    // InternalMyDsl.g:680:4: rule__PrintOperation__Group_0__0
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
                    // InternalMyDsl.g:684:2: ( rulePrintTable )
                    {
                    // InternalMyDsl.g:684:2: ( rulePrintTable )
                    // InternalMyDsl.g:685:3: rulePrintTable
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


    // $ANTLR start "rule__TopLevelOperation__Group_12__0"
    // InternalMyDsl.g:694:1: rule__TopLevelOperation__Group_12__0 : rule__TopLevelOperation__Group_12__0__Impl rule__TopLevelOperation__Group_12__1 ;
    public final void rule__TopLevelOperation__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:698:1: ( rule__TopLevelOperation__Group_12__0__Impl rule__TopLevelOperation__Group_12__1 )
            // InternalMyDsl.g:699:2: rule__TopLevelOperation__Group_12__0__Impl rule__TopLevelOperation__Group_12__1
            {
            pushFollow(FOLLOW_4);
            rule__TopLevelOperation__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopLevelOperation__Group_12__1();

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
    // $ANTLR end "rule__TopLevelOperation__Group_12__0"


    // $ANTLR start "rule__TopLevelOperation__Group_12__0__Impl"
    // InternalMyDsl.g:706:1: rule__TopLevelOperation__Group_12__0__Impl : ( () ) ;
    public final void rule__TopLevelOperation__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:710:1: ( ( () ) )
            // InternalMyDsl.g:711:1: ( () )
            {
            // InternalMyDsl.g:711:1: ( () )
            // InternalMyDsl.g:712:2: ()
            {
             before(grammarAccess.getTopLevelOperationAccess().getTopLevelOperationAction_12_0()); 
            // InternalMyDsl.g:713:2: ()
            // InternalMyDsl.g:713:3: 
            {
            }

             after(grammarAccess.getTopLevelOperationAccess().getTopLevelOperationAction_12_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopLevelOperation__Group_12__0__Impl"


    // $ANTLR start "rule__TopLevelOperation__Group_12__1"
    // InternalMyDsl.g:721:1: rule__TopLevelOperation__Group_12__1 : rule__TopLevelOperation__Group_12__1__Impl ;
    public final void rule__TopLevelOperation__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:725:1: ( rule__TopLevelOperation__Group_12__1__Impl )
            // InternalMyDsl.g:726:2: rule__TopLevelOperation__Group_12__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TopLevelOperation__Group_12__1__Impl();

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
    // $ANTLR end "rule__TopLevelOperation__Group_12__1"


    // $ANTLR start "rule__TopLevelOperation__Group_12__1__Impl"
    // InternalMyDsl.g:732:1: rule__TopLevelOperation__Group_12__1__Impl : ( ruleEndOperation ) ;
    public final void rule__TopLevelOperation__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:736:1: ( ( ruleEndOperation ) )
            // InternalMyDsl.g:737:1: ( ruleEndOperation )
            {
            // InternalMyDsl.g:737:1: ( ruleEndOperation )
            // InternalMyDsl.g:738:2: ruleEndOperation
            {
             before(grammarAccess.getTopLevelOperationAccess().getEndOperationParserRuleCall_12_1()); 
            pushFollow(FOLLOW_2);
            ruleEndOperation();

            state._fsp--;

             after(grammarAccess.getTopLevelOperationAccess().getEndOperationParserRuleCall_12_1()); 

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
    // $ANTLR end "rule__TopLevelOperation__Group_12__1__Impl"


    // $ANTLR start "rule__LoadJSON__Group__0"
    // InternalMyDsl.g:748:1: rule__LoadJSON__Group__0 : rule__LoadJSON__Group__0__Impl rule__LoadJSON__Group__1 ;
    public final void rule__LoadJSON__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:752:1: ( rule__LoadJSON__Group__0__Impl rule__LoadJSON__Group__1 )
            // InternalMyDsl.g:753:2: rule__LoadJSON__Group__0__Impl rule__LoadJSON__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyDsl.g:760:1: rule__LoadJSON__Group__0__Impl : ( 'loadJSON' ) ;
    public final void rule__LoadJSON__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:764:1: ( ( 'loadJSON' ) )
            // InternalMyDsl.g:765:1: ( 'loadJSON' )
            {
            // InternalMyDsl.g:765:1: ( 'loadJSON' )
            // InternalMyDsl.g:766:2: 'loadJSON'
            {
             before(grammarAccess.getLoadJSONAccess().getLoadJSONKeyword_0()); 
            match(input,13,FOLLOW_2); 
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
    // InternalMyDsl.g:775:1: rule__LoadJSON__Group__1 : rule__LoadJSON__Group__1__Impl rule__LoadJSON__Group__2 ;
    public final void rule__LoadJSON__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:779:1: ( rule__LoadJSON__Group__1__Impl rule__LoadJSON__Group__2 )
            // InternalMyDsl.g:780:2: rule__LoadJSON__Group__1__Impl rule__LoadJSON__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:787:1: rule__LoadJSON__Group__1__Impl : ( 'from' ) ;
    public final void rule__LoadJSON__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:791:1: ( ( 'from' ) )
            // InternalMyDsl.g:792:1: ( 'from' )
            {
            // InternalMyDsl.g:792:1: ( 'from' )
            // InternalMyDsl.g:793:2: 'from'
            {
             before(grammarAccess.getLoadJSONAccess().getFromKeyword_1()); 
            match(input,14,FOLLOW_2); 
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
    // InternalMyDsl.g:802:1: rule__LoadJSON__Group__2 : rule__LoadJSON__Group__2__Impl rule__LoadJSON__Group__3 ;
    public final void rule__LoadJSON__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:806:1: ( rule__LoadJSON__Group__2__Impl rule__LoadJSON__Group__3 )
            // InternalMyDsl.g:807:2: rule__LoadJSON__Group__2__Impl rule__LoadJSON__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:814:1: rule__LoadJSON__Group__2__Impl : ( ( rule__LoadJSON__FileAssignment_2 ) ) ;
    public final void rule__LoadJSON__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:818:1: ( ( ( rule__LoadJSON__FileAssignment_2 ) ) )
            // InternalMyDsl.g:819:1: ( ( rule__LoadJSON__FileAssignment_2 ) )
            {
            // InternalMyDsl.g:819:1: ( ( rule__LoadJSON__FileAssignment_2 ) )
            // InternalMyDsl.g:820:2: ( rule__LoadJSON__FileAssignment_2 )
            {
             before(grammarAccess.getLoadJSONAccess().getFileAssignment_2()); 
            // InternalMyDsl.g:821:2: ( rule__LoadJSON__FileAssignment_2 )
            // InternalMyDsl.g:821:3: rule__LoadJSON__FileAssignment_2
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
    // InternalMyDsl.g:829:1: rule__LoadJSON__Group__3 : rule__LoadJSON__Group__3__Impl rule__LoadJSON__Group__4 ;
    public final void rule__LoadJSON__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:833:1: ( rule__LoadJSON__Group__3__Impl rule__LoadJSON__Group__4 )
            // InternalMyDsl.g:834:2: rule__LoadJSON__Group__3__Impl rule__LoadJSON__Group__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:841:1: rule__LoadJSON__Group__3__Impl : ( 'into' ) ;
    public final void rule__LoadJSON__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:845:1: ( ( 'into' ) )
            // InternalMyDsl.g:846:1: ( 'into' )
            {
            // InternalMyDsl.g:846:1: ( 'into' )
            // InternalMyDsl.g:847:2: 'into'
            {
             before(grammarAccess.getLoadJSONAccess().getIntoKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getLoadJSONAccess().getIntoKeyword_3()); 

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
    // InternalMyDsl.g:856:1: rule__LoadJSON__Group__4 : rule__LoadJSON__Group__4__Impl rule__LoadJSON__Group__5 ;
    public final void rule__LoadJSON__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:860:1: ( rule__LoadJSON__Group__4__Impl rule__LoadJSON__Group__5 )
            // InternalMyDsl.g:861:2: rule__LoadJSON__Group__4__Impl rule__LoadJSON__Group__5
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:868:1: rule__LoadJSON__Group__4__Impl : ( ( rule__LoadJSON__TableAssignment_4 ) ) ;
    public final void rule__LoadJSON__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:872:1: ( ( ( rule__LoadJSON__TableAssignment_4 ) ) )
            // InternalMyDsl.g:873:1: ( ( rule__LoadJSON__TableAssignment_4 ) )
            {
            // InternalMyDsl.g:873:1: ( ( rule__LoadJSON__TableAssignment_4 ) )
            // InternalMyDsl.g:874:2: ( rule__LoadJSON__TableAssignment_4 )
            {
             before(grammarAccess.getLoadJSONAccess().getTableAssignment_4()); 
            // InternalMyDsl.g:875:2: ( rule__LoadJSON__TableAssignment_4 )
            // InternalMyDsl.g:875:3: rule__LoadJSON__TableAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__LoadJSON__TableAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLoadJSONAccess().getTableAssignment_4()); 

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
    // InternalMyDsl.g:883:1: rule__LoadJSON__Group__5 : rule__LoadJSON__Group__5__Impl rule__LoadJSON__Group__6 ;
    public final void rule__LoadJSON__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:887:1: ( rule__LoadJSON__Group__5__Impl rule__LoadJSON__Group__6 )
            // InternalMyDsl.g:888:2: rule__LoadJSON__Group__5__Impl rule__LoadJSON__Group__6
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:895:1: rule__LoadJSON__Group__5__Impl : ( ( rule__LoadJSON__Group_5__0 )? ) ;
    public final void rule__LoadJSON__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:899:1: ( ( ( rule__LoadJSON__Group_5__0 )? ) )
            // InternalMyDsl.g:900:1: ( ( rule__LoadJSON__Group_5__0 )? )
            {
            // InternalMyDsl.g:900:1: ( ( rule__LoadJSON__Group_5__0 )? )
            // InternalMyDsl.g:901:2: ( rule__LoadJSON__Group_5__0 )?
            {
             before(grammarAccess.getLoadJSONAccess().getGroup_5()); 
            // InternalMyDsl.g:902:2: ( rule__LoadJSON__Group_5__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:902:3: rule__LoadJSON__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LoadJSON__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLoadJSONAccess().getGroup_5()); 

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
    // InternalMyDsl.g:910:1: rule__LoadJSON__Group__6 : rule__LoadJSON__Group__6__Impl ;
    public final void rule__LoadJSON__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:914:1: ( rule__LoadJSON__Group__6__Impl )
            // InternalMyDsl.g:915:2: rule__LoadJSON__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LoadJSON__Group__6__Impl();

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
    // InternalMyDsl.g:921:1: rule__LoadJSON__Group__6__Impl : ( ( rule__LoadJSON__Group_6__0 )? ) ;
    public final void rule__LoadJSON__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:925:1: ( ( ( rule__LoadJSON__Group_6__0 )? ) )
            // InternalMyDsl.g:926:1: ( ( rule__LoadJSON__Group_6__0 )? )
            {
            // InternalMyDsl.g:926:1: ( ( rule__LoadJSON__Group_6__0 )? )
            // InternalMyDsl.g:927:2: ( rule__LoadJSON__Group_6__0 )?
            {
             before(grammarAccess.getLoadJSONAccess().getGroup_6()); 
            // InternalMyDsl.g:928:2: ( rule__LoadJSON__Group_6__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:928:3: rule__LoadJSON__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LoadJSON__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLoadJSONAccess().getGroup_6()); 

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


    // $ANTLR start "rule__LoadJSON__Group_5__0"
    // InternalMyDsl.g:937:1: rule__LoadJSON__Group_5__0 : rule__LoadJSON__Group_5__0__Impl rule__LoadJSON__Group_5__1 ;
    public final void rule__LoadJSON__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:941:1: ( rule__LoadJSON__Group_5__0__Impl rule__LoadJSON__Group_5__1 )
            // InternalMyDsl.g:942:2: rule__LoadJSON__Group_5__0__Impl rule__LoadJSON__Group_5__1
            {
            pushFollow(FOLLOW_9);
            rule__LoadJSON__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoadJSON__Group_5__1();

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
    // $ANTLR end "rule__LoadJSON__Group_5__0"


    // $ANTLR start "rule__LoadJSON__Group_5__0__Impl"
    // InternalMyDsl.g:949:1: rule__LoadJSON__Group_5__0__Impl : ( 'withAttributes' ) ;
    public final void rule__LoadJSON__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:953:1: ( ( 'withAttributes' ) )
            // InternalMyDsl.g:954:1: ( 'withAttributes' )
            {
            // InternalMyDsl.g:954:1: ( 'withAttributes' )
            // InternalMyDsl.g:955:2: 'withAttributes'
            {
             before(grammarAccess.getLoadJSONAccess().getWithAttributesKeyword_5_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getLoadJSONAccess().getWithAttributesKeyword_5_0()); 

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
    // $ANTLR end "rule__LoadJSON__Group_5__0__Impl"


    // $ANTLR start "rule__LoadJSON__Group_5__1"
    // InternalMyDsl.g:964:1: rule__LoadJSON__Group_5__1 : rule__LoadJSON__Group_5__1__Impl rule__LoadJSON__Group_5__2 ;
    public final void rule__LoadJSON__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:968:1: ( rule__LoadJSON__Group_5__1__Impl rule__LoadJSON__Group_5__2 )
            // InternalMyDsl.g:969:2: rule__LoadJSON__Group_5__1__Impl rule__LoadJSON__Group_5__2
            {
            pushFollow(FOLLOW_6);
            rule__LoadJSON__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoadJSON__Group_5__2();

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
    // $ANTLR end "rule__LoadJSON__Group_5__1"


    // $ANTLR start "rule__LoadJSON__Group_5__1__Impl"
    // InternalMyDsl.g:976:1: rule__LoadJSON__Group_5__1__Impl : ( '(' ) ;
    public final void rule__LoadJSON__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:980:1: ( ( '(' ) )
            // InternalMyDsl.g:981:1: ( '(' )
            {
            // InternalMyDsl.g:981:1: ( '(' )
            // InternalMyDsl.g:982:2: '('
            {
             before(grammarAccess.getLoadJSONAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getLoadJSONAccess().getLeftParenthesisKeyword_5_1()); 

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
    // $ANTLR end "rule__LoadJSON__Group_5__1__Impl"


    // $ANTLR start "rule__LoadJSON__Group_5__2"
    // InternalMyDsl.g:991:1: rule__LoadJSON__Group_5__2 : rule__LoadJSON__Group_5__2__Impl rule__LoadJSON__Group_5__3 ;
    public final void rule__LoadJSON__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:995:1: ( rule__LoadJSON__Group_5__2__Impl rule__LoadJSON__Group_5__3 )
            // InternalMyDsl.g:996:2: rule__LoadJSON__Group_5__2__Impl rule__LoadJSON__Group_5__3
            {
            pushFollow(FOLLOW_10);
            rule__LoadJSON__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoadJSON__Group_5__3();

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
    // $ANTLR end "rule__LoadJSON__Group_5__2"


    // $ANTLR start "rule__LoadJSON__Group_5__2__Impl"
    // InternalMyDsl.g:1003:1: rule__LoadJSON__Group_5__2__Impl : ( ( rule__LoadJSON__AttributesAssignment_5_2 ) ) ;
    public final void rule__LoadJSON__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1007:1: ( ( ( rule__LoadJSON__AttributesAssignment_5_2 ) ) )
            // InternalMyDsl.g:1008:1: ( ( rule__LoadJSON__AttributesAssignment_5_2 ) )
            {
            // InternalMyDsl.g:1008:1: ( ( rule__LoadJSON__AttributesAssignment_5_2 ) )
            // InternalMyDsl.g:1009:2: ( rule__LoadJSON__AttributesAssignment_5_2 )
            {
             before(grammarAccess.getLoadJSONAccess().getAttributesAssignment_5_2()); 
            // InternalMyDsl.g:1010:2: ( rule__LoadJSON__AttributesAssignment_5_2 )
            // InternalMyDsl.g:1010:3: rule__LoadJSON__AttributesAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__LoadJSON__AttributesAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getLoadJSONAccess().getAttributesAssignment_5_2()); 

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
    // $ANTLR end "rule__LoadJSON__Group_5__2__Impl"


    // $ANTLR start "rule__LoadJSON__Group_5__3"
    // InternalMyDsl.g:1018:1: rule__LoadJSON__Group_5__3 : rule__LoadJSON__Group_5__3__Impl rule__LoadJSON__Group_5__4 ;
    public final void rule__LoadJSON__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1022:1: ( rule__LoadJSON__Group_5__3__Impl rule__LoadJSON__Group_5__4 )
            // InternalMyDsl.g:1023:2: rule__LoadJSON__Group_5__3__Impl rule__LoadJSON__Group_5__4
            {
            pushFollow(FOLLOW_10);
            rule__LoadJSON__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoadJSON__Group_5__4();

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
    // $ANTLR end "rule__LoadJSON__Group_5__3"


    // $ANTLR start "rule__LoadJSON__Group_5__3__Impl"
    // InternalMyDsl.g:1030:1: rule__LoadJSON__Group_5__3__Impl : ( ( rule__LoadJSON__Group_5_3__0 )* ) ;
    public final void rule__LoadJSON__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1034:1: ( ( ( rule__LoadJSON__Group_5_3__0 )* ) )
            // InternalMyDsl.g:1035:1: ( ( rule__LoadJSON__Group_5_3__0 )* )
            {
            // InternalMyDsl.g:1035:1: ( ( rule__LoadJSON__Group_5_3__0 )* )
            // InternalMyDsl.g:1036:2: ( rule__LoadJSON__Group_5_3__0 )*
            {
             before(grammarAccess.getLoadJSONAccess().getGroup_5_3()); 
            // InternalMyDsl.g:1037:2: ( rule__LoadJSON__Group_5_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:1037:3: rule__LoadJSON__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__LoadJSON__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getLoadJSONAccess().getGroup_5_3()); 

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
    // $ANTLR end "rule__LoadJSON__Group_5__3__Impl"


    // $ANTLR start "rule__LoadJSON__Group_5__4"
    // InternalMyDsl.g:1045:1: rule__LoadJSON__Group_5__4 : rule__LoadJSON__Group_5__4__Impl ;
    public final void rule__LoadJSON__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1049:1: ( rule__LoadJSON__Group_5__4__Impl )
            // InternalMyDsl.g:1050:2: rule__LoadJSON__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LoadJSON__Group_5__4__Impl();

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
    // $ANTLR end "rule__LoadJSON__Group_5__4"


    // $ANTLR start "rule__LoadJSON__Group_5__4__Impl"
    // InternalMyDsl.g:1056:1: rule__LoadJSON__Group_5__4__Impl : ( ')' ) ;
    public final void rule__LoadJSON__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1060:1: ( ( ')' ) )
            // InternalMyDsl.g:1061:1: ( ')' )
            {
            // InternalMyDsl.g:1061:1: ( ')' )
            // InternalMyDsl.g:1062:2: ')'
            {
             before(grammarAccess.getLoadJSONAccess().getRightParenthesisKeyword_5_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getLoadJSONAccess().getRightParenthesisKeyword_5_4()); 

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
    // $ANTLR end "rule__LoadJSON__Group_5__4__Impl"


    // $ANTLR start "rule__LoadJSON__Group_5_3__0"
    // InternalMyDsl.g:1072:1: rule__LoadJSON__Group_5_3__0 : rule__LoadJSON__Group_5_3__0__Impl rule__LoadJSON__Group_5_3__1 ;
    public final void rule__LoadJSON__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1076:1: ( rule__LoadJSON__Group_5_3__0__Impl rule__LoadJSON__Group_5_3__1 )
            // InternalMyDsl.g:1077:2: rule__LoadJSON__Group_5_3__0__Impl rule__LoadJSON__Group_5_3__1
            {
            pushFollow(FOLLOW_6);
            rule__LoadJSON__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoadJSON__Group_5_3__1();

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
    // $ANTLR end "rule__LoadJSON__Group_5_3__0"


    // $ANTLR start "rule__LoadJSON__Group_5_3__0__Impl"
    // InternalMyDsl.g:1084:1: rule__LoadJSON__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__LoadJSON__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1088:1: ( ( ',' ) )
            // InternalMyDsl.g:1089:1: ( ',' )
            {
            // InternalMyDsl.g:1089:1: ( ',' )
            // InternalMyDsl.g:1090:2: ','
            {
             before(grammarAccess.getLoadJSONAccess().getCommaKeyword_5_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getLoadJSONAccess().getCommaKeyword_5_3_0()); 

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
    // $ANTLR end "rule__LoadJSON__Group_5_3__0__Impl"


    // $ANTLR start "rule__LoadJSON__Group_5_3__1"
    // InternalMyDsl.g:1099:1: rule__LoadJSON__Group_5_3__1 : rule__LoadJSON__Group_5_3__1__Impl ;
    public final void rule__LoadJSON__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1103:1: ( rule__LoadJSON__Group_5_3__1__Impl )
            // InternalMyDsl.g:1104:2: rule__LoadJSON__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LoadJSON__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__LoadJSON__Group_5_3__1"


    // $ANTLR start "rule__LoadJSON__Group_5_3__1__Impl"
    // InternalMyDsl.g:1110:1: rule__LoadJSON__Group_5_3__1__Impl : ( ( rule__LoadJSON__AttributesAssignment_5_3_1 ) ) ;
    public final void rule__LoadJSON__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1114:1: ( ( ( rule__LoadJSON__AttributesAssignment_5_3_1 ) ) )
            // InternalMyDsl.g:1115:1: ( ( rule__LoadJSON__AttributesAssignment_5_3_1 ) )
            {
            // InternalMyDsl.g:1115:1: ( ( rule__LoadJSON__AttributesAssignment_5_3_1 ) )
            // InternalMyDsl.g:1116:2: ( rule__LoadJSON__AttributesAssignment_5_3_1 )
            {
             before(grammarAccess.getLoadJSONAccess().getAttributesAssignment_5_3_1()); 
            // InternalMyDsl.g:1117:2: ( rule__LoadJSON__AttributesAssignment_5_3_1 )
            // InternalMyDsl.g:1117:3: rule__LoadJSON__AttributesAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__LoadJSON__AttributesAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getLoadJSONAccess().getAttributesAssignment_5_3_1()); 

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
    // $ANTLR end "rule__LoadJSON__Group_5_3__1__Impl"


    // $ANTLR start "rule__LoadJSON__Group_6__0"
    // InternalMyDsl.g:1126:1: rule__LoadJSON__Group_6__0 : rule__LoadJSON__Group_6__0__Impl rule__LoadJSON__Group_6__1 ;
    public final void rule__LoadJSON__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1130:1: ( rule__LoadJSON__Group_6__0__Impl rule__LoadJSON__Group_6__1 )
            // InternalMyDsl.g:1131:2: rule__LoadJSON__Group_6__0__Impl rule__LoadJSON__Group_6__1
            {
            pushFollow(FOLLOW_9);
            rule__LoadJSON__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoadJSON__Group_6__1();

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
    // $ANTLR end "rule__LoadJSON__Group_6__0"


    // $ANTLR start "rule__LoadJSON__Group_6__0__Impl"
    // InternalMyDsl.g:1138:1: rule__LoadJSON__Group_6__0__Impl : ( 'nestedIn' ) ;
    public final void rule__LoadJSON__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1142:1: ( ( 'nestedIn' ) )
            // InternalMyDsl.g:1143:1: ( 'nestedIn' )
            {
            // InternalMyDsl.g:1143:1: ( 'nestedIn' )
            // InternalMyDsl.g:1144:2: 'nestedIn'
            {
             before(grammarAccess.getLoadJSONAccess().getNestedInKeyword_6_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getLoadJSONAccess().getNestedInKeyword_6_0()); 

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
    // $ANTLR end "rule__LoadJSON__Group_6__0__Impl"


    // $ANTLR start "rule__LoadJSON__Group_6__1"
    // InternalMyDsl.g:1153:1: rule__LoadJSON__Group_6__1 : rule__LoadJSON__Group_6__1__Impl rule__LoadJSON__Group_6__2 ;
    public final void rule__LoadJSON__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1157:1: ( rule__LoadJSON__Group_6__1__Impl rule__LoadJSON__Group_6__2 )
            // InternalMyDsl.g:1158:2: rule__LoadJSON__Group_6__1__Impl rule__LoadJSON__Group_6__2
            {
            pushFollow(FOLLOW_6);
            rule__LoadJSON__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoadJSON__Group_6__2();

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
    // $ANTLR end "rule__LoadJSON__Group_6__1"


    // $ANTLR start "rule__LoadJSON__Group_6__1__Impl"
    // InternalMyDsl.g:1165:1: rule__LoadJSON__Group_6__1__Impl : ( '(' ) ;
    public final void rule__LoadJSON__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1169:1: ( ( '(' ) )
            // InternalMyDsl.g:1170:1: ( '(' )
            {
            // InternalMyDsl.g:1170:1: ( '(' )
            // InternalMyDsl.g:1171:2: '('
            {
             before(grammarAccess.getLoadJSONAccess().getLeftParenthesisKeyword_6_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getLoadJSONAccess().getLeftParenthesisKeyword_6_1()); 

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
    // $ANTLR end "rule__LoadJSON__Group_6__1__Impl"


    // $ANTLR start "rule__LoadJSON__Group_6__2"
    // InternalMyDsl.g:1180:1: rule__LoadJSON__Group_6__2 : rule__LoadJSON__Group_6__2__Impl rule__LoadJSON__Group_6__3 ;
    public final void rule__LoadJSON__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1184:1: ( rule__LoadJSON__Group_6__2__Impl rule__LoadJSON__Group_6__3 )
            // InternalMyDsl.g:1185:2: rule__LoadJSON__Group_6__2__Impl rule__LoadJSON__Group_6__3
            {
            pushFollow(FOLLOW_10);
            rule__LoadJSON__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoadJSON__Group_6__3();

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
    // $ANTLR end "rule__LoadJSON__Group_6__2"


    // $ANTLR start "rule__LoadJSON__Group_6__2__Impl"
    // InternalMyDsl.g:1192:1: rule__LoadJSON__Group_6__2__Impl : ( ( rule__LoadJSON__NestedAssignment_6_2 ) ) ;
    public final void rule__LoadJSON__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1196:1: ( ( ( rule__LoadJSON__NestedAssignment_6_2 ) ) )
            // InternalMyDsl.g:1197:1: ( ( rule__LoadJSON__NestedAssignment_6_2 ) )
            {
            // InternalMyDsl.g:1197:1: ( ( rule__LoadJSON__NestedAssignment_6_2 ) )
            // InternalMyDsl.g:1198:2: ( rule__LoadJSON__NestedAssignment_6_2 )
            {
             before(grammarAccess.getLoadJSONAccess().getNestedAssignment_6_2()); 
            // InternalMyDsl.g:1199:2: ( rule__LoadJSON__NestedAssignment_6_2 )
            // InternalMyDsl.g:1199:3: rule__LoadJSON__NestedAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__LoadJSON__NestedAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getLoadJSONAccess().getNestedAssignment_6_2()); 

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
    // $ANTLR end "rule__LoadJSON__Group_6__2__Impl"


    // $ANTLR start "rule__LoadJSON__Group_6__3"
    // InternalMyDsl.g:1207:1: rule__LoadJSON__Group_6__3 : rule__LoadJSON__Group_6__3__Impl rule__LoadJSON__Group_6__4 ;
    public final void rule__LoadJSON__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1211:1: ( rule__LoadJSON__Group_6__3__Impl rule__LoadJSON__Group_6__4 )
            // InternalMyDsl.g:1212:2: rule__LoadJSON__Group_6__3__Impl rule__LoadJSON__Group_6__4
            {
            pushFollow(FOLLOW_10);
            rule__LoadJSON__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoadJSON__Group_6__4();

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
    // $ANTLR end "rule__LoadJSON__Group_6__3"


    // $ANTLR start "rule__LoadJSON__Group_6__3__Impl"
    // InternalMyDsl.g:1219:1: rule__LoadJSON__Group_6__3__Impl : ( ( rule__LoadJSON__Group_6_3__0 )* ) ;
    public final void rule__LoadJSON__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1223:1: ( ( ( rule__LoadJSON__Group_6_3__0 )* ) )
            // InternalMyDsl.g:1224:1: ( ( rule__LoadJSON__Group_6_3__0 )* )
            {
            // InternalMyDsl.g:1224:1: ( ( rule__LoadJSON__Group_6_3__0 )* )
            // InternalMyDsl.g:1225:2: ( rule__LoadJSON__Group_6_3__0 )*
            {
             before(grammarAccess.getLoadJSONAccess().getGroup_6_3()); 
            // InternalMyDsl.g:1226:2: ( rule__LoadJSON__Group_6_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:1226:3: rule__LoadJSON__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__LoadJSON__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getLoadJSONAccess().getGroup_6_3()); 

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
    // $ANTLR end "rule__LoadJSON__Group_6__3__Impl"


    // $ANTLR start "rule__LoadJSON__Group_6__4"
    // InternalMyDsl.g:1234:1: rule__LoadJSON__Group_6__4 : rule__LoadJSON__Group_6__4__Impl ;
    public final void rule__LoadJSON__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1238:1: ( rule__LoadJSON__Group_6__4__Impl )
            // InternalMyDsl.g:1239:2: rule__LoadJSON__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LoadJSON__Group_6__4__Impl();

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
    // $ANTLR end "rule__LoadJSON__Group_6__4"


    // $ANTLR start "rule__LoadJSON__Group_6__4__Impl"
    // InternalMyDsl.g:1245:1: rule__LoadJSON__Group_6__4__Impl : ( ')' ) ;
    public final void rule__LoadJSON__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1249:1: ( ( ')' ) )
            // InternalMyDsl.g:1250:1: ( ')' )
            {
            // InternalMyDsl.g:1250:1: ( ')' )
            // InternalMyDsl.g:1251:2: ')'
            {
             before(grammarAccess.getLoadJSONAccess().getRightParenthesisKeyword_6_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getLoadJSONAccess().getRightParenthesisKeyword_6_4()); 

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
    // $ANTLR end "rule__LoadJSON__Group_6__4__Impl"


    // $ANTLR start "rule__LoadJSON__Group_6_3__0"
    // InternalMyDsl.g:1261:1: rule__LoadJSON__Group_6_3__0 : rule__LoadJSON__Group_6_3__0__Impl rule__LoadJSON__Group_6_3__1 ;
    public final void rule__LoadJSON__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1265:1: ( rule__LoadJSON__Group_6_3__0__Impl rule__LoadJSON__Group_6_3__1 )
            // InternalMyDsl.g:1266:2: rule__LoadJSON__Group_6_3__0__Impl rule__LoadJSON__Group_6_3__1
            {
            pushFollow(FOLLOW_6);
            rule__LoadJSON__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoadJSON__Group_6_3__1();

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
    // $ANTLR end "rule__LoadJSON__Group_6_3__0"


    // $ANTLR start "rule__LoadJSON__Group_6_3__0__Impl"
    // InternalMyDsl.g:1273:1: rule__LoadJSON__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__LoadJSON__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1277:1: ( ( ',' ) )
            // InternalMyDsl.g:1278:1: ( ',' )
            {
            // InternalMyDsl.g:1278:1: ( ',' )
            // InternalMyDsl.g:1279:2: ','
            {
             before(grammarAccess.getLoadJSONAccess().getCommaKeyword_6_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getLoadJSONAccess().getCommaKeyword_6_3_0()); 

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
    // $ANTLR end "rule__LoadJSON__Group_6_3__0__Impl"


    // $ANTLR start "rule__LoadJSON__Group_6_3__1"
    // InternalMyDsl.g:1288:1: rule__LoadJSON__Group_6_3__1 : rule__LoadJSON__Group_6_3__1__Impl ;
    public final void rule__LoadJSON__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1292:1: ( rule__LoadJSON__Group_6_3__1__Impl )
            // InternalMyDsl.g:1293:2: rule__LoadJSON__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LoadJSON__Group_6_3__1__Impl();

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
    // $ANTLR end "rule__LoadJSON__Group_6_3__1"


    // $ANTLR start "rule__LoadJSON__Group_6_3__1__Impl"
    // InternalMyDsl.g:1299:1: rule__LoadJSON__Group_6_3__1__Impl : ( ( rule__LoadJSON__NestedAssignment_6_3_1 ) ) ;
    public final void rule__LoadJSON__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1303:1: ( ( ( rule__LoadJSON__NestedAssignment_6_3_1 ) ) )
            // InternalMyDsl.g:1304:1: ( ( rule__LoadJSON__NestedAssignment_6_3_1 ) )
            {
            // InternalMyDsl.g:1304:1: ( ( rule__LoadJSON__NestedAssignment_6_3_1 ) )
            // InternalMyDsl.g:1305:2: ( rule__LoadJSON__NestedAssignment_6_3_1 )
            {
             before(grammarAccess.getLoadJSONAccess().getNestedAssignment_6_3_1()); 
            // InternalMyDsl.g:1306:2: ( rule__LoadJSON__NestedAssignment_6_3_1 )
            // InternalMyDsl.g:1306:3: rule__LoadJSON__NestedAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__LoadJSON__NestedAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getLoadJSONAccess().getNestedAssignment_6_3_1()); 

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
    // $ANTLR end "rule__LoadJSON__Group_6_3__1__Impl"


    // $ANTLR start "rule__LoadXML__Group__0"
    // InternalMyDsl.g:1315:1: rule__LoadXML__Group__0 : rule__LoadXML__Group__0__Impl rule__LoadXML__Group__1 ;
    public final void rule__LoadXML__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1319:1: ( rule__LoadXML__Group__0__Impl rule__LoadXML__Group__1 )
            // InternalMyDsl.g:1320:2: rule__LoadXML__Group__0__Impl rule__LoadXML__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyDsl.g:1327:1: rule__LoadXML__Group__0__Impl : ( 'loadXML' ) ;
    public final void rule__LoadXML__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1331:1: ( ( 'loadXML' ) )
            // InternalMyDsl.g:1332:1: ( 'loadXML' )
            {
            // InternalMyDsl.g:1332:1: ( 'loadXML' )
            // InternalMyDsl.g:1333:2: 'loadXML'
            {
             before(grammarAccess.getLoadXMLAccess().getLoadXMLKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalMyDsl.g:1342:1: rule__LoadXML__Group__1 : rule__LoadXML__Group__1__Impl rule__LoadXML__Group__2 ;
    public final void rule__LoadXML__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1346:1: ( rule__LoadXML__Group__1__Impl rule__LoadXML__Group__2 )
            // InternalMyDsl.g:1347:2: rule__LoadXML__Group__1__Impl rule__LoadXML__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:1354:1: rule__LoadXML__Group__1__Impl : ( 'from' ) ;
    public final void rule__LoadXML__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1358:1: ( ( 'from' ) )
            // InternalMyDsl.g:1359:1: ( 'from' )
            {
            // InternalMyDsl.g:1359:1: ( 'from' )
            // InternalMyDsl.g:1360:2: 'from'
            {
             before(grammarAccess.getLoadXMLAccess().getFromKeyword_1()); 
            match(input,14,FOLLOW_2); 
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
    // InternalMyDsl.g:1369:1: rule__LoadXML__Group__2 : rule__LoadXML__Group__2__Impl rule__LoadXML__Group__3 ;
    public final void rule__LoadXML__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1373:1: ( rule__LoadXML__Group__2__Impl rule__LoadXML__Group__3 )
            // InternalMyDsl.g:1374:2: rule__LoadXML__Group__2__Impl rule__LoadXML__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:1381:1: rule__LoadXML__Group__2__Impl : ( ( rule__LoadXML__FileAssignment_2 ) ) ;
    public final void rule__LoadXML__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1385:1: ( ( ( rule__LoadXML__FileAssignment_2 ) ) )
            // InternalMyDsl.g:1386:1: ( ( rule__LoadXML__FileAssignment_2 ) )
            {
            // InternalMyDsl.g:1386:1: ( ( rule__LoadXML__FileAssignment_2 ) )
            // InternalMyDsl.g:1387:2: ( rule__LoadXML__FileAssignment_2 )
            {
             before(grammarAccess.getLoadXMLAccess().getFileAssignment_2()); 
            // InternalMyDsl.g:1388:2: ( rule__LoadXML__FileAssignment_2 )
            // InternalMyDsl.g:1388:3: rule__LoadXML__FileAssignment_2
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
    // InternalMyDsl.g:1396:1: rule__LoadXML__Group__3 : rule__LoadXML__Group__3__Impl rule__LoadXML__Group__4 ;
    public final void rule__LoadXML__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1400:1: ( rule__LoadXML__Group__3__Impl rule__LoadXML__Group__4 )
            // InternalMyDsl.g:1401:2: rule__LoadXML__Group__3__Impl rule__LoadXML__Group__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:1408:1: rule__LoadXML__Group__3__Impl : ( 'into' ) ;
    public final void rule__LoadXML__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1412:1: ( ( 'into' ) )
            // InternalMyDsl.g:1413:1: ( 'into' )
            {
            // InternalMyDsl.g:1413:1: ( 'into' )
            // InternalMyDsl.g:1414:2: 'into'
            {
             before(grammarAccess.getLoadXMLAccess().getIntoKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getLoadXMLAccess().getIntoKeyword_3()); 

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
    // InternalMyDsl.g:1423:1: rule__LoadXML__Group__4 : rule__LoadXML__Group__4__Impl rule__LoadXML__Group__5 ;
    public final void rule__LoadXML__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1427:1: ( rule__LoadXML__Group__4__Impl rule__LoadXML__Group__5 )
            // InternalMyDsl.g:1428:2: rule__LoadXML__Group__4__Impl rule__LoadXML__Group__5
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:1435:1: rule__LoadXML__Group__4__Impl : ( ( rule__LoadXML__TableAssignment_4 ) ) ;
    public final void rule__LoadXML__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1439:1: ( ( ( rule__LoadXML__TableAssignment_4 ) ) )
            // InternalMyDsl.g:1440:1: ( ( rule__LoadXML__TableAssignment_4 ) )
            {
            // InternalMyDsl.g:1440:1: ( ( rule__LoadXML__TableAssignment_4 ) )
            // InternalMyDsl.g:1441:2: ( rule__LoadXML__TableAssignment_4 )
            {
             before(grammarAccess.getLoadXMLAccess().getTableAssignment_4()); 
            // InternalMyDsl.g:1442:2: ( rule__LoadXML__TableAssignment_4 )
            // InternalMyDsl.g:1442:3: rule__LoadXML__TableAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__LoadXML__TableAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLoadXMLAccess().getTableAssignment_4()); 

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
    // InternalMyDsl.g:1450:1: rule__LoadXML__Group__5 : rule__LoadXML__Group__5__Impl ;
    public final void rule__LoadXML__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1454:1: ( rule__LoadXML__Group__5__Impl )
            // InternalMyDsl.g:1455:2: rule__LoadXML__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LoadXML__Group__5__Impl();

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
    // InternalMyDsl.g:1461:1: rule__LoadXML__Group__5__Impl : ( ( rule__LoadXML__Group_5__0 )? ) ;
    public final void rule__LoadXML__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1465:1: ( ( ( rule__LoadXML__Group_5__0 )? ) )
            // InternalMyDsl.g:1466:1: ( ( rule__LoadXML__Group_5__0 )? )
            {
            // InternalMyDsl.g:1466:1: ( ( rule__LoadXML__Group_5__0 )? )
            // InternalMyDsl.g:1467:2: ( rule__LoadXML__Group_5__0 )?
            {
             before(grammarAccess.getLoadXMLAccess().getGroup_5()); 
            // InternalMyDsl.g:1468:2: ( rule__LoadXML__Group_5__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:1468:3: rule__LoadXML__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LoadXML__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLoadXMLAccess().getGroup_5()); 

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


    // $ANTLR start "rule__LoadXML__Group_5__0"
    // InternalMyDsl.g:1477:1: rule__LoadXML__Group_5__0 : rule__LoadXML__Group_5__0__Impl rule__LoadXML__Group_5__1 ;
    public final void rule__LoadXML__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1481:1: ( rule__LoadXML__Group_5__0__Impl rule__LoadXML__Group_5__1 )
            // InternalMyDsl.g:1482:2: rule__LoadXML__Group_5__0__Impl rule__LoadXML__Group_5__1
            {
            pushFollow(FOLLOW_9);
            rule__LoadXML__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoadXML__Group_5__1();

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
    // $ANTLR end "rule__LoadXML__Group_5__0"


    // $ANTLR start "rule__LoadXML__Group_5__0__Impl"
    // InternalMyDsl.g:1489:1: rule__LoadXML__Group_5__0__Impl : ( 'nestedIn' ) ;
    public final void rule__LoadXML__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1493:1: ( ( 'nestedIn' ) )
            // InternalMyDsl.g:1494:1: ( 'nestedIn' )
            {
            // InternalMyDsl.g:1494:1: ( 'nestedIn' )
            // InternalMyDsl.g:1495:2: 'nestedIn'
            {
             before(grammarAccess.getLoadXMLAccess().getNestedInKeyword_5_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getLoadXMLAccess().getNestedInKeyword_5_0()); 

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
    // $ANTLR end "rule__LoadXML__Group_5__0__Impl"


    // $ANTLR start "rule__LoadXML__Group_5__1"
    // InternalMyDsl.g:1504:1: rule__LoadXML__Group_5__1 : rule__LoadXML__Group_5__1__Impl rule__LoadXML__Group_5__2 ;
    public final void rule__LoadXML__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1508:1: ( rule__LoadXML__Group_5__1__Impl rule__LoadXML__Group_5__2 )
            // InternalMyDsl.g:1509:2: rule__LoadXML__Group_5__1__Impl rule__LoadXML__Group_5__2
            {
            pushFollow(FOLLOW_6);
            rule__LoadXML__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoadXML__Group_5__2();

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
    // $ANTLR end "rule__LoadXML__Group_5__1"


    // $ANTLR start "rule__LoadXML__Group_5__1__Impl"
    // InternalMyDsl.g:1516:1: rule__LoadXML__Group_5__1__Impl : ( '(' ) ;
    public final void rule__LoadXML__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1520:1: ( ( '(' ) )
            // InternalMyDsl.g:1521:1: ( '(' )
            {
            // InternalMyDsl.g:1521:1: ( '(' )
            // InternalMyDsl.g:1522:2: '('
            {
             before(grammarAccess.getLoadXMLAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getLoadXMLAccess().getLeftParenthesisKeyword_5_1()); 

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
    // $ANTLR end "rule__LoadXML__Group_5__1__Impl"


    // $ANTLR start "rule__LoadXML__Group_5__2"
    // InternalMyDsl.g:1531:1: rule__LoadXML__Group_5__2 : rule__LoadXML__Group_5__2__Impl rule__LoadXML__Group_5__3 ;
    public final void rule__LoadXML__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1535:1: ( rule__LoadXML__Group_5__2__Impl rule__LoadXML__Group_5__3 )
            // InternalMyDsl.g:1536:2: rule__LoadXML__Group_5__2__Impl rule__LoadXML__Group_5__3
            {
            pushFollow(FOLLOW_10);
            rule__LoadXML__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoadXML__Group_5__3();

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
    // $ANTLR end "rule__LoadXML__Group_5__2"


    // $ANTLR start "rule__LoadXML__Group_5__2__Impl"
    // InternalMyDsl.g:1543:1: rule__LoadXML__Group_5__2__Impl : ( ( rule__LoadXML__NestedAssignment_5_2 ) ) ;
    public final void rule__LoadXML__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1547:1: ( ( ( rule__LoadXML__NestedAssignment_5_2 ) ) )
            // InternalMyDsl.g:1548:1: ( ( rule__LoadXML__NestedAssignment_5_2 ) )
            {
            // InternalMyDsl.g:1548:1: ( ( rule__LoadXML__NestedAssignment_5_2 ) )
            // InternalMyDsl.g:1549:2: ( rule__LoadXML__NestedAssignment_5_2 )
            {
             before(grammarAccess.getLoadXMLAccess().getNestedAssignment_5_2()); 
            // InternalMyDsl.g:1550:2: ( rule__LoadXML__NestedAssignment_5_2 )
            // InternalMyDsl.g:1550:3: rule__LoadXML__NestedAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__LoadXML__NestedAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getLoadXMLAccess().getNestedAssignment_5_2()); 

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
    // $ANTLR end "rule__LoadXML__Group_5__2__Impl"


    // $ANTLR start "rule__LoadXML__Group_5__3"
    // InternalMyDsl.g:1558:1: rule__LoadXML__Group_5__3 : rule__LoadXML__Group_5__3__Impl rule__LoadXML__Group_5__4 ;
    public final void rule__LoadXML__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1562:1: ( rule__LoadXML__Group_5__3__Impl rule__LoadXML__Group_5__4 )
            // InternalMyDsl.g:1563:2: rule__LoadXML__Group_5__3__Impl rule__LoadXML__Group_5__4
            {
            pushFollow(FOLLOW_10);
            rule__LoadXML__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoadXML__Group_5__4();

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
    // $ANTLR end "rule__LoadXML__Group_5__3"


    // $ANTLR start "rule__LoadXML__Group_5__3__Impl"
    // InternalMyDsl.g:1570:1: rule__LoadXML__Group_5__3__Impl : ( ( rule__LoadXML__Group_5_3__0 )* ) ;
    public final void rule__LoadXML__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1574:1: ( ( ( rule__LoadXML__Group_5_3__0 )* ) )
            // InternalMyDsl.g:1575:1: ( ( rule__LoadXML__Group_5_3__0 )* )
            {
            // InternalMyDsl.g:1575:1: ( ( rule__LoadXML__Group_5_3__0 )* )
            // InternalMyDsl.g:1576:2: ( rule__LoadXML__Group_5_3__0 )*
            {
             before(grammarAccess.getLoadXMLAccess().getGroup_5_3()); 
            // InternalMyDsl.g:1577:2: ( rule__LoadXML__Group_5_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==19) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:1577:3: rule__LoadXML__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__LoadXML__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getLoadXMLAccess().getGroup_5_3()); 

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
    // $ANTLR end "rule__LoadXML__Group_5__3__Impl"


    // $ANTLR start "rule__LoadXML__Group_5__4"
    // InternalMyDsl.g:1585:1: rule__LoadXML__Group_5__4 : rule__LoadXML__Group_5__4__Impl ;
    public final void rule__LoadXML__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1589:1: ( rule__LoadXML__Group_5__4__Impl )
            // InternalMyDsl.g:1590:2: rule__LoadXML__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LoadXML__Group_5__4__Impl();

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
    // $ANTLR end "rule__LoadXML__Group_5__4"


    // $ANTLR start "rule__LoadXML__Group_5__4__Impl"
    // InternalMyDsl.g:1596:1: rule__LoadXML__Group_5__4__Impl : ( ')' ) ;
    public final void rule__LoadXML__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1600:1: ( ( ')' ) )
            // InternalMyDsl.g:1601:1: ( ')' )
            {
            // InternalMyDsl.g:1601:1: ( ')' )
            // InternalMyDsl.g:1602:2: ')'
            {
             before(grammarAccess.getLoadXMLAccess().getRightParenthesisKeyword_5_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getLoadXMLAccess().getRightParenthesisKeyword_5_4()); 

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
    // $ANTLR end "rule__LoadXML__Group_5__4__Impl"


    // $ANTLR start "rule__LoadXML__Group_5_3__0"
    // InternalMyDsl.g:1612:1: rule__LoadXML__Group_5_3__0 : rule__LoadXML__Group_5_3__0__Impl rule__LoadXML__Group_5_3__1 ;
    public final void rule__LoadXML__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1616:1: ( rule__LoadXML__Group_5_3__0__Impl rule__LoadXML__Group_5_3__1 )
            // InternalMyDsl.g:1617:2: rule__LoadXML__Group_5_3__0__Impl rule__LoadXML__Group_5_3__1
            {
            pushFollow(FOLLOW_6);
            rule__LoadXML__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoadXML__Group_5_3__1();

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
    // $ANTLR end "rule__LoadXML__Group_5_3__0"


    // $ANTLR start "rule__LoadXML__Group_5_3__0__Impl"
    // InternalMyDsl.g:1624:1: rule__LoadXML__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__LoadXML__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1628:1: ( ( ',' ) )
            // InternalMyDsl.g:1629:1: ( ',' )
            {
            // InternalMyDsl.g:1629:1: ( ',' )
            // InternalMyDsl.g:1630:2: ','
            {
             before(grammarAccess.getLoadXMLAccess().getCommaKeyword_5_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getLoadXMLAccess().getCommaKeyword_5_3_0()); 

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
    // $ANTLR end "rule__LoadXML__Group_5_3__0__Impl"


    // $ANTLR start "rule__LoadXML__Group_5_3__1"
    // InternalMyDsl.g:1639:1: rule__LoadXML__Group_5_3__1 : rule__LoadXML__Group_5_3__1__Impl ;
    public final void rule__LoadXML__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1643:1: ( rule__LoadXML__Group_5_3__1__Impl )
            // InternalMyDsl.g:1644:2: rule__LoadXML__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LoadXML__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__LoadXML__Group_5_3__1"


    // $ANTLR start "rule__LoadXML__Group_5_3__1__Impl"
    // InternalMyDsl.g:1650:1: rule__LoadXML__Group_5_3__1__Impl : ( ( rule__LoadXML__NestedAssignment_5_3_1 ) ) ;
    public final void rule__LoadXML__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1654:1: ( ( ( rule__LoadXML__NestedAssignment_5_3_1 ) ) )
            // InternalMyDsl.g:1655:1: ( ( rule__LoadXML__NestedAssignment_5_3_1 ) )
            {
            // InternalMyDsl.g:1655:1: ( ( rule__LoadXML__NestedAssignment_5_3_1 ) )
            // InternalMyDsl.g:1656:2: ( rule__LoadXML__NestedAssignment_5_3_1 )
            {
             before(grammarAccess.getLoadXMLAccess().getNestedAssignment_5_3_1()); 
            // InternalMyDsl.g:1657:2: ( rule__LoadXML__NestedAssignment_5_3_1 )
            // InternalMyDsl.g:1657:3: rule__LoadXML__NestedAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__LoadXML__NestedAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getLoadXMLAccess().getNestedAssignment_5_3_1()); 

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
    // $ANTLR end "rule__LoadXML__Group_5_3__1__Impl"


    // $ANTLR start "rule__LoadYAML__Group__0"
    // InternalMyDsl.g:1666:1: rule__LoadYAML__Group__0 : rule__LoadYAML__Group__0__Impl rule__LoadYAML__Group__1 ;
    public final void rule__LoadYAML__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1670:1: ( rule__LoadYAML__Group__0__Impl rule__LoadYAML__Group__1 )
            // InternalMyDsl.g:1671:2: rule__LoadYAML__Group__0__Impl rule__LoadYAML__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyDsl.g:1678:1: rule__LoadYAML__Group__0__Impl : ( 'loadYAML' ) ;
    public final void rule__LoadYAML__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1682:1: ( ( 'loadYAML' ) )
            // InternalMyDsl.g:1683:1: ( 'loadYAML' )
            {
            // InternalMyDsl.g:1683:1: ( 'loadYAML' )
            // InternalMyDsl.g:1684:2: 'loadYAML'
            {
             before(grammarAccess.getLoadYAMLAccess().getLoadYAMLKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalMyDsl.g:1693:1: rule__LoadYAML__Group__1 : rule__LoadYAML__Group__1__Impl rule__LoadYAML__Group__2 ;
    public final void rule__LoadYAML__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1697:1: ( rule__LoadYAML__Group__1__Impl rule__LoadYAML__Group__2 )
            // InternalMyDsl.g:1698:2: rule__LoadYAML__Group__1__Impl rule__LoadYAML__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:1705:1: rule__LoadYAML__Group__1__Impl : ( 'from' ) ;
    public final void rule__LoadYAML__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1709:1: ( ( 'from' ) )
            // InternalMyDsl.g:1710:1: ( 'from' )
            {
            // InternalMyDsl.g:1710:1: ( 'from' )
            // InternalMyDsl.g:1711:2: 'from'
            {
             before(grammarAccess.getLoadYAMLAccess().getFromKeyword_1()); 
            match(input,14,FOLLOW_2); 
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
    // InternalMyDsl.g:1720:1: rule__LoadYAML__Group__2 : rule__LoadYAML__Group__2__Impl rule__LoadYAML__Group__3 ;
    public final void rule__LoadYAML__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1724:1: ( rule__LoadYAML__Group__2__Impl rule__LoadYAML__Group__3 )
            // InternalMyDsl.g:1725:2: rule__LoadYAML__Group__2__Impl rule__LoadYAML__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:1732:1: rule__LoadYAML__Group__2__Impl : ( ( rule__LoadYAML__FileAssignment_2 ) ) ;
    public final void rule__LoadYAML__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1736:1: ( ( ( rule__LoadYAML__FileAssignment_2 ) ) )
            // InternalMyDsl.g:1737:1: ( ( rule__LoadYAML__FileAssignment_2 ) )
            {
            // InternalMyDsl.g:1737:1: ( ( rule__LoadYAML__FileAssignment_2 ) )
            // InternalMyDsl.g:1738:2: ( rule__LoadYAML__FileAssignment_2 )
            {
             before(grammarAccess.getLoadYAMLAccess().getFileAssignment_2()); 
            // InternalMyDsl.g:1739:2: ( rule__LoadYAML__FileAssignment_2 )
            // InternalMyDsl.g:1739:3: rule__LoadYAML__FileAssignment_2
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
    // InternalMyDsl.g:1747:1: rule__LoadYAML__Group__3 : rule__LoadYAML__Group__3__Impl rule__LoadYAML__Group__4 ;
    public final void rule__LoadYAML__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1751:1: ( rule__LoadYAML__Group__3__Impl rule__LoadYAML__Group__4 )
            // InternalMyDsl.g:1752:2: rule__LoadYAML__Group__3__Impl rule__LoadYAML__Group__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:1759:1: rule__LoadYAML__Group__3__Impl : ( 'into' ) ;
    public final void rule__LoadYAML__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1763:1: ( ( 'into' ) )
            // InternalMyDsl.g:1764:1: ( 'into' )
            {
            // InternalMyDsl.g:1764:1: ( 'into' )
            // InternalMyDsl.g:1765:2: 'into'
            {
             before(grammarAccess.getLoadYAMLAccess().getIntoKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getLoadYAMLAccess().getIntoKeyword_3()); 

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
    // InternalMyDsl.g:1774:1: rule__LoadYAML__Group__4 : rule__LoadYAML__Group__4__Impl rule__LoadYAML__Group__5 ;
    public final void rule__LoadYAML__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1778:1: ( rule__LoadYAML__Group__4__Impl rule__LoadYAML__Group__5 )
            // InternalMyDsl.g:1779:2: rule__LoadYAML__Group__4__Impl rule__LoadYAML__Group__5
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:1786:1: rule__LoadYAML__Group__4__Impl : ( ( rule__LoadYAML__TableAssignment_4 ) ) ;
    public final void rule__LoadYAML__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1790:1: ( ( ( rule__LoadYAML__TableAssignment_4 ) ) )
            // InternalMyDsl.g:1791:1: ( ( rule__LoadYAML__TableAssignment_4 ) )
            {
            // InternalMyDsl.g:1791:1: ( ( rule__LoadYAML__TableAssignment_4 ) )
            // InternalMyDsl.g:1792:2: ( rule__LoadYAML__TableAssignment_4 )
            {
             before(grammarAccess.getLoadYAMLAccess().getTableAssignment_4()); 
            // InternalMyDsl.g:1793:2: ( rule__LoadYAML__TableAssignment_4 )
            // InternalMyDsl.g:1793:3: rule__LoadYAML__TableAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__LoadYAML__TableAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLoadYAMLAccess().getTableAssignment_4()); 

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
    // InternalMyDsl.g:1801:1: rule__LoadYAML__Group__5 : rule__LoadYAML__Group__5__Impl ;
    public final void rule__LoadYAML__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1805:1: ( rule__LoadYAML__Group__5__Impl )
            // InternalMyDsl.g:1806:2: rule__LoadYAML__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LoadYAML__Group__5__Impl();

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
    // InternalMyDsl.g:1812:1: rule__LoadYAML__Group__5__Impl : ( ( rule__LoadYAML__Group_5__0 )? ) ;
    public final void rule__LoadYAML__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1816:1: ( ( ( rule__LoadYAML__Group_5__0 )? ) )
            // InternalMyDsl.g:1817:1: ( ( rule__LoadYAML__Group_5__0 )? )
            {
            // InternalMyDsl.g:1817:1: ( ( rule__LoadYAML__Group_5__0 )? )
            // InternalMyDsl.g:1818:2: ( rule__LoadYAML__Group_5__0 )?
            {
             before(grammarAccess.getLoadYAMLAccess().getGroup_5()); 
            // InternalMyDsl.g:1819:2: ( rule__LoadYAML__Group_5__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:1819:3: rule__LoadYAML__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LoadYAML__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLoadYAMLAccess().getGroup_5()); 

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


    // $ANTLR start "rule__LoadYAML__Group_5__0"
    // InternalMyDsl.g:1828:1: rule__LoadYAML__Group_5__0 : rule__LoadYAML__Group_5__0__Impl rule__LoadYAML__Group_5__1 ;
    public final void rule__LoadYAML__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1832:1: ( rule__LoadYAML__Group_5__0__Impl rule__LoadYAML__Group_5__1 )
            // InternalMyDsl.g:1833:2: rule__LoadYAML__Group_5__0__Impl rule__LoadYAML__Group_5__1
            {
            pushFollow(FOLLOW_9);
            rule__LoadYAML__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoadYAML__Group_5__1();

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
    // $ANTLR end "rule__LoadYAML__Group_5__0"


    // $ANTLR start "rule__LoadYAML__Group_5__0__Impl"
    // InternalMyDsl.g:1840:1: rule__LoadYAML__Group_5__0__Impl : ( 'nestedIn' ) ;
    public final void rule__LoadYAML__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1844:1: ( ( 'nestedIn' ) )
            // InternalMyDsl.g:1845:1: ( 'nestedIn' )
            {
            // InternalMyDsl.g:1845:1: ( 'nestedIn' )
            // InternalMyDsl.g:1846:2: 'nestedIn'
            {
             before(grammarAccess.getLoadYAMLAccess().getNestedInKeyword_5_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getLoadYAMLAccess().getNestedInKeyword_5_0()); 

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
    // $ANTLR end "rule__LoadYAML__Group_5__0__Impl"


    // $ANTLR start "rule__LoadYAML__Group_5__1"
    // InternalMyDsl.g:1855:1: rule__LoadYAML__Group_5__1 : rule__LoadYAML__Group_5__1__Impl rule__LoadYAML__Group_5__2 ;
    public final void rule__LoadYAML__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1859:1: ( rule__LoadYAML__Group_5__1__Impl rule__LoadYAML__Group_5__2 )
            // InternalMyDsl.g:1860:2: rule__LoadYAML__Group_5__1__Impl rule__LoadYAML__Group_5__2
            {
            pushFollow(FOLLOW_6);
            rule__LoadYAML__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoadYAML__Group_5__2();

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
    // $ANTLR end "rule__LoadYAML__Group_5__1"


    // $ANTLR start "rule__LoadYAML__Group_5__1__Impl"
    // InternalMyDsl.g:1867:1: rule__LoadYAML__Group_5__1__Impl : ( '(' ) ;
    public final void rule__LoadYAML__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1871:1: ( ( '(' ) )
            // InternalMyDsl.g:1872:1: ( '(' )
            {
            // InternalMyDsl.g:1872:1: ( '(' )
            // InternalMyDsl.g:1873:2: '('
            {
             before(grammarAccess.getLoadYAMLAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getLoadYAMLAccess().getLeftParenthesisKeyword_5_1()); 

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
    // $ANTLR end "rule__LoadYAML__Group_5__1__Impl"


    // $ANTLR start "rule__LoadYAML__Group_5__2"
    // InternalMyDsl.g:1882:1: rule__LoadYAML__Group_5__2 : rule__LoadYAML__Group_5__2__Impl rule__LoadYAML__Group_5__3 ;
    public final void rule__LoadYAML__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1886:1: ( rule__LoadYAML__Group_5__2__Impl rule__LoadYAML__Group_5__3 )
            // InternalMyDsl.g:1887:2: rule__LoadYAML__Group_5__2__Impl rule__LoadYAML__Group_5__3
            {
            pushFollow(FOLLOW_10);
            rule__LoadYAML__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoadYAML__Group_5__3();

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
    // $ANTLR end "rule__LoadYAML__Group_5__2"


    // $ANTLR start "rule__LoadYAML__Group_5__2__Impl"
    // InternalMyDsl.g:1894:1: rule__LoadYAML__Group_5__2__Impl : ( ( rule__LoadYAML__NestedAssignment_5_2 ) ) ;
    public final void rule__LoadYAML__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1898:1: ( ( ( rule__LoadYAML__NestedAssignment_5_2 ) ) )
            // InternalMyDsl.g:1899:1: ( ( rule__LoadYAML__NestedAssignment_5_2 ) )
            {
            // InternalMyDsl.g:1899:1: ( ( rule__LoadYAML__NestedAssignment_5_2 ) )
            // InternalMyDsl.g:1900:2: ( rule__LoadYAML__NestedAssignment_5_2 )
            {
             before(grammarAccess.getLoadYAMLAccess().getNestedAssignment_5_2()); 
            // InternalMyDsl.g:1901:2: ( rule__LoadYAML__NestedAssignment_5_2 )
            // InternalMyDsl.g:1901:3: rule__LoadYAML__NestedAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__LoadYAML__NestedAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getLoadYAMLAccess().getNestedAssignment_5_2()); 

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
    // $ANTLR end "rule__LoadYAML__Group_5__2__Impl"


    // $ANTLR start "rule__LoadYAML__Group_5__3"
    // InternalMyDsl.g:1909:1: rule__LoadYAML__Group_5__3 : rule__LoadYAML__Group_5__3__Impl rule__LoadYAML__Group_5__4 ;
    public final void rule__LoadYAML__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1913:1: ( rule__LoadYAML__Group_5__3__Impl rule__LoadYAML__Group_5__4 )
            // InternalMyDsl.g:1914:2: rule__LoadYAML__Group_5__3__Impl rule__LoadYAML__Group_5__4
            {
            pushFollow(FOLLOW_10);
            rule__LoadYAML__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoadYAML__Group_5__4();

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
    // $ANTLR end "rule__LoadYAML__Group_5__3"


    // $ANTLR start "rule__LoadYAML__Group_5__3__Impl"
    // InternalMyDsl.g:1921:1: rule__LoadYAML__Group_5__3__Impl : ( ( rule__LoadYAML__Group_5_3__0 )* ) ;
    public final void rule__LoadYAML__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1925:1: ( ( ( rule__LoadYAML__Group_5_3__0 )* ) )
            // InternalMyDsl.g:1926:1: ( ( rule__LoadYAML__Group_5_3__0 )* )
            {
            // InternalMyDsl.g:1926:1: ( ( rule__LoadYAML__Group_5_3__0 )* )
            // InternalMyDsl.g:1927:2: ( rule__LoadYAML__Group_5_3__0 )*
            {
             before(grammarAccess.getLoadYAMLAccess().getGroup_5_3()); 
            // InternalMyDsl.g:1928:2: ( rule__LoadYAML__Group_5_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==19) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:1928:3: rule__LoadYAML__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__LoadYAML__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getLoadYAMLAccess().getGroup_5_3()); 

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
    // $ANTLR end "rule__LoadYAML__Group_5__3__Impl"


    // $ANTLR start "rule__LoadYAML__Group_5__4"
    // InternalMyDsl.g:1936:1: rule__LoadYAML__Group_5__4 : rule__LoadYAML__Group_5__4__Impl ;
    public final void rule__LoadYAML__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1940:1: ( rule__LoadYAML__Group_5__4__Impl )
            // InternalMyDsl.g:1941:2: rule__LoadYAML__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LoadYAML__Group_5__4__Impl();

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
    // $ANTLR end "rule__LoadYAML__Group_5__4"


    // $ANTLR start "rule__LoadYAML__Group_5__4__Impl"
    // InternalMyDsl.g:1947:1: rule__LoadYAML__Group_5__4__Impl : ( ')' ) ;
    public final void rule__LoadYAML__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1951:1: ( ( ')' ) )
            // InternalMyDsl.g:1952:1: ( ')' )
            {
            // InternalMyDsl.g:1952:1: ( ')' )
            // InternalMyDsl.g:1953:2: ')'
            {
             before(grammarAccess.getLoadYAMLAccess().getRightParenthesisKeyword_5_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getLoadYAMLAccess().getRightParenthesisKeyword_5_4()); 

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
    // $ANTLR end "rule__LoadYAML__Group_5__4__Impl"


    // $ANTLR start "rule__LoadYAML__Group_5_3__0"
    // InternalMyDsl.g:1963:1: rule__LoadYAML__Group_5_3__0 : rule__LoadYAML__Group_5_3__0__Impl rule__LoadYAML__Group_5_3__1 ;
    public final void rule__LoadYAML__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1967:1: ( rule__LoadYAML__Group_5_3__0__Impl rule__LoadYAML__Group_5_3__1 )
            // InternalMyDsl.g:1968:2: rule__LoadYAML__Group_5_3__0__Impl rule__LoadYAML__Group_5_3__1
            {
            pushFollow(FOLLOW_6);
            rule__LoadYAML__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoadYAML__Group_5_3__1();

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
    // $ANTLR end "rule__LoadYAML__Group_5_3__0"


    // $ANTLR start "rule__LoadYAML__Group_5_3__0__Impl"
    // InternalMyDsl.g:1975:1: rule__LoadYAML__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__LoadYAML__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1979:1: ( ( ',' ) )
            // InternalMyDsl.g:1980:1: ( ',' )
            {
            // InternalMyDsl.g:1980:1: ( ',' )
            // InternalMyDsl.g:1981:2: ','
            {
             before(grammarAccess.getLoadYAMLAccess().getCommaKeyword_5_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getLoadYAMLAccess().getCommaKeyword_5_3_0()); 

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
    // $ANTLR end "rule__LoadYAML__Group_5_3__0__Impl"


    // $ANTLR start "rule__LoadYAML__Group_5_3__1"
    // InternalMyDsl.g:1990:1: rule__LoadYAML__Group_5_3__1 : rule__LoadYAML__Group_5_3__1__Impl ;
    public final void rule__LoadYAML__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1994:1: ( rule__LoadYAML__Group_5_3__1__Impl )
            // InternalMyDsl.g:1995:2: rule__LoadYAML__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LoadYAML__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__LoadYAML__Group_5_3__1"


    // $ANTLR start "rule__LoadYAML__Group_5_3__1__Impl"
    // InternalMyDsl.g:2001:1: rule__LoadYAML__Group_5_3__1__Impl : ( ( rule__LoadYAML__NestedAssignment_5_3_1 ) ) ;
    public final void rule__LoadYAML__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2005:1: ( ( ( rule__LoadYAML__NestedAssignment_5_3_1 ) ) )
            // InternalMyDsl.g:2006:1: ( ( rule__LoadYAML__NestedAssignment_5_3_1 ) )
            {
            // InternalMyDsl.g:2006:1: ( ( rule__LoadYAML__NestedAssignment_5_3_1 ) )
            // InternalMyDsl.g:2007:2: ( rule__LoadYAML__NestedAssignment_5_3_1 )
            {
             before(grammarAccess.getLoadYAMLAccess().getNestedAssignment_5_3_1()); 
            // InternalMyDsl.g:2008:2: ( rule__LoadYAML__NestedAssignment_5_3_1 )
            // InternalMyDsl.g:2008:3: rule__LoadYAML__NestedAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__LoadYAML__NestedAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getLoadYAMLAccess().getNestedAssignment_5_3_1()); 

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
    // $ANTLR end "rule__LoadYAML__Group_5_3__1__Impl"


    // $ANTLR start "rule__SelectOperation__Group__0"
    // InternalMyDsl.g:2017:1: rule__SelectOperation__Group__0 : rule__SelectOperation__Group__0__Impl rule__SelectOperation__Group__1 ;
    public final void rule__SelectOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2021:1: ( rule__SelectOperation__Group__0__Impl rule__SelectOperation__Group__1 )
            // InternalMyDsl.g:2022:2: rule__SelectOperation__Group__0__Impl rule__SelectOperation__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalMyDsl.g:2029:1: rule__SelectOperation__Group__0__Impl : ( 'select' ) ;
    public final void rule__SelectOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2033:1: ( ( 'select' ) )
            // InternalMyDsl.g:2034:1: ( 'select' )
            {
            // InternalMyDsl.g:2034:1: ( 'select' )
            // InternalMyDsl.g:2035:2: 'select'
            {
             before(grammarAccess.getSelectOperationAccess().getSelectKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalMyDsl.g:2044:1: rule__SelectOperation__Group__1 : rule__SelectOperation__Group__1__Impl rule__SelectOperation__Group__2 ;
    public final void rule__SelectOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2048:1: ( rule__SelectOperation__Group__1__Impl rule__SelectOperation__Group__2 )
            // InternalMyDsl.g:2049:2: rule__SelectOperation__Group__1__Impl rule__SelectOperation__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:2056:1: rule__SelectOperation__Group__1__Impl : ( 'columns' ) ;
    public final void rule__SelectOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2060:1: ( ( 'columns' ) )
            // InternalMyDsl.g:2061:1: ( 'columns' )
            {
            // InternalMyDsl.g:2061:1: ( 'columns' )
            // InternalMyDsl.g:2062:2: 'columns'
            {
             before(grammarAccess.getSelectOperationAccess().getColumnsKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMyDsl.g:2071:1: rule__SelectOperation__Group__2 : rule__SelectOperation__Group__2__Impl rule__SelectOperation__Group__3 ;
    public final void rule__SelectOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2075:1: ( rule__SelectOperation__Group__2__Impl rule__SelectOperation__Group__3 )
            // InternalMyDsl.g:2076:2: rule__SelectOperation__Group__2__Impl rule__SelectOperation__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:2083:1: rule__SelectOperation__Group__2__Impl : ( '(' ) ;
    public final void rule__SelectOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2087:1: ( ( '(' ) )
            // InternalMyDsl.g:2088:1: ( '(' )
            {
            // InternalMyDsl.g:2088:1: ( '(' )
            // InternalMyDsl.g:2089:2: '('
            {
             before(grammarAccess.getSelectOperationAccess().getLeftParenthesisKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSelectOperationAccess().getLeftParenthesisKeyword_2()); 

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
    // InternalMyDsl.g:2098:1: rule__SelectOperation__Group__3 : rule__SelectOperation__Group__3__Impl rule__SelectOperation__Group__4 ;
    public final void rule__SelectOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2102:1: ( rule__SelectOperation__Group__3__Impl rule__SelectOperation__Group__4 )
            // InternalMyDsl.g:2103:2: rule__SelectOperation__Group__3__Impl rule__SelectOperation__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:2110:1: rule__SelectOperation__Group__3__Impl : ( ( rule__SelectOperation__ColumnsAssignment_3 ) ) ;
    public final void rule__SelectOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2114:1: ( ( ( rule__SelectOperation__ColumnsAssignment_3 ) ) )
            // InternalMyDsl.g:2115:1: ( ( rule__SelectOperation__ColumnsAssignment_3 ) )
            {
            // InternalMyDsl.g:2115:1: ( ( rule__SelectOperation__ColumnsAssignment_3 ) )
            // InternalMyDsl.g:2116:2: ( rule__SelectOperation__ColumnsAssignment_3 )
            {
             before(grammarAccess.getSelectOperationAccess().getColumnsAssignment_3()); 
            // InternalMyDsl.g:2117:2: ( rule__SelectOperation__ColumnsAssignment_3 )
            // InternalMyDsl.g:2117:3: rule__SelectOperation__ColumnsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SelectOperation__ColumnsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSelectOperationAccess().getColumnsAssignment_3()); 

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
    // InternalMyDsl.g:2125:1: rule__SelectOperation__Group__4 : rule__SelectOperation__Group__4__Impl rule__SelectOperation__Group__5 ;
    public final void rule__SelectOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2129:1: ( rule__SelectOperation__Group__4__Impl rule__SelectOperation__Group__5 )
            // InternalMyDsl.g:2130:2: rule__SelectOperation__Group__4__Impl rule__SelectOperation__Group__5
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:2137:1: rule__SelectOperation__Group__4__Impl : ( ( rule__SelectOperation__Group_4__0 )* ) ;
    public final void rule__SelectOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2141:1: ( ( ( rule__SelectOperation__Group_4__0 )* ) )
            // InternalMyDsl.g:2142:1: ( ( rule__SelectOperation__Group_4__0 )* )
            {
            // InternalMyDsl.g:2142:1: ( ( rule__SelectOperation__Group_4__0 )* )
            // InternalMyDsl.g:2143:2: ( rule__SelectOperation__Group_4__0 )*
            {
             before(grammarAccess.getSelectOperationAccess().getGroup_4()); 
            // InternalMyDsl.g:2144:2: ( rule__SelectOperation__Group_4__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==19) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:2144:3: rule__SelectOperation__Group_4__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__SelectOperation__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getSelectOperationAccess().getGroup_4()); 

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
    // InternalMyDsl.g:2152:1: rule__SelectOperation__Group__5 : rule__SelectOperation__Group__5__Impl rule__SelectOperation__Group__6 ;
    public final void rule__SelectOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2156:1: ( rule__SelectOperation__Group__5__Impl rule__SelectOperation__Group__6 )
            // InternalMyDsl.g:2157:2: rule__SelectOperation__Group__5__Impl rule__SelectOperation__Group__6
            {
            pushFollow(FOLLOW_14);
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
    // InternalMyDsl.g:2164:1: rule__SelectOperation__Group__5__Impl : ( ')' ) ;
    public final void rule__SelectOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2168:1: ( ( ')' ) )
            // InternalMyDsl.g:2169:1: ( ')' )
            {
            // InternalMyDsl.g:2169:1: ( ')' )
            // InternalMyDsl.g:2170:2: ')'
            {
             before(grammarAccess.getSelectOperationAccess().getRightParenthesisKeyword_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSelectOperationAccess().getRightParenthesisKeyword_5()); 

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
    // InternalMyDsl.g:2179:1: rule__SelectOperation__Group__6 : rule__SelectOperation__Group__6__Impl rule__SelectOperation__Group__7 ;
    public final void rule__SelectOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2183:1: ( rule__SelectOperation__Group__6__Impl rule__SelectOperation__Group__7 )
            // InternalMyDsl.g:2184:2: rule__SelectOperation__Group__6__Impl rule__SelectOperation__Group__7
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
    // InternalMyDsl.g:2191:1: rule__SelectOperation__Group__6__Impl : ( 'fromTable' ) ;
    public final void rule__SelectOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2195:1: ( ( 'fromTable' ) )
            // InternalMyDsl.g:2196:1: ( 'fromTable' )
            {
            // InternalMyDsl.g:2196:1: ( 'fromTable' )
            // InternalMyDsl.g:2197:2: 'fromTable'
            {
             before(grammarAccess.getSelectOperationAccess().getFromTableKeyword_6()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSelectOperationAccess().getFromTableKeyword_6()); 

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
    // InternalMyDsl.g:2206:1: rule__SelectOperation__Group__7 : rule__SelectOperation__Group__7__Impl rule__SelectOperation__Group__8 ;
    public final void rule__SelectOperation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2210:1: ( rule__SelectOperation__Group__7__Impl rule__SelectOperation__Group__8 )
            // InternalMyDsl.g:2211:2: rule__SelectOperation__Group__7__Impl rule__SelectOperation__Group__8
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:2218:1: rule__SelectOperation__Group__7__Impl : ( ( rule__SelectOperation__TableAssignment_7 ) ) ;
    public final void rule__SelectOperation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2222:1: ( ( ( rule__SelectOperation__TableAssignment_7 ) ) )
            // InternalMyDsl.g:2223:1: ( ( rule__SelectOperation__TableAssignment_7 ) )
            {
            // InternalMyDsl.g:2223:1: ( ( rule__SelectOperation__TableAssignment_7 ) )
            // InternalMyDsl.g:2224:2: ( rule__SelectOperation__TableAssignment_7 )
            {
             before(grammarAccess.getSelectOperationAccess().getTableAssignment_7()); 
            // InternalMyDsl.g:2225:2: ( rule__SelectOperation__TableAssignment_7 )
            // InternalMyDsl.g:2225:3: rule__SelectOperation__TableAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__SelectOperation__TableAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getSelectOperationAccess().getTableAssignment_7()); 

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
    // InternalMyDsl.g:2233:1: rule__SelectOperation__Group__8 : rule__SelectOperation__Group__8__Impl rule__SelectOperation__Group__9 ;
    public final void rule__SelectOperation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2237:1: ( rule__SelectOperation__Group__8__Impl rule__SelectOperation__Group__9 )
            // InternalMyDsl.g:2238:2: rule__SelectOperation__Group__8__Impl rule__SelectOperation__Group__9
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:2245:1: rule__SelectOperation__Group__8__Impl : ( 'toTable' ) ;
    public final void rule__SelectOperation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2249:1: ( ( 'toTable' ) )
            // InternalMyDsl.g:2250:1: ( 'toTable' )
            {
            // InternalMyDsl.g:2250:1: ( 'toTable' )
            // InternalMyDsl.g:2251:2: 'toTable'
            {
             before(grammarAccess.getSelectOperationAccess().getToTableKeyword_8()); 
            match(input,26,FOLLOW_2); 
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
    // InternalMyDsl.g:2260:1: rule__SelectOperation__Group__9 : rule__SelectOperation__Group__9__Impl ;
    public final void rule__SelectOperation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2264:1: ( rule__SelectOperation__Group__9__Impl )
            // InternalMyDsl.g:2265:2: rule__SelectOperation__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectOperation__Group__9__Impl();

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
    // InternalMyDsl.g:2271:1: rule__SelectOperation__Group__9__Impl : ( ( rule__SelectOperation__TargetAssignment_9 ) ) ;
    public final void rule__SelectOperation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2275:1: ( ( ( rule__SelectOperation__TargetAssignment_9 ) ) )
            // InternalMyDsl.g:2276:1: ( ( rule__SelectOperation__TargetAssignment_9 ) )
            {
            // InternalMyDsl.g:2276:1: ( ( rule__SelectOperation__TargetAssignment_9 ) )
            // InternalMyDsl.g:2277:2: ( rule__SelectOperation__TargetAssignment_9 )
            {
             before(grammarAccess.getSelectOperationAccess().getTargetAssignment_9()); 
            // InternalMyDsl.g:2278:2: ( rule__SelectOperation__TargetAssignment_9 )
            // InternalMyDsl.g:2278:3: rule__SelectOperation__TargetAssignment_9
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


    // $ANTLR start "rule__SelectOperation__Group_4__0"
    // InternalMyDsl.g:2287:1: rule__SelectOperation__Group_4__0 : rule__SelectOperation__Group_4__0__Impl rule__SelectOperation__Group_4__1 ;
    public final void rule__SelectOperation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2291:1: ( rule__SelectOperation__Group_4__0__Impl rule__SelectOperation__Group_4__1 )
            // InternalMyDsl.g:2292:2: rule__SelectOperation__Group_4__0__Impl rule__SelectOperation__Group_4__1
            {
            pushFollow(FOLLOW_6);
            rule__SelectOperation__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectOperation__Group_4__1();

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
    // $ANTLR end "rule__SelectOperation__Group_4__0"


    // $ANTLR start "rule__SelectOperation__Group_4__0__Impl"
    // InternalMyDsl.g:2299:1: rule__SelectOperation__Group_4__0__Impl : ( ',' ) ;
    public final void rule__SelectOperation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2303:1: ( ( ',' ) )
            // InternalMyDsl.g:2304:1: ( ',' )
            {
            // InternalMyDsl.g:2304:1: ( ',' )
            // InternalMyDsl.g:2305:2: ','
            {
             before(grammarAccess.getSelectOperationAccess().getCommaKeyword_4_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSelectOperationAccess().getCommaKeyword_4_0()); 

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
    // $ANTLR end "rule__SelectOperation__Group_4__0__Impl"


    // $ANTLR start "rule__SelectOperation__Group_4__1"
    // InternalMyDsl.g:2314:1: rule__SelectOperation__Group_4__1 : rule__SelectOperation__Group_4__1__Impl ;
    public final void rule__SelectOperation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2318:1: ( rule__SelectOperation__Group_4__1__Impl )
            // InternalMyDsl.g:2319:2: rule__SelectOperation__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectOperation__Group_4__1__Impl();

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
    // $ANTLR end "rule__SelectOperation__Group_4__1"


    // $ANTLR start "rule__SelectOperation__Group_4__1__Impl"
    // InternalMyDsl.g:2325:1: rule__SelectOperation__Group_4__1__Impl : ( ( rule__SelectOperation__ColumnsAssignment_4_1 ) ) ;
    public final void rule__SelectOperation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2329:1: ( ( ( rule__SelectOperation__ColumnsAssignment_4_1 ) ) )
            // InternalMyDsl.g:2330:1: ( ( rule__SelectOperation__ColumnsAssignment_4_1 ) )
            {
            // InternalMyDsl.g:2330:1: ( ( rule__SelectOperation__ColumnsAssignment_4_1 ) )
            // InternalMyDsl.g:2331:2: ( rule__SelectOperation__ColumnsAssignment_4_1 )
            {
             before(grammarAccess.getSelectOperationAccess().getColumnsAssignment_4_1()); 
            // InternalMyDsl.g:2332:2: ( rule__SelectOperation__ColumnsAssignment_4_1 )
            // InternalMyDsl.g:2332:3: rule__SelectOperation__ColumnsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__SelectOperation__ColumnsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectOperationAccess().getColumnsAssignment_4_1()); 

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
    // $ANTLR end "rule__SelectOperation__Group_4__1__Impl"


    // $ANTLR start "rule__ConcatOperation__Group__0"
    // InternalMyDsl.g:2341:1: rule__ConcatOperation__Group__0 : rule__ConcatOperation__Group__0__Impl rule__ConcatOperation__Group__1 ;
    public final void rule__ConcatOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2345:1: ( rule__ConcatOperation__Group__0__Impl rule__ConcatOperation__Group__1 )
            // InternalMyDsl.g:2346:2: rule__ConcatOperation__Group__0__Impl rule__ConcatOperation__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:2353:1: rule__ConcatOperation__Group__0__Impl : ( 'concatHorizontal' ) ;
    public final void rule__ConcatOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2357:1: ( ( 'concatHorizontal' ) )
            // InternalMyDsl.g:2358:1: ( 'concatHorizontal' )
            {
            // InternalMyDsl.g:2358:1: ( 'concatHorizontal' )
            // InternalMyDsl.g:2359:2: 'concatHorizontal'
            {
             before(grammarAccess.getConcatOperationAccess().getConcatHorizontalKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMyDsl.g:2368:1: rule__ConcatOperation__Group__1 : rule__ConcatOperation__Group__1__Impl rule__ConcatOperation__Group__2 ;
    public final void rule__ConcatOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2372:1: ( rule__ConcatOperation__Group__1__Impl rule__ConcatOperation__Group__2 )
            // InternalMyDsl.g:2373:2: rule__ConcatOperation__Group__1__Impl rule__ConcatOperation__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:2380:1: rule__ConcatOperation__Group__1__Impl : ( 'toTable' ) ;
    public final void rule__ConcatOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2384:1: ( ( 'toTable' ) )
            // InternalMyDsl.g:2385:1: ( 'toTable' )
            {
            // InternalMyDsl.g:2385:1: ( 'toTable' )
            // InternalMyDsl.g:2386:2: 'toTable'
            {
             before(grammarAccess.getConcatOperationAccess().getToTableKeyword_1()); 
            match(input,26,FOLLOW_2); 
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
    // InternalMyDsl.g:2395:1: rule__ConcatOperation__Group__2 : rule__ConcatOperation__Group__2__Impl rule__ConcatOperation__Group__3 ;
    public final void rule__ConcatOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2399:1: ( rule__ConcatOperation__Group__2__Impl rule__ConcatOperation__Group__3 )
            // InternalMyDsl.g:2400:2: rule__ConcatOperation__Group__2__Impl rule__ConcatOperation__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:2407:1: rule__ConcatOperation__Group__2__Impl : ( ( rule__ConcatOperation__TargetAssignment_2 ) ) ;
    public final void rule__ConcatOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2411:1: ( ( ( rule__ConcatOperation__TargetAssignment_2 ) ) )
            // InternalMyDsl.g:2412:1: ( ( rule__ConcatOperation__TargetAssignment_2 ) )
            {
            // InternalMyDsl.g:2412:1: ( ( rule__ConcatOperation__TargetAssignment_2 ) )
            // InternalMyDsl.g:2413:2: ( rule__ConcatOperation__TargetAssignment_2 )
            {
             before(grammarAccess.getConcatOperationAccess().getTargetAssignment_2()); 
            // InternalMyDsl.g:2414:2: ( rule__ConcatOperation__TargetAssignment_2 )
            // InternalMyDsl.g:2414:3: rule__ConcatOperation__TargetAssignment_2
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
    // InternalMyDsl.g:2422:1: rule__ConcatOperation__Group__3 : rule__ConcatOperation__Group__3__Impl rule__ConcatOperation__Group__4 ;
    public final void rule__ConcatOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2426:1: ( rule__ConcatOperation__Group__3__Impl rule__ConcatOperation__Group__4 )
            // InternalMyDsl.g:2427:2: rule__ConcatOperation__Group__3__Impl rule__ConcatOperation__Group__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:2434:1: rule__ConcatOperation__Group__3__Impl : ( 'onTables' ) ;
    public final void rule__ConcatOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2438:1: ( ( 'onTables' ) )
            // InternalMyDsl.g:2439:1: ( 'onTables' )
            {
            // InternalMyDsl.g:2439:1: ( 'onTables' )
            // InternalMyDsl.g:2440:2: 'onTables'
            {
             before(grammarAccess.getConcatOperationAccess().getOnTablesKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getConcatOperationAccess().getOnTablesKeyword_3()); 

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
    // InternalMyDsl.g:2449:1: rule__ConcatOperation__Group__4 : rule__ConcatOperation__Group__4__Impl rule__ConcatOperation__Group__5 ;
    public final void rule__ConcatOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2453:1: ( rule__ConcatOperation__Group__4__Impl rule__ConcatOperation__Group__5 )
            // InternalMyDsl.g:2454:2: rule__ConcatOperation__Group__4__Impl rule__ConcatOperation__Group__5
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:2461:1: rule__ConcatOperation__Group__4__Impl : ( '(' ) ;
    public final void rule__ConcatOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2465:1: ( ( '(' ) )
            // InternalMyDsl.g:2466:1: ( '(' )
            {
            // InternalMyDsl.g:2466:1: ( '(' )
            // InternalMyDsl.g:2467:2: '('
            {
             before(grammarAccess.getConcatOperationAccess().getLeftParenthesisKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getConcatOperationAccess().getLeftParenthesisKeyword_4()); 

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
    // InternalMyDsl.g:2476:1: rule__ConcatOperation__Group__5 : rule__ConcatOperation__Group__5__Impl rule__ConcatOperation__Group__6 ;
    public final void rule__ConcatOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2480:1: ( rule__ConcatOperation__Group__5__Impl rule__ConcatOperation__Group__6 )
            // InternalMyDsl.g:2481:2: rule__ConcatOperation__Group__5__Impl rule__ConcatOperation__Group__6
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:2488:1: rule__ConcatOperation__Group__5__Impl : ( ( rule__ConcatOperation__TablesAssignment_5 ) ) ;
    public final void rule__ConcatOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2492:1: ( ( ( rule__ConcatOperation__TablesAssignment_5 ) ) )
            // InternalMyDsl.g:2493:1: ( ( rule__ConcatOperation__TablesAssignment_5 ) )
            {
            // InternalMyDsl.g:2493:1: ( ( rule__ConcatOperation__TablesAssignment_5 ) )
            // InternalMyDsl.g:2494:2: ( rule__ConcatOperation__TablesAssignment_5 )
            {
             before(grammarAccess.getConcatOperationAccess().getTablesAssignment_5()); 
            // InternalMyDsl.g:2495:2: ( rule__ConcatOperation__TablesAssignment_5 )
            // InternalMyDsl.g:2495:3: rule__ConcatOperation__TablesAssignment_5
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
    // InternalMyDsl.g:2503:1: rule__ConcatOperation__Group__6 : rule__ConcatOperation__Group__6__Impl rule__ConcatOperation__Group__7 ;
    public final void rule__ConcatOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2507:1: ( rule__ConcatOperation__Group__6__Impl rule__ConcatOperation__Group__7 )
            // InternalMyDsl.g:2508:2: rule__ConcatOperation__Group__6__Impl rule__ConcatOperation__Group__7
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:2515:1: rule__ConcatOperation__Group__6__Impl : ( ( rule__ConcatOperation__Group_6__0 )* ) ;
    public final void rule__ConcatOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2519:1: ( ( ( rule__ConcatOperation__Group_6__0 )* ) )
            // InternalMyDsl.g:2520:1: ( ( rule__ConcatOperation__Group_6__0 )* )
            {
            // InternalMyDsl.g:2520:1: ( ( rule__ConcatOperation__Group_6__0 )* )
            // InternalMyDsl.g:2521:2: ( rule__ConcatOperation__Group_6__0 )*
            {
             before(grammarAccess.getConcatOperationAccess().getGroup_6()); 
            // InternalMyDsl.g:2522:2: ( rule__ConcatOperation__Group_6__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==19) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:2522:3: rule__ConcatOperation__Group_6__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ConcatOperation__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalMyDsl.g:2530:1: rule__ConcatOperation__Group__7 : rule__ConcatOperation__Group__7__Impl ;
    public final void rule__ConcatOperation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2534:1: ( rule__ConcatOperation__Group__7__Impl )
            // InternalMyDsl.g:2535:2: rule__ConcatOperation__Group__7__Impl
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
    // InternalMyDsl.g:2541:1: rule__ConcatOperation__Group__7__Impl : ( ')' ) ;
    public final void rule__ConcatOperation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2545:1: ( ( ')' ) )
            // InternalMyDsl.g:2546:1: ( ')' )
            {
            // InternalMyDsl.g:2546:1: ( ')' )
            // InternalMyDsl.g:2547:2: ')'
            {
             before(grammarAccess.getConcatOperationAccess().getRightParenthesisKeyword_7()); 
            match(input,18,FOLLOW_2); 
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
    // InternalMyDsl.g:2557:1: rule__ConcatOperation__Group_6__0 : rule__ConcatOperation__Group_6__0__Impl rule__ConcatOperation__Group_6__1 ;
    public final void rule__ConcatOperation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2561:1: ( rule__ConcatOperation__Group_6__0__Impl rule__ConcatOperation__Group_6__1 )
            // InternalMyDsl.g:2562:2: rule__ConcatOperation__Group_6__0__Impl rule__ConcatOperation__Group_6__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:2569:1: rule__ConcatOperation__Group_6__0__Impl : ( ',' ) ;
    public final void rule__ConcatOperation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2573:1: ( ( ',' ) )
            // InternalMyDsl.g:2574:1: ( ',' )
            {
            // InternalMyDsl.g:2574:1: ( ',' )
            // InternalMyDsl.g:2575:2: ','
            {
             before(grammarAccess.getConcatOperationAccess().getCommaKeyword_6_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalMyDsl.g:2584:1: rule__ConcatOperation__Group_6__1 : rule__ConcatOperation__Group_6__1__Impl ;
    public final void rule__ConcatOperation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2588:1: ( rule__ConcatOperation__Group_6__1__Impl )
            // InternalMyDsl.g:2589:2: rule__ConcatOperation__Group_6__1__Impl
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
    // InternalMyDsl.g:2595:1: rule__ConcatOperation__Group_6__1__Impl : ( ( rule__ConcatOperation__TablesAssignment_6_1 ) ) ;
    public final void rule__ConcatOperation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2599:1: ( ( ( rule__ConcatOperation__TablesAssignment_6_1 ) ) )
            // InternalMyDsl.g:2600:1: ( ( rule__ConcatOperation__TablesAssignment_6_1 ) )
            {
            // InternalMyDsl.g:2600:1: ( ( rule__ConcatOperation__TablesAssignment_6_1 ) )
            // InternalMyDsl.g:2601:2: ( rule__ConcatOperation__TablesAssignment_6_1 )
            {
             before(grammarAccess.getConcatOperationAccess().getTablesAssignment_6_1()); 
            // InternalMyDsl.g:2602:2: ( rule__ConcatOperation__TablesAssignment_6_1 )
            // InternalMyDsl.g:2602:3: rule__ConcatOperation__TablesAssignment_6_1
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
    // InternalMyDsl.g:2611:1: rule__FilterOperation__Group__0 : rule__FilterOperation__Group__0__Impl rule__FilterOperation__Group__1 ;
    public final void rule__FilterOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2615:1: ( rule__FilterOperation__Group__0__Impl rule__FilterOperation__Group__1 )
            // InternalMyDsl.g:2616:2: rule__FilterOperation__Group__0__Impl rule__FilterOperation__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyDsl.g:2623:1: rule__FilterOperation__Group__0__Impl : ( 'filter' ) ;
    public final void rule__FilterOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2627:1: ( ( 'filter' ) )
            // InternalMyDsl.g:2628:1: ( 'filter' )
            {
            // InternalMyDsl.g:2628:1: ( 'filter' )
            // InternalMyDsl.g:2629:2: 'filter'
            {
             before(grammarAccess.getFilterOperationAccess().getFilterKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalMyDsl.g:2638:1: rule__FilterOperation__Group__1 : rule__FilterOperation__Group__1__Impl rule__FilterOperation__Group__2 ;
    public final void rule__FilterOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2642:1: ( rule__FilterOperation__Group__1__Impl rule__FilterOperation__Group__2 )
            // InternalMyDsl.g:2643:2: rule__FilterOperation__Group__1__Impl rule__FilterOperation__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:2650:1: rule__FilterOperation__Group__1__Impl : ( 'onColumn' ) ;
    public final void rule__FilterOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2654:1: ( ( 'onColumn' ) )
            // InternalMyDsl.g:2655:1: ( 'onColumn' )
            {
            // InternalMyDsl.g:2655:1: ( 'onColumn' )
            // InternalMyDsl.g:2656:2: 'onColumn'
            {
             before(grammarAccess.getFilterOperationAccess().getOnColumnKeyword_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalMyDsl.g:2665:1: rule__FilterOperation__Group__2 : rule__FilterOperation__Group__2__Impl rule__FilterOperation__Group__3 ;
    public final void rule__FilterOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2669:1: ( rule__FilterOperation__Group__2__Impl rule__FilterOperation__Group__3 )
            // InternalMyDsl.g:2670:2: rule__FilterOperation__Group__2__Impl rule__FilterOperation__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:2677:1: rule__FilterOperation__Group__2__Impl : ( ( rule__FilterOperation__ColumnAssignment_2 ) ) ;
    public final void rule__FilterOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2681:1: ( ( ( rule__FilterOperation__ColumnAssignment_2 ) ) )
            // InternalMyDsl.g:2682:1: ( ( rule__FilterOperation__ColumnAssignment_2 ) )
            {
            // InternalMyDsl.g:2682:1: ( ( rule__FilterOperation__ColumnAssignment_2 ) )
            // InternalMyDsl.g:2683:2: ( rule__FilterOperation__ColumnAssignment_2 )
            {
             before(grammarAccess.getFilterOperationAccess().getColumnAssignment_2()); 
            // InternalMyDsl.g:2684:2: ( rule__FilterOperation__ColumnAssignment_2 )
            // InternalMyDsl.g:2684:3: rule__FilterOperation__ColumnAssignment_2
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
    // InternalMyDsl.g:2692:1: rule__FilterOperation__Group__3 : rule__FilterOperation__Group__3__Impl rule__FilterOperation__Group__4 ;
    public final void rule__FilterOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2696:1: ( rule__FilterOperation__Group__3__Impl rule__FilterOperation__Group__4 )
            // InternalMyDsl.g:2697:2: rule__FilterOperation__Group__3__Impl rule__FilterOperation__Group__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:2704:1: rule__FilterOperation__Group__3__Impl : ( 'onTable' ) ;
    public final void rule__FilterOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2708:1: ( ( 'onTable' ) )
            // InternalMyDsl.g:2709:1: ( 'onTable' )
            {
            // InternalMyDsl.g:2709:1: ( 'onTable' )
            // InternalMyDsl.g:2710:2: 'onTable'
            {
             before(grammarAccess.getFilterOperationAccess().getOnTableKeyword_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getFilterOperationAccess().getOnTableKeyword_3()); 

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
    // InternalMyDsl.g:2719:1: rule__FilterOperation__Group__4 : rule__FilterOperation__Group__4__Impl rule__FilterOperation__Group__5 ;
    public final void rule__FilterOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2723:1: ( rule__FilterOperation__Group__4__Impl rule__FilterOperation__Group__5 )
            // InternalMyDsl.g:2724:2: rule__FilterOperation__Group__4__Impl rule__FilterOperation__Group__5
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:2731:1: rule__FilterOperation__Group__4__Impl : ( ( rule__FilterOperation__TableAssignment_4 ) ) ;
    public final void rule__FilterOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2735:1: ( ( ( rule__FilterOperation__TableAssignment_4 ) ) )
            // InternalMyDsl.g:2736:1: ( ( rule__FilterOperation__TableAssignment_4 ) )
            {
            // InternalMyDsl.g:2736:1: ( ( rule__FilterOperation__TableAssignment_4 ) )
            // InternalMyDsl.g:2737:2: ( rule__FilterOperation__TableAssignment_4 )
            {
             before(grammarAccess.getFilterOperationAccess().getTableAssignment_4()); 
            // InternalMyDsl.g:2738:2: ( rule__FilterOperation__TableAssignment_4 )
            // InternalMyDsl.g:2738:3: rule__FilterOperation__TableAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__FilterOperation__TableAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFilterOperationAccess().getTableAssignment_4()); 

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
    // InternalMyDsl.g:2746:1: rule__FilterOperation__Group__5 : rule__FilterOperation__Group__5__Impl rule__FilterOperation__Group__6 ;
    public final void rule__FilterOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2750:1: ( rule__FilterOperation__Group__5__Impl rule__FilterOperation__Group__6 )
            // InternalMyDsl.g:2751:2: rule__FilterOperation__Group__5__Impl rule__FilterOperation__Group__6
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
    // InternalMyDsl.g:2758:1: rule__FilterOperation__Group__5__Impl : ( 'where' ) ;
    public final void rule__FilterOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2762:1: ( ( 'where' ) )
            // InternalMyDsl.g:2763:1: ( 'where' )
            {
            // InternalMyDsl.g:2763:1: ( 'where' )
            // InternalMyDsl.g:2764:2: 'where'
            {
             before(grammarAccess.getFilterOperationAccess().getWhereKeyword_5()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getFilterOperationAccess().getWhereKeyword_5()); 

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
    // InternalMyDsl.g:2773:1: rule__FilterOperation__Group__6 : rule__FilterOperation__Group__6__Impl rule__FilterOperation__Group__7 ;
    public final void rule__FilterOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2777:1: ( rule__FilterOperation__Group__6__Impl rule__FilterOperation__Group__7 )
            // InternalMyDsl.g:2778:2: rule__FilterOperation__Group__6__Impl rule__FilterOperation__Group__7
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:2785:1: rule__FilterOperation__Group__6__Impl : ( ( rule__FilterOperation__ConditionAssignment_6 ) ) ;
    public final void rule__FilterOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2789:1: ( ( ( rule__FilterOperation__ConditionAssignment_6 ) ) )
            // InternalMyDsl.g:2790:1: ( ( rule__FilterOperation__ConditionAssignment_6 ) )
            {
            // InternalMyDsl.g:2790:1: ( ( rule__FilterOperation__ConditionAssignment_6 ) )
            // InternalMyDsl.g:2791:2: ( rule__FilterOperation__ConditionAssignment_6 )
            {
             before(grammarAccess.getFilterOperationAccess().getConditionAssignment_6()); 
            // InternalMyDsl.g:2792:2: ( rule__FilterOperation__ConditionAssignment_6 )
            // InternalMyDsl.g:2792:3: rule__FilterOperation__ConditionAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__FilterOperation__ConditionAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getFilterOperationAccess().getConditionAssignment_6()); 

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
    // InternalMyDsl.g:2800:1: rule__FilterOperation__Group__7 : rule__FilterOperation__Group__7__Impl rule__FilterOperation__Group__8 ;
    public final void rule__FilterOperation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2804:1: ( rule__FilterOperation__Group__7__Impl rule__FilterOperation__Group__8 )
            // InternalMyDsl.g:2805:2: rule__FilterOperation__Group__7__Impl rule__FilterOperation__Group__8
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:2812:1: rule__FilterOperation__Group__7__Impl : ( 'value' ) ;
    public final void rule__FilterOperation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2816:1: ( ( 'value' ) )
            // InternalMyDsl.g:2817:1: ( 'value' )
            {
            // InternalMyDsl.g:2817:1: ( 'value' )
            // InternalMyDsl.g:2818:2: 'value'
            {
             before(grammarAccess.getFilterOperationAccess().getValueKeyword_7()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getFilterOperationAccess().getValueKeyword_7()); 

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
    // InternalMyDsl.g:2827:1: rule__FilterOperation__Group__8 : rule__FilterOperation__Group__8__Impl rule__FilterOperation__Group__9 ;
    public final void rule__FilterOperation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2831:1: ( rule__FilterOperation__Group__8__Impl rule__FilterOperation__Group__9 )
            // InternalMyDsl.g:2832:2: rule__FilterOperation__Group__8__Impl rule__FilterOperation__Group__9
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:2839:1: rule__FilterOperation__Group__8__Impl : ( ( rule__FilterOperation__ValueAssignment_8 ) ) ;
    public final void rule__FilterOperation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2843:1: ( ( ( rule__FilterOperation__ValueAssignment_8 ) ) )
            // InternalMyDsl.g:2844:1: ( ( rule__FilterOperation__ValueAssignment_8 ) )
            {
            // InternalMyDsl.g:2844:1: ( ( rule__FilterOperation__ValueAssignment_8 ) )
            // InternalMyDsl.g:2845:2: ( rule__FilterOperation__ValueAssignment_8 )
            {
             before(grammarAccess.getFilterOperationAccess().getValueAssignment_8()); 
            // InternalMyDsl.g:2846:2: ( rule__FilterOperation__ValueAssignment_8 )
            // InternalMyDsl.g:2846:3: rule__FilterOperation__ValueAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__FilterOperation__ValueAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getFilterOperationAccess().getValueAssignment_8()); 

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
    // InternalMyDsl.g:2854:1: rule__FilterOperation__Group__9 : rule__FilterOperation__Group__9__Impl ;
    public final void rule__FilterOperation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2858:1: ( rule__FilterOperation__Group__9__Impl )
            // InternalMyDsl.g:2859:2: rule__FilterOperation__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FilterOperation__Group__9__Impl();

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
    // InternalMyDsl.g:2865:1: rule__FilterOperation__Group__9__Impl : ( ( rule__FilterOperation__Group_9__0 )? ) ;
    public final void rule__FilterOperation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2869:1: ( ( ( rule__FilterOperation__Group_9__0 )? ) )
            // InternalMyDsl.g:2870:1: ( ( rule__FilterOperation__Group_9__0 )? )
            {
            // InternalMyDsl.g:2870:1: ( ( rule__FilterOperation__Group_9__0 )? )
            // InternalMyDsl.g:2871:2: ( rule__FilterOperation__Group_9__0 )?
            {
             before(grammarAccess.getFilterOperationAccess().getGroup_9()); 
            // InternalMyDsl.g:2872:2: ( rule__FilterOperation__Group_9__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:2872:3: rule__FilterOperation__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FilterOperation__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFilterOperationAccess().getGroup_9()); 

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


    // $ANTLR start "rule__FilterOperation__Group_9__0"
    // InternalMyDsl.g:2881:1: rule__FilterOperation__Group_9__0 : rule__FilterOperation__Group_9__0__Impl rule__FilterOperation__Group_9__1 ;
    public final void rule__FilterOperation__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2885:1: ( rule__FilterOperation__Group_9__0__Impl rule__FilterOperation__Group_9__1 )
            // InternalMyDsl.g:2886:2: rule__FilterOperation__Group_9__0__Impl rule__FilterOperation__Group_9__1
            {
            pushFollow(FOLLOW_6);
            rule__FilterOperation__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterOperation__Group_9__1();

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
    // $ANTLR end "rule__FilterOperation__Group_9__0"


    // $ANTLR start "rule__FilterOperation__Group_9__0__Impl"
    // InternalMyDsl.g:2893:1: rule__FilterOperation__Group_9__0__Impl : ( 'toTable' ) ;
    public final void rule__FilterOperation__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2897:1: ( ( 'toTable' ) )
            // InternalMyDsl.g:2898:1: ( 'toTable' )
            {
            // InternalMyDsl.g:2898:1: ( 'toTable' )
            // InternalMyDsl.g:2899:2: 'toTable'
            {
             before(grammarAccess.getFilterOperationAccess().getToTableKeyword_9_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getFilterOperationAccess().getToTableKeyword_9_0()); 

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
    // $ANTLR end "rule__FilterOperation__Group_9__0__Impl"


    // $ANTLR start "rule__FilterOperation__Group_9__1"
    // InternalMyDsl.g:2908:1: rule__FilterOperation__Group_9__1 : rule__FilterOperation__Group_9__1__Impl ;
    public final void rule__FilterOperation__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2912:1: ( rule__FilterOperation__Group_9__1__Impl )
            // InternalMyDsl.g:2913:2: rule__FilterOperation__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FilterOperation__Group_9__1__Impl();

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
    // $ANTLR end "rule__FilterOperation__Group_9__1"


    // $ANTLR start "rule__FilterOperation__Group_9__1__Impl"
    // InternalMyDsl.g:2919:1: rule__FilterOperation__Group_9__1__Impl : ( ( rule__FilterOperation__TargetAssignment_9_1 ) ) ;
    public final void rule__FilterOperation__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2923:1: ( ( ( rule__FilterOperation__TargetAssignment_9_1 ) ) )
            // InternalMyDsl.g:2924:1: ( ( rule__FilterOperation__TargetAssignment_9_1 ) )
            {
            // InternalMyDsl.g:2924:1: ( ( rule__FilterOperation__TargetAssignment_9_1 ) )
            // InternalMyDsl.g:2925:2: ( rule__FilterOperation__TargetAssignment_9_1 )
            {
             before(grammarAccess.getFilterOperationAccess().getTargetAssignment_9_1()); 
            // InternalMyDsl.g:2926:2: ( rule__FilterOperation__TargetAssignment_9_1 )
            // InternalMyDsl.g:2926:3: rule__FilterOperation__TargetAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__FilterOperation__TargetAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getFilterOperationAccess().getTargetAssignment_9_1()); 

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
    // $ANTLR end "rule__FilterOperation__Group_9__1__Impl"


    // $ANTLR start "rule__SaveOperation__Group__0"
    // InternalMyDsl.g:2935:1: rule__SaveOperation__Group__0 : rule__SaveOperation__Group__0__Impl rule__SaveOperation__Group__1 ;
    public final void rule__SaveOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2939:1: ( rule__SaveOperation__Group__0__Impl rule__SaveOperation__Group__1 )
            // InternalMyDsl.g:2940:2: rule__SaveOperation__Group__0__Impl rule__SaveOperation__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyDsl.g:2947:1: rule__SaveOperation__Group__0__Impl : ( 'save' ) ;
    public final void rule__SaveOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2951:1: ( ( 'save' ) )
            // InternalMyDsl.g:2952:1: ( 'save' )
            {
            // InternalMyDsl.g:2952:1: ( 'save' )
            // InternalMyDsl.g:2953:2: 'save'
            {
             before(grammarAccess.getSaveOperationAccess().getSaveKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalMyDsl.g:2962:1: rule__SaveOperation__Group__1 : rule__SaveOperation__Group__1__Impl rule__SaveOperation__Group__2 ;
    public final void rule__SaveOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2966:1: ( rule__SaveOperation__Group__1__Impl rule__SaveOperation__Group__2 )
            // InternalMyDsl.g:2967:2: rule__SaveOperation__Group__1__Impl rule__SaveOperation__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:2974:1: rule__SaveOperation__Group__1__Impl : ( 'tables' ) ;
    public final void rule__SaveOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2978:1: ( ( 'tables' ) )
            // InternalMyDsl.g:2979:1: ( 'tables' )
            {
            // InternalMyDsl.g:2979:1: ( 'tables' )
            // InternalMyDsl.g:2980:2: 'tables'
            {
             before(grammarAccess.getSaveOperationAccess().getTablesKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalMyDsl.g:2989:1: rule__SaveOperation__Group__2 : rule__SaveOperation__Group__2__Impl rule__SaveOperation__Group__3 ;
    public final void rule__SaveOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2993:1: ( rule__SaveOperation__Group__2__Impl rule__SaveOperation__Group__3 )
            // InternalMyDsl.g:2994:2: rule__SaveOperation__Group__2__Impl rule__SaveOperation__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:3001:1: rule__SaveOperation__Group__2__Impl : ( '(' ) ;
    public final void rule__SaveOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3005:1: ( ( '(' ) )
            // InternalMyDsl.g:3006:1: ( '(' )
            {
            // InternalMyDsl.g:3006:1: ( '(' )
            // InternalMyDsl.g:3007:2: '('
            {
             before(grammarAccess.getSaveOperationAccess().getLeftParenthesisKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSaveOperationAccess().getLeftParenthesisKeyword_2()); 

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
    // InternalMyDsl.g:3016:1: rule__SaveOperation__Group__3 : rule__SaveOperation__Group__3__Impl rule__SaveOperation__Group__4 ;
    public final void rule__SaveOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3020:1: ( rule__SaveOperation__Group__3__Impl rule__SaveOperation__Group__4 )
            // InternalMyDsl.g:3021:2: rule__SaveOperation__Group__3__Impl rule__SaveOperation__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:3028:1: rule__SaveOperation__Group__3__Impl : ( ( rule__SaveOperation__TablesAssignment_3 ) ) ;
    public final void rule__SaveOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3032:1: ( ( ( rule__SaveOperation__TablesAssignment_3 ) ) )
            // InternalMyDsl.g:3033:1: ( ( rule__SaveOperation__TablesAssignment_3 ) )
            {
            // InternalMyDsl.g:3033:1: ( ( rule__SaveOperation__TablesAssignment_3 ) )
            // InternalMyDsl.g:3034:2: ( rule__SaveOperation__TablesAssignment_3 )
            {
             before(grammarAccess.getSaveOperationAccess().getTablesAssignment_3()); 
            // InternalMyDsl.g:3035:2: ( rule__SaveOperation__TablesAssignment_3 )
            // InternalMyDsl.g:3035:3: rule__SaveOperation__TablesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SaveOperation__TablesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSaveOperationAccess().getTablesAssignment_3()); 

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
    // InternalMyDsl.g:3043:1: rule__SaveOperation__Group__4 : rule__SaveOperation__Group__4__Impl rule__SaveOperation__Group__5 ;
    public final void rule__SaveOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3047:1: ( rule__SaveOperation__Group__4__Impl rule__SaveOperation__Group__5 )
            // InternalMyDsl.g:3048:2: rule__SaveOperation__Group__4__Impl rule__SaveOperation__Group__5
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:3055:1: rule__SaveOperation__Group__4__Impl : ( ( rule__SaveOperation__Group_4__0 )* ) ;
    public final void rule__SaveOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3059:1: ( ( ( rule__SaveOperation__Group_4__0 )* ) )
            // InternalMyDsl.g:3060:1: ( ( rule__SaveOperation__Group_4__0 )* )
            {
            // InternalMyDsl.g:3060:1: ( ( rule__SaveOperation__Group_4__0 )* )
            // InternalMyDsl.g:3061:2: ( rule__SaveOperation__Group_4__0 )*
            {
             before(grammarAccess.getSaveOperationAccess().getGroup_4()); 
            // InternalMyDsl.g:3062:2: ( rule__SaveOperation__Group_4__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==19) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMyDsl.g:3062:3: rule__SaveOperation__Group_4__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__SaveOperation__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getSaveOperationAccess().getGroup_4()); 

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
    // InternalMyDsl.g:3070:1: rule__SaveOperation__Group__5 : rule__SaveOperation__Group__5__Impl rule__SaveOperation__Group__6 ;
    public final void rule__SaveOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3074:1: ( rule__SaveOperation__Group__5__Impl rule__SaveOperation__Group__6 )
            // InternalMyDsl.g:3075:2: rule__SaveOperation__Group__5__Impl rule__SaveOperation__Group__6
            {
            pushFollow(FOLLOW_22);
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
    // InternalMyDsl.g:3082:1: rule__SaveOperation__Group__5__Impl : ( ')' ) ;
    public final void rule__SaveOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3086:1: ( ( ')' ) )
            // InternalMyDsl.g:3087:1: ( ')' )
            {
            // InternalMyDsl.g:3087:1: ( ')' )
            // InternalMyDsl.g:3088:2: ')'
            {
             before(grammarAccess.getSaveOperationAccess().getRightParenthesisKeyword_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSaveOperationAccess().getRightParenthesisKeyword_5()); 

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
    // InternalMyDsl.g:3097:1: rule__SaveOperation__Group__6 : rule__SaveOperation__Group__6__Impl rule__SaveOperation__Group__7 ;
    public final void rule__SaveOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3101:1: ( rule__SaveOperation__Group__6__Impl rule__SaveOperation__Group__7 )
            // InternalMyDsl.g:3102:2: rule__SaveOperation__Group__6__Impl rule__SaveOperation__Group__7
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
    // InternalMyDsl.g:3109:1: rule__SaveOperation__Group__6__Impl : ( 'to' ) ;
    public final void rule__SaveOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3113:1: ( ( 'to' ) )
            // InternalMyDsl.g:3114:1: ( 'to' )
            {
            // InternalMyDsl.g:3114:1: ( 'to' )
            // InternalMyDsl.g:3115:2: 'to'
            {
             before(grammarAccess.getSaveOperationAccess().getToKeyword_6()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getSaveOperationAccess().getToKeyword_6()); 

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
    // InternalMyDsl.g:3124:1: rule__SaveOperation__Group__7 : rule__SaveOperation__Group__7__Impl rule__SaveOperation__Group__8 ;
    public final void rule__SaveOperation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3128:1: ( rule__SaveOperation__Group__7__Impl rule__SaveOperation__Group__8 )
            // InternalMyDsl.g:3129:2: rule__SaveOperation__Group__7__Impl rule__SaveOperation__Group__8
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:3136:1: rule__SaveOperation__Group__7__Impl : ( ( rule__SaveOperation__FileAssignment_7 ) ) ;
    public final void rule__SaveOperation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3140:1: ( ( ( rule__SaveOperation__FileAssignment_7 ) ) )
            // InternalMyDsl.g:3141:1: ( ( rule__SaveOperation__FileAssignment_7 ) )
            {
            // InternalMyDsl.g:3141:1: ( ( rule__SaveOperation__FileAssignment_7 ) )
            // InternalMyDsl.g:3142:2: ( rule__SaveOperation__FileAssignment_7 )
            {
             before(grammarAccess.getSaveOperationAccess().getFileAssignment_7()); 
            // InternalMyDsl.g:3143:2: ( rule__SaveOperation__FileAssignment_7 )
            // InternalMyDsl.g:3143:3: rule__SaveOperation__FileAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__SaveOperation__FileAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getSaveOperationAccess().getFileAssignment_7()); 

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
    // InternalMyDsl.g:3151:1: rule__SaveOperation__Group__8 : rule__SaveOperation__Group__8__Impl rule__SaveOperation__Group__9 ;
    public final void rule__SaveOperation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3155:1: ( rule__SaveOperation__Group__8__Impl rule__SaveOperation__Group__9 )
            // InternalMyDsl.g:3156:2: rule__SaveOperation__Group__8__Impl rule__SaveOperation__Group__9
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:3163:1: rule__SaveOperation__Group__8__Impl : ( 'as' ) ;
    public final void rule__SaveOperation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3167:1: ( ( 'as' ) )
            // InternalMyDsl.g:3168:1: ( 'as' )
            {
            // InternalMyDsl.g:3168:1: ( 'as' )
            // InternalMyDsl.g:3169:2: 'as'
            {
             before(grammarAccess.getSaveOperationAccess().getAsKeyword_8()); 
            match(input,37,FOLLOW_2); 
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
    // InternalMyDsl.g:3178:1: rule__SaveOperation__Group__9 : rule__SaveOperation__Group__9__Impl ;
    public final void rule__SaveOperation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3182:1: ( rule__SaveOperation__Group__9__Impl )
            // InternalMyDsl.g:3183:2: rule__SaveOperation__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SaveOperation__Group__9__Impl();

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
    // InternalMyDsl.g:3189:1: rule__SaveOperation__Group__9__Impl : ( ( rule__SaveOperation__FormatAssignment_9 ) ) ;
    public final void rule__SaveOperation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3193:1: ( ( ( rule__SaveOperation__FormatAssignment_9 ) ) )
            // InternalMyDsl.g:3194:1: ( ( rule__SaveOperation__FormatAssignment_9 ) )
            {
            // InternalMyDsl.g:3194:1: ( ( rule__SaveOperation__FormatAssignment_9 ) )
            // InternalMyDsl.g:3195:2: ( rule__SaveOperation__FormatAssignment_9 )
            {
             before(grammarAccess.getSaveOperationAccess().getFormatAssignment_9()); 
            // InternalMyDsl.g:3196:2: ( rule__SaveOperation__FormatAssignment_9 )
            // InternalMyDsl.g:3196:3: rule__SaveOperation__FormatAssignment_9
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


    // $ANTLR start "rule__SaveOperation__Group_4__0"
    // InternalMyDsl.g:3205:1: rule__SaveOperation__Group_4__0 : rule__SaveOperation__Group_4__0__Impl rule__SaveOperation__Group_4__1 ;
    public final void rule__SaveOperation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3209:1: ( rule__SaveOperation__Group_4__0__Impl rule__SaveOperation__Group_4__1 )
            // InternalMyDsl.g:3210:2: rule__SaveOperation__Group_4__0__Impl rule__SaveOperation__Group_4__1
            {
            pushFollow(FOLLOW_6);
            rule__SaveOperation__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SaveOperation__Group_4__1();

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
    // $ANTLR end "rule__SaveOperation__Group_4__0"


    // $ANTLR start "rule__SaveOperation__Group_4__0__Impl"
    // InternalMyDsl.g:3217:1: rule__SaveOperation__Group_4__0__Impl : ( ',' ) ;
    public final void rule__SaveOperation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3221:1: ( ( ',' ) )
            // InternalMyDsl.g:3222:1: ( ',' )
            {
            // InternalMyDsl.g:3222:1: ( ',' )
            // InternalMyDsl.g:3223:2: ','
            {
             before(grammarAccess.getSaveOperationAccess().getCommaKeyword_4_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSaveOperationAccess().getCommaKeyword_4_0()); 

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
    // $ANTLR end "rule__SaveOperation__Group_4__0__Impl"


    // $ANTLR start "rule__SaveOperation__Group_4__1"
    // InternalMyDsl.g:3232:1: rule__SaveOperation__Group_4__1 : rule__SaveOperation__Group_4__1__Impl ;
    public final void rule__SaveOperation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3236:1: ( rule__SaveOperation__Group_4__1__Impl )
            // InternalMyDsl.g:3237:2: rule__SaveOperation__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SaveOperation__Group_4__1__Impl();

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
    // $ANTLR end "rule__SaveOperation__Group_4__1"


    // $ANTLR start "rule__SaveOperation__Group_4__1__Impl"
    // InternalMyDsl.g:3243:1: rule__SaveOperation__Group_4__1__Impl : ( ( rule__SaveOperation__TablesAssignment_4_1 ) ) ;
    public final void rule__SaveOperation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3247:1: ( ( ( rule__SaveOperation__TablesAssignment_4_1 ) ) )
            // InternalMyDsl.g:3248:1: ( ( rule__SaveOperation__TablesAssignment_4_1 ) )
            {
            // InternalMyDsl.g:3248:1: ( ( rule__SaveOperation__TablesAssignment_4_1 ) )
            // InternalMyDsl.g:3249:2: ( rule__SaveOperation__TablesAssignment_4_1 )
            {
             before(grammarAccess.getSaveOperationAccess().getTablesAssignment_4_1()); 
            // InternalMyDsl.g:3250:2: ( rule__SaveOperation__TablesAssignment_4_1 )
            // InternalMyDsl.g:3250:3: rule__SaveOperation__TablesAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__SaveOperation__TablesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSaveOperationAccess().getTablesAssignment_4_1()); 

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
    // $ANTLR end "rule__SaveOperation__Group_4__1__Impl"


    // $ANTLR start "rule__PrintOperation__Group_0__0"
    // InternalMyDsl.g:3259:1: rule__PrintOperation__Group_0__0 : rule__PrintOperation__Group_0__0__Impl rule__PrintOperation__Group_0__1 ;
    public final void rule__PrintOperation__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3263:1: ( rule__PrintOperation__Group_0__0__Impl rule__PrintOperation__Group_0__1 )
            // InternalMyDsl.g:3264:2: rule__PrintOperation__Group_0__0__Impl rule__PrintOperation__Group_0__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalMyDsl.g:3271:1: rule__PrintOperation__Group_0__0__Impl : ( () ) ;
    public final void rule__PrintOperation__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3275:1: ( ( () ) )
            // InternalMyDsl.g:3276:1: ( () )
            {
            // InternalMyDsl.g:3276:1: ( () )
            // InternalMyDsl.g:3277:2: ()
            {
             before(grammarAccess.getPrintOperationAccess().getPrintOperationAction_0_0()); 
            // InternalMyDsl.g:3278:2: ()
            // InternalMyDsl.g:3278:3: 
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
    // InternalMyDsl.g:3286:1: rule__PrintOperation__Group_0__1 : rule__PrintOperation__Group_0__1__Impl ;
    public final void rule__PrintOperation__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3290:1: ( rule__PrintOperation__Group_0__1__Impl )
            // InternalMyDsl.g:3291:2: rule__PrintOperation__Group_0__1__Impl
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
    // InternalMyDsl.g:3297:1: rule__PrintOperation__Group_0__1__Impl : ( rulePrintAll ) ;
    public final void rule__PrintOperation__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3301:1: ( ( rulePrintAll ) )
            // InternalMyDsl.g:3302:1: ( rulePrintAll )
            {
            // InternalMyDsl.g:3302:1: ( rulePrintAll )
            // InternalMyDsl.g:3303:2: rulePrintAll
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
    // InternalMyDsl.g:3313:1: rule__PrintTable__Group__0 : rule__PrintTable__Group__0__Impl rule__PrintTable__Group__1 ;
    public final void rule__PrintTable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3317:1: ( rule__PrintTable__Group__0__Impl rule__PrintTable__Group__1 )
            // InternalMyDsl.g:3318:2: rule__PrintTable__Group__0__Impl rule__PrintTable__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:3325:1: rule__PrintTable__Group__0__Impl : ( 'printTable' ) ;
    public final void rule__PrintTable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3329:1: ( ( 'printTable' ) )
            // InternalMyDsl.g:3330:1: ( 'printTable' )
            {
            // InternalMyDsl.g:3330:1: ( 'printTable' )
            // InternalMyDsl.g:3331:2: 'printTable'
            {
             before(grammarAccess.getPrintTableAccess().getPrintTableKeyword_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalMyDsl.g:3340:1: rule__PrintTable__Group__1 : rule__PrintTable__Group__1__Impl ;
    public final void rule__PrintTable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3344:1: ( rule__PrintTable__Group__1__Impl )
            // InternalMyDsl.g:3345:2: rule__PrintTable__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrintTable__Group__1__Impl();

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
    // InternalMyDsl.g:3351:1: rule__PrintTable__Group__1__Impl : ( ( rule__PrintTable__TableAssignment_1 ) ) ;
    public final void rule__PrintTable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3355:1: ( ( ( rule__PrintTable__TableAssignment_1 ) ) )
            // InternalMyDsl.g:3356:1: ( ( rule__PrintTable__TableAssignment_1 ) )
            {
            // InternalMyDsl.g:3356:1: ( ( rule__PrintTable__TableAssignment_1 ) )
            // InternalMyDsl.g:3357:2: ( rule__PrintTable__TableAssignment_1 )
            {
             before(grammarAccess.getPrintTableAccess().getTableAssignment_1()); 
            // InternalMyDsl.g:3358:2: ( rule__PrintTable__TableAssignment_1 )
            // InternalMyDsl.g:3358:3: rule__PrintTable__TableAssignment_1
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


    // $ANTLR start "rule__RenameOperation__Group__0"
    // InternalMyDsl.g:3367:1: rule__RenameOperation__Group__0 : rule__RenameOperation__Group__0__Impl rule__RenameOperation__Group__1 ;
    public final void rule__RenameOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3371:1: ( rule__RenameOperation__Group__0__Impl rule__RenameOperation__Group__1 )
            // InternalMyDsl.g:3372:2: rule__RenameOperation__Group__0__Impl rule__RenameOperation__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyDsl.g:3379:1: rule__RenameOperation__Group__0__Impl : ( 'renameColumn' ) ;
    public final void rule__RenameOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3383:1: ( ( 'renameColumn' ) )
            // InternalMyDsl.g:3384:1: ( 'renameColumn' )
            {
            // InternalMyDsl.g:3384:1: ( 'renameColumn' )
            // InternalMyDsl.g:3385:2: 'renameColumn'
            {
             before(grammarAccess.getRenameOperationAccess().getRenameColumnKeyword_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalMyDsl.g:3394:1: rule__RenameOperation__Group__1 : rule__RenameOperation__Group__1__Impl rule__RenameOperation__Group__2 ;
    public final void rule__RenameOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3398:1: ( rule__RenameOperation__Group__1__Impl rule__RenameOperation__Group__2 )
            // InternalMyDsl.g:3399:2: rule__RenameOperation__Group__1__Impl rule__RenameOperation__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:3406:1: rule__RenameOperation__Group__1__Impl : ( 'from' ) ;
    public final void rule__RenameOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3410:1: ( ( 'from' ) )
            // InternalMyDsl.g:3411:1: ( 'from' )
            {
            // InternalMyDsl.g:3411:1: ( 'from' )
            // InternalMyDsl.g:3412:2: 'from'
            {
             before(grammarAccess.getRenameOperationAccess().getFromKeyword_1()); 
            match(input,14,FOLLOW_2); 
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
    // InternalMyDsl.g:3421:1: rule__RenameOperation__Group__2 : rule__RenameOperation__Group__2__Impl rule__RenameOperation__Group__3 ;
    public final void rule__RenameOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3425:1: ( rule__RenameOperation__Group__2__Impl rule__RenameOperation__Group__3 )
            // InternalMyDsl.g:3426:2: rule__RenameOperation__Group__2__Impl rule__RenameOperation__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalMyDsl.g:3433:1: rule__RenameOperation__Group__2__Impl : ( ( rule__RenameOperation__OriginalAssignment_2 ) ) ;
    public final void rule__RenameOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3437:1: ( ( ( rule__RenameOperation__OriginalAssignment_2 ) ) )
            // InternalMyDsl.g:3438:1: ( ( rule__RenameOperation__OriginalAssignment_2 ) )
            {
            // InternalMyDsl.g:3438:1: ( ( rule__RenameOperation__OriginalAssignment_2 ) )
            // InternalMyDsl.g:3439:2: ( rule__RenameOperation__OriginalAssignment_2 )
            {
             before(grammarAccess.getRenameOperationAccess().getOriginalAssignment_2()); 
            // InternalMyDsl.g:3440:2: ( rule__RenameOperation__OriginalAssignment_2 )
            // InternalMyDsl.g:3440:3: rule__RenameOperation__OriginalAssignment_2
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
    // InternalMyDsl.g:3448:1: rule__RenameOperation__Group__3 : rule__RenameOperation__Group__3__Impl rule__RenameOperation__Group__4 ;
    public final void rule__RenameOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3452:1: ( rule__RenameOperation__Group__3__Impl rule__RenameOperation__Group__4 )
            // InternalMyDsl.g:3453:2: rule__RenameOperation__Group__3__Impl rule__RenameOperation__Group__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:3460:1: rule__RenameOperation__Group__3__Impl : ( 'to' ) ;
    public final void rule__RenameOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3464:1: ( ( 'to' ) )
            // InternalMyDsl.g:3465:1: ( 'to' )
            {
            // InternalMyDsl.g:3465:1: ( 'to' )
            // InternalMyDsl.g:3466:2: 'to'
            {
             before(grammarAccess.getRenameOperationAccess().getToKeyword_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getRenameOperationAccess().getToKeyword_3()); 

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
    // InternalMyDsl.g:3475:1: rule__RenameOperation__Group__4 : rule__RenameOperation__Group__4__Impl rule__RenameOperation__Group__5 ;
    public final void rule__RenameOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3479:1: ( rule__RenameOperation__Group__4__Impl rule__RenameOperation__Group__5 )
            // InternalMyDsl.g:3480:2: rule__RenameOperation__Group__4__Impl rule__RenameOperation__Group__5
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:3487:1: rule__RenameOperation__Group__4__Impl : ( ( rule__RenameOperation__RenamedAssignment_4 ) ) ;
    public final void rule__RenameOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3491:1: ( ( ( rule__RenameOperation__RenamedAssignment_4 ) ) )
            // InternalMyDsl.g:3492:1: ( ( rule__RenameOperation__RenamedAssignment_4 ) )
            {
            // InternalMyDsl.g:3492:1: ( ( rule__RenameOperation__RenamedAssignment_4 ) )
            // InternalMyDsl.g:3493:2: ( rule__RenameOperation__RenamedAssignment_4 )
            {
             before(grammarAccess.getRenameOperationAccess().getRenamedAssignment_4()); 
            // InternalMyDsl.g:3494:2: ( rule__RenameOperation__RenamedAssignment_4 )
            // InternalMyDsl.g:3494:3: rule__RenameOperation__RenamedAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__RenameOperation__RenamedAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRenameOperationAccess().getRenamedAssignment_4()); 

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
    // InternalMyDsl.g:3502:1: rule__RenameOperation__Group__5 : rule__RenameOperation__Group__5__Impl rule__RenameOperation__Group__6 ;
    public final void rule__RenameOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3506:1: ( rule__RenameOperation__Group__5__Impl rule__RenameOperation__Group__6 )
            // InternalMyDsl.g:3507:2: rule__RenameOperation__Group__5__Impl rule__RenameOperation__Group__6
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
    // InternalMyDsl.g:3514:1: rule__RenameOperation__Group__5__Impl : ( 'onTable' ) ;
    public final void rule__RenameOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3518:1: ( ( 'onTable' ) )
            // InternalMyDsl.g:3519:1: ( 'onTable' )
            {
            // InternalMyDsl.g:3519:1: ( 'onTable' )
            // InternalMyDsl.g:3520:2: 'onTable'
            {
             before(grammarAccess.getRenameOperationAccess().getOnTableKeyword_5()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getRenameOperationAccess().getOnTableKeyword_5()); 

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
    // InternalMyDsl.g:3529:1: rule__RenameOperation__Group__6 : rule__RenameOperation__Group__6__Impl ;
    public final void rule__RenameOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3533:1: ( rule__RenameOperation__Group__6__Impl )
            // InternalMyDsl.g:3534:2: rule__RenameOperation__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RenameOperation__Group__6__Impl();

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
    // InternalMyDsl.g:3540:1: rule__RenameOperation__Group__6__Impl : ( ( rule__RenameOperation__TableAssignment_6 ) ) ;
    public final void rule__RenameOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3544:1: ( ( ( rule__RenameOperation__TableAssignment_6 ) ) )
            // InternalMyDsl.g:3545:1: ( ( rule__RenameOperation__TableAssignment_6 ) )
            {
            // InternalMyDsl.g:3545:1: ( ( rule__RenameOperation__TableAssignment_6 ) )
            // InternalMyDsl.g:3546:2: ( rule__RenameOperation__TableAssignment_6 )
            {
             before(grammarAccess.getRenameOperationAccess().getTableAssignment_6()); 
            // InternalMyDsl.g:3547:2: ( rule__RenameOperation__TableAssignment_6 )
            // InternalMyDsl.g:3547:3: rule__RenameOperation__TableAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__RenameOperation__TableAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRenameOperationAccess().getTableAssignment_6()); 

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


    // $ANTLR start "rule__LimitOperation__Group__0"
    // InternalMyDsl.g:3556:1: rule__LimitOperation__Group__0 : rule__LimitOperation__Group__0__Impl rule__LimitOperation__Group__1 ;
    public final void rule__LimitOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3560:1: ( rule__LimitOperation__Group__0__Impl rule__LimitOperation__Group__1 )
            // InternalMyDsl.g:3561:2: rule__LimitOperation__Group__0__Impl rule__LimitOperation__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalMyDsl.g:3568:1: rule__LimitOperation__Group__0__Impl : ( 'limit' ) ;
    public final void rule__LimitOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3572:1: ( ( 'limit' ) )
            // InternalMyDsl.g:3573:1: ( 'limit' )
            {
            // InternalMyDsl.g:3573:1: ( 'limit' )
            // InternalMyDsl.g:3574:2: 'limit'
            {
             before(grammarAccess.getLimitOperationAccess().getLimitKeyword_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalMyDsl.g:3583:1: rule__LimitOperation__Group__1 : rule__LimitOperation__Group__1__Impl rule__LimitOperation__Group__2 ;
    public final void rule__LimitOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3587:1: ( rule__LimitOperation__Group__1__Impl rule__LimitOperation__Group__2 )
            // InternalMyDsl.g:3588:2: rule__LimitOperation__Group__1__Impl rule__LimitOperation__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:3595:1: rule__LimitOperation__Group__1__Impl : ( 'table' ) ;
    public final void rule__LimitOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3599:1: ( ( 'table' ) )
            // InternalMyDsl.g:3600:1: ( 'table' )
            {
            // InternalMyDsl.g:3600:1: ( 'table' )
            // InternalMyDsl.g:3601:2: 'table'
            {
             before(grammarAccess.getLimitOperationAccess().getTableKeyword_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalMyDsl.g:3610:1: rule__LimitOperation__Group__2 : rule__LimitOperation__Group__2__Impl rule__LimitOperation__Group__3 ;
    public final void rule__LimitOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3614:1: ( rule__LimitOperation__Group__2__Impl rule__LimitOperation__Group__3 )
            // InternalMyDsl.g:3615:2: rule__LimitOperation__Group__2__Impl rule__LimitOperation__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyDsl.g:3622:1: rule__LimitOperation__Group__2__Impl : ( ( rule__LimitOperation__TableAssignment_2 ) ) ;
    public final void rule__LimitOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3626:1: ( ( ( rule__LimitOperation__TableAssignment_2 ) ) )
            // InternalMyDsl.g:3627:1: ( ( rule__LimitOperation__TableAssignment_2 ) )
            {
            // InternalMyDsl.g:3627:1: ( ( rule__LimitOperation__TableAssignment_2 ) )
            // InternalMyDsl.g:3628:2: ( rule__LimitOperation__TableAssignment_2 )
            {
             before(grammarAccess.getLimitOperationAccess().getTableAssignment_2()); 
            // InternalMyDsl.g:3629:2: ( rule__LimitOperation__TableAssignment_2 )
            // InternalMyDsl.g:3629:3: rule__LimitOperation__TableAssignment_2
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
    // InternalMyDsl.g:3637:1: rule__LimitOperation__Group__3 : rule__LimitOperation__Group__3__Impl rule__LimitOperation__Group__4 ;
    public final void rule__LimitOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3641:1: ( rule__LimitOperation__Group__3__Impl rule__LimitOperation__Group__4 )
            // InternalMyDsl.g:3642:2: rule__LimitOperation__Group__3__Impl rule__LimitOperation__Group__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalMyDsl.g:3649:1: rule__LimitOperation__Group__3__Impl : ( 'from' ) ;
    public final void rule__LimitOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3653:1: ( ( 'from' ) )
            // InternalMyDsl.g:3654:1: ( 'from' )
            {
            // InternalMyDsl.g:3654:1: ( 'from' )
            // InternalMyDsl.g:3655:2: 'from'
            {
             before(grammarAccess.getLimitOperationAccess().getFromKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getLimitOperationAccess().getFromKeyword_3()); 

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
    // InternalMyDsl.g:3664:1: rule__LimitOperation__Group__4 : rule__LimitOperation__Group__4__Impl rule__LimitOperation__Group__5 ;
    public final void rule__LimitOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3668:1: ( rule__LimitOperation__Group__4__Impl rule__LimitOperation__Group__5 )
            // InternalMyDsl.g:3669:2: rule__LimitOperation__Group__4__Impl rule__LimitOperation__Group__5
            {
            pushFollow(FOLLOW_22);
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
    // InternalMyDsl.g:3676:1: rule__LimitOperation__Group__4__Impl : ( ( rule__LimitOperation__StartAssignment_4 ) ) ;
    public final void rule__LimitOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3680:1: ( ( ( rule__LimitOperation__StartAssignment_4 ) ) )
            // InternalMyDsl.g:3681:1: ( ( rule__LimitOperation__StartAssignment_4 ) )
            {
            // InternalMyDsl.g:3681:1: ( ( rule__LimitOperation__StartAssignment_4 ) )
            // InternalMyDsl.g:3682:2: ( rule__LimitOperation__StartAssignment_4 )
            {
             before(grammarAccess.getLimitOperationAccess().getStartAssignment_4()); 
            // InternalMyDsl.g:3683:2: ( rule__LimitOperation__StartAssignment_4 )
            // InternalMyDsl.g:3683:3: rule__LimitOperation__StartAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__LimitOperation__StartAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLimitOperationAccess().getStartAssignment_4()); 

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
    // InternalMyDsl.g:3691:1: rule__LimitOperation__Group__5 : rule__LimitOperation__Group__5__Impl rule__LimitOperation__Group__6 ;
    public final void rule__LimitOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3695:1: ( rule__LimitOperation__Group__5__Impl rule__LimitOperation__Group__6 )
            // InternalMyDsl.g:3696:2: rule__LimitOperation__Group__5__Impl rule__LimitOperation__Group__6
            {
            pushFollow(FOLLOW_26);
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
    // InternalMyDsl.g:3703:1: rule__LimitOperation__Group__5__Impl : ( 'to' ) ;
    public final void rule__LimitOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3707:1: ( ( 'to' ) )
            // InternalMyDsl.g:3708:1: ( 'to' )
            {
            // InternalMyDsl.g:3708:1: ( 'to' )
            // InternalMyDsl.g:3709:2: 'to'
            {
             before(grammarAccess.getLimitOperationAccess().getToKeyword_5()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getLimitOperationAccess().getToKeyword_5()); 

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
    // InternalMyDsl.g:3718:1: rule__LimitOperation__Group__6 : rule__LimitOperation__Group__6__Impl ;
    public final void rule__LimitOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3722:1: ( rule__LimitOperation__Group__6__Impl )
            // InternalMyDsl.g:3723:2: rule__LimitOperation__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LimitOperation__Group__6__Impl();

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
    // InternalMyDsl.g:3729:1: rule__LimitOperation__Group__6__Impl : ( ( rule__LimitOperation__EndAssignment_6 ) ) ;
    public final void rule__LimitOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3733:1: ( ( ( rule__LimitOperation__EndAssignment_6 ) ) )
            // InternalMyDsl.g:3734:1: ( ( rule__LimitOperation__EndAssignment_6 ) )
            {
            // InternalMyDsl.g:3734:1: ( ( rule__LimitOperation__EndAssignment_6 ) )
            // InternalMyDsl.g:3735:2: ( rule__LimitOperation__EndAssignment_6 )
            {
             before(grammarAccess.getLimitOperationAccess().getEndAssignment_6()); 
            // InternalMyDsl.g:3736:2: ( rule__LimitOperation__EndAssignment_6 )
            // InternalMyDsl.g:3736:3: rule__LimitOperation__EndAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__LimitOperation__EndAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getLimitOperationAccess().getEndAssignment_6()); 

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


    // $ANTLR start "rule__ArgMaxOperation__Group__0"
    // InternalMyDsl.g:3745:1: rule__ArgMaxOperation__Group__0 : rule__ArgMaxOperation__Group__0__Impl rule__ArgMaxOperation__Group__1 ;
    public final void rule__ArgMaxOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3749:1: ( rule__ArgMaxOperation__Group__0__Impl rule__ArgMaxOperation__Group__1 )
            // InternalMyDsl.g:3750:2: rule__ArgMaxOperation__Group__0__Impl rule__ArgMaxOperation__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyDsl.g:3757:1: rule__ArgMaxOperation__Group__0__Impl : ( 'argMax' ) ;
    public final void rule__ArgMaxOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3761:1: ( ( 'argMax' ) )
            // InternalMyDsl.g:3762:1: ( 'argMax' )
            {
            // InternalMyDsl.g:3762:1: ( 'argMax' )
            // InternalMyDsl.g:3763:2: 'argMax'
            {
             before(grammarAccess.getArgMaxOperationAccess().getArgMaxKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getArgMaxOperationAccess().getArgMaxKeyword_0()); 

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
    // InternalMyDsl.g:3772:1: rule__ArgMaxOperation__Group__1 : rule__ArgMaxOperation__Group__1__Impl rule__ArgMaxOperation__Group__2 ;
    public final void rule__ArgMaxOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3776:1: ( rule__ArgMaxOperation__Group__1__Impl rule__ArgMaxOperation__Group__2 )
            // InternalMyDsl.g:3777:2: rule__ArgMaxOperation__Group__1__Impl rule__ArgMaxOperation__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:3784:1: rule__ArgMaxOperation__Group__1__Impl : ( 'onColumn' ) ;
    public final void rule__ArgMaxOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3788:1: ( ( 'onColumn' ) )
            // InternalMyDsl.g:3789:1: ( 'onColumn' )
            {
            // InternalMyDsl.g:3789:1: ( 'onColumn' )
            // InternalMyDsl.g:3790:2: 'onColumn'
            {
             before(grammarAccess.getArgMaxOperationAccess().getOnColumnKeyword_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalMyDsl.g:3799:1: rule__ArgMaxOperation__Group__2 : rule__ArgMaxOperation__Group__2__Impl rule__ArgMaxOperation__Group__3 ;
    public final void rule__ArgMaxOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3803:1: ( rule__ArgMaxOperation__Group__2__Impl rule__ArgMaxOperation__Group__3 )
            // InternalMyDsl.g:3804:2: rule__ArgMaxOperation__Group__2__Impl rule__ArgMaxOperation__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:3811:1: rule__ArgMaxOperation__Group__2__Impl : ( ( rule__ArgMaxOperation__ColumnAssignment_2 ) ) ;
    public final void rule__ArgMaxOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3815:1: ( ( ( rule__ArgMaxOperation__ColumnAssignment_2 ) ) )
            // InternalMyDsl.g:3816:1: ( ( rule__ArgMaxOperation__ColumnAssignment_2 ) )
            {
            // InternalMyDsl.g:3816:1: ( ( rule__ArgMaxOperation__ColumnAssignment_2 ) )
            // InternalMyDsl.g:3817:2: ( rule__ArgMaxOperation__ColumnAssignment_2 )
            {
             before(grammarAccess.getArgMaxOperationAccess().getColumnAssignment_2()); 
            // InternalMyDsl.g:3818:2: ( rule__ArgMaxOperation__ColumnAssignment_2 )
            // InternalMyDsl.g:3818:3: rule__ArgMaxOperation__ColumnAssignment_2
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
    // InternalMyDsl.g:3826:1: rule__ArgMaxOperation__Group__3 : rule__ArgMaxOperation__Group__3__Impl rule__ArgMaxOperation__Group__4 ;
    public final void rule__ArgMaxOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3830:1: ( rule__ArgMaxOperation__Group__3__Impl rule__ArgMaxOperation__Group__4 )
            // InternalMyDsl.g:3831:2: rule__ArgMaxOperation__Group__3__Impl rule__ArgMaxOperation__Group__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:3838:1: rule__ArgMaxOperation__Group__3__Impl : ( 'onTable' ) ;
    public final void rule__ArgMaxOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3842:1: ( ( 'onTable' ) )
            // InternalMyDsl.g:3843:1: ( 'onTable' )
            {
            // InternalMyDsl.g:3843:1: ( 'onTable' )
            // InternalMyDsl.g:3844:2: 'onTable'
            {
             before(grammarAccess.getArgMaxOperationAccess().getOnTableKeyword_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getArgMaxOperationAccess().getOnTableKeyword_3()); 

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
    // InternalMyDsl.g:3853:1: rule__ArgMaxOperation__Group__4 : rule__ArgMaxOperation__Group__4__Impl rule__ArgMaxOperation__Group__5 ;
    public final void rule__ArgMaxOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3857:1: ( rule__ArgMaxOperation__Group__4__Impl rule__ArgMaxOperation__Group__5 )
            // InternalMyDsl.g:3858:2: rule__ArgMaxOperation__Group__4__Impl rule__ArgMaxOperation__Group__5
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:3865:1: rule__ArgMaxOperation__Group__4__Impl : ( ( rule__ArgMaxOperation__TableAssignment_4 ) ) ;
    public final void rule__ArgMaxOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3869:1: ( ( ( rule__ArgMaxOperation__TableAssignment_4 ) ) )
            // InternalMyDsl.g:3870:1: ( ( rule__ArgMaxOperation__TableAssignment_4 ) )
            {
            // InternalMyDsl.g:3870:1: ( ( rule__ArgMaxOperation__TableAssignment_4 ) )
            // InternalMyDsl.g:3871:2: ( rule__ArgMaxOperation__TableAssignment_4 )
            {
             before(grammarAccess.getArgMaxOperationAccess().getTableAssignment_4()); 
            // InternalMyDsl.g:3872:2: ( rule__ArgMaxOperation__TableAssignment_4 )
            // InternalMyDsl.g:3872:3: rule__ArgMaxOperation__TableAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ArgMaxOperation__TableAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getArgMaxOperationAccess().getTableAssignment_4()); 

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
    // InternalMyDsl.g:3880:1: rule__ArgMaxOperation__Group__5 : rule__ArgMaxOperation__Group__5__Impl rule__ArgMaxOperation__Group__6 ;
    public final void rule__ArgMaxOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3884:1: ( rule__ArgMaxOperation__Group__5__Impl rule__ArgMaxOperation__Group__6 )
            // InternalMyDsl.g:3885:2: rule__ArgMaxOperation__Group__5__Impl rule__ArgMaxOperation__Group__6
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
    // InternalMyDsl.g:3892:1: rule__ArgMaxOperation__Group__5__Impl : ( 'toTable' ) ;
    public final void rule__ArgMaxOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3896:1: ( ( 'toTable' ) )
            // InternalMyDsl.g:3897:1: ( 'toTable' )
            {
            // InternalMyDsl.g:3897:1: ( 'toTable' )
            // InternalMyDsl.g:3898:2: 'toTable'
            {
             before(grammarAccess.getArgMaxOperationAccess().getToTableKeyword_5()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getArgMaxOperationAccess().getToTableKeyword_5()); 

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
    // InternalMyDsl.g:3907:1: rule__ArgMaxOperation__Group__6 : rule__ArgMaxOperation__Group__6__Impl ;
    public final void rule__ArgMaxOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3911:1: ( rule__ArgMaxOperation__Group__6__Impl )
            // InternalMyDsl.g:3912:2: rule__ArgMaxOperation__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArgMaxOperation__Group__6__Impl();

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
    // InternalMyDsl.g:3918:1: rule__ArgMaxOperation__Group__6__Impl : ( ( rule__ArgMaxOperation__TargetAssignment_6 ) ) ;
    public final void rule__ArgMaxOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3922:1: ( ( ( rule__ArgMaxOperation__TargetAssignment_6 ) ) )
            // InternalMyDsl.g:3923:1: ( ( rule__ArgMaxOperation__TargetAssignment_6 ) )
            {
            // InternalMyDsl.g:3923:1: ( ( rule__ArgMaxOperation__TargetAssignment_6 ) )
            // InternalMyDsl.g:3924:2: ( rule__ArgMaxOperation__TargetAssignment_6 )
            {
             before(grammarAccess.getArgMaxOperationAccess().getTargetAssignment_6()); 
            // InternalMyDsl.g:3925:2: ( rule__ArgMaxOperation__TargetAssignment_6 )
            // InternalMyDsl.g:3925:3: rule__ArgMaxOperation__TargetAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__ArgMaxOperation__TargetAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getArgMaxOperationAccess().getTargetAssignment_6()); 

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


    // $ANTLR start "rule__ArgMinOperation__Group__0"
    // InternalMyDsl.g:3934:1: rule__ArgMinOperation__Group__0 : rule__ArgMinOperation__Group__0__Impl rule__ArgMinOperation__Group__1 ;
    public final void rule__ArgMinOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3938:1: ( rule__ArgMinOperation__Group__0__Impl rule__ArgMinOperation__Group__1 )
            // InternalMyDsl.g:3939:2: rule__ArgMinOperation__Group__0__Impl rule__ArgMinOperation__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyDsl.g:3946:1: rule__ArgMinOperation__Group__0__Impl : ( 'argMin' ) ;
    public final void rule__ArgMinOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3950:1: ( ( 'argMin' ) )
            // InternalMyDsl.g:3951:1: ( 'argMin' )
            {
            // InternalMyDsl.g:3951:1: ( 'argMin' )
            // InternalMyDsl.g:3952:2: 'argMin'
            {
             before(grammarAccess.getArgMinOperationAccess().getArgMinKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getArgMinOperationAccess().getArgMinKeyword_0()); 

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
    // InternalMyDsl.g:3961:1: rule__ArgMinOperation__Group__1 : rule__ArgMinOperation__Group__1__Impl rule__ArgMinOperation__Group__2 ;
    public final void rule__ArgMinOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3965:1: ( rule__ArgMinOperation__Group__1__Impl rule__ArgMinOperation__Group__2 )
            // InternalMyDsl.g:3966:2: rule__ArgMinOperation__Group__1__Impl rule__ArgMinOperation__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:3973:1: rule__ArgMinOperation__Group__1__Impl : ( 'onColumn' ) ;
    public final void rule__ArgMinOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3977:1: ( ( 'onColumn' ) )
            // InternalMyDsl.g:3978:1: ( 'onColumn' )
            {
            // InternalMyDsl.g:3978:1: ( 'onColumn' )
            // InternalMyDsl.g:3979:2: 'onColumn'
            {
             before(grammarAccess.getArgMinOperationAccess().getOnColumnKeyword_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalMyDsl.g:3988:1: rule__ArgMinOperation__Group__2 : rule__ArgMinOperation__Group__2__Impl rule__ArgMinOperation__Group__3 ;
    public final void rule__ArgMinOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3992:1: ( rule__ArgMinOperation__Group__2__Impl rule__ArgMinOperation__Group__3 )
            // InternalMyDsl.g:3993:2: rule__ArgMinOperation__Group__2__Impl rule__ArgMinOperation__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:4000:1: rule__ArgMinOperation__Group__2__Impl : ( ( rule__ArgMinOperation__ColumnAssignment_2 ) ) ;
    public final void rule__ArgMinOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4004:1: ( ( ( rule__ArgMinOperation__ColumnAssignment_2 ) ) )
            // InternalMyDsl.g:4005:1: ( ( rule__ArgMinOperation__ColumnAssignment_2 ) )
            {
            // InternalMyDsl.g:4005:1: ( ( rule__ArgMinOperation__ColumnAssignment_2 ) )
            // InternalMyDsl.g:4006:2: ( rule__ArgMinOperation__ColumnAssignment_2 )
            {
             before(grammarAccess.getArgMinOperationAccess().getColumnAssignment_2()); 
            // InternalMyDsl.g:4007:2: ( rule__ArgMinOperation__ColumnAssignment_2 )
            // InternalMyDsl.g:4007:3: rule__ArgMinOperation__ColumnAssignment_2
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
    // InternalMyDsl.g:4015:1: rule__ArgMinOperation__Group__3 : rule__ArgMinOperation__Group__3__Impl rule__ArgMinOperation__Group__4 ;
    public final void rule__ArgMinOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4019:1: ( rule__ArgMinOperation__Group__3__Impl rule__ArgMinOperation__Group__4 )
            // InternalMyDsl.g:4020:2: rule__ArgMinOperation__Group__3__Impl rule__ArgMinOperation__Group__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:4027:1: rule__ArgMinOperation__Group__3__Impl : ( 'onTable' ) ;
    public final void rule__ArgMinOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4031:1: ( ( 'onTable' ) )
            // InternalMyDsl.g:4032:1: ( 'onTable' )
            {
            // InternalMyDsl.g:4032:1: ( 'onTable' )
            // InternalMyDsl.g:4033:2: 'onTable'
            {
             before(grammarAccess.getArgMinOperationAccess().getOnTableKeyword_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getArgMinOperationAccess().getOnTableKeyword_3()); 

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
    // InternalMyDsl.g:4042:1: rule__ArgMinOperation__Group__4 : rule__ArgMinOperation__Group__4__Impl rule__ArgMinOperation__Group__5 ;
    public final void rule__ArgMinOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4046:1: ( rule__ArgMinOperation__Group__4__Impl rule__ArgMinOperation__Group__5 )
            // InternalMyDsl.g:4047:2: rule__ArgMinOperation__Group__4__Impl rule__ArgMinOperation__Group__5
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:4054:1: rule__ArgMinOperation__Group__4__Impl : ( ( rule__ArgMinOperation__TableAssignment_4 ) ) ;
    public final void rule__ArgMinOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4058:1: ( ( ( rule__ArgMinOperation__TableAssignment_4 ) ) )
            // InternalMyDsl.g:4059:1: ( ( rule__ArgMinOperation__TableAssignment_4 ) )
            {
            // InternalMyDsl.g:4059:1: ( ( rule__ArgMinOperation__TableAssignment_4 ) )
            // InternalMyDsl.g:4060:2: ( rule__ArgMinOperation__TableAssignment_4 )
            {
             before(grammarAccess.getArgMinOperationAccess().getTableAssignment_4()); 
            // InternalMyDsl.g:4061:2: ( rule__ArgMinOperation__TableAssignment_4 )
            // InternalMyDsl.g:4061:3: rule__ArgMinOperation__TableAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ArgMinOperation__TableAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getArgMinOperationAccess().getTableAssignment_4()); 

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
    // InternalMyDsl.g:4069:1: rule__ArgMinOperation__Group__5 : rule__ArgMinOperation__Group__5__Impl rule__ArgMinOperation__Group__6 ;
    public final void rule__ArgMinOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4073:1: ( rule__ArgMinOperation__Group__5__Impl rule__ArgMinOperation__Group__6 )
            // InternalMyDsl.g:4074:2: rule__ArgMinOperation__Group__5__Impl rule__ArgMinOperation__Group__6
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
    // InternalMyDsl.g:4081:1: rule__ArgMinOperation__Group__5__Impl : ( 'toTable' ) ;
    public final void rule__ArgMinOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4085:1: ( ( 'toTable' ) )
            // InternalMyDsl.g:4086:1: ( 'toTable' )
            {
            // InternalMyDsl.g:4086:1: ( 'toTable' )
            // InternalMyDsl.g:4087:2: 'toTable'
            {
             before(grammarAccess.getArgMinOperationAccess().getToTableKeyword_5()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getArgMinOperationAccess().getToTableKeyword_5()); 

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
    // InternalMyDsl.g:4096:1: rule__ArgMinOperation__Group__6 : rule__ArgMinOperation__Group__6__Impl ;
    public final void rule__ArgMinOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4100:1: ( rule__ArgMinOperation__Group__6__Impl )
            // InternalMyDsl.g:4101:2: rule__ArgMinOperation__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArgMinOperation__Group__6__Impl();

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
    // InternalMyDsl.g:4107:1: rule__ArgMinOperation__Group__6__Impl : ( ( rule__ArgMinOperation__TargetAssignment_6 ) ) ;
    public final void rule__ArgMinOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4111:1: ( ( ( rule__ArgMinOperation__TargetAssignment_6 ) ) )
            // InternalMyDsl.g:4112:1: ( ( rule__ArgMinOperation__TargetAssignment_6 ) )
            {
            // InternalMyDsl.g:4112:1: ( ( rule__ArgMinOperation__TargetAssignment_6 ) )
            // InternalMyDsl.g:4113:2: ( rule__ArgMinOperation__TargetAssignment_6 )
            {
             before(grammarAccess.getArgMinOperationAccess().getTargetAssignment_6()); 
            // InternalMyDsl.g:4114:2: ( rule__ArgMinOperation__TargetAssignment_6 )
            // InternalMyDsl.g:4114:3: rule__ArgMinOperation__TargetAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__ArgMinOperation__TargetAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getArgMinOperationAccess().getTargetAssignment_6()); 

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


    // $ANTLR start "rule__DropOperation__Group__0"
    // InternalMyDsl.g:4123:1: rule__DropOperation__Group__0 : rule__DropOperation__Group__0__Impl rule__DropOperation__Group__1 ;
    public final void rule__DropOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4127:1: ( rule__DropOperation__Group__0__Impl rule__DropOperation__Group__1 )
            // InternalMyDsl.g:4128:2: rule__DropOperation__Group__0__Impl rule__DropOperation__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:4135:1: rule__DropOperation__Group__0__Impl : ( 'dropTable' ) ;
    public final void rule__DropOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4139:1: ( ( 'dropTable' ) )
            // InternalMyDsl.g:4140:1: ( 'dropTable' )
            {
            // InternalMyDsl.g:4140:1: ( 'dropTable' )
            // InternalMyDsl.g:4141:2: 'dropTable'
            {
             before(grammarAccess.getDropOperationAccess().getDropTableKeyword_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalMyDsl.g:4150:1: rule__DropOperation__Group__1 : rule__DropOperation__Group__1__Impl ;
    public final void rule__DropOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4154:1: ( rule__DropOperation__Group__1__Impl )
            // InternalMyDsl.g:4155:2: rule__DropOperation__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DropOperation__Group__1__Impl();

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
    // InternalMyDsl.g:4161:1: rule__DropOperation__Group__1__Impl : ( ( rule__DropOperation__TableAssignment_1 ) ) ;
    public final void rule__DropOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4165:1: ( ( ( rule__DropOperation__TableAssignment_1 ) ) )
            // InternalMyDsl.g:4166:1: ( ( rule__DropOperation__TableAssignment_1 ) )
            {
            // InternalMyDsl.g:4166:1: ( ( rule__DropOperation__TableAssignment_1 ) )
            // InternalMyDsl.g:4167:2: ( rule__DropOperation__TableAssignment_1 )
            {
             before(grammarAccess.getDropOperationAccess().getTableAssignment_1()); 
            // InternalMyDsl.g:4168:2: ( rule__DropOperation__TableAssignment_1 )
            // InternalMyDsl.g:4168:3: rule__DropOperation__TableAssignment_1
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


    // $ANTLR start "rule__ProcessFoldersOperation__Group__0"
    // InternalMyDsl.g:4177:1: rule__ProcessFoldersOperation__Group__0 : rule__ProcessFoldersOperation__Group__0__Impl rule__ProcessFoldersOperation__Group__1 ;
    public final void rule__ProcessFoldersOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4181:1: ( rule__ProcessFoldersOperation__Group__0__Impl rule__ProcessFoldersOperation__Group__1 )
            // InternalMyDsl.g:4182:2: rule__ProcessFoldersOperation__Group__0__Impl rule__ProcessFoldersOperation__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:4189:1: rule__ProcessFoldersOperation__Group__0__Impl : ( 'processFolders' ) ;
    public final void rule__ProcessFoldersOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4193:1: ( ( 'processFolders' ) )
            // InternalMyDsl.g:4194:1: ( 'processFolders' )
            {
            // InternalMyDsl.g:4194:1: ( 'processFolders' )
            // InternalMyDsl.g:4195:2: 'processFolders'
            {
             before(grammarAccess.getProcessFoldersOperationAccess().getProcessFoldersKeyword_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalMyDsl.g:4204:1: rule__ProcessFoldersOperation__Group__1 : rule__ProcessFoldersOperation__Group__1__Impl rule__ProcessFoldersOperation__Group__2 ;
    public final void rule__ProcessFoldersOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4208:1: ( rule__ProcessFoldersOperation__Group__1__Impl rule__ProcessFoldersOperation__Group__2 )
            // InternalMyDsl.g:4209:2: rule__ProcessFoldersOperation__Group__1__Impl rule__ProcessFoldersOperation__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:4216:1: rule__ProcessFoldersOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__ProcessFoldersOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4220:1: ( ( '(' ) )
            // InternalMyDsl.g:4221:1: ( '(' )
            {
            // InternalMyDsl.g:4221:1: ( '(' )
            // InternalMyDsl.g:4222:2: '('
            {
             before(grammarAccess.getProcessFoldersOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getProcessFoldersOperationAccess().getLeftParenthesisKeyword_1()); 

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
    // InternalMyDsl.g:4231:1: rule__ProcessFoldersOperation__Group__2 : rule__ProcessFoldersOperation__Group__2__Impl rule__ProcessFoldersOperation__Group__3 ;
    public final void rule__ProcessFoldersOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4235:1: ( rule__ProcessFoldersOperation__Group__2__Impl rule__ProcessFoldersOperation__Group__3 )
            // InternalMyDsl.g:4236:2: rule__ProcessFoldersOperation__Group__2__Impl rule__ProcessFoldersOperation__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:4243:1: rule__ProcessFoldersOperation__Group__2__Impl : ( ( rule__ProcessFoldersOperation__FoldersAssignment_2 ) ) ;
    public final void rule__ProcessFoldersOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4247:1: ( ( ( rule__ProcessFoldersOperation__FoldersAssignment_2 ) ) )
            // InternalMyDsl.g:4248:1: ( ( rule__ProcessFoldersOperation__FoldersAssignment_2 ) )
            {
            // InternalMyDsl.g:4248:1: ( ( rule__ProcessFoldersOperation__FoldersAssignment_2 ) )
            // InternalMyDsl.g:4249:2: ( rule__ProcessFoldersOperation__FoldersAssignment_2 )
            {
             before(grammarAccess.getProcessFoldersOperationAccess().getFoldersAssignment_2()); 
            // InternalMyDsl.g:4250:2: ( rule__ProcessFoldersOperation__FoldersAssignment_2 )
            // InternalMyDsl.g:4250:3: rule__ProcessFoldersOperation__FoldersAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ProcessFoldersOperation__FoldersAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getProcessFoldersOperationAccess().getFoldersAssignment_2()); 

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
    // InternalMyDsl.g:4258:1: rule__ProcessFoldersOperation__Group__3 : rule__ProcessFoldersOperation__Group__3__Impl rule__ProcessFoldersOperation__Group__4 ;
    public final void rule__ProcessFoldersOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4262:1: ( rule__ProcessFoldersOperation__Group__3__Impl rule__ProcessFoldersOperation__Group__4 )
            // InternalMyDsl.g:4263:2: rule__ProcessFoldersOperation__Group__3__Impl rule__ProcessFoldersOperation__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:4270:1: rule__ProcessFoldersOperation__Group__3__Impl : ( ( rule__ProcessFoldersOperation__Group_3__0 )* ) ;
    public final void rule__ProcessFoldersOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4274:1: ( ( ( rule__ProcessFoldersOperation__Group_3__0 )* ) )
            // InternalMyDsl.g:4275:1: ( ( rule__ProcessFoldersOperation__Group_3__0 )* )
            {
            // InternalMyDsl.g:4275:1: ( ( rule__ProcessFoldersOperation__Group_3__0 )* )
            // InternalMyDsl.g:4276:2: ( rule__ProcessFoldersOperation__Group_3__0 )*
            {
             before(grammarAccess.getProcessFoldersOperationAccess().getGroup_3()); 
            // InternalMyDsl.g:4277:2: ( rule__ProcessFoldersOperation__Group_3__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==19) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMyDsl.g:4277:3: rule__ProcessFoldersOperation__Group_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ProcessFoldersOperation__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getProcessFoldersOperationAccess().getGroup_3()); 

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
    // InternalMyDsl.g:4285:1: rule__ProcessFoldersOperation__Group__4 : rule__ProcessFoldersOperation__Group__4__Impl rule__ProcessFoldersOperation__Group__5 ;
    public final void rule__ProcessFoldersOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4289:1: ( rule__ProcessFoldersOperation__Group__4__Impl rule__ProcessFoldersOperation__Group__5 )
            // InternalMyDsl.g:4290:2: rule__ProcessFoldersOperation__Group__4__Impl rule__ProcessFoldersOperation__Group__5
            {
            pushFollow(FOLLOW_27);
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
    // InternalMyDsl.g:4297:1: rule__ProcessFoldersOperation__Group__4__Impl : ( ')' ) ;
    public final void rule__ProcessFoldersOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4301:1: ( ( ')' ) )
            // InternalMyDsl.g:4302:1: ( ')' )
            {
            // InternalMyDsl.g:4302:1: ( ')' )
            // InternalMyDsl.g:4303:2: ')'
            {
             before(grammarAccess.getProcessFoldersOperationAccess().getRightParenthesisKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getProcessFoldersOperationAccess().getRightParenthesisKeyword_4()); 

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
    // InternalMyDsl.g:4312:1: rule__ProcessFoldersOperation__Group__5 : rule__ProcessFoldersOperation__Group__5__Impl rule__ProcessFoldersOperation__Group__6 ;
    public final void rule__ProcessFoldersOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4316:1: ( rule__ProcessFoldersOperation__Group__5__Impl rule__ProcessFoldersOperation__Group__6 )
            // InternalMyDsl.g:4317:2: rule__ProcessFoldersOperation__Group__5__Impl rule__ProcessFoldersOperation__Group__6
            {
            pushFollow(FOLLOW_28);
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
    // InternalMyDsl.g:4324:1: rule__ProcessFoldersOperation__Group__5__Impl : ( 'with' ) ;
    public final void rule__ProcessFoldersOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4328:1: ( ( 'with' ) )
            // InternalMyDsl.g:4329:1: ( 'with' )
            {
            // InternalMyDsl.g:4329:1: ( 'with' )
            // InternalMyDsl.g:4330:2: 'with'
            {
             before(grammarAccess.getProcessFoldersOperationAccess().getWithKeyword_5()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getProcessFoldersOperationAccess().getWithKeyword_5()); 

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
    // InternalMyDsl.g:4339:1: rule__ProcessFoldersOperation__Group__6 : rule__ProcessFoldersOperation__Group__6__Impl rule__ProcessFoldersOperation__Group__7 ;
    public final void rule__ProcessFoldersOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4343:1: ( rule__ProcessFoldersOperation__Group__6__Impl rule__ProcessFoldersOperation__Group__7 )
            // InternalMyDsl.g:4344:2: rule__ProcessFoldersOperation__Group__6__Impl rule__ProcessFoldersOperation__Group__7
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:4351:1: rule__ProcessFoldersOperation__Group__6__Impl : ( '{' ) ;
    public final void rule__ProcessFoldersOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4355:1: ( ( '{' ) )
            // InternalMyDsl.g:4356:1: ( '{' )
            {
            // InternalMyDsl.g:4356:1: ( '{' )
            // InternalMyDsl.g:4357:2: '{'
            {
             before(grammarAccess.getProcessFoldersOperationAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getProcessFoldersOperationAccess().getLeftCurlyBracketKeyword_6()); 

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
    // InternalMyDsl.g:4366:1: rule__ProcessFoldersOperation__Group__7 : rule__ProcessFoldersOperation__Group__7__Impl rule__ProcessFoldersOperation__Group__8 ;
    public final void rule__ProcessFoldersOperation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4370:1: ( rule__ProcessFoldersOperation__Group__7__Impl rule__ProcessFoldersOperation__Group__8 )
            // InternalMyDsl.g:4371:2: rule__ProcessFoldersOperation__Group__7__Impl rule__ProcessFoldersOperation__Group__8
            {
            pushFollow(FOLLOW_29);
            rule__ProcessFoldersOperation__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProcessFoldersOperation__Group__8();

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
    // InternalMyDsl.g:4378:1: rule__ProcessFoldersOperation__Group__7__Impl : ( ( ( rule__ProcessFoldersOperation__FolderOperationsAssignment_7 ) ) ( ( rule__ProcessFoldersOperation__FolderOperationsAssignment_7 )* ) ) ;
    public final void rule__ProcessFoldersOperation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4382:1: ( ( ( ( rule__ProcessFoldersOperation__FolderOperationsAssignment_7 ) ) ( ( rule__ProcessFoldersOperation__FolderOperationsAssignment_7 )* ) ) )
            // InternalMyDsl.g:4383:1: ( ( ( rule__ProcessFoldersOperation__FolderOperationsAssignment_7 ) ) ( ( rule__ProcessFoldersOperation__FolderOperationsAssignment_7 )* ) )
            {
            // InternalMyDsl.g:4383:1: ( ( ( rule__ProcessFoldersOperation__FolderOperationsAssignment_7 ) ) ( ( rule__ProcessFoldersOperation__FolderOperationsAssignment_7 )* ) )
            // InternalMyDsl.g:4384:2: ( ( rule__ProcessFoldersOperation__FolderOperationsAssignment_7 ) ) ( ( rule__ProcessFoldersOperation__FolderOperationsAssignment_7 )* )
            {
            // InternalMyDsl.g:4384:2: ( ( rule__ProcessFoldersOperation__FolderOperationsAssignment_7 ) )
            // InternalMyDsl.g:4385:3: ( rule__ProcessFoldersOperation__FolderOperationsAssignment_7 )
            {
             before(grammarAccess.getProcessFoldersOperationAccess().getFolderOperationsAssignment_7()); 
            // InternalMyDsl.g:4386:3: ( rule__ProcessFoldersOperation__FolderOperationsAssignment_7 )
            // InternalMyDsl.g:4386:4: rule__ProcessFoldersOperation__FolderOperationsAssignment_7
            {
            pushFollow(FOLLOW_3);
            rule__ProcessFoldersOperation__FolderOperationsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getProcessFoldersOperationAccess().getFolderOperationsAssignment_7()); 

            }

            // InternalMyDsl.g:4389:2: ( ( rule__ProcessFoldersOperation__FolderOperationsAssignment_7 )* )
            // InternalMyDsl.g:4390:3: ( rule__ProcessFoldersOperation__FolderOperationsAssignment_7 )*
            {
             before(grammarAccess.getProcessFoldersOperationAccess().getFolderOperationsAssignment_7()); 
            // InternalMyDsl.g:4391:3: ( rule__ProcessFoldersOperation__FolderOperationsAssignment_7 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=11 && LA18_0<=13)||(LA18_0>=21 && LA18_0<=23)||LA18_0==27||LA18_0==29||LA18_0==34||(LA18_0>=38 && LA18_0<=40)||(LA18_0>=42 && LA18_0<=45)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMyDsl.g:4391:4: rule__ProcessFoldersOperation__FolderOperationsAssignment_7
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__ProcessFoldersOperation__FolderOperationsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getProcessFoldersOperationAccess().getFolderOperationsAssignment_7()); 

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
    // $ANTLR end "rule__ProcessFoldersOperation__Group__7__Impl"


    // $ANTLR start "rule__ProcessFoldersOperation__Group__8"
    // InternalMyDsl.g:4400:1: rule__ProcessFoldersOperation__Group__8 : rule__ProcessFoldersOperation__Group__8__Impl ;
    public final void rule__ProcessFoldersOperation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4404:1: ( rule__ProcessFoldersOperation__Group__8__Impl )
            // InternalMyDsl.g:4405:2: rule__ProcessFoldersOperation__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProcessFoldersOperation__Group__8__Impl();

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
    // $ANTLR end "rule__ProcessFoldersOperation__Group__8"


    // $ANTLR start "rule__ProcessFoldersOperation__Group__8__Impl"
    // InternalMyDsl.g:4411:1: rule__ProcessFoldersOperation__Group__8__Impl : ( '}' ) ;
    public final void rule__ProcessFoldersOperation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4415:1: ( ( '}' ) )
            // InternalMyDsl.g:4416:1: ( '}' )
            {
            // InternalMyDsl.g:4416:1: ( '}' )
            // InternalMyDsl.g:4417:2: '}'
            {
             before(grammarAccess.getProcessFoldersOperationAccess().getRightCurlyBracketKeyword_8()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getProcessFoldersOperationAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__ProcessFoldersOperation__Group__8__Impl"


    // $ANTLR start "rule__ProcessFoldersOperation__Group_3__0"
    // InternalMyDsl.g:4427:1: rule__ProcessFoldersOperation__Group_3__0 : rule__ProcessFoldersOperation__Group_3__0__Impl rule__ProcessFoldersOperation__Group_3__1 ;
    public final void rule__ProcessFoldersOperation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4431:1: ( rule__ProcessFoldersOperation__Group_3__0__Impl rule__ProcessFoldersOperation__Group_3__1 )
            // InternalMyDsl.g:4432:2: rule__ProcessFoldersOperation__Group_3__0__Impl rule__ProcessFoldersOperation__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__ProcessFoldersOperation__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProcessFoldersOperation__Group_3__1();

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
    // $ANTLR end "rule__ProcessFoldersOperation__Group_3__0"


    // $ANTLR start "rule__ProcessFoldersOperation__Group_3__0__Impl"
    // InternalMyDsl.g:4439:1: rule__ProcessFoldersOperation__Group_3__0__Impl : ( ',' ) ;
    public final void rule__ProcessFoldersOperation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4443:1: ( ( ',' ) )
            // InternalMyDsl.g:4444:1: ( ',' )
            {
            // InternalMyDsl.g:4444:1: ( ',' )
            // InternalMyDsl.g:4445:2: ','
            {
             before(grammarAccess.getProcessFoldersOperationAccess().getCommaKeyword_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getProcessFoldersOperationAccess().getCommaKeyword_3_0()); 

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
    // $ANTLR end "rule__ProcessFoldersOperation__Group_3__0__Impl"


    // $ANTLR start "rule__ProcessFoldersOperation__Group_3__1"
    // InternalMyDsl.g:4454:1: rule__ProcessFoldersOperation__Group_3__1 : rule__ProcessFoldersOperation__Group_3__1__Impl ;
    public final void rule__ProcessFoldersOperation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4458:1: ( rule__ProcessFoldersOperation__Group_3__1__Impl )
            // InternalMyDsl.g:4459:2: rule__ProcessFoldersOperation__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProcessFoldersOperation__Group_3__1__Impl();

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
    // $ANTLR end "rule__ProcessFoldersOperation__Group_3__1"


    // $ANTLR start "rule__ProcessFoldersOperation__Group_3__1__Impl"
    // InternalMyDsl.g:4465:1: rule__ProcessFoldersOperation__Group_3__1__Impl : ( ( rule__ProcessFoldersOperation__FoldersAssignment_3_1 ) ) ;
    public final void rule__ProcessFoldersOperation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4469:1: ( ( ( rule__ProcessFoldersOperation__FoldersAssignment_3_1 ) ) )
            // InternalMyDsl.g:4470:1: ( ( rule__ProcessFoldersOperation__FoldersAssignment_3_1 ) )
            {
            // InternalMyDsl.g:4470:1: ( ( rule__ProcessFoldersOperation__FoldersAssignment_3_1 ) )
            // InternalMyDsl.g:4471:2: ( rule__ProcessFoldersOperation__FoldersAssignment_3_1 )
            {
             before(grammarAccess.getProcessFoldersOperationAccess().getFoldersAssignment_3_1()); 
            // InternalMyDsl.g:4472:2: ( rule__ProcessFoldersOperation__FoldersAssignment_3_1 )
            // InternalMyDsl.g:4472:3: rule__ProcessFoldersOperation__FoldersAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ProcessFoldersOperation__FoldersAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getProcessFoldersOperationAccess().getFoldersAssignment_3_1()); 

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
    // $ANTLR end "rule__ProcessFoldersOperation__Group_3__1__Impl"


    // $ANTLR start "rule__Model__OperationsAssignment"
    // InternalMyDsl.g:4481:1: rule__Model__OperationsAssignment : ( ruleTopLevelOperation ) ;
    public final void rule__Model__OperationsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4485:1: ( ( ruleTopLevelOperation ) )
            // InternalMyDsl.g:4486:2: ( ruleTopLevelOperation )
            {
            // InternalMyDsl.g:4486:2: ( ruleTopLevelOperation )
            // InternalMyDsl.g:4487:3: ruleTopLevelOperation
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
    // InternalMyDsl.g:4496:1: rule__LoadJSON__FileAssignment_2 : ( RULE_STRING ) ;
    public final void rule__LoadJSON__FileAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4500:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:4501:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:4501:2: ( RULE_STRING )
            // InternalMyDsl.g:4502:3: RULE_STRING
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


    // $ANTLR start "rule__LoadJSON__TableAssignment_4"
    // InternalMyDsl.g:4511:1: rule__LoadJSON__TableAssignment_4 : ( RULE_STRING ) ;
    public final void rule__LoadJSON__TableAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4515:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:4516:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:4516:2: ( RULE_STRING )
            // InternalMyDsl.g:4517:3: RULE_STRING
            {
             before(grammarAccess.getLoadJSONAccess().getTableSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLoadJSONAccess().getTableSTRINGTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__LoadJSON__TableAssignment_4"


    // $ANTLR start "rule__LoadJSON__AttributesAssignment_5_2"
    // InternalMyDsl.g:4526:1: rule__LoadJSON__AttributesAssignment_5_2 : ( RULE_STRING ) ;
    public final void rule__LoadJSON__AttributesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4530:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:4531:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:4531:2: ( RULE_STRING )
            // InternalMyDsl.g:4532:3: RULE_STRING
            {
             before(grammarAccess.getLoadJSONAccess().getAttributesSTRINGTerminalRuleCall_5_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLoadJSONAccess().getAttributesSTRINGTerminalRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__LoadJSON__AttributesAssignment_5_2"


    // $ANTLR start "rule__LoadJSON__AttributesAssignment_5_3_1"
    // InternalMyDsl.g:4541:1: rule__LoadJSON__AttributesAssignment_5_3_1 : ( RULE_STRING ) ;
    public final void rule__LoadJSON__AttributesAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4545:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:4546:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:4546:2: ( RULE_STRING )
            // InternalMyDsl.g:4547:3: RULE_STRING
            {
             before(grammarAccess.getLoadJSONAccess().getAttributesSTRINGTerminalRuleCall_5_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLoadJSONAccess().getAttributesSTRINGTerminalRuleCall_5_3_1_0()); 

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
    // $ANTLR end "rule__LoadJSON__AttributesAssignment_5_3_1"


    // $ANTLR start "rule__LoadJSON__NestedAssignment_6_2"
    // InternalMyDsl.g:4556:1: rule__LoadJSON__NestedAssignment_6_2 : ( RULE_STRING ) ;
    public final void rule__LoadJSON__NestedAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4560:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:4561:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:4561:2: ( RULE_STRING )
            // InternalMyDsl.g:4562:3: RULE_STRING
            {
             before(grammarAccess.getLoadJSONAccess().getNestedSTRINGTerminalRuleCall_6_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLoadJSONAccess().getNestedSTRINGTerminalRuleCall_6_2_0()); 

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
    // $ANTLR end "rule__LoadJSON__NestedAssignment_6_2"


    // $ANTLR start "rule__LoadJSON__NestedAssignment_6_3_1"
    // InternalMyDsl.g:4571:1: rule__LoadJSON__NestedAssignment_6_3_1 : ( RULE_STRING ) ;
    public final void rule__LoadJSON__NestedAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4575:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:4576:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:4576:2: ( RULE_STRING )
            // InternalMyDsl.g:4577:3: RULE_STRING
            {
             before(grammarAccess.getLoadJSONAccess().getNestedSTRINGTerminalRuleCall_6_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLoadJSONAccess().getNestedSTRINGTerminalRuleCall_6_3_1_0()); 

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
    // $ANTLR end "rule__LoadJSON__NestedAssignment_6_3_1"


    // $ANTLR start "rule__LoadXML__FileAssignment_2"
    // InternalMyDsl.g:4586:1: rule__LoadXML__FileAssignment_2 : ( RULE_STRING ) ;
    public final void rule__LoadXML__FileAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4590:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:4591:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:4591:2: ( RULE_STRING )
            // InternalMyDsl.g:4592:3: RULE_STRING
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


    // $ANTLR start "rule__LoadXML__TableAssignment_4"
    // InternalMyDsl.g:4601:1: rule__LoadXML__TableAssignment_4 : ( RULE_STRING ) ;
    public final void rule__LoadXML__TableAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4605:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:4606:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:4606:2: ( RULE_STRING )
            // InternalMyDsl.g:4607:3: RULE_STRING
            {
             before(grammarAccess.getLoadXMLAccess().getTableSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLoadXMLAccess().getTableSTRINGTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__LoadXML__TableAssignment_4"


    // $ANTLR start "rule__LoadXML__NestedAssignment_5_2"
    // InternalMyDsl.g:4616:1: rule__LoadXML__NestedAssignment_5_2 : ( RULE_STRING ) ;
    public final void rule__LoadXML__NestedAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4620:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:4621:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:4621:2: ( RULE_STRING )
            // InternalMyDsl.g:4622:3: RULE_STRING
            {
             before(grammarAccess.getLoadXMLAccess().getNestedSTRINGTerminalRuleCall_5_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLoadXMLAccess().getNestedSTRINGTerminalRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__LoadXML__NestedAssignment_5_2"


    // $ANTLR start "rule__LoadXML__NestedAssignment_5_3_1"
    // InternalMyDsl.g:4631:1: rule__LoadXML__NestedAssignment_5_3_1 : ( RULE_STRING ) ;
    public final void rule__LoadXML__NestedAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4635:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:4636:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:4636:2: ( RULE_STRING )
            // InternalMyDsl.g:4637:3: RULE_STRING
            {
             before(grammarAccess.getLoadXMLAccess().getNestedSTRINGTerminalRuleCall_5_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLoadXMLAccess().getNestedSTRINGTerminalRuleCall_5_3_1_0()); 

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
    // $ANTLR end "rule__LoadXML__NestedAssignment_5_3_1"


    // $ANTLR start "rule__LoadYAML__FileAssignment_2"
    // InternalMyDsl.g:4646:1: rule__LoadYAML__FileAssignment_2 : ( RULE_STRING ) ;
    public final void rule__LoadYAML__FileAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4650:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:4651:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:4651:2: ( RULE_STRING )
            // InternalMyDsl.g:4652:3: RULE_STRING
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


    // $ANTLR start "rule__LoadYAML__TableAssignment_4"
    // InternalMyDsl.g:4661:1: rule__LoadYAML__TableAssignment_4 : ( RULE_STRING ) ;
    public final void rule__LoadYAML__TableAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4665:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:4666:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:4666:2: ( RULE_STRING )
            // InternalMyDsl.g:4667:3: RULE_STRING
            {
             before(grammarAccess.getLoadYAMLAccess().getTableSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLoadYAMLAccess().getTableSTRINGTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__LoadYAML__TableAssignment_4"


    // $ANTLR start "rule__LoadYAML__NestedAssignment_5_2"
    // InternalMyDsl.g:4676:1: rule__LoadYAML__NestedAssignment_5_2 : ( RULE_STRING ) ;
    public final void rule__LoadYAML__NestedAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4680:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:4681:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:4681:2: ( RULE_STRING )
            // InternalMyDsl.g:4682:3: RULE_STRING
            {
             before(grammarAccess.getLoadYAMLAccess().getNestedSTRINGTerminalRuleCall_5_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLoadYAMLAccess().getNestedSTRINGTerminalRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__LoadYAML__NestedAssignment_5_2"


    // $ANTLR start "rule__LoadYAML__NestedAssignment_5_3_1"
    // InternalMyDsl.g:4691:1: rule__LoadYAML__NestedAssignment_5_3_1 : ( RULE_STRING ) ;
    public final void rule__LoadYAML__NestedAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4695:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:4696:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:4696:2: ( RULE_STRING )
            // InternalMyDsl.g:4697:3: RULE_STRING
            {
             before(grammarAccess.getLoadYAMLAccess().getNestedSTRINGTerminalRuleCall_5_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLoadYAMLAccess().getNestedSTRINGTerminalRuleCall_5_3_1_0()); 

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
    // $ANTLR end "rule__LoadYAML__NestedAssignment_5_3_1"


    // $ANTLR start "rule__SelectOperation__ColumnsAssignment_3"
    // InternalMyDsl.g:4706:1: rule__SelectOperation__ColumnsAssignment_3 : ( RULE_STRING ) ;
    public final void rule__SelectOperation__ColumnsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4710:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:4711:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:4711:2: ( RULE_STRING )
            // InternalMyDsl.g:4712:3: RULE_STRING
            {
             before(grammarAccess.getSelectOperationAccess().getColumnsSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSelectOperationAccess().getColumnsSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__SelectOperation__ColumnsAssignment_3"


    // $ANTLR start "rule__SelectOperation__ColumnsAssignment_4_1"
    // InternalMyDsl.g:4721:1: rule__SelectOperation__ColumnsAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__SelectOperation__ColumnsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4725:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:4726:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:4726:2: ( RULE_STRING )
            // InternalMyDsl.g:4727:3: RULE_STRING
            {
             before(grammarAccess.getSelectOperationAccess().getColumnsSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSelectOperationAccess().getColumnsSTRINGTerminalRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__SelectOperation__ColumnsAssignment_4_1"


    // $ANTLR start "rule__SelectOperation__TableAssignment_7"
    // InternalMyDsl.g:4736:1: rule__SelectOperation__TableAssignment_7 : ( RULE_STRING ) ;
    public final void rule__SelectOperation__TableAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4740:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:4741:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:4741:2: ( RULE_STRING )
            // InternalMyDsl.g:4742:3: RULE_STRING
            {
             before(grammarAccess.getSelectOperationAccess().getTableSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSelectOperationAccess().getTableSTRINGTerminalRuleCall_7_0()); 

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
    // $ANTLR end "rule__SelectOperation__TableAssignment_7"


    // $ANTLR start "rule__SelectOperation__TargetAssignment_9"
    // InternalMyDsl.g:4751:1: rule__SelectOperation__TargetAssignment_9 : ( RULE_STRING ) ;
    public final void rule__SelectOperation__TargetAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4755:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:4756:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:4756:2: ( RULE_STRING )
            // InternalMyDsl.g:4757:3: RULE_STRING
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


    // $ANTLR start "rule__ConcatOperation__TargetAssignment_2"
    // InternalMyDsl.g:4766:1: rule__ConcatOperation__TargetAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ConcatOperation__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4770:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:4771:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:4771:2: ( RULE_STRING )
            // InternalMyDsl.g:4772:3: RULE_STRING
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
    // InternalMyDsl.g:4781:1: rule__ConcatOperation__TablesAssignment_5 : ( RULE_STRING ) ;
    public final void rule__ConcatOperation__TablesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4785:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:4786:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:4786:2: ( RULE_STRING )
            // InternalMyDsl.g:4787:3: RULE_STRING
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
    // InternalMyDsl.g:4796:1: rule__ConcatOperation__TablesAssignment_6_1 : ( RULE_STRING ) ;
    public final void rule__ConcatOperation__TablesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4800:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:4801:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:4801:2: ( RULE_STRING )
            // InternalMyDsl.g:4802:3: RULE_STRING
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
    // InternalMyDsl.g:4811:1: rule__FilterOperation__ColumnAssignment_2 : ( RULE_STRING ) ;
    public final void rule__FilterOperation__ColumnAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4815:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:4816:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:4816:2: ( RULE_STRING )
            // InternalMyDsl.g:4817:3: RULE_STRING
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


    // $ANTLR start "rule__FilterOperation__TableAssignment_4"
    // InternalMyDsl.g:4826:1: rule__FilterOperation__TableAssignment_4 : ( RULE_STRING ) ;
    public final void rule__FilterOperation__TableAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4830:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:4831:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:4831:2: ( RULE_STRING )
            // InternalMyDsl.g:4832:3: RULE_STRING
            {
             before(grammarAccess.getFilterOperationAccess().getTableSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFilterOperationAccess().getTableSTRINGTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__FilterOperation__TableAssignment_4"


    // $ANTLR start "rule__FilterOperation__ConditionAssignment_6"
    // InternalMyDsl.g:4841:1: rule__FilterOperation__ConditionAssignment_6 : ( RULE_STRING ) ;
    public final void rule__FilterOperation__ConditionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4845:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:4846:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:4846:2: ( RULE_STRING )
            // InternalMyDsl.g:4847:3: RULE_STRING
            {
             before(grammarAccess.getFilterOperationAccess().getConditionSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFilterOperationAccess().getConditionSTRINGTerminalRuleCall_6_0()); 

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
    // $ANTLR end "rule__FilterOperation__ConditionAssignment_6"


    // $ANTLR start "rule__FilterOperation__ValueAssignment_8"
    // InternalMyDsl.g:4856:1: rule__FilterOperation__ValueAssignment_8 : ( RULE_STRING ) ;
    public final void rule__FilterOperation__ValueAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4860:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:4861:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:4861:2: ( RULE_STRING )
            // InternalMyDsl.g:4862:3: RULE_STRING
            {
             before(grammarAccess.getFilterOperationAccess().getValueSTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFilterOperationAccess().getValueSTRINGTerminalRuleCall_8_0()); 

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
    // $ANTLR end "rule__FilterOperation__ValueAssignment_8"


    // $ANTLR start "rule__FilterOperation__TargetAssignment_9_1"
    // InternalMyDsl.g:4871:1: rule__FilterOperation__TargetAssignment_9_1 : ( RULE_STRING ) ;
    public final void rule__FilterOperation__TargetAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4875:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:4876:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:4876:2: ( RULE_STRING )
            // InternalMyDsl.g:4877:3: RULE_STRING
            {
             before(grammarAccess.getFilterOperationAccess().getTargetSTRINGTerminalRuleCall_9_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFilterOperationAccess().getTargetSTRINGTerminalRuleCall_9_1_0()); 

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
    // $ANTLR end "rule__FilterOperation__TargetAssignment_9_1"


    // $ANTLR start "rule__SaveOperation__TablesAssignment_3"
    // InternalMyDsl.g:4886:1: rule__SaveOperation__TablesAssignment_3 : ( RULE_STRING ) ;
    public final void rule__SaveOperation__TablesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4890:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:4891:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:4891:2: ( RULE_STRING )
            // InternalMyDsl.g:4892:3: RULE_STRING
            {
             before(grammarAccess.getSaveOperationAccess().getTablesSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSaveOperationAccess().getTablesSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__SaveOperation__TablesAssignment_3"


    // $ANTLR start "rule__SaveOperation__TablesAssignment_4_1"
    // InternalMyDsl.g:4901:1: rule__SaveOperation__TablesAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__SaveOperation__TablesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4905:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:4906:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:4906:2: ( RULE_STRING )
            // InternalMyDsl.g:4907:3: RULE_STRING
            {
             before(grammarAccess.getSaveOperationAccess().getTablesSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSaveOperationAccess().getTablesSTRINGTerminalRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__SaveOperation__TablesAssignment_4_1"


    // $ANTLR start "rule__SaveOperation__FileAssignment_7"
    // InternalMyDsl.g:4916:1: rule__SaveOperation__FileAssignment_7 : ( RULE_STRING ) ;
    public final void rule__SaveOperation__FileAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4920:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:4921:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:4921:2: ( RULE_STRING )
            // InternalMyDsl.g:4922:3: RULE_STRING
            {
             before(grammarAccess.getSaveOperationAccess().getFileSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSaveOperationAccess().getFileSTRINGTerminalRuleCall_7_0()); 

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
    // $ANTLR end "rule__SaveOperation__FileAssignment_7"


    // $ANTLR start "rule__SaveOperation__FormatAssignment_9"
    // InternalMyDsl.g:4931:1: rule__SaveOperation__FormatAssignment_9 : ( RULE_STRING ) ;
    public final void rule__SaveOperation__FormatAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4935:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:4936:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:4936:2: ( RULE_STRING )
            // InternalMyDsl.g:4937:3: RULE_STRING
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
    // InternalMyDsl.g:4946:1: rule__PrintTable__TableAssignment_1 : ( RULE_STRING ) ;
    public final void rule__PrintTable__TableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4950:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:4951:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:4951:2: ( RULE_STRING )
            // InternalMyDsl.g:4952:3: RULE_STRING
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
    // InternalMyDsl.g:4961:1: rule__RenameOperation__OriginalAssignment_2 : ( RULE_STRING ) ;
    public final void rule__RenameOperation__OriginalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4965:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:4966:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:4966:2: ( RULE_STRING )
            // InternalMyDsl.g:4967:3: RULE_STRING
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


    // $ANTLR start "rule__RenameOperation__RenamedAssignment_4"
    // InternalMyDsl.g:4976:1: rule__RenameOperation__RenamedAssignment_4 : ( RULE_STRING ) ;
    public final void rule__RenameOperation__RenamedAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4980:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:4981:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:4981:2: ( RULE_STRING )
            // InternalMyDsl.g:4982:3: RULE_STRING
            {
             before(grammarAccess.getRenameOperationAccess().getRenamedSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRenameOperationAccess().getRenamedSTRINGTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__RenameOperation__RenamedAssignment_4"


    // $ANTLR start "rule__RenameOperation__TableAssignment_6"
    // InternalMyDsl.g:4991:1: rule__RenameOperation__TableAssignment_6 : ( RULE_STRING ) ;
    public final void rule__RenameOperation__TableAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4995:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:4996:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:4996:2: ( RULE_STRING )
            // InternalMyDsl.g:4997:3: RULE_STRING
            {
             before(grammarAccess.getRenameOperationAccess().getTableSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRenameOperationAccess().getTableSTRINGTerminalRuleCall_6_0()); 

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
    // $ANTLR end "rule__RenameOperation__TableAssignment_6"


    // $ANTLR start "rule__LimitOperation__TableAssignment_2"
    // InternalMyDsl.g:5006:1: rule__LimitOperation__TableAssignment_2 : ( RULE_STRING ) ;
    public final void rule__LimitOperation__TableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5010:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5011:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5011:2: ( RULE_STRING )
            // InternalMyDsl.g:5012:3: RULE_STRING
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


    // $ANTLR start "rule__LimitOperation__StartAssignment_4"
    // InternalMyDsl.g:5021:1: rule__LimitOperation__StartAssignment_4 : ( RULE_INT ) ;
    public final void rule__LimitOperation__StartAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5025:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:5026:2: ( RULE_INT )
            {
            // InternalMyDsl.g:5026:2: ( RULE_INT )
            // InternalMyDsl.g:5027:3: RULE_INT
            {
             before(grammarAccess.getLimitOperationAccess().getStartINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLimitOperationAccess().getStartINTTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__LimitOperation__StartAssignment_4"


    // $ANTLR start "rule__LimitOperation__EndAssignment_6"
    // InternalMyDsl.g:5036:1: rule__LimitOperation__EndAssignment_6 : ( RULE_INT ) ;
    public final void rule__LimitOperation__EndAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5040:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:5041:2: ( RULE_INT )
            {
            // InternalMyDsl.g:5041:2: ( RULE_INT )
            // InternalMyDsl.g:5042:3: RULE_INT
            {
             before(grammarAccess.getLimitOperationAccess().getEndINTTerminalRuleCall_6_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLimitOperationAccess().getEndINTTerminalRuleCall_6_0()); 

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
    // $ANTLR end "rule__LimitOperation__EndAssignment_6"


    // $ANTLR start "rule__ArgMaxOperation__ColumnAssignment_2"
    // InternalMyDsl.g:5051:1: rule__ArgMaxOperation__ColumnAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ArgMaxOperation__ColumnAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5055:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5056:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5056:2: ( RULE_STRING )
            // InternalMyDsl.g:5057:3: RULE_STRING
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


    // $ANTLR start "rule__ArgMaxOperation__TableAssignment_4"
    // InternalMyDsl.g:5066:1: rule__ArgMaxOperation__TableAssignment_4 : ( RULE_STRING ) ;
    public final void rule__ArgMaxOperation__TableAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5070:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5071:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5071:2: ( RULE_STRING )
            // InternalMyDsl.g:5072:3: RULE_STRING
            {
             before(grammarAccess.getArgMaxOperationAccess().getTableSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getArgMaxOperationAccess().getTableSTRINGTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__ArgMaxOperation__TableAssignment_4"


    // $ANTLR start "rule__ArgMaxOperation__TargetAssignment_6"
    // InternalMyDsl.g:5081:1: rule__ArgMaxOperation__TargetAssignment_6 : ( RULE_STRING ) ;
    public final void rule__ArgMaxOperation__TargetAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5085:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5086:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5086:2: ( RULE_STRING )
            // InternalMyDsl.g:5087:3: RULE_STRING
            {
             before(grammarAccess.getArgMaxOperationAccess().getTargetSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getArgMaxOperationAccess().getTargetSTRINGTerminalRuleCall_6_0()); 

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
    // $ANTLR end "rule__ArgMaxOperation__TargetAssignment_6"


    // $ANTLR start "rule__ArgMinOperation__ColumnAssignment_2"
    // InternalMyDsl.g:5096:1: rule__ArgMinOperation__ColumnAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ArgMinOperation__ColumnAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5100:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5101:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5101:2: ( RULE_STRING )
            // InternalMyDsl.g:5102:3: RULE_STRING
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


    // $ANTLR start "rule__ArgMinOperation__TableAssignment_4"
    // InternalMyDsl.g:5111:1: rule__ArgMinOperation__TableAssignment_4 : ( RULE_STRING ) ;
    public final void rule__ArgMinOperation__TableAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5115:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5116:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5116:2: ( RULE_STRING )
            // InternalMyDsl.g:5117:3: RULE_STRING
            {
             before(grammarAccess.getArgMinOperationAccess().getTableSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getArgMinOperationAccess().getTableSTRINGTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__ArgMinOperation__TableAssignment_4"


    // $ANTLR start "rule__ArgMinOperation__TargetAssignment_6"
    // InternalMyDsl.g:5126:1: rule__ArgMinOperation__TargetAssignment_6 : ( RULE_STRING ) ;
    public final void rule__ArgMinOperation__TargetAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5130:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5131:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5131:2: ( RULE_STRING )
            // InternalMyDsl.g:5132:3: RULE_STRING
            {
             before(grammarAccess.getArgMinOperationAccess().getTargetSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getArgMinOperationAccess().getTargetSTRINGTerminalRuleCall_6_0()); 

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
    // $ANTLR end "rule__ArgMinOperation__TargetAssignment_6"


    // $ANTLR start "rule__DropOperation__TableAssignment_1"
    // InternalMyDsl.g:5141:1: rule__DropOperation__TableAssignment_1 : ( RULE_STRING ) ;
    public final void rule__DropOperation__TableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5145:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5146:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5146:2: ( RULE_STRING )
            // InternalMyDsl.g:5147:3: RULE_STRING
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


    // $ANTLR start "rule__ProcessFoldersOperation__FoldersAssignment_2"
    // InternalMyDsl.g:5156:1: rule__ProcessFoldersOperation__FoldersAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ProcessFoldersOperation__FoldersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5160:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5161:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5161:2: ( RULE_STRING )
            // InternalMyDsl.g:5162:3: RULE_STRING
            {
             before(grammarAccess.getProcessFoldersOperationAccess().getFoldersSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getProcessFoldersOperationAccess().getFoldersSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__ProcessFoldersOperation__FoldersAssignment_2"


    // $ANTLR start "rule__ProcessFoldersOperation__FoldersAssignment_3_1"
    // InternalMyDsl.g:5171:1: rule__ProcessFoldersOperation__FoldersAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__ProcessFoldersOperation__FoldersAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5175:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5176:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5176:2: ( RULE_STRING )
            // InternalMyDsl.g:5177:3: RULE_STRING
            {
             before(grammarAccess.getProcessFoldersOperationAccess().getFoldersSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getProcessFoldersOperationAccess().getFoldersSTRINGTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__ProcessFoldersOperation__FoldersAssignment_3_1"


    // $ANTLR start "rule__ProcessFoldersOperation__FolderOperationsAssignment_7"
    // InternalMyDsl.g:5186:1: rule__ProcessFoldersOperation__FolderOperationsAssignment_7 : ( ruleTopLevelOperation ) ;
    public final void rule__ProcessFoldersOperation__FolderOperationsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5190:1: ( ( ruleTopLevelOperation ) )
            // InternalMyDsl.g:5191:2: ( ruleTopLevelOperation )
            {
            // InternalMyDsl.g:5191:2: ( ruleTopLevelOperation )
            // InternalMyDsl.g:5192:3: ruleTopLevelOperation
            {
             before(grammarAccess.getProcessFoldersOperationAccess().getFolderOperationsTopLevelOperationParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleTopLevelOperation();

            state._fsp--;

             after(grammarAccess.getProcessFoldersOperationAccess().getFolderOperationsTopLevelOperationParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__ProcessFoldersOperation__FolderOperationsAssignment_7"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00003DC428E03802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00003DC428E03800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0001000000000000L});

}