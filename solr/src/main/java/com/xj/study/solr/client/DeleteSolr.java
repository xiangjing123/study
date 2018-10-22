package com.xj.study.solr.client;

import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrClient;

import java.io.IOException;

/**
 *
 *
 * @auther: xiangjing
 * @version: 1.0
 * @since: 1.0
 * @createTime: 2018-10-22 10:21
 */
public class DeleteSolr {

    public static void main(String[] args) throws IOException, SolrServerException {

        HttpSolrClient.Builder builder = new HttpSolrClient.Builder("http://132.232.66.111:8983/solr/xj/");

        HttpSolrClient client = builder.build();

       // client.deleteById("1");
        client.deleteByQuery("age:21");


        client.commit();

        client.close();


    }
}
