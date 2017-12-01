package test;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import org.codehaus.jackson.map.ObjectMapper;

import com.ai.paas.ipaas.search.vo.SearchOption;
import com.ai.paas.ipaas.search.vo.Sort;
import com.ai.paas.ipaas.search.vo.Sort.SortOrder;

public class Test {

	public static void main(String[] args) throws Exception {
		String json = "{\"sorts\":[{\"order\":\"1\",\"sortBy\":\"exttaskid\"}]}";
		String json1 = "{\"order\":\"1\",\"sortBy\":\"exttaskid\"}";
		String json2 = "{\"searchCriterias\":[{\"field\":\"actprokey\",\"fieldValue\":[\"leave\"],\"option\":{\"boost\":1.0,\"dataFilter\":\"1\",\"highlight\":false,\"queryStringPrecision\":\"90%\",\"searchLogic\":\"1\",\"searchType\":\"1\",\"termOperator\":\"1\"},\"subCriterias\":[]},{\"field\":\"busititle\",\"fieldValue\":[\"fuck you bitch\"],\"option\":{\"boost\":1.0,\"dataFilter\":\"1\",\"highlight\":false,\"queryStringPrecision\":\"90%\",\"searchLogic\":\"1\",\"searchType\":\"1\",\"termOperator\":\"1\"},\"subCriterias\":[]}]}";
		ObjectMapper mapper = new ObjectMapper();
		// JSON from String to Object
		Sort sort = mapper.readValue(json1, Sort.class);
		System.out.println(sort.getOrder());
		TestVO obj = mapper.readValue(json, TestVO.class);
		System.out.println(obj.getSorts().get(0).getSortBy());
		TestVo1 vo1 = mapper.readValue(json2, TestVo1.class);
		System.out.println(vo1.getSearchCriterias().get(0).getOption().getQueryStringPrecision());
		List<Sort> sorts = new ArrayList<>();
		Sort sort1 = new Sort("test", SortOrder.DESC);
		sorts.add(sort1);
		TestVO testVO = new TestVO();
		testVO.setSorts(sorts);
		System.out.println(mapper.writeValueAsString(testVO));

		String test = "dsfsdfsdfds^sdfsdf^dsfsdf";
		System.out.println(test.replaceAll("\\^", ""));
		com.ai.paas.ipaas.search.common.TypeGetter<List<String>> t = new com.ai.paas.ipaas.search.common.TypeGetter<List<String>>() {
		};
		System.out.println(t.getType());

		String dd = "b9a37901\\-8dfd\\-11e7\\-bc9e\\-54e1ad007ebc";
		System.out.println(dd.replaceAll("\\\\-", "-"));
		SearchOption option = new SearchOption(SearchOption.SearchLogic.must, SearchOption.SearchType.match);
		System.out.println(option);
		// 测试下正则匹配
		String pt = "^\\S*?(id)$";
		System.out.println(Pattern.matches(pt, "t.id"));
		String pt1="^\\S*?[(name)|(content)|(desc)]\\S*?$";
		System.out.println(Pattern.matches(pt1, "t.name"));
		System.out.println(Pattern.matches(pt1, "t.desc"));
		System.out.println(Pattern.matches(pt1, "content"));
		
		
	}

}
