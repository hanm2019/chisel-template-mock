package MyModules
import chisel3.stage.ChiselStage

object ANDemitVerilog extends App{
    (new chisel3.stage.ChiselStage).emitVerilog(new MyModule)
}

