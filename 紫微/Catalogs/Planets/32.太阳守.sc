// Object * 60 UMa  ---  Spectroscopic Binary  ---  OID=@610364   (@@5028,12)  ---  coobox=3422 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Star "60 UMa A"
{
	DateUpdated     "2024-05-03"
	ParentBody      "60 UMa"
	Class           "F5IIIs"
	AbsMagn         0.88 // 计算的值

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.115488
		Eccentricity    0.834596265
		Inclination     1.54229987
		AscendingNode   0
		ArgOfPericenter 53.6918094
		MeanAnomaly     110.883723
	}
}

Star "60 UMa B"
{
	ParentBody      "60 UMa"
	Class           "F5.6?"
}
