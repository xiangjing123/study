package com.xj.study.solr.client;

import com.xj.study.solr.entity.User;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrClient;

import java.io.IOException;

/**
 * TODO
 *
 * @auther: xiangjing
 * @version: 1.0
 * @since: 1.0
 * @createTime: 2018-10-18 15:00
 */
public class ClientTest {

    public static void main(String[] args) throws IOException, SolrServerException {

        HttpSolrClient.Builder builder = new HttpSolrClient.Builder("http://132.232.66.111:8983/solr/xj/");

        HttpSolrClient client = builder.build();

        User user = new User("王翠莲",21,0,"小事一桩");
        client.addBean(user);

        client.commit();
        client.close();


    }
}
