package MyModules
import chisel3.stage.ChiselStage

object ANDemitVerilog extends App{
    (new ChiselStage).emitVerilog(new MyModule)
}

