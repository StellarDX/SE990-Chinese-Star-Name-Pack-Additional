// Object * 16 Psc  ---  Spectroscopic Binary  ---  OID=@1385685   (@@28666,2)  ---  coobox=9867 
// Object types: Spectroscopic Binary,High Proper Motion Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Star "16 Psc A"
{
	DateUpdated     "2024-06-18"
	ParentBody      "16 Psc"
	Class           "F6V"
	AbsMagn         3.11 // 计算的值

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   78.4280043
		Eccentricity    0.0790671397
		Inclination     -1.32232475
		AscendingNode   0
		ArgOfPericenter 94.4939334
		MeanAnomaly     -165.16387
	}
}

Star "16 Psc B"
{
	ParentBody      "16 Psc"
	Class           "G9?"
}