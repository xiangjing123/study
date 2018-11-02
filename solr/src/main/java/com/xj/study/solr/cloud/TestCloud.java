package com.xj.study.solr.cloud;

import org.apache.solr.client.solrj.impl.CloudSolrClient;
import org.apache.solr.common.SolrInputDocument;

import java.util.Arrays;
import java.util.Optional;


/**
 * @auther: xiangjing
 * @version: 2.0
 * @since: 2.0
 * @createTime: 2018-10-30
 */
public class TestCloud {

    public static void main(String[] args) throws Exception {
        String zkHosts="192.168.2.240:2181,192.168.2.240:2182,192.168.2.240:2183";
        CloudSolrClient solrClient = new CloudSolrClient.Builder(Arrays.asList(zkHosts.split(",")), Optional.ofNullable("/")).build();
       // CloudSolrClient solrClient1 = new CloudSolrClient(zkHosts);
        solrClient.setDefaultCollection("test");
        SolrInputDocument doc =  new SolrInputDocument();
        //doc.addField("name","Mr.wang");
        //doc.addField("age","28");
        //doc.addField("id","001");
        doc.addField("supplierCommodityId","1");

        solrClient.add(doc);
        solrClient.commit();
        solrClient.close();
    }
}
