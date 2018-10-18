package com.xj.study.solr.client;

import com.xj.study.solr.entity.User;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.apache.solr.common.params.SolrParams;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/**
 * TODO
 *
 * @auther: xiangjing
 * @version: 1.0
 * @since: 1.0
 * @createTime: 2018-10-18 15:15
 */
public class QuerySolr {

    public static void main(String[] args) throws IOException, SolrServerException {

        HttpSolrClient.Builder builder = new HttpSolrClient.Builder("http://132.232.66.111:8983/solr/xj/");

        HttpSolrClient client = builder.build();

        SolrQuery params = new SolrQuery("*:*");
        params.setFields("name", "desc");

        QueryResponse response = client.query(params);
        SolrDocumentList list = response.getResults();
        System.out.println(list.size());
        for (SolrDocument document : list) {
            System.out.println("name=" + document.get("name"));
        }
        List<User> users = response.getBeans(User.class);
        System.out.println(response.getStatus());
        System.out.println(users);

    }
}
