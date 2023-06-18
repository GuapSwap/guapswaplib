package dex

import ergo.ErgoBlockchainAsset
import org.ergoplatform.appkit.ErgoId

trait DexPool {

    val _dexPoolId: String
    var _dexPoolAssetX: ErgoBlockchainAsset
    var _dexPoolAssetY: ErgoBlockchainAsset

    def getPoolIdAsErgoId: ErgoId = {
        ErgoId.create(_dexPoolId)
    }

}