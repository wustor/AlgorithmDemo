package com.writing;

/**
 * Created by fatchao
 * 日期  2018-02-24.
 * 邮箱  fat_chao@163.com
 */

public class FinalTest {

    private final class Test {
        private String goods;

        public String getGoods() {
            return goods;
        }

        public void setGoods(String goods) {
            this.goods = goods;
        }
    }

    public void main(String[] args) {
        Test test = new Test();
        Test test1 = new Test();
    }
}
