package com.xj.study.solr.client;

import com.xj.study.solr.entity.User;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrClient;

import java.io.IOException;

/**
 *
 *
 * @auther: xiangjing
 * @version: 1.0
 * @since: 1.0
 * @createTime: 2018-10-18 15:00
 */
public class AddSolr {

    public static void main(String[] args) throws IOException, SolrServerException {

        HttpSolrClient.Builder builder = new HttpSolrClient.Builder("http://132.232.66.111:8983/solr/xj/");

        HttpSolrClient client = builder.build();

        User user = new User("47bbd7c3-c95e-4e77-9276-77e0ea0e145b","王五",23,1,"小事一桩");
        client.addBean(user);

        client.commit();
        client.close();


    }
}
