package com.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
  Logger logger = LoggerFactory.getLogger(TestController.class);

  // @Autowired
  // TransportClient client;

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String test() {
    System.out.println("hello ");
    logger.error("Hello this testing smtp error");
    logger.info("Hello this testing smtp info");

    return "OK";
  }


  // @RequestMapping(value = "/index", method = RequestMethod.POST)
  // public String index(@RequestBody Map<String, Object> map) {
  //
  // ObjectMapper mapper = new ObjectMapper();
  // String output = null;
  // try {
  // output = mapper.writeValueAsString(map);
  // } catch (JsonProcessingException e) {
  // // TODO Auto-generated catch block
  // e.printStackTrace();
  // }
  //
  // IndexResponse response = client.prepareIndex("twitter", "tweet").setSource(output).get();
  //
  // logger.info("Index response :: {}", response.getIndex());
  //
  // return "OK";
  // }

  // @RequestMapping(value = "/update", method = RequestMethod.POST)
  // public String update(@RequestBody Map<String, Object> map) {
  //
  // ObjectMapper mapper = new ObjectMapper();
  // String output = null;
  // try {
  // output = mapper.writeValueAsString(map);
  // } catch (JsonProcessingException e) {
  // // TODO Auto-generated catch block
  // e.printStackTrace();
  // }
  //
  // IndexResponse response = client.prepareIndex("twitter", "tweet").setSource(output).get();
  //
  // logger.info("Index response :: {}", response.getIndex());
  //
  // return "OK";
  // }
  //
  //
  // @RequestMapping(value = "/search", method = RequestMethod.POST)
  // public String search(@RequestBody Map<String, Object> map) {
  //
  // QueryBuilder qb = QueryBuilders.termQuery("user", "mayur");
  // QueryBuilder qb1 = QueryBuilders.termQuery("user", "keyur");
  // QueryBuilder qb3 = QueryBuilders.termQuery("user", "kimchy");
  // QueryBuilder qb2 = QueryBuilders.boolQuery().should(qb).should(qb1).must(qb3);
  //
  //
  //
  // SearchRequestBuilder srb2 = client.prepareSearch().setQuery(qb2);
  //
  //
  // MultiSearchResponse scrollResp = client.prepareMultiSearch().add(srb2).execute().actionGet();
  // ObjectMapper mapper = new ObjectMapper();
  //
  //
  //
  // logger.info("Response () :: ", scrollResp);
  //
  // return "OK " + scrollResp;
  // }
  //
  // @RequestMapping(value = "/api1/{id}/**", method = RequestMethod.POST)
  // public String api1(@PathVariable("id") String id) {
  // return id;
  //
  // }
  //
  // @RequestMapping(value = "/api1", method = RequestMethod.POST)
  // public String data(HttpServletResponse httpServletResponse) throws IOException {
  // // httpServletResponse.sendRedirect("https://dreamworld.solutions/");
  // return "redirect:" + "https://dreamworld.solutions/";
  //
  // }
}
