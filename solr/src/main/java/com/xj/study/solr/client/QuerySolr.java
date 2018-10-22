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
 *
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
        params.setFields("name", "desc","age","id","_version_");
       // params.setFilterQueries("age:23 && !name:王翠山");
        //params.setParam("age","23");
        params.addSort("age",SolrQuery.ORDER.desc);
        QueryResponse response = client.query(params);
        SolrDocumentList list = response.getResults();
        for (SolrDocument document : list) {
            System.out.println("name=" + document.get("name") +":");
            System.out.print("age=" + document.get("age")+"\t");
            System.out.print("id=" + document.get("id")+"\t");
            System.out.print("version=" + document.get("_version_")+"\t");
            System.out.print("desc=" + document.get("desc") +"\n");
        }

    }
}
