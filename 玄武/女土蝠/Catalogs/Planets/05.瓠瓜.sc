// Object * 29 Vul  ---  High Proper Motion Star  ---  OID=@2810327   (@@62071,10)  ---  coobox=20389 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Star "29 Vul A"
{
	DateUpdated     "2024-06-09"
	ParentBody      "29 Vul"
	Class           "A0Va(_sh)"
	AbsMagn         0.56
	MassSol         2.67
	Radius          1769077.56153117 // 计算的值
	LumBol          71
	Teff            10507
	FeH             -0.15
	Age             0.254

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   6.1692214
		Eccentricity    0.314705842
		Inclination     -0.212205887
		AscendingNode   0
		ArgOfPericenter 66.1337442
		MeanAnomaly     -2.08557928
	}
}

Star "29 Vul B"
{
	ParentBody      "29 Vul"
	Class           "M0.5?"
}
