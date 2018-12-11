package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        // 请求方法
        method 'GET'
        // 路径
        url('/') {
            queryParameters {
                parameter("uuid", "1")
            }
        }
    }
    response { // 响应设置
        status 200
        body("""
          {
              "uuid": "1",
              "prodName": "电视"
            }
  """)
        headers {
            header('Content-Type': 'application/json;charset=UTF-8')
        }
    }
}
