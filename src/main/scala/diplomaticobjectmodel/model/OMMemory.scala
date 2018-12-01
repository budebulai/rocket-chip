// See LICENSE.SiFive for license details.

package freechips.rocketchip.diplomaticobjectmodel.model

sealed trait OMMemoryType extends OMBaseType

case object LIM extends OMMemoryType
case object TIM extends OMMemoryType
case object ICACHE extends OMMemoryType
case object DCACHE extends OMMemoryType

case class OMMemory(
  description: String,
  addressWidth: Int,
  dataWidth: Int,
  depth: Int,
  writeMaskGranularity: Int,
  rtlModule: OMRTLModule,
  omMemoryType: Option[OMMemoryType] = None,
  _types: Seq[String] = Seq("OMMemory", "OMComponent")
)  extends OMComponent
