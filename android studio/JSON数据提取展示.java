package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONArray;

public class jsonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_json);
    }

    public void get(View view) throws JSONException {
        String jsonStr="{\"code\": 0, \"msg\": \"success\", \"data\": [{\"p_id\": 5703, \"dm_title\": \"python\\u4eff\\u771f\\u5b9e\\u9a8c\\u5ba4\", \"dm_type\": [\"\\u5de5\\u5177\\u5e94\\u7528\"], \"dm_budget\": \"5000\\u4ee5\\u4e0b\", \"dm_cycle\": \"1\\u6708\", \"dm_department\": \"VR\\u5de5\\u5b66\\u7ed3\\u5408\\u90e8\", \"u_id\": \"1\", \"u_phone\": \"15010115689\", \"dm_status\": \"\\u672a\\u516c\\u5e03\\u9879\\u76ee\", \"publish_date\": \"2020-07-31 14:58:38\", \"delivery_date\": \"\", \"dm_description\": \"python\\u4eff\\u771f\\u5b9e\\u9a8c\\u5ba4 \\u524d\\u540e\\u7aef\\u5f00\\u53d1 \", \"icon\": \"https://zb.oschina.net/file/get?path=static/project-reward/cover/zhuomianyingyong_1.png\"}, {\"p_id\": 5674, \"dm_title\": \"\\u65e0\\u63a5\\u53e3\\u6587\\u6863\\u5bf9\\u63a5\\u7f51\\u7ad9\\u811a\\u672c\", \"dm_type\": [\"\\u5de5\\u5177\\u5e94\\u7528\"], \"dm_budget\": \"0-5000\", \"dm_cycle\": \"7\", \"dm_department\": \"\\u53cb\\u5546\", \"u_id\": \"86231683\", \"u_phone\": \"14422094\", \"dm_status\": \"\\u672a\\u516c\\u5e03\\u9879\\u76ee\", \"publish_date\": \"2020-07-21 13:45:15\", \"delivery_date\": \"\", \"dm_description\": \"<p>\\u9700\\u8981\\u5f00\\u53d1\\u65e0\\u63a5\\u53e3\\u6587\\u6863\\u5bf9\\u63a5\\u7f51\\u7ad9\\u811a\\u672c</p>\\n\\u6280\\u80fd\\u8981\\u6c42\\uff1aJava C#\", \"icon\": \"https://zb.oschina.net/file/get?path=static/project-reward/cover/qiyeyingyong_1.png\"}, {\"p_id\": 5675, \"dm_title\": \"\\u5f71\\u50cf\\u4f20\\u611f\\u5668\\u56fe\\u50cf\\u5904\\u7406\\u91c7\\u96c6\\u677f\\u5f00\\u53d1\", \"dm_type\": [\"\\u5de5\\u5177\\u5e94\\u7528\"], \"dm_budget\": \"0-5000\", \"dm_cycle\": \"15\", \"dm_department\": \"\\u53cb\\u5546\", \"u_id\": \"44842791\", \"u_phone\": \"12422078\", \"dm_status\": \"\\u672a\\u516c\\u5e03\\u9879\\u76ee\", \"publish_date\": \"2020-07-21 12:13:25\", \"delivery_date\": \"\", \"dm_description\": \"<p>\\u5229\\u7528GM370-M106-A4R1\\u5f71\\u50cf\\u4f20\\u611f\\u5668\\u6d4b\\u91cf\\u6db2\\u4f53\\u6ce1\\u6cab\\u9ad8\\u5ea6\\u3002\\u5c06\\u4f20\\u611f\\u5668\\u7684\\u5149\\u5b66\\u5f71\\u50cf\\u6a21\\u62df\\u4fe1\\u53f7\\u5bf9\\u5e94\\u6db2\\u4f53\\u7684\\u53d1\\u6ce1\\u9ad8\\u5ea6\\uff0c\\u4ece\\u800c\\u83b7\\u53d6\\u6db2\\u4f53\\u6ce1\\u6cab\\u7684\\u9ad8\\u5ea6\\u548c\\u505c\\u7559\\u65f6\\u95f4\\u3002\\u8bbe\\u8ba1\\u5236\\u4f5c\\u4e00\\u5757\\u6570\\u636e\\u5904\\u7406\\u91c7\\u96c6\\u7535\\u8def\\u677f\\u3002\\u7f51\\u53e3\\u8f93\\u51fa\\u3002</p>\\n\\u6280\\u80fd\\u8981\\u6c42\\uff1aC#\", \"icon\": \"https://zb.oschina.net/file/get?path=static/project-reward/cover/zhuomianyingyong_1.png\"}, {\"p_id\": 5680, \"dm_title\": \"\\u5feb\\u9012\\u5c0f\\u7a0b\\u5e8f\\u5f00\\u53d1\", \"dm_type\": [\"\\u79fb\\u52a8\\u5e94\\u7528\"], \"dm_budget\": \"0-0\", \"dm_cycle\": \"1\", \"dm_department\": \"\\u53cb\\u5546\", \"u_id\": \"36596878\", \"u_phone\": \"12422064\", \"dm_status\": \"\\u672a\\u516c\\u5e03\\u9879\\u76ee\", \"publish_date\": \"2020-07-21 12:04:41\", \"delivery_date\": \"\", \"dm_description\": \"<p>\\u5feb\\u9012\\u5c0f\\u7a0b\\u5e8f\\u5f00\\u53d1\\uff0c\\u660e\\u786e\\u597d\\u4e86\\u9700\\u6c42\\uff0c\\u6709\\u63a5\\u5355\\u8054\\u7cfb\\u6211\\u770b\\u9700\\u6c42 \\u524d\\u671f\\u5f00\\u53d1\\u5feb\\u9012\\u7248\\u5757\\u548c\\u63a5\\u5355\\u7248\\u5757</p>\\n\\u6280\\u80fd\\u8981\\u6c42\\uff1a\", \"icon\": \"https://zb.oschina.net/file/get?path=static/project-reward/cover/H5yingyong_3.png\"}, {\"p_id\": 5681, \"dm_title\": \"\\u5546\\u57ce\\u5c0f\\u7a0b\\u5e8f\\u5f00\\u53d1\", \"dm_type\": [\"\\u5fae\\u4fe1\\u5e94\\u7528\"], \"dm_budget\": \"10000-50000\", \"dm_cycle\": \"60\", \"dm_department\": \"\\u53cb\\u5546\", \"u_id\": \"94939082\", \"u_phone\": \"13422232\", \"dm_status\": \"\\u672a\\u516c\\u5e03\\u9879\\u76ee\", \"publish_date\": \"2020-07-21 10:56:50\", \"delivery_date\": \"\", \"dm_description\": \"<p><span style=\\\"color: rgb(102, 102, 102);\\\">\\u9700\\u6c42:\\u5546\\u57ce\\u5c0f\\u7a0b\\u5e8f\\uff0c\\u5546\\u54c1\\u914d\\u9001\\u884c\\u4e1a\\uff0c\\u4ea7\\u54c1\\u5c55\\u793a\\uff0c\\u5728\\u7ebf\\u652f\\u4ed8\\u914d\\u9001\\uff0c\\u8d22\\u52a1\\uff0c\\u4ea7\\u54c1\\u51fa\\u5165\\u5e93\\uff0c\\u516c\\u53f8\\u9700\\u6c42\\uff0c\\u5177\\u4f53\\u8be6\\u8c08</span></p>\\n\\u6280\\u80fd\\u8981\\u6c42\\uff1a\", \"icon\": \"https://zb.oschina.net/file/get?path=static/project-reward/cover/qukuailian_1.png\"}, {\"p_id\": 5682, \"dm_title\": \"\\u79fb\\u52a8\\u5e94\\u7528\", \"dm_type\": [\"\\u79fb\\u52a8\\u5e94\\u7528\"], \"dm_budget\": \"0-0\", \"dm_cycle\": \"1\", \"dm_department\": \"\\u53cb\\u5546\", \"u_id\": \"66609843\", \"u_phone\": \"16422253\", \"dm_status\": \"\\u672a\\u516c\\u5e03\\u9879\\u76ee\", \"publish_date\": \"2020-07-20 10:01:17\", \"delivery_date\": \"\", \"dm_description\": \"\\u57fa\\u4e8ethinkphp 6.0 \\u5f00\\u53d1\\u5fae\\u4fe1html\\u7f51\\u7ad9\\n\\n\\u53c2\\u8003\\u6765\\u5ba2\\u7535\\u5546saas\\u529f\\u80fd\\uff0c\\u76f4\\u64ad\\u529f\\u80fd\\u3002\\n\\u6280\\u80fd\\u8981\\u6c42\\uff1a\", \"icon\": \"https://zb.oschina.net/file/get?path=static/project-reward/cover/WEByingyong_1.png\"}, {\"p_id\": 5676, \"dm_title\": \"\\u4ee3\\u7801\\u51b2\\u7a81\\u5728\\u7ebf\\u89e3\\u51b3\\u7684\\u53ef\\u89c6\\u5316\\u5de5\\u5177\\u9875\\u9762\\u524d\\u7aef\\u9879\\u76ee\", \"dm_type\": [\"WEB\\u5e94\\u7528\"], \"dm_budget\": \"10000-50000\", \"dm_cycle\": \"30\", \"dm_department\": \"\\u53cb\\u5546\", \"u_id\": \"10288363\", \"u_phone\": \"11511359\", \"dm_status\": \"\\u672a\\u516c\\u5e03\\u9879\\u76ee\", \"publish_date\": \"2020-07-17 14:51:49\", \"delivery_date\": \"\", \"dm_description\": \"<p><span style=\\\"color: rgb(0, 0, 0);\\\">1\\u3001\\u9879\\u76ee\\u76ee\\u6807\\uff1a</span></p><p><span style=\\\"color: rgb(0, 0, 0);\\\">       \\u5b9e\\u73b0\\u57fa\\u4e8eGit\\u4ee3\\u7801\\u5e93\\u5206\\u652f\\u5408\\u5e76\\u8fc7\\u7a0b\\u4e2d\\uff0c\\u4ee3\\u7801\\u51b2\\u7a81\\u5728\\u7ebf\\u89e3\\u51b3\\u7684\\u53ef\\u89c6\\u5316\\u5de5\\u5177\\u3002</span></p><p><span style=\\\"color: rgb(0, 0, 0);\\\">2\\u3001\\u9700\\u6c42\\u8bf4\\u660e\\uff1a</span></p><p><span style=\\\"color: rgb(0, 0, 0);\\\">       </span>\\u5728&nbsp;Pull Request&nbsp;\\u5904\\u7406\\u9875\\u9762\\uff0c\\u4f18\\u5316\\u6539\\u8fdb\\u9875\\u9762\\u5448\\u73b0\\u7ed3\\u6784\\uff0c\\u901a\\u8fc7\\u5c06\\u5b58\\u5728\\u51b2\\u7a81\\u7684\\u6587\\u4ef6\\uff0c\\u6309\\u7167\\u4ee3\\u7801\\u5e93\\u7684\\u5c42\\u7ea7\\u7ed3\\u6784\\u505aTree&nbsp;\\u578b\\u6570\\u636e\\u5c55\\u793a\\u5448\\u73b0\\u3002</p><p>3\\u3001\\u627f\\u63a5\\u8981\\u6c42\\uff1a</p><p>     \\uff081\\uff09\\u6709\\u8d44\\u6df1\\u524d\\u7aef\\u9875\\u9762\\u5f00\\u53d1\\u7ecf\\u9a8c</p><p>     \\uff082\\uff09\\u64c5\\u957fVUE\\u53ca\\u539f\\u751fjs</p><p>     \\uff083\\uff09\\u80fd\\u6709\\u5b9e\\u73b0\\u8f83\\u4e3a\\u590d\\u6742\\u7684\\u903b\\u8f91\\u7b97\\u6cd5</p><p><br></p><p>       \\u8d39\\u7528\\u9884\\u7b97\\uff1a2\\u4e07\\u5de6\\u53f3</p><p>     </p><p>       \\u7279\\u522b\\u8bf4\\u660e\\uff1a</p><p>       A\\u3001\\u9879\\u76ee\\u4ea4\\u4ed8\\u5468\\u671f\\uff0c\\u517c\\u804c\\u4e00\\u4e2a\\u6708\\u5185\\uff08\\u80fd\\u63d0\\u524d\\u6700\\u597d\\uff09</p><p>       B\\u3001\\u5ba2\\u6237\\u53ef\\u63d0\\u4f9b\\u539f\\u578b</p><p><br></p><p>       \\u7ade\\u6807\\u8bf7\\u8bf4\\u660e\\u5bf9\\u9700\\u6c42\\u7684\\u7406\\u89e3\\u548c\\u6280\\u672f\\u3001\\u65f6\\u95f4\\u4f18\\u52bf\\u3002\\u65e0\\u6548\\u5546\\u52a1\\u7ade\\u6807\\u65e0\\u9700\\u62a5\\u540d\\u54c8\\uff0c\\u611f\\u8c22\\u3002</p><p><br></p><p>       \\u9700\\u6c42\\u63cf\\u8ff0\\u89c1\\u9644\\u4ef6</p><p><br></p>\\n\\u6280\\u80fd\\u8981\\u6c42\\uff1a\", \"icon\": \"https://zb.oschina.net/file/get?path=static/project-reward/cover/H5yingyong_3.png\"}, {\"p_id\": 5679, \"dm_title\": \"\\u901a\\u8fc7\\u56fe\\u7247\\u5199H5\\u9875\\u9762\\u9875\\u9762\\u9700\\u8981\\u9002\\u5e94\\u624b\\u673a\\u7aef\", \"dm_type\": [\"H5\\u5e94\\u7528\"], \"dm_budget\": \"0-5000\", \"dm_cycle\": \"7\", \"dm_department\": \"\\u53cb\\u5546\", \"u_id\": \"46290151\", \"u_phone\": \"19511947\", \"dm_status\": \"\\u672a\\u516c\\u5e03\\u9879\\u76ee\", \"publish_date\": \"2020-07-16 11:42:22\", \"delivery_date\": \"\", \"dm_description\": \"<p>\\u8fd9\\u8fb9\\u6709\\u4e2a\\u7535\\u8111\\u7aef\\u5c55\\u793a\\u7684\\u4e2d\\u63a7\\u7cfb\\u7edf\\uff0c\\u73b0\\u5728\\u9700\\u8981\\u653e\\u5230\\u624b\\u673a\\u7aef\\u5c55\\u793a\\u3002</p><p>\\u4e3b\\u8981\\u5de5\\u4f5c\\u6709\\uff1a</p><p>1\\u3001\\u4e2d\\u63a7\\u673a\\u5668(\\u6bd4\\u5982\\uff1a\\u63d0\\u5347\\u6cf5\\u3001\\u6ee4\\u6c60\\u3001\\u7ba1\\u9053\\u7b49)\\u9700\\u8981\\u81ea\\u5df1\\u641c\\u7d22\\u67e5\\u627e\\u56fe\\u7247\\u3002</p><p>2\\u3001\\u9700\\u8981\\u4e00\\u4e2a\\u52a8\\u6001\\u7684\\u6548\\u679c\\uff0cgif \\u56fe\\u7247\\u7684\\u6548\\u679c\\u3002\\u6bd4\\u5982\\u6c34\\u7684\\u6d41\\u52a8\\u7b49\\u3002</p><p>3\\u3001\\u9700\\u8981\\u5199\\u6210\\u624b\\u673a\\u7aef\\u5c55\\u793a\\u7684\\u9875\\u9762\\u3002\\u53ea\\u5199H5+CSS,\\u4e0d\\u9700\\u8981\\u5199JS\\u3002</p><p>4\\u3001\\u4e3b\\u9875\\u97621\\u4e2a\\u3001\\u5c55\\u793a\\u98754\\u4e2a\\uff0c\\u8be6\\u60c5\\u98752\\u4e2a\\u3002\\u5269\\u4e0b\\u7684\\u5c31\\u662f\\u4e00\\u4e9b\\u56fe\\u7247\\u4fee\\u6539\\u3002</p><p><br></p><p>\\u53ef\\u4ee5\\u76f4\\u63a5\\u52a0\\u5fae\\u4fe1\\u3002\\u6700\\u597d\\u4e0d\\u8981\\u6253\\u7535\\u8bdd\\u3002\\u4e2a\\u4eba\\u6700\\u597d\\uff0c\\u516c\\u53f8\\u4e5f\\u53ef\\u4ee5\\u3002</p>\\n\\u6280\\u80fd\\u8981\\u6c42\\uff1aCSS HTML5 \\u5176\\u4ed6\\u8bed\\u8a00\", \"icon\": \"https://zb.oschina.net/file/get?path=static/project-reward/cover/dashuju_1.png\"}, {\"p_id\": 5683, \"dm_title\": \"\\u4e00\\u7269\\u4e00\\u7801\\u5c0f\\u7a0b\\u5e8f\\u7ea2\\u5305\", \"dm_type\": [\"\\u5fae\\u4fe1\\u5e94\\u7528\"], \"dm_budget\": \"0-0\", \"dm_cycle\": \"1\", \"dm_department\": \"\\u53cb\\u5546\", \"u_id\": \"46567508\", \"u_phone\": \"14511775\", \"dm_status\": \"\\u672a\\u516c\\u5e03\\u9879\\u76ee\", \"publish_date\": \"2020-07-16 09:39:17\", \"delivery_date\": \"\", \"dm_description\": \"<p>1\\u3001\\u901a\\u8fc7\\u5fae\\u4fe1\\u626b\\u4e00\\u626b\\uff0c\\u7528\\u6237\\u53ef\\u4ee5\\u770b\\u5230\\u5546\\u54c1\\u4fe1\\u606f</p><p>2\\u3001\\u7528\\u6237\\u626b\\u7801\\u540e\\u53ef\\u4ee5\\u9886\\u53d6\\u7ea2\\u5305</p><p>3\\u3001\\u9632\\u4f2a\\u6eaf\\u6e90\\uff0c\\u7528\\u6237\\u626b\\u7801\\u540e\\u53ef\\u4ee5\\u4e86\\u89e3\\u8be5\\u7801\\u88ab\\u626b\\u6b21\\u6570\\u3001\\u65f6\\u95f4\\uff0c\\u8f85\\u52a9\\u9274\\u522b\\u5546\\u54c1\\u771f\\u4f2a\\uff0c\\u4e86\\u89e3\\u5546\\u54c1\\u4fe1\\u606f\\u3002</p><p>4\\u3001\\u7528\\u6237\\u5728\\u5c0f\\u7a0b\\u5e8f\\u9886\\u53d6\\u7ea2\\u5305\\u540e\\uff0c\\u4f1a\\u8fdb\\u5165\\u7528\\u6237\\u5fae\\u4fe1\\u4f59\\u989d\\u3002</p><p>\\u540e\\u53f0\\u7ba1\\u7406\\uff1a</p><p>1\\u3001\\u54c1\\u724c\\u5546\\u53ef\\u4ee5\\u4fee\\u6539\\u5546\\u54c1\\u4fe1\\u606f\\u3001\\u4ef7\\u683c\\uff0c\\u6d88\\u8d39\\u8005\\u626b\\u7801\\u5373\\u53ef\\u83b7\\u53d6\\u76f8\\u5173\\u4fe1\\u606f\\u3002</p><p>2\\u3001\\u76f8\\u5173\\u6570\\u636e\\u6536\\u96c6\\u3001\\u7edf\\u8ba1\\u3002</p><p>3\\u3001\\u9632\\u4f2a\\u7801\\u7ba1\\u7406</p><p>4\\u3001\\u751f\\u6210\\u9632\\u4f2a\\u7801\\uff0c\\u6bcf\\u6b211w\\u4e2a\\u4ee5\\u4e0a\\uff0c\\u751f\\u6210\\u4e8c\\u7ef4\\u7801\\u6570\\u636e\\u5305\\uff0c\\u4e0b\\u8f7d\\u89e3\\u538b\\u540e\\u53ef\\u4ee5\\u663e\\u793a\\u51fa\\u4e8c\\u7ef4\\u7801\\u5e76\\u5370\\u5237\\u3002</p>\\n\\u6280\\u80fd\\u8981\\u6c42\\uff1aJava\", \"icon\": \"https://zb.oschina.net/file/get?path=static/project-reward/cover/weixinyingyong_3.png\"}, {\"p_id\": 5684, \"dm_title\": \"\\u6d77\\u5eb7\\u5927\\u534e\\u89c6\\u9891\\u96c6\\u6210\\u7edf\\u4e00\\u9884\\u89c8\\u67e5\\u770b\\u4e91\\u53f0\\u63a7\\u5236\", \"dm_type\": [\"\\u4f01\\u4e1a\\u5e94\\u7528\"], \"dm_budget\": \"100000-500000\", \"dm_cycle\": \"45\", \"dm_department\": \"\\u53cb\\u5546\", \"u_id\": \"86417537\", \"u_phone\": \"12513048\", \"dm_status\": \"\\u672a\\u516c\\u5e03\\u9879\\u76ee\", \"publish_date\": \"2020-07-04 21:47:03\", \"delivery_date\": \"\", \"dm_description\": \"<p>\\u5c06\\u4e0d\\u901a\\u65f6\\u671f\\u5efa\\u8bbe\\u7684\\u6d77\\u5eb7\\u3001\\u5927\\u534e\\u89c6\\u9891\\u96c6\\u6210\\u7edf\\u4e00\\u9884\\u89c8\\u67e5\\u770b\\u4e91\\u53f0\\u63a7\\u5236\\uff0c\\u652f\\u6301pc web\\u7aef \\uff0capp\\u67e5\\u770b\\uff1b</p>\\n\\u6280\\u80fd\\u8981\\u6c42\\uff1aJava HTML5 CSS C# C++\", \"icon\": \"https://zb.oschina.net/file/get?path=static/project-reward/cover/qukuailian_1.png\"}, {\"p_id\": 5685, \"dm_title\": \"\\u4f01\\u4e1a\\u5e94\\u7528\", \"dm_type\": [\"\\u4f01\\u4e1a\\u5e94\\u7528\"], \"dm_budget\": \"0-0\", \"dm_cycle\": \"365\", \"dm_department\": \"\\u53cb\\u5546\", \"u_id\": \"36417092\", \"u_phone\": \"12513006\", \"dm_status\": \"\\u672a\\u516c\\u5e03\\u9879\\u76ee\", \"publish_date\": \"2020-07-04 21:46:58\", \"delivery_date\": \"\", \"dm_description\": \"\\u9700\\u8981\\u505a\\u7f51\\u7ad9\\uff0c\\u7ebf\\u4e0a\\u63a8\\u5e7f\\u7684\\uff0c\\u540e\\u671f\\u9700\\u8981\\u5237\\u767e\\u5ea6\\u6392\\u540d\\u7684\\uff0c\\n\\u6280\\u80fd\\u8981\\u6c42\\uff1a\", \"icon\": \"https://zb.oschina.net/file/get?path=static/project-reward/cover/dashuju_1.png\"}, {\"p_id\": 5686, \"dm_title\": \"H5\\u5e94\\u7528\", \"dm_type\": [\"H5\\u5e94\\u7528\"], \"dm_budget\": \"0-0\", \"dm_cycle\": \"2\", \"dm_department\": \"\\u53cb\\u5546\", \"u_id\": \"84967342\", \"u_phone\": \"13513232\", \"dm_status\": \"\\u672a\\u516c\\u5e03\\u9879\\u76ee\", \"publish_date\": \"2020-07-04 11:31:35\", \"delivery_date\": \"\", \"dm_description\": \"\\u4e86\\u89e3an\\u857e\\u7684\\u6765 \\u5728\\u6e90\\u7801\\u7684\\u57fa\\u7840\\u4e0a\\u6dfb\\u52a0\\u529f\\u80fd  \\u81ea\\u52a8\\u586b\\u5199\\u9a8c\\u8bc1\\u7801+\\u8ba2\\u5355\\u91cd\\u590d\\n\\u6280\\u80fd\\u8981\\u6c42\\uff1a\", \"icon\": \"https://zb.oschina.net/file/get?path=static/project-reward/cover/qiyeyingyong_1.png\"}, {\"p_id\": 5687, \"dm_title\": \"\\u864e\\u7259\\u4eba\\u6c14\\u534f\\u8bae\\u5f00\\u53d1\", \"dm_type\": [\"\\u5de5\\u5177\\u5e94\\u7528\"], \"dm_budget\": \"0-0\", \"dm_cycle\": \"7\", \"dm_department\": \"\\u53cb\\u5546\", \"u_id\": \"10599784\", \"u_phone\": \"16513289\", \"dm_status\": \"\\u672a\\u516c\\u5e03\\u9879\\u76ee\", \"publish_date\": \"2020-07-04 11:31:21\", \"delivery_date\": \"\", \"dm_description\": \"<p>\\u864e\\u7259\\u4eba\\u6c14\\u534f\\u8bae&nbsp;\\u6279\\u91cf\\u767b\\u9646\\u8d26\\u53f7\\uff08cookie\\u767b\\u9646 \\u6700\\u5c115w\\u4e2a\\u8d26\\u53f7\\u767b\\u9646\\uff09\\u6302\\u5165\\u6307\\u5b9aid\\u623f\\u95f4</p><p>&nbsp;</p><p>\\u6bd4\\u5982\\u4e0a\\u4e861000\\u4e2a\\u53f7 \\u53ef\\u4ee5\\u5206\\u6279\\u8fdb\\u5165\\u4e0d\\u540c\\u7684\\u623f\\u95f4 \\u6bd4\\u5982100\\u4e2a\\u53f7\\u8fdb\\u5165id1001\\u623f\\u95f4 900\\u4eba\\u8fdb\\u5165id1002\\u623f\\u95f4</p>\\n\\u6280\\u80fd\\u8981\\u6c42\\uff1a\", \"icon\": \"https://zb.oschina.net/file/get?path=static/project-reward/cover/weixinyingyong_3.png\"}, {\"p_id\": 5688, \"dm_title\": \"tb\\u8f6f\\u4ef6\", \"dm_type\": [\"\\u79fb\\u52a8\\u5e94\\u7528\"], \"dm_budget\": \"5000-10000\", \"dm_cycle\": \"15\", \"dm_department\": \"\\u53cb\\u5546\", \"u_id\": \"66517488\", \"u_phone\": \"15513294\", \"dm_status\": \"\\u672a\\u516c\\u5e03\\u9879\\u76ee\", \"publish_date\": \"2020-07-03 17:08:43\", \"delivery_date\": \"\", \"dm_description\": \"<p>\\u4e00\\u3001\\u9879\\u76ee\\u7b80\\u4ecb</p><p>\\u5f00\\u53d1\\u4e00\\u4e2a\\u534f\\u8bae\\u62a2\\u8d2d\\u8f6f\\u4ef6\\uff0c\\u591a\\u7ebf\\u7a0b\\uff0c\\u591a\\u8d26\\u6237\\uff0c\\u5e76\\u53d1\\u62a2\\u8d2d\\u6307\\u5b9a\\u7f51\\u7ad9\\u5546\\u54c1\\u5f00\\u53d1\\u8bed\\u8a00\\uff1a\\u968f\\u610f</p><p>\\u5b9a\\u65f6\\u4e0b\\u5355 \\u7acb\\u5373\\u4e0b\\u5355 \\u5e76\\u53d1\\u4e0b\\u5355 \\u8d2d\\u7269\\u8f66 \\u8ba2\\u5355\\u67e5\\u8be2\\u4f18\\u60e0\\u5238\\u9886\\u7528\\u7b49\\u529f\\u80fd</p><p>\\u6709\\u540c\\u884c\\u8f6f\\u4ef6\\u7ed9\\u4e0e\\u53c2\\u8003</p><p>\\u4e8c\\u3001\\u9700\\u6c42\\u63cf\\u8ff0</p><p>1\\u3001\\u7b2c\\u4e00\\u9636\\u6bb5\\uff0c\\u5b9e\\u73b0\\u6574\\u4e2a\\u6846\\u67b6\\u53ca\\u5404\\u529f\\u80fd\\u6a21\\u5757\\u642d\\u5efa\\u5b8c\\u6210\\u300210\\u5929\\u5b8c\\u6210\\u3002</p><p>2\\u3001\\u7b2c\\u4e8c\\u9636\\u6bb5\\uff0c\\u4e00\\u9636\\u6bb5\\u57fa\\u7840\\u4e0a\\u8fdb\\u884c\\u6d4b\\u8bd5\\u901f\\u5ea6\\u4f18\\u5316\\u7b49\\u3002\\u534f\\u52a9\\u4fee\\u6539bug\\u30025\\u5929\\u5b8c\\u6210\\u3002</p><p>\\u4e09\\u3001\\u63a5\\u5305\\u8981\\u6c42</p><p>\\u719f\\u6089\\u7f51\\u7edc\\u722c\\u866b\\u3001\\u6a21\\u62dfhttp\\u53d1\\u9001\\u8bf7\\u6c42\\u3001java\\u3001\\u57fa\\u4e8eHttpClient\\u3001Multiple Thread\\u3001File I/O\\u7b49\\u4e3b\\u8981\\u6280\\u672f\\uff0c\\u57fa\\u4e8e\\u591a\\u7ebf\\u7a0b\\u591a\\u8d26\\u53f7\\u767b\\u5f55\\u4e0b\\u5355\\u3002\\u53ef\\u72ec\\u7acb\\u5b8c\\u6210\\u4efb\\u52a1\\uff0c\\u6709\\u8fc7\\u7c7b\\u4f3c\\u9879\\u76ee\\u7ecf\\u9a8c\\uff0c\\u5bf9\\u7a81\\u7834\\u98ce\\u63a7\\u6709\\u7ecf\\u9a8c\\u8005\\u4f18\\u5148\\u3002</p><p>\\u9700\\u8981\\u5b9e\\u65f6\\u6c9f\\u901a\\u6700\\u597d\\u5f00\\u53d1\\u8fc7\\u7a0b\\u4e2d\\u8fb9\\u5f00\\u53d1\\u8fb9\\u6c9f\\u901a\\uff0c\\u514d\\u5f97\\u505a\\u5b8c\\u4fee\\u6539\\u91cf\\u5927\\u3002\\u6c9f\\u901a\\u548c\\u8c10\\u4e5f\\u5408\\u9002\\u4eca\\u540e\\u7684\\u552e\\u540e\\uff0c\\u9996\\u6b21\\u5f00\\u53d1\\u5b8c\\u5305\\u66f4\\u65b01\\u4e2a\\u6708\\u3002\\u540e\\u7eed\\u6309\\u96be\\u5ea6\\u53ca\\u5de5\\u4f5c\\u91cf\\u4ed8\\u8d39\\u552e\\u540e\\u3002</p><p>\\u56db\\u3001\\u4ea4\\u4ed8\\u8981\\u6c42</p><p>\\u9879\\u76ee\\u5468\\u671f\\uff1a 15\\u5929 2\\u3001\\u4ea4\\u4ed8\\u5185\\u5bb9\\uff1a \\u4ea4\\u4ed8\\u5b8c\\u6574\\u6e90\\u7801\\uff0c\\u6709\\u8be6\\u7ec6\\u7684\\u4ee3\\u7801\\u6ce8\\u91ca\\u3002</p><p>\\u8f6f\\u4ef6\\u53ef\\u89c6\\u5316\\u8fd0\\u884c\\uff0c\\u53ef\\u76f4\\u63a5\\u4f7f\\u7528\\u3002</p><p>\\u4e94\\u3001\\u916c\\u91d1\\u4ea4\\u4ed8\\u65b9\\u5f0f</p><p>\\u8be6\\u7ec6\\u7684\\u300a\\u9879\\u76ee\\u5f00\\u53d1\\u9636\\u6bb5\\u5212\\u5206\\u8868\\u300b\\u5728\\u9879\\u76ee\\u542f\\u52a8\\u5f00\\u53d1\\u524d\\u534f\\u5b9a\\uff0c\\u5e73\\u53f0\\u6309\\u7167\\u8be5\\u8868\\u6839\\u636e\\u9636\\u6bb5\\u9a8c\\u6536\\u60c5\\u51b5\\u6309\\u9636\\u6bb5\\u652f\\u4ed8\\u5f00\\u53d1\\u8d39\\u3002</p>\\n\\u6280\\u80fd\\u8981\\u6c42\\uff1a\", \"icon\": \"https://zb.oschina.net/file/get?path=static/project-reward/cover/qiyeyingyong_1.png\"}, {\"p_id\": 5689, \"dm_title\": \"\\u914d\\u7f6e\\u7ba1\\u7406\\u5efa\\u8bbe\\u9879\\u76ee\\u9884\\u7b9750\\u4e07\\u4ee5\\u4e0a\", \"dm_type\": [\"\\u4f01\\u4e1a\\u5e94\\u7528\"], \"dm_budget\": \"0-0\", \"dm_cycle\": \"5\", \"dm_department\": \"\\u53cb\\u5546\", \"u_id\": \"10588365\", \"u_phone\": \"15513248\", \"dm_status\": \"\\u672a\\u516c\\u5e03\\u9879\\u76ee\", \"publish_date\": \"2020-07-03 11:56:25\", \"delivery_date\": \"\", \"dm_description\": \"<p style=\\\"color: rgb(0, 0, 0); font-family: &quot;Open Sans&quot;, &quot;Helvetica Neue&quot;, helvetica, arial, verdana, sans-serif; font-size: 13.3333px;\\\">\\u9879\\u76ee\\u80cc\\u666f\\uff1a</p><p style=\\\"color: rgb(0, 0, 0); font-family: &quot;Open Sans&quot;, &quot;Helvetica Neue&quot;, helvetica, arial, verdana, sans-serif; font-size: 13.3333px;\\\">\\u914d\\u7f6e\\u7ba1\\u7406\\u5de5\\u4f5c\\u662f\\u5e94\\u7528\\u7cfb\\u7edf\\u7814\\u53d1\\u7684\\u57fa\\u7840\\u4fdd\\u969c\\u73af\\u8282\\uff0c\\u4e5f\\u662f\\u786e\\u4fdd\\u5f00\\u53d1\\u7c7b\\u9879\\u76ee\\u5b9e\\u65bd\\u6210\\u529f\\u7684\\u91cd\\u8981\\u56e0\\u7d20\\u3002\\u914d\\u7f6e\\u7ba1\\u7406\\u5de5\\u5177\\u4f5c\\u4e3a\\u914d\\u7f6e\\u7ba1\\u7406\\u5de5\\u4f5c\\u7684\\u57fa\\u7840\\u652f\\u6491\\u8f6f\\u4ef6\\uff0c\\u76f4\\u63a5\\u5f71\\u54cd\\u8f6f\\u4ef6\\u5f00\\u53d1\\u6548\\u7387\\u3002</p><p style=\\\"color: rgb(0, 0, 0); font-family: &quot;Open Sans&quot;, &quot;Helvetica Neue&quot;, helvetica, arial, verdana, sans-serif; font-size: 13.3333px;\\\">\\u968f\\u7740\\u6211\\u53f8\\u4e1a\\u52a1\\u7684\\u4e0d\\u65ad\\u53d1\\u5c55\\uff0c\\u4e1a\\u52a1\\u9700\\u6c42\\u9010\\u5e74\\u9012\\u589e\\uff0c\\u5bf9\\u5e94\\u7528\\u7cfb\\u7edf\\u7684\\u5f00\\u53d1\\u8d28\\u91cf\\u548c\\u6548\\u7387\\u8981\\u6c42\\u4e5f\\u968f\\u4e4b\\u63d0\\u9ad8\\uff0c\\u4ee5\\u884c\\u5185\\u73b0\\u6709\\u914d\\u7f6e\\u7ba1\\u7406\\u5de5\\u5177\\uff0c\\u96be\\u4ee5\\u652f\\u6491\\u914d\\u7f6e\\u7ba1\\u7406\\u5de5\\u4f5c\\u7684\\u6709\\u6548\\u5f00\\u5c55\\u3002\\u4e3a\\u63d0\\u5347\\u5e94\\u7528\\u7cfb\\u7edf\\u5f00\\u53d1\\u8fc7\\u7a0b\\u8d28\\u6548\\uff0c\\u4fdd\\u969c\\u6e90\\u4ee3\\u7801\\u3001\\u6587\\u6863\\u7b49\\u914d\\u7f6e\\u8d44\\u4ea7\\u7684\\u6709\\u5e8f\\u53d7\\u63a7\\u3002</p><h1 style=\\\"color: rgb(0, 0, 0); font-family: &quot;Open Sans&quot;, &quot;Helvetica Neue&quot;, helvetica, arial, verdana, sans-serif; font-size: 13.3333px;\\\"><br></h1><p style=\\\"color: rgb(0, 0, 0); font-family: &quot;Open Sans&quot;, &quot;Helvetica Neue&quot;, helvetica, arial, verdana, sans-serif; font-size: 13.3333px;\\\">\\u9879\\u76ee\\u76ee\\u6807\\uff1a</p><p \", \"icon\": \"https://zb.oschina.net/file/get?path=static/project-reward/cover/zhuomianyingyong_1.png\"}, {\"p_id\": 5690, \"dm_title\": \"\\u773c\\u63a7\\u4eea\\u6c9f\\u901a\\u8f6f\\u4ef6\", \"dm_type\": [\"\\u684c\\u9762\\u5e94\\u7528\"], \"dm_budget\": \"0-0\", \"dm_cycle\": \"0\", \"dm_department\": \"\\u53cb\\u5546\", \"u_id\": \"46414586\", \"u_phone\": \"11513201\", \"dm_status\": \"\\u672a\\u516c\\u5e03\\u9879\\u76ee\", \"publish_date\": \"2020-07-03 10:54:34\", \"delivery_date\": \"\", \"dm_description\": \"<p>\\u5f00\\u53d1\\u4e00\\u6b3eWindows\\u5e73\\u53f0\\u7684\\u773c\\u63a7\\u4eea\\u6c9f\\u901a\\u63a7\\u5236\\u8f6f\\u4ef6\\uff0c\\u6709\\u9700\\u6c42\\u6a21\\u677f\\u548c\\u8f6f\\u4ef6\\u7a0b\\u5e8f\\u53c2\\u8003\\uff0c\\u6309\\u7167\\u6a21\\u677f\\u7167\\u505a\\u5c31\\u53ef\\u4ee5\\uff0c\\u4e3b\\u8981\\u9700\\u8981\\u63d0\\u4f9b\\u8f6f\\u4ef6\\u4e0e\\u7cfb\\u7edf\\u7684\\u517c\\u5bb9\\u6027\\uff0c\\u7cbe\\u51c6\\u5ea6\\uff0c\\u7075\\u654f\\u5ea6\\uff0c\\u7ec6\\u8282\\u65b9\\u9762\\u7684\\u5fae\\u8c03\\u3002</p>\\n\\u6280\\u80fd\\u8981\\u6c42\\uff1a\", \"icon\": \"https://zb.oschina.net/file/get?path=static/project-reward/cover/WEByingyong_1.png\"}, {\"p_id\": 5691, \"dm_title\": \"\\u63a5\\u53e3api\\u5f00\\u53d1\", \"dm_type\": [\"\\u4f01\\u4e1a\\u5e94\\u7528\"], \"dm_budget\": \"0-5000\", \"dm_cycle\": \"2\", \"dm_department\": \"\\u53cb\\u5546\", \"u_id\": \"106415499\", \"u_phone\": \"17513227\", \"dm_status\": \"\\u672a\\u516c\\u5e03\\u9879\\u76ee\", \"publish_date\": \"2020-07-03 10:49:39\", \"delivery_date\": \"\", \"dm_description\": \"<p><span style=\\\"color: rgba(0, 0, 0, 0.8);\\\">\\u5c06\\u5e73\\u53f0\\u7684\\u9884\\u7ea6\\u4fe1\\u606f\\u540c\\u6b65\\u5230\\u7b2c\\u4e09\\u53d1\\u7684\\u65e5\\u5386\\u7cfb\\u7edf\\u4e2d\\uff0c\\u6709\\u63d0\\u4f9bapi\\u6587\\u6863</span></p><p><span style=\\\"color: rgba(0, 0, 0, 0.8);\\\">C#</span></p>\\n\\u6280\\u80fd\\u8981\\u6c42\\uff1a\", \"icon\": \"https://zb.oschina.net/file/get?path=static/project-reward/cover/qukuailian_1.png\"}, {\"p_id\": 5692, \"dm_title\": \"java\\u5fae\\u4fe1\\u5c0f\\u7a0b\\u5e8f\\u5546\\u573a\\u7cfb\\u7edf\\u8be6\\u60c5\\u770b\\u9700\\u6c42\\u6587\\u6863\", \"dm_type\": [\"\\u5fae\\u4fe1\\u5e94\\u7528\"], \"dm_budget\": \"50000-100000\", \"dm_cycle\": \"80\", \"dm_department\": \"\\u53cb\\u5546\", \"u_id\": \"36003507\", \"u_phone\": \"15518131\", \"dm_status\": \"\\u672a\\u516c\\u5e03\\u9879\\u76ee\", \"publish_date\": \"2020-07-03 10:44:07\", \"delivery_date\": \"\", \"dm_description\": \"<p>java\\u5fae\\u4fe1\\u5c0f\\u7a0b\\u5e8f\\u5546\\u54c1\\u5206\\u9500\\u8be6\\u60c5\\u770b\\u9700\\u6c42\\u6587\\u6863</p><p>\\u8bf7\\u5c06\\u516c\\u53f8\\u4fe1\\u606f\\u53d1\\u9001\\u5230\\u90ae\\u7bb1 350224276@qq.com</p>\\n\\u6280\\u80fd\\u8981\\u6c42\\uff1aJava\", \"icon\": \"https://zb.oschina.net/file/get?path=static/project-reward/cover/weixinyingyong_3.png\"}, {\"p_id\": 5693, \"dm_title\": \"\\u90ae\\u7bb1\\u5730\\u5740\\u68c0\\u6d4b\\u7a0b\\u5e8f\", \"dm_type\": [\"\\u5de5\\u5177\\u5e94\\u7528\"], \"dm_budget\": \"0-0\", \"dm_cycle\": \"0\", \"dm_department\": \"\\u53cb\\u5546\", \"u_id\": \"86438706\", \"u_phone\": \"16518118\", \"dm_status\": \"\\u672a\\u516c\\u5e03\\u9879\\u76ee\", \"publish_date\": \"2020-07-03 09:42:34\", \"delivery_date\": \"\", \"dm_description\": \"<p>\\u90ae\\u7bb1\\u5730\\u5740\\u68c0\\u6d4b\\u7a0b\\u5e8f\\u5f00\\u53d1</p><p>\\u51c6\\u786e\\u738795%\\u4ee5\\u4e0a\\u6700\\u597d</p><p>\\u6709\\u7ecf\\u9a8c/\\u6848\\u4f8b\\u4f18\\u5148</p><p>\\u4ef7\\u683c\\u5546\\u8bae</p>\\n\\u6280\\u80fd\\u8981\\u6c42\\uff1a\", \"icon\": \"https://zb.oschina.net/file/get?path=static/project-reward/cover/dashuju_1.png\"}, {\"p_id\": 5694, \"dm_title\": \"web\\u524d\\u7aef\\u5f00\\u53d1\", \"dm_type\": [\"WEB\\u5e94\\u7528\"], \"dm_budget\": \"0-0\", \"dm_cycle\": \"30\", \"dm_department\": \"\\u53cb\\u5546\", \"u_id\": \"34962315\", \"u_phone\": \"15518198\", \"dm_status\": \"\\u672a\\u516c\\u5e03\\u9879\\u76ee\", \"publish_date\": \"2020-07-03 09:42:27\", \"delivery_date\": \"\", \"dm_description\": \"<p>\\u4e24\\u4e2aweb\\u524d\\u7aef\\uff0c\\u7ba1\\u7406\\u540e\\u53f0\\u548c\\u5546\\u6237\\u540e\\u53f0\\uff0c\\u9700\\u6c42\\u7b80\\u5355\\uff0c\\u4e00\\u70b9\\u4e0d\\u590d\\u6742\\uff0c\\u8981\\u6c42\\u9875\\u9762\\u505a\\u7684\\u89c4\\u8303\\uff0c\\u4e0d\\u8981\\u51fa\\u73b0\\u548cUI\\u8bbe\\u8ba1\\u56fe\\u7684\\u504f\\u5dee\\uff0c</p><p>\\u8be6\\u7ec6\\u7684\\u5185\\u5bb9\\u7535\\u8bdd\\u804a\\uff0c</p>\\n\\u6280\\u80fd\\u8981\\u6c42\\uff1a\", \"icon\": \"https://zb.oschina.net/file/get?path=static/project-reward/cover/WEByingyong_1.png\"}, {\"p_id\": 5695, \"dm_title\": \"\\u7f51\\u7ad9\\u524d\\u7aef\\u5f00\\u53d170\\u591a\\u4e2a\\u9875\\u9762\", \"dm_type\": [\"\\u79fb\\u52a8\\u5e94\\u7528\"], \"dm_budget\": \"5000-10000\", \"dm_cycle\": \"60\", \"dm_department\": \"\\u53cb\\u5546\", \"u_id\": \"104154667\", \"u_phone\": \"19518178\", \"dm_status\": \"\\u672a\\u516c\\u5e03\\u9879\\u76ee\", \"publish_date\": \"2020-07-03 09:42:20\", \"delivery_date\": \"\", \"dm_description\": \"<p>\\u505a\\u4e2a\\u7f51\\u7ad9\\u524d\\u7aef\\u548c\\u624b\\u673a\\u7f51\\u7ad9\\u524d\\u7aef\\uff0c\\u4e0d\\u9700\\u8981\\u540e\\u53f0</p><p>1.\\u7cbe\\u901aDIV+CSS\\u7f51\\u9875\\u6846\\u67b6\\u5e03\\u5c40\\u7684HTML\\u4ee3\\u7801\\u7f16\\u5199\\uff0c\\u719f\\u6089W3C\\u6807\\u51c6\\uff1b</p><p>2.\\u7cbe\\u901aJavaScript\\u3001Ajax\\u3001JQuery\\u7b49\\u5404\\u79cdWeb\\u524d\\u7aef\\u5f00\\u53d1\\u6280\\u672f\\uff1b</p><p>3.\\u7cbe\\u901a\\u624b\\u673awap\\u7aef\\u7f51\\u9875\\u89c4\\u8303\\uff1b</p><p>4.\\u638c\\u63e1Angular\\u3001Vue\\u3001React\\u7b49\\u5f00\\u6e90\\u6846\\u67b6\\u4e2d\\u7684\\u4e00\\u79cd\\u6216\\u591a\\u79cd\\u3002</p><p>1.\\u7cbe\\u901aDIV+CSS\\u7f51\\u9875\\u6846\\u67b6\\u5e03\\u5c40\\u7684HTML\\u4ee3\\u7801\\u7f16\\u5199\\uff0c\\u719f\\u6089W3C\\u6807\\u51c6\\uff1b</p><p>2.\\u7cbe\\u901aJavaScript\\u3001Ajax\\u3001JQuery\\u7b49\\u5404\\u79cdWeb\\u524d\\u7aef\\u5f00\\u53d1\\u6280\\u672f\\uff1b</p><p>3.\\u7cbe\\u901a\\u624b\\u673awap\\u7aef\\u7f51\\u9875\\u89c4\\u8303\\uff1b</p><p>4.\\u638c\\u63e1Angular\\u3001Vue\\u3001React\\u7b49\\u5f00\\u6e90\\u6846\\u67b6\\u4e2d\\u7684\\u4e00\\u79cd\\u6216\\u591a\\u79cd\\u3002</p><p>\\u4e0d\\u9700\\u8981\\u540e\\u53f0\\uff0cUI\\u8bbe\\u8ba1\\u548c\\u5f00\\u53d1\\u524d\\u7aef\\u4e00\\u5b9a\\u8981\\u4f1a</p><p>\\u6ce8\\u660e\\uff1a\\u6ca1\\u6709\\u9884\\u4ed8\\u6b3e\\uff0c\\u5168\\u90e8\\u8d70\\u5e73\\u53f0</p><p>\\u8bbe\\u8ba1\\u548cUI\\u8981\\u64c5\\u957f\\u548c\\u7f8e\\u89c2</p><p>PC\\u7aef\\u548c\\u79fb\\u52a8\\u7aef\\u7684\\u524d\\u7aef</p>\\n\\u6280\\u80fd\\u8981\\u6c42\\uff1a\", \"icon\": \"https://zb.oschina.net/file/get?path=static/project-reward/cover/weixinyingyong_3.png\"}, {\"p_id\": 5696, \"dm_title\": \"\\u57fa\\u4e8e\\u76ee\\u6807\\u5bf9\\u8c61\\u7684\\u6587\\u672c\\u62bd\\u53d6\\u7cfb\\u7edf\", \"dm_type\": [\"\\u4eba\\u5de5\\u667a\\u80fd\"], \"dm_budget\": \"50000-100000\", \"dm_cycle\": \"3\", \"dm_department\": \"\\u53cb\\u5546\", \"u_id\": \"86410361\", \"u_phone\": \"18518319\", \"dm_status\": \"\\u672a\\u516c\\u5e03\\u9879\\u76ee\", \"publish_date\": \"2020-07-02 12:28:21\", \"delivery_date\": \"\", \"dm_description\": \"<p>\\u5728\\u7ed9\\u5b9a\\u7684\\u6587\\u672c\\u6587\\u4ef6\\u4e2d\\uff0c\\u62bd\\u53d6\\u51fa\\u76ee\\u6807\\u5bf9\\u8c61\\u7684\\u76f8\\u5173\\u5c5e\\u6027\\u3002</p><p>\\u5982\\u4ece\\u8bbe\\u8ba1\\u6587\\u6863\\u4e2d\\uff0c\\u901a\\u8fc7\\u81ea\\u7136\\u8bed\\u8a00\\u5206\\u6790\\uff0c\\u63d0\\u53d6\\u51fa\\u7ed9\\u5b9a\\u8bbe\\u5907\\u3001\\u6750\\u6599\\u7684\\u89c4\\u683c\\u578b\\u53f7\\u3001\\u6570\\u91cf\\u3001\\u5355\\u4ef7\\u7b49\\u3002</p>\\n\\u6280\\u80fd\\u8981\\u6c42\\uff1aC++\", \"icon\": \"https://zb.oschina.net/file/get?path=static/project-reward/cover/dashuju_1.png\"}, {\"p_id\": 5697, \"dm_title\": \"\\u6296\\u97f3\\u534f\\u8bae\\u811a\\u672c\\u5f00\\u53d1\\u61c2\\u5f97\\u6765\", \"dm_type\": [\"\\u5de5\\u5177\\u5e94\\u7528\"], \"dm_budget\": \"0-0\", \"dm_cycle\": \"10\", \"dm_department\": \"\\u53cb\\u5546\", \"u_id\": \"76410923\", \"u_phone\": \"19518375\", \"dm_status\": \"\\u672a\\u516c\\u5e03\\u9879\\u76ee\", \"publish_date\": \"2020-07-02 11:09:15\", \"delivery_date\": \"\", \"dm_description\": \"<p>1.1&nbsp;\\u5173\\u4e8e\\u77ed\\u89c6\\u9891\\u64cd\\u4f5c\\u7684\\u529f\\u80fd</p><p>\\u3010\\u4efb\\u52a1\\u5185\\u5bb9\\u3011</p><p>\\u7b2c\\u4e00\\u3001\\u5173\\u6ce8</p><p>\\u7b2c\\u4e8c\\u3001\\u77ed\\u89c6\\u9891\\u70b9\\u8d5e</p><p>\\u7b2c\\u4e09\\u3001\\u8bc4\\u8bba\\uff0c\\u8bc4\\u8bba\\u70b9\\u8d5e</p><p>\\u7b2c\\u56db\\u3001\\u8fde\\u7eed\\u64ad\\u653e</p><p>\\u7b2c\\u4e94\\u3001\\u5206\\u4eab\\u89c6\\u9891</p><p>\\u7b2c\\u516d\\u3001\\u4e0b\\u8f7d\\u89c6\\u9891</p><p><br></p><p>\\u3010\\u9009\\u62e9\\u76f4\\u64ad\\u95f4\\u7c7b\\u578b\\u3011</p><p>\\u7b2c\\u4e00\\u3001\\u5355\\u4eba\\u76f4\\u64ad</p><p>\\u7b2c\\u4e8c\\u3001\\u5bf9\\u6218\\u76f4\\u64ad</p><p><br></p><p>\\u3010\\u4efb\\u52a1\\u5185\\u5bb9\\u3011</p><p>\\u7b2c\\u4e00\\u3001\\u63d0\\u5347\\u76f4\\u64ad\\u95f4\\u4eba\\u6c14</p><p>\\u7b2c\\u4e8c\\u3001\\u5173\\u6ce8\\u76f4\\u64ad\\u95f4</p><p>\\u7b2c\\u4e09\\u3001\\u4e92\\u52a8\\uff0c\\u70b9\\u8d5e</p><p>\\u7b2c\\u56db\\u3001\\u5173\\u6ce8\\u5728\\u7ebf\\u7528\\u6237\\u6216\\u672c\\u573a\\u65c1</p><p>\\u7b2c\\u4e94\\u3001\\u52a0\\u5165\\u7c89\\u4e1d\\u56e2</p><p>\\u7b2c\\u516d\\u3001\\u67e5\\u770b\\u8d2d\\u7269\\u8f66</p><p><br></p><p>1.1&nbsp;\\u5c0f\\u53f7\\u7ba1\\u7406</p><p>\\u7b2c\\u4e00\\u3001&nbsp;\\u6240\\u6709\\u7684\\u5c0f\\u53f7\\u90fd\\u8981\\u653e\\u5728\\u4e91\\u7aef\\uff08\\u540e\\u53f0\\uff09</p><p>\\u7b2c\\u4e8c\\u3001&nbsp;\\u6279\\u91cf\\u5bfc\\u5165\\u5c0f\\u53f7&amp;\\u4e0a\\u4f20\\u5230\\u4e91\\u7aef</p><p>\\u7b2c\\u4e09\\u3001&nbsp;\\u67e5\\u770b\\u5c0f\\u53f7\\u72b6\\u6001</p><p>\\u7b2c\\u56db\\u3001&nbsp;\\u4e0b\\u8f7d\\u5c0f\\u53f7\\u548c\\u5c0f\\u53f7\\u7ec4</p><p>\\u7b2c\\u4e94\\u3001&nbsp;\\u6bcf\\u4e2a\\u5c0f\\u53f7\\u90fd\\u6709\\u4e0d\\u540cIP</p>\\n\\u6280\\u80fd\\u8981\\u6c42\\uff1a\", \"icon\": \"https://zb.oschina.net/file/get?path=static/project-reward/cover/dashuju_1.png\"}, {\"p_id\": 5698, \"dm_title\": \"\\u5c0f\\u7a0b\\u5e8fUI\\u56fe\", \"dm_type\": [\"\\u8bbe\\u8ba1\"], \"dm_budget\": \"0-0\", \"dm_cycle\": \"0\", \"dm_department\": \"\\u53cb\\u5546\", \"u_id\": \"96425606\", \"u_phone\": \"11518358\", \"dm_status\": \"\\u672a\\u516c\\u5e03\\u9879\\u76ee\", \"publish_date\": \"2020-07-02 09:55:36\", \"delivery_date\": \"\", \"dm_description\": \"<p>\\u76ee\\u524d\\u5df2\\u7ecf\\u6709\\u4e86\\u754c\\u9762\\u539f\\u578b\\u56fe\\uff0c\\u539f\\u578b\\u56fe\\u5df2\\u7ecf\\u786e\\u5b9a\\u4e86\\u5177\\u4f53\\u7684\\u529f\\u80fd\\uff0c\\u9700\\u8981\\u6839\\u636e\\u539f\\u578b\\u56fe\\u8bbe\\u8ba1UI\\u56fe\\uff1a</p><p>1\\u3001\\u9700\\u8981\\u7f8e\\u5de5\\u642d\\u914d\\u8272\\u5f69\\uff0c\\u8bbe\\u8ba1\\u4f18\\u5316\\uff0c\\u4f7f\\u9875\\u9762\\u53d8\\u5f97\\u7f8e\\u89c2\\u3002</p><p>2\\u3001UI\\u56fe\\u4e2d\\u6d89\\u53ca\\u5230\\u7684\\u5c0f\\u56fe\\u6807\\uff0c\\u80cc\\u666f\\u56fe\\u7b49\\uff0c\\u5f00\\u53d1\\u4e2d\\u9700\\u8981\\u7528\\u5230\\u7684\\u56fe\\u7247\\uff0c\\u9700\\u8981\\u63d0\\u4f9b\\u3002</p><p>3\\u3001UI\\u56fe\\u9700\\u8981\\u80fd\\u8ba9\\u6211\\u7684\\u5ba2\\u6237\\u8ba4\\u53ef\\u3002</p><p>4\\u3001\\u80fd\\u529b\\u5f3a\\u7684\\u8054\\u7cfb\\u6211\\uff0c\\u6700\\u597d\\u80fd\\u770b\\u51e0\\u5f20\\u4f5c\\u54c1\\u3002</p><p>5\\u3001\\u9700\\u8981\\u5de5\\u4f5c\\u65e5\\u767d\\u5929\\u4e5f\\u53ef\\u4ee5\\u5e72\\u6d3b\\u7684\\uff0c\\u4e0d\\u8981\\u5ba2\\u6237\\u8054\\u7cfb\\u6211\\u4e86\\uff0c\\u4f46\\u662f\\u6211\\u65e0\\u6cd5\\u4e0e\\u4f60\\u6c9f\\u901a\\u4e0a\\u3002</p><p>\\u8fd9\\u4e00\\u70b9\\u5f88\\u91cd\\u8981\\uff01\\uff01\\uff01</p><p>\\u5fae\\u4fe1\\u540c\\u624b\\u673a</p>\\n\\u6280\\u80fd\\u8981\\u6c42\\uff1a\", \"icon\": \"https://zb.oschina.net/file/get?path=static/project-reward/cover/WEByingyong_1.png\"}, {\"p_id\": 5699, \"dm_title\": \"\\u6e38\\u620f\\u5f00\\u53d1\", \"dm_type\": [\"\\u6e38\\u620f\\u5f00\\u53d1\"], \"dm_budget\": \"5000-10000\", \"dm_cycle\": \"10\", \"dm_department\": \"\\u53cb\\u5546\", \"u_id\": \"86410025\", \"u_phone\": \"15518327\", \"dm_status\": \"\\u672a\\u516c\\u5e03\\u9879\\u76ee\", \"publish_date\": \"2020-07-02 09:54:55\", \"delivery_date\": \"\", \"dm_description\": \"\\u9700\\u6c42\\u4e00\\u6b3e\\u6355\\u9c7c\\u6e38\\u620fapp\\uff0c\\u9700\\u8981\\u5e26app\\u8fdb\\u53bb\\u5a31\\u4e50\\u7684\\uff0c\\u5e26\\u5b89\\u5353\\u82f9\\u679c\\u624b\\u673a\\u8fdb\\u7684\\u7cfb\\u7edf\\uff0c\\u505a\\u51fa\\u6765\\u7684\\u6837\\u5f0f\\u8ddf\\u6211\\u60f3\\u8981\\u7684\\u9700\\u6c42\\u4e00\\u81f4\\u5c31\\u884c\\u3002\\n\\u6280\\u80fd\\u8981\\u6c42\\uff1a\", \"icon\": \"https://zb.oschina.net/file/get?path=static/project-reward/cover/WEByingyong_1.png\"}, {\"p_id\": 5700, \"dm_title\": \"thinkphp\\u5f00\\u53d1\\u5fae\\u4fe1html\\u7f51\\u7ad9\", \"dm_type\": [\"\\u5fae\\u4fe1\\u5e94\\u7528\"], \"dm_budget\": \"0-0\", \"dm_cycle\": \"20\", \"dm_department\": \"\\u53cb\\u5546\", \"u_id\": \"86412092\", \"u_phone\": \"12518866\", \"dm_status\": \"\\u672a\\u516c\\u5e03\\u9879\\u76ee\", \"publish_date\": \"2020-07-01 16:29:04\", \"delivery_date\": \"\", \"dm_description\": \"<p>\\u53c2\\u8003\\u5fae\\u4fe1\\u516c\\u4f17\\u53f7\\uff1a\\u4e59\\u65b9\\u5b9d</p><p>thinkphp\\u5f00\\u53d1</p>\\n\\u6280\\u80fd\\u8981\\u6c42\\uff1aPHP ThinkPHP Laravel\", \"icon\": \"https://zb.oschina.net/file/get?path=static/project-reward/cover/zhuomianyingyong_1.png\"}, {\"p_id\": 5701, \"dm_title\": \"\\u9ad8\\u7ea7\\u524d\\u7aef\\u5de5\\u7a0b\\u5e08\\uff08\\u719f\\u6089react\\uff09\", \"dm_type\": [\"\\u5de5\\u5177\\u5e94\\u7528\"], \"dm_budget\": \"0-0\", \"dm_cycle\": \"20\", \"dm_department\": \"\\u53cb\\u5546\", \"u_id\": \"66412447\", \"u_phone\": \"19518899\", \"dm_status\": \"\\u672a\\u516c\\u5e03\\u9879\\u76ee\", \"publish_date\": \"2020-07-01 16:28:48\", \"delivery_date\": \"\", \"dm_description\": \"<p>\\u9879\\u76ee\\uff1a</p><p>\\u505a\\u9ad8\\u7b49\\u82f1\\u8bed\\u5728\\u7ebf\\u6570\\u5b57\\u8bfe\\u7a0b\\uff0cpc\\u7aef\\u548c\\u79fb\\u52a8\\u7aefH5\\u3002\\u4e3b\\u8981\\u662f\\u9898\\u578b\\u7ec4\\u4ef6\\u7684\\u5f00\\u53d1\\uff0c\\u6d89\\u53ca\\u97f3\\u9891\\u3001\\u89c6\\u9891\\u3001\\u5f55\\u97f3\\u3001\\u62d6\\u62fd\\u9898\\u3001\\u5355\\u8bcd\\u5361\\u7b49\\u3002\\u6280\\u672f\\u6808\\u662freact\\u3002</p><p><br></p><p><br></p><p><br></p><p><br></p><p><strong>\\u5c97\\u4f4d\\u804c\\u8d23\\uff1a</strong></p><p><span style=\\\"color: rgb(51, 51, 51);\\\">1.&nbsp;&nbsp;\\u5728\\u7ebf\\u6559\\u80b2\\u4ea7\\u54c1PC\\u548c\\u79fb\\u52a8\\u8bbe\\u5907Web\\u524d\\u7aef\\u5f00\\u53d1\\uff1b</span></p><p><span style=\\\"color: rgb(51, 51, 51);\\\">2.&nbsp;&nbsp;\\u524d\\u7aef\\u7ec4\\u4ef6\\u5316\\u65b9\\u6848\\u548c\\u7ec4\\u4ef6\\u8bbe\\u8ba1\\uff1b</span></p><p><span style=\\\"color: rgb(51, 51, 51);\\\">3.&nbsp;&nbsp;\\u524d\\u7aef\\u5de5\\u7a0b\\u5316\\u6539\\u8fdb\\u548c\\u6027\\u80fd\\u4f18\\u5316\\uff1b</span></p><p><span style=\\\"color: rgb(51, 51, 51);\\\">4.&nbsp;&nbsp;\\u524d\\u7aef\\u9886\\u57df\\u524d\\u6cbf\\u6280\\u672f\\u7814\\u7a76\\u548c\\u5e94\\u7528\\u3002</span></p><p><br></p><p><strong>\\u5c97\\u4f4d\\u8981\\u6c42\\uff1a</strong></p><p><span style=\\\"color: rgb(51, 51, 51);\\\">1.&nbsp;&nbsp;\\u8ba1\\u7b97\\u673a\\u76f8\\u5173\\u4e13\\u4e1a\\u672c\\u79d1\\u53ca\\u4ee5\\u4e0a\\u5b66\\u5386\\uff0c3\\u5e74\\u4ee5\\u4e0a\\u4e92\\u8054\\u7f51\\u524d\\u7aef\\u5f00\\u53d1\\u7ecf\\u9a8c\\uff1b</span></p><p><span style=\\\"color: rgb(51, 51, 51);\\\">2.&nbsp;&nbsp;\\u719f\\u6089HTML5\\u3001CSS3\\uff0c\\u719f\\u6089\\u9875\\u9762\\u67b6\\u6784\\u548c\\u5e38\\u7528\\u5e03\\u5c40\\uff0c\\u719f\\u6089\\u6d4f\\u89c8\\u5668\\u517c\\u5bb9\\u6027\\u95ee\\u9898\\u548c\\u89e3\\u51b3\\u65b9\\u6cd5\\uff1b</span></p><p><span style=\\\"color: rgb(51, 51, 51);\\\">3.&nbsp;&nbsp;\\u7cbe\\u901aJavaScript\\uff0c\\u719f\\u6089ES6\\uff0c\\u719f\\u6089\\u4e00\\u79cd\\u4ee5\\u4e0aJS\\u6a21\\u7248\\uff1b</span></p><p><span style=\\\"color: rgb(51, 51, 51);\\\">4.&nbsp;&nbsp;\\u719f\\u7ec3\\u638c\\u63e1React\\u3001Vue\\u7b49\\u73b0\\u4ee3JavaScript\\u5e93\\u548c\\u6846\\u67b6\\uff0c\\u7406\\u89e3MVC/MVVM\\u7b49\\u6982\\u5ff5\\uff1b</span></p><p><span style=\\\"color: rgb(51, 51, 51);\\\">5.&nbsp;&nbsp;\\u7406\\u89e3\\u524d\\u540e\\u5206\\u79bb\\u8bbe\\u8ba1\\u548c\\u6a21\\u5757\\u5316\\u8bbe\\u8ba1\\u601d\\u60f3\\uff0c\\u719f\", \"icon\": \"https://zb.oschina.net/file/get?path=static/project-reward/cover/zhuomianyingyong_1.png\"}, {\"p_id\": 5702, \"dm_title\": \"\\u5fae\\u4fe1\\u516c\\u4f17\\u53f7\\u5f00\\u53d1\", \"dm_type\": [\"\\u5fae\\u4fe1\\u5e94\\u7528\"], \"dm_budget\": \"0-0\", \"dm_cycle\": \"0\", \"dm_department\": \"\\u53cb\\u5546\", \"u_id\": \"46412501\", \"u_phone\": \"14518878\", \"dm_status\": \"\\u672a\\u516c\\u5e03\\u9879\\u76ee\", \"publish_date\": \"2020-07-01 15:23:08\", \"delivery_date\": \"\", \"dm_description\": \"<p>\\u505a\\u4e2a\\u7c7b\\u4f3c\\u4e8e\\u6c49\\u5821\\u738b\\u7684\\u516c\\u4f17\\u53f7</p>\\n\\u6280\\u80fd\\u8981\\u6c42\\uff1a\", \"icon\": \"https://zb.oschina.net/file/get?path=static/project-reward/cover/dashuju_1.png\"}]}";
        JSONObject proObj=new JSONObject(jsonStr);
        JSONArray jsonArray = proObj.getJSONArray("data");
        JSONObject item0 = jsonArray.getJSONObject(0);
        String dm_title=item0.getString("dm_title");
        String dm_budget=item0.getString("dm_budget");
        String dm_cycle=item0.getString("dm_cycle");
        JSONArray dm_type=item0.getJSONArray("dm_type");
        String strdm_type = dm_type.getString(0);
        //补充view
        TextView Vdm_title = (TextView)findViewById(R.id.dm_title);
        TextView Vdm_budget = (TextView)findViewById(R.id.dm_budget);
        TextView Vdm_cycle = (TextView)findViewById(R.id.dm_cycle);
        Vdm_title.setText(dm_title);
        Vdm_budget.setText(dm_budget);
        Vdm_cycle.setText(dm_cycle);
        TextView Vdm_type = (TextView)findViewById(R.id.dm_type);
        TextView Vdm_type2 = (TextView)findViewById(R.id.dm_type2);
        Vdm_type.setText(strdm_type);
        Vdm_type2.setText(strdm_type);
        Toast.makeText(this,"run", Toast.LENGTH_SHORT).show();
    }
}
