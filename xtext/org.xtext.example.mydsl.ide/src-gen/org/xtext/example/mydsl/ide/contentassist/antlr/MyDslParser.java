/*
 * generated by Xtext 2.37.0
 */
package org.xtext.example.mydsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.mydsl.ide.contentassist.antlr.internal.InternalMyDslParser;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

public class MyDslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(MyDslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, MyDslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getTopLevelOperationAccess().getAlternatives(), "rule__TopLevelOperation__Alternatives");
			builder.put(grammarAccess.getLoadOperationAccess().getAlternatives(), "rule__LoadOperation__Alternatives");
			builder.put(grammarAccess.getPrintOperationAccess().getAlternatives(), "rule__PrintOperation__Alternatives");
			builder.put(grammarAccess.getTopLevelOperationAccess().getGroup_12(), "rule__TopLevelOperation__Group_12__0");
			builder.put(grammarAccess.getLoadJSONAccess().getGroup(), "rule__LoadJSON__Group__0");
			builder.put(grammarAccess.getLoadJSONAccess().getGroup_5(), "rule__LoadJSON__Group_5__0");
			builder.put(grammarAccess.getLoadJSONAccess().getGroup_5_3(), "rule__LoadJSON__Group_5_3__0");
			builder.put(grammarAccess.getLoadJSONAccess().getGroup_6(), "rule__LoadJSON__Group_6__0");
			builder.put(grammarAccess.getLoadJSONAccess().getGroup_6_3(), "rule__LoadJSON__Group_6_3__0");
			builder.put(grammarAccess.getLoadXMLAccess().getGroup(), "rule__LoadXML__Group__0");
			builder.put(grammarAccess.getLoadXMLAccess().getGroup_5(), "rule__LoadXML__Group_5__0");
			builder.put(grammarAccess.getLoadXMLAccess().getGroup_5_3(), "rule__LoadXML__Group_5_3__0");
			builder.put(grammarAccess.getLoadYAMLAccess().getGroup(), "rule__LoadYAML__Group__0");
			builder.put(grammarAccess.getLoadYAMLAccess().getGroup_5(), "rule__LoadYAML__Group_5__0");
			builder.put(grammarAccess.getLoadYAMLAccess().getGroup_5_3(), "rule__LoadYAML__Group_5_3__0");
			builder.put(grammarAccess.getSelectOperationAccess().getGroup(), "rule__SelectOperation__Group__0");
			builder.put(grammarAccess.getSelectOperationAccess().getGroup_4(), "rule__SelectOperation__Group_4__0");
			builder.put(grammarAccess.getConcatOperationAccess().getGroup(), "rule__ConcatOperation__Group__0");
			builder.put(grammarAccess.getConcatOperationAccess().getGroup_6(), "rule__ConcatOperation__Group_6__0");
			builder.put(grammarAccess.getFilterOperationAccess().getGroup(), "rule__FilterOperation__Group__0");
			builder.put(grammarAccess.getFilterOperationAccess().getGroup_9(), "rule__FilterOperation__Group_9__0");
			builder.put(grammarAccess.getSaveOperationAccess().getGroup(), "rule__SaveOperation__Group__0");
			builder.put(grammarAccess.getSaveOperationAccess().getGroup_4(), "rule__SaveOperation__Group_4__0");
			builder.put(grammarAccess.getPrintOperationAccess().getGroup_0(), "rule__PrintOperation__Group_0__0");
			builder.put(grammarAccess.getPrintTableAccess().getGroup(), "rule__PrintTable__Group__0");
			builder.put(grammarAccess.getRenameOperationAccess().getGroup(), "rule__RenameOperation__Group__0");
			builder.put(grammarAccess.getLimitOperationAccess().getGroup(), "rule__LimitOperation__Group__0");
			builder.put(grammarAccess.getArgMaxOperationAccess().getGroup(), "rule__ArgMaxOperation__Group__0");
			builder.put(grammarAccess.getArgMinOperationAccess().getGroup(), "rule__ArgMinOperation__Group__0");
			builder.put(grammarAccess.getDropOperationAccess().getGroup(), "rule__DropOperation__Group__0");
			builder.put(grammarAccess.getProcessFoldersOperationAccess().getGroup(), "rule__ProcessFoldersOperation__Group__0");
			builder.put(grammarAccess.getProcessFoldersOperationAccess().getGroup_3(), "rule__ProcessFoldersOperation__Group_3__0");
			builder.put(grammarAccess.getModelAccess().getOperationsAssignment(), "rule__Model__OperationsAssignment");
			builder.put(grammarAccess.getLoadJSONAccess().getFileAssignment_2(), "rule__LoadJSON__FileAssignment_2");
			builder.put(grammarAccess.getLoadJSONAccess().getTableAssignment_4(), "rule__LoadJSON__TableAssignment_4");
			builder.put(grammarAccess.getLoadJSONAccess().getAttributesAssignment_5_2(), "rule__LoadJSON__AttributesAssignment_5_2");
			builder.put(grammarAccess.getLoadJSONAccess().getAttributesAssignment_5_3_1(), "rule__LoadJSON__AttributesAssignment_5_3_1");
			builder.put(grammarAccess.getLoadJSONAccess().getNestedAssignment_6_2(), "rule__LoadJSON__NestedAssignment_6_2");
			builder.put(grammarAccess.getLoadJSONAccess().getNestedAssignment_6_3_1(), "rule__LoadJSON__NestedAssignment_6_3_1");
			builder.put(grammarAccess.getLoadXMLAccess().getFileAssignment_2(), "rule__LoadXML__FileAssignment_2");
			builder.put(grammarAccess.getLoadXMLAccess().getTableAssignment_4(), "rule__LoadXML__TableAssignment_4");
			builder.put(grammarAccess.getLoadXMLAccess().getNestedAssignment_5_2(), "rule__LoadXML__NestedAssignment_5_2");
			builder.put(grammarAccess.getLoadXMLAccess().getNestedAssignment_5_3_1(), "rule__LoadXML__NestedAssignment_5_3_1");
			builder.put(grammarAccess.getLoadYAMLAccess().getFileAssignment_2(), "rule__LoadYAML__FileAssignment_2");
			builder.put(grammarAccess.getLoadYAMLAccess().getTableAssignment_4(), "rule__LoadYAML__TableAssignment_4");
			builder.put(grammarAccess.getLoadYAMLAccess().getNestedAssignment_5_2(), "rule__LoadYAML__NestedAssignment_5_2");
			builder.put(grammarAccess.getLoadYAMLAccess().getNestedAssignment_5_3_1(), "rule__LoadYAML__NestedAssignment_5_3_1");
			builder.put(grammarAccess.getSelectOperationAccess().getColumnsAssignment_3(), "rule__SelectOperation__ColumnsAssignment_3");
			builder.put(grammarAccess.getSelectOperationAccess().getColumnsAssignment_4_1(), "rule__SelectOperation__ColumnsAssignment_4_1");
			builder.put(grammarAccess.getSelectOperationAccess().getTableAssignment_7(), "rule__SelectOperation__TableAssignment_7");
			builder.put(grammarAccess.getSelectOperationAccess().getTargetAssignment_9(), "rule__SelectOperation__TargetAssignment_9");
			builder.put(grammarAccess.getConcatOperationAccess().getTargetAssignment_2(), "rule__ConcatOperation__TargetAssignment_2");
			builder.put(grammarAccess.getConcatOperationAccess().getTablesAssignment_5(), "rule__ConcatOperation__TablesAssignment_5");
			builder.put(grammarAccess.getConcatOperationAccess().getTablesAssignment_6_1(), "rule__ConcatOperation__TablesAssignment_6_1");
			builder.put(grammarAccess.getFilterOperationAccess().getColumnAssignment_2(), "rule__FilterOperation__ColumnAssignment_2");
			builder.put(grammarAccess.getFilterOperationAccess().getTableAssignment_4(), "rule__FilterOperation__TableAssignment_4");
			builder.put(grammarAccess.getFilterOperationAccess().getConditionAssignment_6(), "rule__FilterOperation__ConditionAssignment_6");
			builder.put(grammarAccess.getFilterOperationAccess().getValueAssignment_8(), "rule__FilterOperation__ValueAssignment_8");
			builder.put(grammarAccess.getFilterOperationAccess().getTargetAssignment_9_1(), "rule__FilterOperation__TargetAssignment_9_1");
			builder.put(grammarAccess.getSaveOperationAccess().getTablesAssignment_3(), "rule__SaveOperation__TablesAssignment_3");
			builder.put(grammarAccess.getSaveOperationAccess().getTablesAssignment_4_1(), "rule__SaveOperation__TablesAssignment_4_1");
			builder.put(grammarAccess.getSaveOperationAccess().getFileAssignment_7(), "rule__SaveOperation__FileAssignment_7");
			builder.put(grammarAccess.getSaveOperationAccess().getFormatAssignment_9(), "rule__SaveOperation__FormatAssignment_9");
			builder.put(grammarAccess.getPrintTableAccess().getTableAssignment_1(), "rule__PrintTable__TableAssignment_1");
			builder.put(grammarAccess.getRenameOperationAccess().getOriginalAssignment_2(), "rule__RenameOperation__OriginalAssignment_2");
			builder.put(grammarAccess.getRenameOperationAccess().getRenamedAssignment_4(), "rule__RenameOperation__RenamedAssignment_4");
			builder.put(grammarAccess.getRenameOperationAccess().getTableAssignment_6(), "rule__RenameOperation__TableAssignment_6");
			builder.put(grammarAccess.getLimitOperationAccess().getTableAssignment_2(), "rule__LimitOperation__TableAssignment_2");
			builder.put(grammarAccess.getLimitOperationAccess().getStartAssignment_4(), "rule__LimitOperation__StartAssignment_4");
			builder.put(grammarAccess.getLimitOperationAccess().getEndAssignment_6(), "rule__LimitOperation__EndAssignment_6");
			builder.put(grammarAccess.getArgMaxOperationAccess().getColumnAssignment_2(), "rule__ArgMaxOperation__ColumnAssignment_2");
			builder.put(grammarAccess.getArgMaxOperationAccess().getTableAssignment_4(), "rule__ArgMaxOperation__TableAssignment_4");
			builder.put(grammarAccess.getArgMaxOperationAccess().getTargetAssignment_6(), "rule__ArgMaxOperation__TargetAssignment_6");
			builder.put(grammarAccess.getArgMinOperationAccess().getColumnAssignment_2(), "rule__ArgMinOperation__ColumnAssignment_2");
			builder.put(grammarAccess.getArgMinOperationAccess().getTableAssignment_4(), "rule__ArgMinOperation__TableAssignment_4");
			builder.put(grammarAccess.getArgMinOperationAccess().getTargetAssignment_6(), "rule__ArgMinOperation__TargetAssignment_6");
			builder.put(grammarAccess.getDropOperationAccess().getTableAssignment_1(), "rule__DropOperation__TableAssignment_1");
			builder.put(grammarAccess.getProcessFoldersOperationAccess().getFoldersAssignment_2(), "rule__ProcessFoldersOperation__FoldersAssignment_2");
			builder.put(grammarAccess.getProcessFoldersOperationAccess().getFoldersAssignment_3_1(), "rule__ProcessFoldersOperation__FoldersAssignment_3_1");
			builder.put(grammarAccess.getProcessFoldersOperationAccess().getFolderOperationsAssignment_7(), "rule__ProcessFoldersOperation__FolderOperationsAssignment_7");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private MyDslGrammarAccess grammarAccess;

	@Override
	protected InternalMyDslParser createParser() {
		InternalMyDslParser result = new InternalMyDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
