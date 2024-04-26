package $package$

import zio.*
import zio.test.*

object SomeSuite extends ZIOSpecDefault {
  override def spec: Spec[TestEnvironment & Scope, Any] =
    suite("SomeSuite")(
      test("the trivial") {
        for {
          result <- ZIO.attempt(1 + 1)
        } yield assertTrue(result == 2)
      }
    )
}
